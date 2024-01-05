# Technology Exam Notes

## Install docker for linux

Opdater package listen, hvilket er relevant når ny
software skal installeres for at sikre nyeste version.
```bash
sudo apt-get update
```

Docker har et script der kan køres 
for at få Docker installed.

```bash
curl -fsSL https://get.docker.com -o get-docker.sh
```

Herefter køres scriptet lokalt:
```bash
sudo sh get-docker.sh
```

---

## Docker Steerings

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