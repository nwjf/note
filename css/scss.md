SCSS 基础笔记
------------------------

> 部分内容，只做记录

## 基本语法
```scss
// scss 嵌套语法
.name {
    font-size: 10px;
    .text {
        font-size: 12px;
    }
}
```
```sass
// sass 缩进语法
.name
    font-size: 10px
    .text
        font-size: 12px
```

## 变量申明
```scss
// 变量定义
$width: 200px;
$width: 1.5 !default;   // 默认变量(只是一个默认值，没有覆盖就生效，否则使用覆盖值)
$width: 1.5 !global;    // 全局变量(最外层定义可以不适用global)
```

## 继承
```scss
@extend .class5;        // 继承class5
```

## 循环
```scss
// for
@for $i from 1 to 5 {
    .item-#{$i} {
        border:#{$i}px solid;
    }
}
//while 循环
$m:8;
@while $m > 0 {
    .items-#{$m} {
        width:2em*$m;
    }
    $m:$m - 1;
}
//each 语法
@each $img in q,w,e,r {
    .#{$img} {
        background-image:url('#{$img}.png')
    }
}
```
## 函数
```scss
@function double ($number){
    @return $number*2;
}
.text9{
    font-size: double(20px);
}
```

## 代码块复用
```scss
@mixin text6 {
    height:50px;
    left:20px;
}
.text{
    @include text6;
}
```


--------------------------------------


## vscode 配置方法
安装 easy sass 插件

## vue配置
```shell
# 笔记时间较早，可能过时，请了解再用
npm install --save-dev css-loader           # 已下载
npm install --save-dev style-loader         # 已下载
npm install --save-dev sass-loader          # 依赖于node-sass
npm install --save-dev node-sass
```
```html
<style lang="sass"></style>
<style lang="scss"></style>
```