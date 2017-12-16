# MongoDB数据库操作命令笔记(三)

## 主要内容
> 1. MongoDB服务器的启动与客户端连接的完整模式
> 2. MongoDB的权限管理
> 3. MongoDB的索引操作
> 4. MongoDB的数据备份与恢复
> 5. MongoDB的数据导出与导入
> 6. 将MongoDB服务设置系统级服务的方法

## 服务器启动与客户端连接的完整模式

### 服务器启动完整模式
	mongod --dbpath=d:/data/db --logpath=d:/data/log/mongodb.log --storageEngine=mmapv1 --port=27017 --auth
	
	mongod 				启动服务器的命令
	--dbpth				指定数据存储的位置
	--logpath				指定日志文件存储的位置
	--storaageEngine 	指定数据存储的引擎
	--port					指定服务器的端口号
	--auth					开启权限验证
>注：在生产环境下开启mongodb服务器一定要开启权限验证
	
### 客户端连接完整模式
	mongo ip:port/dbname -u username -p password
> 注：在mongodb服务器开启权限验证后，连接时才需要验证用户

## MongoDB的权限管理
	
> 注：在mongodb中一定要先创建管理员身份，再开启权限验证

### 创建用户
> 注：在MongoDB中的有admin数据库，存储的管理员权限相关信息，对admin数据库拥有了管理员权限就对整个数据库都有了管理员权限

管理员

	// 切换到admin数据库
	use admin
	
	// 创建管理员账户
	> db.createUser({
	... user : 'huxiaoshuai',
	... pwd : 'memeda',
	... roles:[{role:'__system',db:'admin'}]
	... })
	Successfully added user: {
	        "user" : "huxiaoshuai",
	        "roles" : [
	                {
	                        "role" : "__system",
	                        "db" : "admin"
	                }
	        ]
	}
	
	roles 权限组
		role 角色
			__system 		系统级别管理员
			read			读权限
			readwrite		读写权限
			
		db	针对的数据库

	
其他普通用户
	
	在创建用户时必须要切换到对应的数据库位置，执行db.createUser()方法
	
	// 对于school数据库创建读写的权限的用户
	> db.createUser({
	... user : 'schoolUser',
	... pwd : '123',
	... roles:[{role:'readwrite',db:'school'}]
	... })
	Successfully added user: {
	        "user" : "schoolUser",
	        "roles" : [
	                {
	                        "role" : "readwrite",
	                        "db" : "school"
	                }
	        ]
	}
	>
 
### 用户登录验证
	切换到该用户对应的数据库，进行权限验证
	
	// 成功返回1，失败返回0
	db.auth(username,pwd)

## MongoDB的索引操作
> 概述：索引是数据库创建的一种便捷查询的目录，有序的查询，提升查询速度

### 创建索引

	// 普通索引
	> db.stu.ensureIndex({uname:1})
	
	// 唯一性索引
	> db.stu.ensureIndex({uname:1},{unique:true})
### 查询索引
	
	> db.stu.getIndexes()

### 删除索引

	> db.stu.dropIndex({uname:1})

### 查询语句的执行效率
	
	> db.stu.find().explain()

## MongoDB的数据备份与恢复

### 数据备份
	
	// 退出数据库客户端
	mongodump -h localhost --port 27017 -d school -o d:/memeda
	
	-h				数据库服务器IP地址
	--port 		端口号
	-d				数据库(导出所有就取消该项)
	-u 				用户名
	-p 				密码

### 数据恢复

	// 退出数据库
	mongorestore -h localhost --port 27017 -d 数据库 --drop 文件存在路径 	
	--drop 删除原有的数据
	-u 		用户
	-p		密码
	
	// 恢复所有数据到数据库
	mongorestore -h --port 文件存储路径
	
## MongoDB的数据导出与导入

### 数据导出

	mongoexport -h localhost --port 27017 -d school -c stu -q {} -f _id,uname --type=csv -o d:/memeda/demo.csv
	
	-c 			对应集合
	-q			查询条件
	-f			指定要获取的字段
	--type 	指定导出的文件类型
		csv
		json
	-o 			指文件存储的路径
	
### 数据导入
	
	导入数据
	mongoimport -h IP --port 端口 -u 用户名 -p 密码 -d 数据库 -c 表名 --upsert --drop 文件名  

	--upsert，其他参数上面的命令已有提到，--upsert 插入或者更新现有数据

	导入部分字段的导出文件
	mongoimport -h IP --port 端口 -u 用户名 -p 密码 -d 数据库 -c 表名 --upsertFields 字段 --drop 文件名  

	导入全部字段的导出文件
	mongoimport -h IP --port 端口 -u 用户名 -p 密码 -d 数据库 -c 表名 --type 类型 --headerline --upsert --drop 文件名  
