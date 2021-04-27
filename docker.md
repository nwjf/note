docker 常用命令集合
------------------------------------

### 登录
```sh
docker login -u [username] -p [password]
```
### 查看docker信息
```sh
docker info
```


### 创建 镜像
```sh
$ docker image build -t koa-demo .
# 或者
$ docker image build -t koa-demo:0.0.1 .
# ps 最后面的 . 不要忘记
```

### 改名
```sh
docker image tag [imagename:tag] [username]/[imagename][:tag]
# 例子
docker image tag docker-node:0.0.1 newwjf/docker-node:0.0.1
```

### push
```sh
docker image push [username]/[repository]:[tag]
# 例子
docker image push newwjf/docker-node:0.0.1
```

### 运行，生成容器
```sh
$ docker container run -p 8000:3000 -it koa-demo /bin/bash
# 或者
$ docker container run -p 8000:3000 -it koa-demo:0.0.1 /bin/bash
# 对的
docker run -dit -p 8001:7001 --name haha docker-node:0.0.3

# -p参数：容器的 3000 端口映射到本机的 8000 端口。
# -it参数：容器的 Shell 映射到当前的 Shell，然后你在本机窗口输入的命令，就会传入容器。
# koa-demo:0.0.1：image 文件的名字（如果有标签，还需要提供标签，默认是 latest 标签）。
# /bin/bash：容器启动以后，内部第一个执行的命令。这里是启动 Bash，保证用户可以使用 Shell。
```

### 查看容器
```sh
docker ps
docker ps -a
```

### 清楚所有容器
```sh
docker rm -f $(docker ps -aq)
```


### 删除

```sh
# 删除容器
docker rm 容器id
# 删除image(需要先删除容器)
docker rmi imageId

# 清楚所有容器
docker rm -f $(docker ps -aq)
```

### 启动，停止
```sh
docker start 容器id
docker stop 容器id
```