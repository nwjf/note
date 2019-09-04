CSS基础笔记
------------------------------------

> 笔记使用scss编写，复制请注意

## meta 部分标签
```html
<meta name="viewport" content="width=device-width" initial-scale="1">
<meta name="keywords" content="">
<meta name="description" content="">
```

## 媒体查询
```scss
@media screen and (min-width: 960px){}
@media screen and (min-width: 600px) and (max-width: 960px){}
```

## 文本超出隐藏
```scss
// 单行超出隐藏，省略号显示
.text {
    word-break: keep-all;       // 不换行
    white-space: nowrap;        // 不换行
    text-overflow: ellipsis;    // 当对象内文本溢出时显示省略标记(...) ；需与overflow:hidden;一起使用。
    overflow: hidden;
}
// 多行隐藏
.text {
    display: -webkit-box;
    overflow: hidden;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
}
```

## input placeholder 样式重置
```scss
input::-webkit-input-placeholder{}      // 使用webkit内核的浏览器
input:-moz-placeholder{}                // Firefox版本4-18
input::-moz-placeholder{}               // Firefox版本19+
input:-ms-input-placeholder{}           // IE浏览器
```

## ios input:disabled 样式设置
```scss
input:disabled,
textarea:disabled {
    -webkit-text-fill-color: #000;
    -webkit-opacity: 1;
    color: #000;
}
```

## 去掉 select 小三角
```scss
.text {
    -webkit-appearance: none;
    -moz-appearance: none;
    -ms-appearance: none;
    appearance: none;
    -webkit-tap-highlight-color: #fff;
    outline: 0;
}
```

## 颜色过渡
```scss
.text {
    background: -moz-linear-gradient(top, #000000 0%, #ffffff 100%);
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#000000), color-stop(100%,#ffffff));
    background: -webkit-linear-gradient(top, #000000 0%,#ffffff 100%);
    background: -o-linear-gradient(top, #000000 0%,#ffffff 100%);
    background: -ms-linear-gradient(top, #000000 0%,#ffffff 100%);
    background: linear-gradient(to bottom, #000000 0%,#ffffff 100%);
}
```