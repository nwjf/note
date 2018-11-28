// "eslint.options": {
//   "configFile": "C:/Users/Administrator/Desktop/note/.eslintrc.js"
// },

module.exports = {
  root: true,
  env: {
    node: true
  },
  'extends': [
    'plugin:vue/essential',
    'eslint:recommended'
  ],
  rules: {
    /**
     * "off" or 0 - 关闭规则
     * "warn" or 1 - 将规则视为一个警告（不会影响退出码）
     * "error" or 2 - 将规则视为一个错误 (退出码为1)
     */
    // 不使用var声明
    // "no-var": "error",
    // 必须添加分号
    'semi': ['error', 'always'],
    // 强制使用单引号
    'quotes': ['error', 'single'],
    // 禁止不必要的分号
    'no-extra-semi': 'error',
    // 在块级作用域外访问块内定义的变量是否报错提示
    'block-scoped-var': 0,
    // 取消禁用console
    'no-console': 'off',
    // 要求使用 === 和 !==
    'eqeqeq': 'error',
    // 禁止使用多个空格
    'no-multi-spaces': 'error',
    'comma-spacing': 'error',
    // 强制驼峰
    // 'camelcase': 'error',
    // 强制使用一致的换行风格
    // 'linebreak-style': ['error', 'unix'],
    // 指定数组的元素之间要以空格隔开(,后面)， never参数：[ 之前和 ] 之后不能带空格，always参数：[ 之前和 ] 之后必须带空格
    // 'array-bracket-spacing': [2, 'never'],
    // 禁止在字符串和注释之外不规则的空白
    // 'no-irregular-whitespace': 'error',
  },
  parserOptions : {
    parser: 'babel-eslint'
  }
}
