数据库编程
------------------

## 定义结束符号
```sql
DELIMITER$$     -- 使用$作为结束符号
DELIMITER;      -- 切换回分号为结束符号
```

## 创建存储过程
```sql
CREATE PROCEDURE sp_name(params);
```