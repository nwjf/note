## nvm
> nvm 是控制nodejs版本的管理工具
### 配置文件
> path: settings.txt
```shell
root: C:\Users\zhong\AppData\Roaming\nvm  
path: C:\Program Files\nodejs 
arch: 64 
proxy: none
node_mirror: http://npm.taobao.org/mirrors/node/
npm_mirror: https://npm.taobao.org/mirrors/npm/
# arch 系统位数
```
## npm
> 报管理工具
```shell
npm adduser # 注册用户
# 安装pack
npm install package
npm i package
npm install package@version

npm uninstall package # 卸载
npm update package    # 更新
npm search package    # 搜索

-S, --save            # 生产环境
-D --save-dev         # 开发环境依赖
-O, --save-optional   # 出现在option依赖中
```
### 查看方法
```shell
npm ls package
npm list package
npm view package    # 查看包详细信息
npm view package version    # 查看包版本信息
npm view package versions   # 查看远程包（所有）版本信息
```
### npm 源
```shell
# 查看源
npm config get registry
npm get registry
# 设置npm镜像源为淘宝镜像
npm set registry https://registry.npmjs.org/
npm config set registry https://registry.npm.taobao.org/
# 淘宝镜像cnpm
npm install -g cnpm --registry=https://registry.npm.taobao.org
```
