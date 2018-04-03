/*
 * @Author: wjf
 * @Date: 2018-04-03 15:58:02
 * @Last Modified by: wjf
 * @Last Modified time: 2018-04-03 16:17:46
 */

'use strict';

import axios from 'axios';
import qs from 'qs';

let http = axios.create({
  baseURL: 'https://cnodejs.org/api/v1',
  timeout: 10000,
  withCredentials: false,
  // 这时候我们通过Qs.stringify转换为表单查询参数
  transformRequest: [function (data) {
    data = qs.stringify(data);
    return data;
  }],
  // 设置Content-Type
  headers: { 'X-Requested-With': 'XMLHttpRequest' }
});

// 添加请求拦截器
http.interceptors.request.use(function (config) {
  // 在发送请求之前做些什么
  return config;
}, function (error) {
  // 对请求错误做些什么
  return Promise.reject(error);
});

// 添加响应拦截器
http.interceptors.response.use(function (response) {
  // 对响应数据做点什么
  return response.data;
}, function (error) {
  // 对响应错误做点什么
  return Promise.reject(error);
});

export default http;
