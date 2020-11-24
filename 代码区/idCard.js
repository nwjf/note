/*
 * @Author: wjf 
 * @Date: 2018-06-09 15:03:35 
 * @Last Modified by: mikey.zhaopeng
 * @Last Modified time: 2020-08-27 20:44:13
 */
// 主函数
function isIdCard (val) {
    val = String(val);
    val = val.toUpperCase();
    if (!/^\d{17}[0-9xX]$/.test(val)) return false;
    if (!checkProvs(val)) return false;
    if (!checkDate(val)) return false;
    let factor = [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2];
    let parity = [1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2];
    let sum = 0;
    for (let i = 0; i < 17; i++) {
        sum += parseInt(val[i]) * factor[i]
    }
    let end = String(parity[sum % 11]);
    if (end !== val[17]) return false;
    return true;
}
// idcard地址函数
function checkProvs (val) {
    let provs = {11: '北京', 12: '天津', 13: '河北', 14: '山西', 15: '内蒙古', 21: '辽宁', 22: '吉林', 23: '黑龙江', 31: '上海', 32: '江苏', 33: '浙江', 34: '安徽', 35: '福建', 36: '江西', 37: '山东', 41: '河南', 42: '湖北', 43: '湖南', 44: '广东', 45: '广西', 46: '海南', 50: '重庆', 51: '四川', 52: '贵州', 53: '云南', 54: '西藏 ', 61: '陕西', 62: '甘肃', 63: '青海', 64: '宁夏', 65: '新疆', 71: '台湾', 81: '香港', 82: '澳门', 91: '海外'};
    let reg = /^(\d{2})\d{15}[0-9xX]$/;
    let addr = reg.exec(val);
    if (!reg.test(val)) return false;
    if (!provs[addr[1]]) return false;
    return true;
}
// idcard日期函数
function checkDate (val) {
    let reg = /^\d{6}(\d{8})\d{3}[0-9xX]$/;
    let str = reg.exec(val)[1];
    let year = str.slice(0, 4);
    let month = str.slice(4, 6);
    let day = str.slice(6, 8);
    let date = new Date(year + '-' + month + '-' + day);
    if (!date) return false;
    if (date.getMonth() + 1 !== parseInt(month)) return false;
    return true;
}