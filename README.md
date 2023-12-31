# Docker Steerings

Kør en simpel ubuntu docker container:
```bash
docker run -it ubuntu
```

Build an image from given docker file in pwd:
```bash 
docker build -t [navn] .
```

## MYSQL docker container

Kør en mysql container:
```bash
docker run --rm --name Test --restart unless-stopped -p 3306:3306 -e MYSQL_ROOT_PASSWORD=test -d mysql
```

herefter skabes adgang til mysql serveren ved følgende:
```bash
docker exec -it Test bash
mysql -uroot -p
```