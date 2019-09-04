sql语句查询
----------------------------------------------

## 数据查询
> ASC 升序 DESC 降序
### 普通查询
```sql
-- 所有数据
SELECT * FROM db_name.tb_name;
-- 普通查询
SELECT user_name, user_sex, user_address FROM db_name.tb_name;
-- 定义别名查询
SELECT user_name AS name, user_sex AS sex FROM db_name.tb_name;
-- 替换查询结果
SELECT 
    user_name, CASE WHEN user_sex='1' THEN '男' ELSE '女' END AS 'sex'
    FROM db_name.tb_name;
```
### 笛卡儿积查询
```sql
SELECT * FROM tb1 CROSS JOIN tb2;
-- or
SELECT * FROM tb1, tb2;
```
### 连接查询
```sql
-- 内连接-外键
SELECT tb1 INNER JOIN tb2
    ON tb1.id = tb2.id;
-- 外连接-左连接
SELECT * FROM tb1 LEFT JOIN tb2
    ON tb1.id = tb2.id;
-- 外连接-右连接
SELECT * FROM tb1 RIGHT JOIN tb2
    ON tb1.id = tb2.id;
```
### 条件查询
```sql
-- 普通条件查询
SELECT * FROM db_name.tb_name
    WHERE user_sex = 1;
-- 范围查询between and
SELECT * FROM db_name.tb_name
    WHERE user_id BETWEEN 1 AND 9;
-- 枚举查询,-查询id为（1， 2， 3）得数据
SELECT * FROM db_name.tb_name
    WHERE id IN (1, 2, 3);
-- 空值查询
SELECT * FROM db_name.tb_name
    WHERE user_name IS NULL;
```
### 子查询-IN
```sql
-- 表子查询，行子查询， 列子查询
SELECT name, score FROM tb1
    WHERE id IN (SELECT id FROM tb2 WHERE score > 80);
-- 分组计数查询
SELECT address, sex, COUNT(*) AS num
    FROM db_name.tb_name
    GROUP BY address, sex;
-- ji
SELECT address, sex, COUNT(*) AS num
    FROM db_name.tb_name
    GROUP BY address, sex
    WITH ROLLUP;
-- 分组过滤 HAVING
SELECT address, sex
    FROM db_name.tb_name
    GROUP BY address, sex
    HAVING COUNT(*) < 3;
```
### 排序 ORDER BY
```sql
SELECT * FROM db_name.tb_name ORDER BY name DESC;
```
### LIMIT-- limit
```sql
-- 从第5条数据开始查询3条数据
SELECT * FROM db_name.tb_name
    ORDER BY name ASC
    LIMIT 4, 3
```
### 多表联查
```sql
SELECT id, name, sex, address, cheng
    FROM db_name.tb1, db_name.tb2, db_name.tb3
    WHERE name='lisi'
    AND db_name.tb1.id = db_name.tb2.id
    AND db_name.tb2.name = db_name.tb3.name;
-- 简化
USE db_name;
SELECT id, name, sex, address, chan
    FROM tb1, tb2, tb3
    WHERE name='lisi' AND tb1.id = tb2.id AND tb2.name = tb3.name;
```