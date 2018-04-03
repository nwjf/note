module.exports = {
  root: true,
  parserOptions: {
    parser: 'babel-eslint'
  },
  env: {
    browser: true,
  },
  extends: [
    // https://github.com/vuejs/eslint-plugin-vue#priority-a-essential-error-prevention
    // consider switching to `plugin:vue/strongly-recommended` or `plugin:vue/recommended` for stricter rules.
    'plugin:vue/essential', 
    // https://github.com/standard/standard/blob/master/docs/RULES-en.md
    'standard'
  ],
  // required to lint *.vue files
  plugins: [
    'vue'
  ],
  // 全局变量使用
  globals: {
    "eventBus": true,
    "axios": true,
    "BMAP_STATUS_SUCCESS": true,
    "openid": true,
    "nickname": true,
    "portrait": true,
    "mui": true,
    "wx": true,
    "commonUrl": true
  },
  // add your custom rules here
  rules: {
    // 允许使用箭头函数
    'arrow-parens': 0,
    // 允许使用async-await
    'generator-star-spacing': 0,
    // 开发中可以使用debuger
    'no-debugger': process.env.NODE_ENV === 'production' ? 2 : 0,
    // 不使用var声明
    "no-var": "error",
    // 必须添加分号
    "semi": ["error", "always"],
  }
}