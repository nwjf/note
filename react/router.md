react-router-dom
--------------------

```js
import {
    BrowserRouter,
    HashRouter,
    Switch,
    Route,
    Link,
    NavLink
} 
from 'react-router-dom';
```

|标签            |说明|
|-------------  |----|
|BrowserRouter  |react-router-dom扩展，利用HTML5 新增的history API (pushState, replaceState)，是web应用最常用的路由组件|
|HashRouter     |react-router-dom扩展，利用window.location.hash，适用于低版本浏览器或者一些特殊情境|
|Switch         |就是一个开关，因为它仅仅只会渲染一个路径。相比之下（不使用<Switch>包裹的情况下），每一个被location匹配到的<Route>将都会被渲染（需要exact的配合）|
|Route          |是路由配置的具体实现，它指定当路径匹配的时候渲染哪一个UI|
|Link           |相当于a标签,replace|
|NavLink        |相当于link，比link更强大,exact[bool]: 是否开启严格模式,strict[bool]：是否严格验证尾随线，replace[bool]: false, //是否替换当前路由，activeClassName，activeStyle|
|Redirect       |重定向to, push, from|


```jsx
<Link to="/index"></link>
<Link to={pathname: '/index', search: '', hash: '', state: ''}></Link>

<NavLink></NavLink>
```

动态路由
```js
// router
<Route path="/home/:name/:type"><Route>

// jsx
<Link to="/home/1/2"></Link>
<NavLink to="/home/1/2"></NavLink>

// js
this.props.history.push({pahtname: '/home/1/2'});
// 接受参数
this.props.match.params.name;
this.props.match.params.type;

// 替代当前路径
this.props.history.replace({pathname: '/home/1/2'});
<Link to="/home/1/2" replace></Link>
<NavLink to="/home/1/2" replace></NavLink>
```