/*
 * @file 正则表达式
 * @Author: wjf 
 * @Date: 2018-01-14 14:50:23 
 * @Last Modified by: wjf
 * @Last Modified time: 2018-07-16 16:04:03
 * @version 1.0.2
 */

// 文本（最短长度1）
export const textReg = /^[\S]{1,}/;
// 姓名
export const nameReg = /^[\u4E00-\u9FA5\uf900-\ufa2d·s]{2,20}$/;
// 昵称，用户名正则，2到16位（字母，数字，下划线，减号）
export const nicknameReg = /^[a-zA-Z0-9_-]{2,16}$/;
// 手机号码
export const phoneReg = /^1[3-9]\d{9}$/;
// email
export const emailReg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9-])+((\.[a-zA-Z0-9-]{2,3}){1,2})$/;
// 密码（6位数字密码）
export const pwdReg = /^\d{6}$/;
// 登录密码（6-20位数字字母_-@#*+.）
export const loginPwdReg = /^[0-9a-zA-Z#@*-+_\.]{6,20}$/;
// 身份证正则,大致匹配，
export const idCardReg = /^[1-9]\d{9}(0[1-9]|1[12])(0[1-9]|[1-2][0-9]|3[01])\d{3}[0-9Xx]$/;
// 大于0的数字，包括小树
export const maxNumReg = /(^[1-9]\d*$)|(^[1-9]\d*\.\d*$)|(^0\.[1-9]\d*$)/;
// 金额，钱正则，包含两位小数
export const moneyReg = /(^\d{1,8}$)|(^\d{1,8}.\d{1,2}$)/;