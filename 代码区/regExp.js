/*
 * @Author: wjf 
 * @Date: 2018-01-14 14:50:23 
 * @Last Modified by: mikey.zhaopeng
 * @Last Modified time: 2018-01-14 15:29:11
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
// 登录密码（6-20位数字_-@#*+.）
export const loginPwdReg = /^[0-9a-zA-Z#@*-+_\.]{6,20}$/;

/*
 * 在下不才，如有不对，请小做修改
 * 如有不能满足需求的请添加
 * 本文档使用es6，如有不支持请自己想办法
 */