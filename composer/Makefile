SHELL := /bin/bash

HERE=$(shell pwd)

up:
	docker-compose up -d --build; echo "Waiting the container setup......"; sleep 15; docker exec -u postgres -it composer_db_1 bash /var/lib/postgresql/init.sh

