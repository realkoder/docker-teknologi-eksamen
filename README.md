# Technology Exam Notes

## Install docker for linux

Update package list, which is relevant for
installing new software and ensuring latest versions.
```bash
sudo apt-get update
```

Docker provides a script to install docker.

```bash
curl -fsSL https://get.docker.com -o get-docker.sh
```

Execute the script:
```bash
sudo sh get-docker.sh
```

<br>

---

## Docker Steerings

Run a simple ubuntu docker container:
```bash
docker run -it ubuntu
```

Build an image from given docker file in pwd:
```bash 
docker build -t [navn] .
```

<br>

---

## MYSQL docker container

Run a mysql container:
```bash
docker run --name Test --restart unless-stopped -p 3306:3306 -e MYSQL_ROOT_PASSWORD=test -d mysql
```

Access the mysql server:
```bash
docker exec -it Test bash
mysql -uroot -p
```

<br>

---

# CLI Commands For Various Stuff `unix based`

Install nano for linux:
```bash
apt update
```
```bash
apt install nano
```

### Understanding Linux Permissions and `chmod`

When dealing with Linux file permissions, 
the `chmod` command is used to manage access rights. 
Organized into three 
categories: user (`u`), group (`g`), 
and others (`o`). 
The permissions themselves are represented by `r` 
(Read), `w` (Write), and `x` (Execute).

### Numeric Representation of Permissions:
- `r` (Read) is represented by the number `4`.
- `w` (Write) is represented by the number `2`.
- `x` (Execute) is represented by the number `1`.

#### Make a File Executable for Everyone:

To add execute permission for the 
owner, group, and others:
```bash
chmod +x filename
```

For only group and other:
```bash
chmod go+x filename
```

### Dealing With Users

Create a new user (if any issues run apt install sudo):
```bash
adduser newUser
```

Adding sudo priv to created user:
```bash
usermod -aG sudo newUser
```

Switch user:
```bash
su newUser
```

## Network Related CLI

View ip addresses and CIDR notation:
```bash
ip address show
```

### DNS Related Stuff

Name server lookup - resolve a domain name to its 
corresponding IP address.
```bash
nslookup example.com
```

WHOIS lookup to find information about 
domain registration, including the owner's 
contact details and registration date.
```bash
whois example.com
```

<br>

lsof lists open network connections and the 
associated processes on your system.
It can help identify higher layer 
protocols and services running on specific ports. 
Protocols such as HTTP, FTP, SSH, or 
DNS operate at the Application layer (Layer 7) 
of the OSI model.
```bash
sudo lsof -i
```

<br>

---
# OSI Model


![OSI Layer 5, 6, 7](img/OSI5-7.png)
