# javaScript 规范

## 命名规范

> 常量      全大写 如 const APP = getApp();
> 变量      小驼峰 如 let userName = '';
> 方法      小驼峰 如 function getName () {};
> 构造方法  大驼峰 如 function Student () {};
> 类class   大驼峰 如 class Student {};

## 语法规范

> 使用 === 和 ！== 尽量不使用 == 和 ！=
> 使用 ' 单引号
> 使用 ; 分号

## 空格规范

> 运算符左右保留一个空格（+ - * / += -= *= ）
> 冒号 : 右侧保留一个空格
> 方法小括号前后保留一个空格 (左边一个 ) 右边一个 function test () {};
> 单行注释 // 前后保留一个空格
> 三目运算符 : ? 左右保留一个空格

如：
```js
let name = ''; // name
let isTrue = name === '';
    isTrue = name !== '';
let sum = sum + 1;
let num += 1;
    num *= 1;
    num -= 1;
    num++;
    num--;
let obj = {
    name: ''
}
function test () {}
class test {}
// 三目
let isTrue = name ? 1 : 2;
```

## 注释规范

单行注释
```js
let name; // name
// 前后保留一个空格
```

文件注释
```js
/**
 * @file LBS控制器
 * @author wjf
 * @copyright wjf版权
 * @createDate 2019-4-18 09:40:11
 */
```

文档注释
```js
/**
 * @method name 方法说明
 * @param {String} params1 参数1说明
 * @returns {Number} param 返回值说明
 * @throws {String} 抛出异常
 */
```

```
@constructor 构造函数声明注释

@param 参数注释

@return 返回值注释

@example 示例注释

@overview 对当前代码文件的描述。

@copyright 代码的版权信息。

@author []代码的作者信息。

@version 当前代码的版本。
```