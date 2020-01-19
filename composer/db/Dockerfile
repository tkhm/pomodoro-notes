# Build時にpostgresのプロセスを先に開始してBuild中にinit.shを実行する形にできるともっと便利
# 現状はinit.shを初回に手動実行する必要あり
FROM postgres:11.5-alpine
ADD init.sh /var/lib/postgresql
