/*
 * @module 获取指定月份的事件，周，等信息
 * @param String d 获取日期，如： 2018-8, 2018-3-12 ,2018/12/12, 2018.12,支持（-,/.）分割日期
 * @return 数组
 */
function getDate (d) {
    var dateArr = [];
    var arr = d.split(/[-\/\.,]/);
    arr[2] = 1;
    for (var i in arr) {
        arr[i] = parseInt(arr[i]);
    }
    var d = new Date(arr[0], arr[1], 0);
    var day = d.getDate();
    var today = ['周日', '周一', '周二', '周三', '周四', '周五', '周六'];
    for (var j = 1; j <= day; j++) {
        var obj = {};
        obj.year = arr[0];
        obj.month = arr[1];
        obj.day = j;
        obj.weekNum = new Date(arr[0] + '/' + arr[1] + '/' + j).getDay();
        obj.week = today[obj.weekNum];
        // obj.w = arr[0] + '-' + arr[1] + '-' + j;
        dateArr.push(obj);
    }
    return dateArr;
}
// console.log(JSON.stringify(getDate('2018-2'), null, 4));


/* 
 * @module 讲指定数字时间转为中文时间
 * @param String d 获取日期，如： 2018-8, 2018-3-12 ,2018/12/12, 2018.12,支持（-,/.）分割日期
 * @return 二〇一八年二月
 */
function dateToChinese (d) {
    var zn = ['〇', '一', '二', '三', '四', '五', '六', '七', '八', '九', '十'];
    var arr = d.split(/[-\/\.,]/);
    var str = '';
    for (var i in arr) {
        arr[i] = arr[i].split('');
    }
    // 年
    for (var i in arr[0]) {
        str += zn[arr[0][i]];
    }
    str += '年';
    // 说明出入月份了
    if (arr[1]) {
        if (arr[1].length === 1) arr[1].splice(0, 0, 0);
        str += parseInt(arr[1][0]) === 1 ? '十' : '';
        str += parseInt(arr[1][1]) !== 0 ? zn[arr[1][1]] : '';
        str += '月';
    }
    // 日
    if (arr[2]) {
        if (arr[2].length === 1) arr[2].splice(0, 0, 0);
        str += parseInt(arr[2][0]) === 1 ? '十' : '';
        str += parseInt(arr[2][1]) !== 0 ? zn[arr[2][1]] : '';
        str += '日';
    }
    return str
}
// console.log(dateToChinese('2018/2'));