SQL 视图 笔记
---------------------------------------

## 基本解释
> view_name 视图名称
> [] 可选，不做为符号

## 创建视图
```sql
-- 创建视图
CREATE VIEW view_name db_name.tb_name
    AS 
    SELECT * FROM db_name.tb_name
    WHERE sex='1'
    WITH CHFCK OPTION; -- 更新整个视图
-- 删除视图
DROP VIEW view_name;
-- 删除数据
DELETE FROM db_name.view_name
    WHERE id=1;
-- 修改视图
ALTER VIEW view_name
    AS ....  -- 和查询一样，关键字不一样alter
```

## 查看视图
```sql
SHOW CREATE VIEW view_name;
```

## 更新视图-数据
```sql
-- 插入数据
INSERT INTO db_name.tb_name.view_name
    VALUE (value1, value2, value3); -- 和插入数据一样
-- 更新数据
UPDATE db_name.view_name
    SET address='beijing'; -- 所有地址都修改

```

## 视图查询
```sql
-- 查询数据
SELECT name, address
    FROM da_name.view_name
    WHERE age=12;
```