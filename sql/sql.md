SQL 语言基本使用命令

-----------------------------------

## 登陆
```sql
mysql -u root -p
```
## 笔记关键字解释
> db_name 数据库名称
> tb_name 表名称
> column_name 列名称
> index_name 索引名称
> from in 两个名词共存

> 建议大写命令

## 基础命令-show
```sql
-- 查看所有数据库
SHOW DATABASES;
SHOW SCHEMAS;
SHOW DATABASES [LIKE|WHERE]
-- 查看表
SHOW TABLES FROM db_name;
-- 查看列
SHOW COLUMNS FROM db_name.table_name;
-- 查看索引
SHOW INDEXS FROM tb_name;
SHOW KEY FROM tb_name;
```
## 选择数据库
```sql
--选择数据库
USE sql_name;
```

## 数据库操作
```sql
-- 创建数据库
CREATE DATABASE db_name;
CREATE SCHEMA db_name;
-- 防止重复创建报错
CREATE DATABASE IF NOT EXISTS db_name;
-- 修改数据库
-- ALTER DATABASE;
-- 删除数据库
DROP DATABASE db_name;
DROP DATABASE IF EXISTS db_name;    -- 如果存在就删除
```
## 表操作
#### 创建表
```sql
USE db_name;
-- 创建表
CREATE TABLE tb_name (
    user_id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(ID)
);
-- INT CHAR(1) 类型
-- NOT NULL 不能为空
-- NULL 允许为空
-- DEFAULT 0 默认值为0
-- AUTO_INCREMENT 自增（配合INT）
-- PRIMARY KEY(id) 主键
/*
 * INT 整型
 * DOUBLE 浮点型
 * BOOL 布尔型
 * DATE 日期型
 * TIMESTAMP 时间戳
 * TIME 时间型
 * CHAR(1) 定长字符型
 * VARCHAR 可变字符型
*/
```
#### 修改表
```sql
-- 添加列 alter ... add ...
ALTER TABLE db_name.tb_name ADD COLUMN user_name CHAR(10) DEFAULT '';
-- 修改列 alter ... change ...(user_name 改为uname 已经其他选项修改)
ALTER TABLE db_name.tb_name CHANGE COLUMN user_name uname CHAR(11);
-- 修改默认值
ALTER TABLE db_name.tb_name ALTER COLUMN user_name SET DEFAULT 'bg';
-- 修改数据类型 -只修改数据类型
ALTER TABLE db_name.tb_name MODIFY COLUMN user_name CHAR(20) FIRST;
-- FIRST 放到第一列
-- 删除列(主键列不能删除)
ALTER TABLE db_name.tb_name DROP COLUMN column_name;
-- 修改表名
ALTER TABLE db_name.tb_name RENAME db_name.tb_name_new;
RENAME TABLE db_name.tb_name TO db_name.tb_name;
```
#### 数据操作
```sql
-- 插入数据
INSERT INTO db_name.tb_name
    VALUES ('uname', 'sex' ...), (), (); -- 按列顺序写(多条数据)

INSERT INTO db_name.tb_name
    SET user_name='lisi', user_sex='2';
-- 删除数据
DELETE FROM db_name.tb_name
    WHERE user_name='lisi'; -- 删除一行或者多行
-- 修改数据
UPDATE db_name.tb_name
    SET user_name='zhangsan', user_sex='1'
    WHERE user_id='1';
```

#### 索引
```sql
-- INDEX or KEY 普通索引
-- UNIQUE 普通索引
-- PRIMARY KEY 主键

-- 创建索引-ASC 升序
CREATE INDEX index_name ON db_name.tb_name(clumn_name ASC);
-- 删除索引
DROP INDEX index_name ON tb_name;

ALTER TABLE db_name.tb_name
    DROP PRIMARY KEY,       -- 删除主键
    DROP INDEX index_name;  -- 删除普通索引
```

## 内置函数
```sql
ABS()       -- 绝对值
COUNT()     -- 聚合函数
ASCII()
NOW()
ENCODE()
IF()
FORMAT()
CAST()
USER()
```