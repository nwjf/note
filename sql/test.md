```sql
-- 创建存储过程
DELIMITER $$ -- 不用分号,更换结束符,记得改过来
CREATE PROCEDURE sp_name(IN cid INT, IN sex CHAR(1))    -- IN cid INT 定义变量, IN输入函数用in
BEGIN   -- 开始
    UPDATE tb_name SET t_sex=sex WHERE t_cid=cid;   -- 语句
END $$   --结束


-- 调用存储过程
CALL sp_name(10, '参数2');

-- 删除存储过程
DROP PROCEDURE sp_name;


-- 申明变量var_name, 写在存储过程内，begin end内最开始处
DECLARE var_name INT(10);

-- 全局变量（用户变量） 使用 @ 符号

-- 变量赋值
SET cid=10; -- 一个变量赋值

```
## 流程控制
```sql
-- if
IF ... THEN ... ELSE
END IF;
--CASE


-- 循环
WHILE x < 10
    x--;
END WHILE;

-- REPEAT， LOOP
-- 退出当前循环 ITERATE

```

## 游标（指针）(不重要)
```sql
-- 创建
DECLARE cursor_name CURSOR FOR select_statement;
-- 打开
OPEN cursor_name;
-- 用游标读取数据
FETCH cursor_name INTO var_name[];
-- 关闭游标
CLOSE cursor_name;
```



## 存储函数
```sql
-- 穿件函数，必有返回值
DELIMITER $$
CREATE FUNCTION sp_name(cid INT)
    RETURNS CHAR(20)    -- 返回值
    DETERMINISTIC   -- 输出是确定的
BEGIN
    DECLARE SEX CHAR(20); -- 变量定义
    SELECT sex INTO SEX FROM tb_name
        WHERE id=cid;
    IF SEX IS NULL THEN
        RETURN(SELECT'没有数据');
    ELSE
        RETURN(SELECT'有数据');
    END IF;
END $$


-- 删除函数
DROP sp_name;
```

## 出发器
```sql
-- 创建触发器
CREATE TRIGGER trigger_name trigger_event
    ON tb_name FOR EACH ROW trigger_body;

-- 列题
CREATE TRIGGER trigger_name AFTER INSERT
    ON tb_name FOR EACH ROW SET @str='content';

-- 触发器分类， insert， delete， update
-- new新数据， old旧数据，只能读，不能更新
```


## 用户账号管理
```sql
-- 创建用户账号
CREATE USER 'zhansan'@'localhost' IDENTIFIED BY '123',
            'lisi'@'localhost' IDENTIFIED BY PASSWORD '123';
-- 删除用户
DROP USER zhansan@localhost;
-- 修改名字
RENAME USER 'lisi'@'localhost' to 'wangwu'@'localhost';

-- 查看用户列表
SELECT * FROM mysql.user;

-- 设置密码
SET PASSWORD FOR 'wangwu'@'localhost'=PASSWORD('123');

-- 设置权限select查询权限
GRANT SELECT(id, name) ON db_name.tb_name TO 'zhansan'@'localhost';

-- 列题，授予两个不存在的用户查询更改权限
GRANT SELECT,UPDATE ON db_name,tb_name TO 'zhansan'@'localhost' IDENTIFIED BY'123';
-- 列题， 所有数据库所有表
GRANT ALL ON *.* TO 'wangwu'@'localhost';
-- 列题， 授予存在的用户创建用户权限，权限转移
GRANT CREATE USER ON *.* TO 'wangwu'@'localhost' WITH GRANT OPTION;

-- 回收权限
REVOKE SELECT ON db_name.tb_name FROM 'wangwu'@'loaclhost';
```