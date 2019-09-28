default:
	@echo "=============Building Local Service============="
	docker build -f Dockerfile -t spring-boot-service .

build: default
	@echo "=============Build And Starting Service Locally============="
	docker-compose up -d

up:
	@echo "=============Starting Service Locally============="
	docker-compose up -d

logs:
	docker-compose logs -f

down:
	docker-compose down

test:
	go test -v -cover ./...

clean: down
	@echo "=============Cleaning Up============="
	rm -f spring-boot-service
	docker system prune -f
	docker volume prune -f
