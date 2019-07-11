git 基本命令使用

------------------------------------------------------------------------


### 

```shell
git init        # 初始化git项目
```

## 密钥生成

```shell
ssh-keygen -t rsa -C 'info'     # 生成ssh密钥
```

## 用户信息

```shell
# 设置全局用户信息
git config --global user.name 'userName'
git config --global user.email 'userEmail'

# 查看config
git config --list
git config --global --list
```

## 分支操作

```shell
git branch          # 显示当前分支

git branch -a       # 显示所有分支

git branch dev      # 创建dev分支

git checkout dev    # 切换到dev分支

git checkout -b dev # 创建dev分支，同时切换到dev分支

git merge dev       # 将dev分支合并到master分支上

git branch -D dev   # 删除dev分支
```

## 日志显示

```shell
git log             # 查看日志信息
git reflog          # 所有日志信息，历史日志
git log --graph     # 图形化显示版本信息
git log --graph --pretty=oneline --abbrev-commit # 图形化显示分支信息
```

## 状态

```shell
git status          # 查看当前状态

git diff            # 查看修改的内容
git diff fileName
```

## 推送设置

```shell
git remote add orighin git@github.com   # 建立连接

git remote set-url origin git@github.com # 更新连接

git remote rm dev       # 移除对应的远程仓库，断开连接

git remote -v   # 查看连接地址信息
# or
git remote --verbose

git remote show origin  # 查看详细信息

git clone git@github.com        # 克隆仓库

# 拉取推送设置
git add src
git add .

git commit -m 'info'

git pull
git push

git pull origin master
git push origin master

git push -u origin master   # 首次推送

git fetch
```

## 版本回退

```shell
git rm --cached *       # 删除git add 添加到暂存区的所有文件

git reset --hard HEAD^  # 回退上一个版本
git reset --herd HEAD~10# 回退到上10个版本
git reset --herd commit_id  # 回退到指定版本

# 撤销git commit ,不撤销git add (不删除代码)
git reset --soft HEAD^
    # 意思是：不删除工作空间改动代码，撤销commit，并且撤销git add . 操作
    # 这个为默认参数,git reset --mixed HEAD^ 和 git reset HEAD^ 效果是一样的。
    --mixed 
    # 不删除工作空间改动代码，撤销commit，不撤销git add . 
    --soft  
    # 删除工作空间改动代码，撤销commit，撤销git add . 
    # 注意完成这个操作后，就恢复到了上一次的commit状态。
    --hard

# commit注释写错了，只想改注释，（会进入vim编辑状态）
git commit --amend
```


## git tag setting

```shell
git tag v1.0        # 添加标签

git tag             # 查看标签

git push origin v1.0 # 推送标签

git tag -d v1.0     # 删除标签

git tag v1.0 commit_id  # 为指定版本添加标签

git push origin --tags  # 推送所有标签
```