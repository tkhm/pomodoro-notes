#!/bin/bash
# postgresユーザーでの実行を前提, 初回に一度実行

main() {

  # グローバル変数汚染しないための対応
  local OPTIND OPTARG OPT
  while getopts ':p' OPT
  do
    case "${OPT}" in
      p ) FLAG_PURGE="TRUE" ;;
      * ) echo "Invalid args provided."; exit 1;;
    esac
  done

  if [[ "${FLAG_PURGE}" == "TRUE" ]] ;then
    dropdb pomonotes
  fi
  createdb pomonotes
}

# shellcheck disable=SC2128
[[ "$0" == "${BASH_SOURCE}" ]] && main "$@"
