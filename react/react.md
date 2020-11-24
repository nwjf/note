---
title: React(一) -- 创建和配置
date: 2019-07-06 11:14:13
categories: React
tags: [JavaScript, React]
---

## 介绍

React 起源于 Facebook 的内部项目，因为该公司对市场上所有 JavaScript MVC 框架，都不满意，就决定自己写一套，用来架设Instagram 的网站。做出来以后，发现这套东西很好用，就在2013年5月开源了。

## 创建项目

```shell
# npm 2.5.0-
    npm install -g create-react-app
    create-react-app my-app
# npm 2.5.0+
    npx create-react-app my-app

# create react ts
    create-react-app my-app --scripts-version=react-scripts-ts
    # or
    npx create-react-app my-app --scripts-version=react-scripts-ts
```

## 项目结构

```
|—— config
|   |—— jest
|   |—— env.js
|   |—— modules.js
|   |—— paths.js
|   |—— pnpTs.js
|   |—— webpack.config.js
|   |—— webpackDevServer.config.js
|
|—— scripts
|   |—— build.js
|   |—— start.js
|   |—— test.js
|
|—— public
|   |—— index.html
|
|—— src
|   |—— components
|   |—— App.js
|   |—— index.js
|   |—— serviceWorker.js
|
|—— package.json
|—— README.md
```

```
# 生成配置文件
npm run eject
```

## css less scss
```shell
# scss
npm i node-sass -D
# less
# npm i 
```