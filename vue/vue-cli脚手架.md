## vue-cli 2.x
```json
npm install vue-cli -g
vue init 模板名 appName
// simple          最简单的模式(没用！)
// webpack         最大的项目
// webpack-simple  较小的项目
npm run dev
npm start
npm run build
```
## vue-cli 3.x
```js
// 安装cli
npm install -g @vue/cli
// OR
yarn global add @vue/cli

// 创建项目
vue create my-project
// OR
vue ui

// 检查版本
vue --version

npm run serve

// 2.0老版本
npm install -g @vue/cli-init
```



npm init        新建一个.json文件
npm list        查看所有安装的包
npm prune        移除项目不依赖的包
npm outdated        查看哪些包过时了