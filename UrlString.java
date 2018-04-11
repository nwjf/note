package com.example.yunmeibao.yunmeibao.utils.stringutils;

/**
 * 服务器地址
 * Created by tx on 2017/2/28.
 */

public class UrlString extends com.yunmeibao.baselibrary.stringutils.UrlString {
    /**
     * 上传服务器基地址
     */
//    public static final String FANHUI_BASE_URL = "http://www.yunmei168.com";
//    public static final String FANHUI_BASE_URL = "http://192.168.1.152";
    /**
     * 登录url090
     */
    public final static String LOGIN = FANHUI_BASE_URL + "/mobilePort/versions2/mlogin";

    /**
     * 更新头像
     */
    public static final String UPLOAD_USERPICTURE = FANHUI_BASE_URL + "/mobilePort/versions2/upload_picture";

    /**
     * 通过手机号获取头像
     */
    public static final String USER_PICTURE = FANHUI_BASE_URL + "/mobilePort/membersPictures";

    /**
     * 检测手机号码是否可以使用
     */
    public final static String CHECKPHONE = FANHUI_BASE_URL + "/mobilePort/checkphone";

    /**
     * 获取手机验证码
     */
    public final static String GETREGISTERCODE = FANHUI_BASE_URL + "/mobilePort/getRegisterCode";

    /**
     * 检测手机验证码
     */
    public final static String CHECKCODE = FANHUI_BASE_URL + "/mobilePort/checkcode";


    /**
     * 注册url
     */
    public final static String REGISTER = FANHUI_BASE_URL + "/mobilePort/register";

    /**
     * 忘记密码
     * <p>
     * post请求
     */
    public final static String FORGOTPASSWORD = FANHUI_BASE_URL + "/mobilePort/forgotPassword";

    /***
     * 实名认证
     * 编号075
     */
    public static final String NAMEYANZHENG = FANHUI_BASE_URL + "/mobilePort/versions2/realName";

    /**
     * 意见反馈
     * <p>
     * post请求
     */
    public final static String FEEDBACK = FANHUI_BASE_URL + "/mobilePort/clearing/feedback";

    /**
     * 查看资金信息
     * <p>
     * get请求
     * 编号026
     */
    public final static String MONEYINFO = FANHUI_BASE_URL + "/mobilePort/member/moneyInfo";

    /***
     * 我的抢单列表
     * 编号087
     */
    public static final String USERQIANGDANLIST = FANHUI_BASE_URL + "/mobilePort/versions2/queryMyGrabOrders";

    /**
     * 取消订单
     * <p>
     * get请求
     */
    public final static String ABLROGATEORDER = FANHUI_BASE_URL + "/mobilePort/member/ablrogateOrder";

    /**
     * 我的抢单中删除订单
     */
    public static final String DELETEORDER = FANHUI_BASE_URL + "/mobilePort/member/deleteOrder";

    /**
     * 看相应的订单派送的司机信息
     * <p>
     * get请求
     * 编号041
     */
    public final static String SELECTSENDINFO = FANHUI_BASE_URL + "/mobilePort/member/selectSendInfo";
    /**
     * 申请结算
     * <p>
     * get请求
     * 编号042
     */
    public final static String BALANCESAVE = FANHUI_BASE_URL + "/mobilePort/clearing/balancesave";

    /**
     * 货源详情，新接口
     * 编号：084
     */
    public static final String HY_XQ = FANHUI_BASE_URL + "/mobilePort/versions2/queryHyOrderInfo";

    /**
     * 发货订单 list 新接口
     * 编号086
     */
    public static final String FaHuoDingDan = FANHUI_BASE_URL + "/mobilePort/versions2/queryMyOrders";

    /**
     * 修改订单
     * <p>
     * get请求
     */
    public final static String CHANGEORDER = FANHUI_BASE_URL + "/mobilePort/member/changeOrder";

    /**
     * 查看司机信息10
     * <p>
     * get请求
     */
    public final static String SELECTSJ = FANHUI_BASE_URL + "/mobilePort/member/selectSJ";

    /**
     * 添加修改司机009
     * <p>
     * get请求
     */
    public final static String SAVESJ = FANHUI_BASE_URL + "/mobilePort/member/saveSJ";

    /**
     * 删除司机信息
     * <p>
     * get请求
     */
    public final static String DELETSJ = FANHUI_BASE_URL + "/mobilePort/member/deletSJ";

    /**
     * 货源列表085
     */
    public static final String HUOYUANLIST = FANHUI_BASE_URL + "/mobilePort/versions2/queryHyOrderlist";

    /**
     * 验证是否是自己的单
     */
    public final static String ISMESENDCAR = FANHUI_BASE_URL + "/mobilePort/checkPermission";

    /**
     * 结算记录
     * 编号078
     */
    public static final String SHENQINGJIESUANJILU = FANHUI_BASE_URL + "/mobilePort/clearing/balanceStatis";

    /**
     * 结算记录详情
     * 编号079
     */
    public static final String FUKUANJILUDETAILS = FANHUI_BASE_URL + "/mobilePort/clearing/balanceStatisDetail";

    /**
     * 个人中心-付款/申请记录(老的结算详情接口不再使用)
     * 编号231
     */
    public static final String SETTLEMENTLIST = FANHUI_BASE_URL + "/mobilePort/clearing/pay_list";

    /**
     * 货主申请修改结算
     * 编号045
     */
    public static final String HUOZHUSHENQINGXIUGAI = FANHUI_BASE_URL + "/mobilePort/clearing/applyUpdateBalan";

    /**
     * 判断支付金额是否充足
     * post请求
     * 编号057
     */
    public final static String JUDGEMONEY = FANHUI_BASE_URL + "/mobilePort/clearing/judgeMoney";

    /**
     * 确认支付结算金额
     * post请求
     * 编号058
     */
    public final static String PAYBILL = FANHUI_BASE_URL + "/mobilePort/clearing/payBill";

    /**
     * 物流申请修改吨数
     */
    public static final String WULIUSHENQINGXIUGAI = FANHUI_BASE_URL + "/mobilePort/clearing/update";

    /**
     * 新抢单接单接口80
     */
    public final static String NEW_SENDCAR = FANHUI_BASE_URL + "/mobilePort/orderReceiving";

    /**
     * 货主选择查看抢单车主信息
     * 编号： 116
     */
    public final static String CARUSER = FANHUI_BASE_URL + "/mobilePort/versions2/queryGrabRecord";

    /**
     * 查看派送过的   司机信息
     * <p>
     * get请求
     * 编号030
     */
    public final static String SELECTSEND = FANHUI_BASE_URL + "/mobilePort/member/selectSend";

    /**
     * 选择订单 物流公司列表016
     * <p>
     * get请求
     */
    public final static String CHOOSELOGISTICS = FANHUI_BASE_URL + "/mobilePort/member/chooseLogistics";

    /**
     * 充值记录
     * <p>
     * get请求
     */
    public final static String ADDMONEYRECORD = FANHUI_BASE_URL + "/mobilePort/member/addMoneyRecord";

    /**
     * 提现记录
     * <p>
     * get请求
     */
    public final static String WITHDRAWRECORD = FANHUI_BASE_URL + "/mobilePort/member/withdrawRecord";

    /**
     * 交易记录
     * <p>
     * get请求
     * 编号027
     */
    public final static String MONEYRECORD = FANHUI_BASE_URL + "/mobilePort/member/moneyRecord";

    /**
     * 银行卡记录
     * <p>
     * get请求
     * 编号036
     */
    public final static String SELECTBANK = FANHUI_BASE_URL + "/mobilePort/member/selectBank";

    /**
     * 删除绑定的银行卡
     * <p>
     * get请求
     */
    public final static String DELETBANK = FANHUI_BASE_URL + "/mobilePort/member/deletBank ";
    /**
     * 添加银行卡
     * <p>
     * get请求
     * 编号025
     */
    public final static String BANKINFO = FANHUI_BASE_URL + "/mobilePort/member/bankInfo";
    /**
     * 生活圈列表
     * 和登陆者个人圈子列表一个接口，传参不同
     * get请求
     */
    public final static String LIFECIRCLELIST = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/lifecircle_query";
    /***
     * 生活圈发布说说(带图片)
     * 编号104
     */
    public static final String LIFECIRCLEREALEASEWITHIMGS = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/lifecircle_save";
    /**
     * 生活圈发说说不带图片
     * 编号109
     */
    public static final String LIFECIRCLEREALEASE = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/lifecircle_save2";
    /**
     * 生活圈个人的资料页
     * 编号  :  106
     */
    public static final String LIFECIRCLEUSERINFO = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/personalInfo";
    /**
     * 获取对某个人的关注状态
     */
    public static final String ISFOCUSED = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/focusrecord_check";
    /**
     * 关注某人
     */
    public static final String ADDANDCANCELFOCUS = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/focusrecord_save";
    /**
     * 提现申请
     * <p>
     * get请求
     * 编号033
     */
    public final static String WITHDRAW = FANHUI_BASE_URL + "/mobilePort/member/withdraw";

    /**
     * 发货统计查询接口
     */
    public final static String FAHUOTONGJI = FANHUI_BASE_URL + "/mobilePort/versions2/statistical_query";
    /**
     * 个人圈子删除发表的说说
     */
    public static final String DELETESPEECH = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/Lifecircle_del";
    /**
     * 评论文章
     */
    public static final String COMMENTARTICLE = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/commentrecord_save";
    /**
     * 评论列表
     */
    public static final String COMMENTLIST = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/commentrecord_query";
    /**
     * 删除评论
     */
    public static final String DELETECOMMENT = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/commentrecord_del";
    /**
     * 生活圈详情点赞和取消点赞
     */
    public static final String DODIANZAN = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/lifecircle_update";

    /**
     * 发货统计标题
     * post请求
     */
    public final static String ADDTRANSPORTTITLE = FANHUI_BASE_URL + "/mobilePort/clearing/addTransportTitle";

    /**
     * 发货统计----添加运输车辆的信息
     * post请求
     */
    public final static String ADDTRANSPORTCAR = FANHUI_BASE_URL + "/mobilePort/clearing/addTransportCar";

    /**
     * 发货统计----查询运输车辆信息
     * post请求
     */
    public final static String SELTRANSPORTCAR = FANHUI_BASE_URL + "/mobilePort/clearing/selTransportCar";
    /**
     * 发货统计----删除运输车辆信息
     * post请求
     */
    public final static String DELTRANSPORTCAR = FANHUI_BASE_URL + "/mobilePort/clearing/delTransportCar";

    /**
     * 删除统计标题
     */
    public final static String Statistical_Del = FANHUI_BASE_URL + "/mobilePort/versions2/statistical_del";

    /**
     * 订阅列表中订阅路线
     */
    public static final String SUBSCRIBELINE = FANHUI_BASE_URL + "/mobilePort/member/subscriber";
    /***
     * 查询车源列表信息(和车源详情一个接口，用户ID不为空时，查询自己的车源信息)
     * <p>
     * CarSourceActivity,CarMasterInfoActivity,CarSouceInfoEditActivity
     */
    public static final String QUERYCARSOUCEIST = FANHUI_BASE_URL + "/mobilePort/versions2/vehicleOwnerInfo_query";
    /**
     * 查询自己发布的货源记录信息（从车源信息点击分享货源进入,一周内发布的源）
     */
    public static final String QUERYMYHUOYUANONEWEEKORDERS = FANHUI_BASE_URL + "/mobilePort/versions2/queryMyOrders";

    /**
     * 新的首页
     * 编号074
     */
    public static final String HOMEYOUXUAN = FANHUI_BASE_URL + "/mobilePort/indexOptimized";
//    public static final String HOMEYOUXUAN = "http://www.yunmei168.com" + "/mobilePort/indexOptimized"; //测试轮播图
    /***
     * 会员中心查询自己发布的货源记录信息（从车源信息点击分享货源进入,一周内发布的源），点击分享按钮
     */
    public static final String SHAREMYHUOYUANTODRIVER = FANHUI_BASE_URL + "/mobilePort/versions2/shareRecords_save";

    /**
     * 车源信息编辑保存
     */
    public static final String SAVEVEHICLEINFO = FANHUI_BASE_URL + "/mobilePort/versions2/vehicleOwnerInfo_save";
    /**
     * 查询我的订阅列表
     */
    public static final String USERSUBSCRIBELIST = FANHUI_BASE_URL + "/mobilePort/versions2/queryMySubscribe";
    /**
     * 取消某一条我的订阅路线
     */
    public static final String USERDELETESUBSCRIBELINE = FANHUI_BASE_URL + "/mobilePort/versions2/cancel_subscriber";

    /**
     * 右上角铃铛里的通知简略信息(最新一条信息)
     * 编号101
     */
    public static final String NOTICENOREAD = FANHUI_BASE_URL + "/mobilePort/versions2/Message_Center_Query";
    /***
     * 铃铛的通知列表，车主收到的分享信息列表(别人分享给我的)
     * 编号97
     */
    public static final String SHARERECORDSLIST = FANHUI_BASE_URL + "/mobilePort/versions2/shareRecords_query";
    /**
     * 首页铃铛里的分享记录
     */
    public static final String MYSHAREHISTORY = FANHUI_BASE_URL + "/mobilePort/versions2/MyshareRecords_query";
    /**
     * 找司机列表
     */
    public static final String FINDDRIVER = FANHUI_BASE_URL + "/mobilePort/jobRecruitment/jobRecruit_query";

    /**
     * 发布订单   /找车
     * 大小写切换 ctrl + shift + u
     * 编号006
     */
    public final static String RELEASE = FANHUI_BASE_URL + "/mobilePort/release";


    /**
     * 新的首页订阅（和新的订阅列表以及优选更多列表一个接口，参数不同，首页订阅不传参，订阅列表和优选列表传参数
     * pagesNo 和querykey，querykey为空时默认是订阅更多，否则是优选更多）
     */
    public static final String HOMEDINGYUE = FANHUI_BASE_URL + "/mobilePort/indexSubscription";

    /**
     * 找司机找老板信息保存接口
     */
    public static final String JOBRECRUITSAVE = FANHUI_BASE_URL + "/mobilePort/jobRecruitment/jobRecruit_save";
    /***
     * 分享记录详情
     */
    public static final String MYSHAREDETAILINFO = FANHUI_BASE_URL + "/mobilePort/versions2/MyshareRecordsDetail_query";

    /**
     * 查看会员基本信息
     * <p>
     * get请求
     * 编号023
     */
    public final static String USERINFO = FANHUI_BASE_URL + "/mobilePort/member/userinfo";

    /***
     * 判断是否已进行公司认证或者司机认证
     */
    public static final String JOBRECRUITCHECK = FANHUI_BASE_URL + "/mobilePort/jobRecruitment/jobRecruit_check";
    /**
     * 邀请司机请求
     * 编号121
     */
    public static final String INVITEDRIVER = FANHUI_BASE_URL + "/mobilePort/jobRecruitment/jobinviterecords_save";

    /**
     * 招聘求职记录接口
     */
    public static final String RECRUITJOBHISTORY = FANHUI_BASE_URL + "/mobilePort/jobRecruitment/jobRecruit_recruit";

    /**
     * 招聘记录里提醒查看
     */
    public static final String REMINDTOLOOK = FANHUI_BASE_URL + "/mobilePort/jobRecruitment/jobinviterecords_warn";

    /**
     * 版本更新
     */
    public static final String UPDATA_APP = FANHUI_BASE_URL + "/mobilePort/versionUpdate";

    /**
     * 新 2017/05/11  注册获取手机验证码
     * 编号124
     */
    public static final String USER_CODE = FANHUI_BASE_URL + "/mobilePort/versions2/registerCode_get";

    /**
     * 新  注册 用户
     * 编号125
     */
    public final static String REGISTER_NEW = FANHUI_BASE_URL + "/mobilePort/versions2/register_save";

    /**
     * 获取支付宝秘钥
     */
    public final static String ALIPAYCONFIG = FANHUI_BASE_URL + "/mobilePort/member/alipayConfig";

    /**
     * 向服务器发送支付信息
     * 编号028
     */
    public final static String ADDMONEY = FANHUI_BASE_URL + "/mobilePort/member/addMoney";

    /**
     * 搜索历史记录
     * 编号103
     */
    public static final String SEARCHHISTORY = FANHUI_BASE_URL + "/mobilePort/versions2/SearchHistory_query";

    /**
     * 搜索（保存搜索记录）
     * 编号102
     */
    public static final String SAVESEARCHHISTORY = FANHUI_BASE_URL + "/mobilePort/versions2/SearchHistory_save";

    /**
     * 煤炭信息保存    买煤  and   卖煤
     */
    public final static String COALINFOSAVE = FANHUI_BASE_URL + "/CoalInfoPort/coalInfoSave";

    /**
     * 煤炭信息查询
     */
    public final static String COALINFOLIST = FANHUI_BASE_URL + "/CoalInfoPort/coalInfoList";

    /**
     * 煤炭信息-买煤卖煤意向反馈-保存
     */
    public final static String COALFEEDBACK = FANHUI_BASE_URL + "/CoalInfoPort/feedback";

    /**
     * 别人的意向  ---
     */
    public final static String OTHERINTENTURL = FANHUI_BASE_URL + "/CoalInfoPort/intentionRecord";

    /**
     * 我的意向  ---》煤炭列表
     */
    public final static String MYINTENTURL = FANHUI_BASE_URL + "/CoalInfoPort/myIntentionRecord";

    /**
     * 货源详情下方的猜你喜欢列表
     */
    public final static String GUESSULIKELIST = FANHUI_BASE_URL + "/mobilePort/versions2/BrowsingHistory_query";

    /**
     * 调用此接口判断是否真正的充值成功
     * 编号029
     */
    public final static String RECHARGESUCCSE = FANHUI_BASE_URL + "/mobilePort/member/succse";

    /**
     * 生活圈他人的圈子列表
     * 编号131
     */
    public final static String LIFECIRCLEOTHER = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/lifecircle_queryByMobile";

    /**
     * 微信获取预付订单id
     * 编号031
     */
    public final static String GETWXPREPAYID = FANHUI_BASE_URL + "/mobilePort/member/Getwxpay";

    /**
     * 邀请码  类型1=添加车辆，2=预约发送信息
     * 编号132
     */
    public final static String YAOQINGMA = FANHUI_BASE_URL + "/mobilePort/getAuthCode";
    /**
     * 企业入驻 保存
     * 编号134
     */
    public final static String QIYERUZHU = FANHUI_BASE_URL + "/mobilePort/versions2/enterpriseauth_save";
    /**
     * 是否企业入驻查询
     * 编号133
     */
    public final static String ISQIYERUZHU = FANHUI_BASE_URL + "/mobilePort/versions2/enterpriseauth_query";

    /**
     * 预约列表135
     */
    public final static String APPOINTMENTLIST = FANHUI_BASE_URL + "/mobilePort/appointment/appointment_query";

    /**
     * 订单预约界面(重新预约也是跳转到该界面)
     * 编号139
     */
    public final static String APPOINTEMNTORDER = FANHUI_BASE_URL + "/mobilePort/appointment/appointManage_updateStatus";

    /**
     * 根据入住厂商类型获取相应工厂列表
     * 编号137
     */
    public final static String VENDERINFOLIST = FANHUI_BASE_URL + "/mobilePort/appointment/venderinfoByType";

    /**
     * 提交预约接口
     * 编号140
     */
    public final static String APPOINTMENTCOMMIT = FANHUI_BASE_URL + "/mobilePort/appointment/appointment_save";

    /**
     * 预约管理列表
     * 编号138
     */
    public final static String APPOINTMANAGELISTQUERY = FANHUI_BASE_URL + "/mobilePort/appointment/appointManage_querry";

    /**
     * 获取车牌号
     * 编号141
     */
    public final static String APPOINTDRIVERNUMBER = FANHUI_BASE_URL + "/mobilePort/appointment/appoint_divernumber";

    /**
     * 预约 统计
     */
    public final static String APPOINTSTATISTICS = FANHUI_BASE_URL + "/mobilePort/appointment/appointStatistics_querry";

    /**
     * 发运计划（供应预报）提交147
     */
    public final static String SUPPLYNOTICESAVE = FANHUI_BASE_URL + "/mobilePort/supplyNotice/supplyNotice_save";

    /**
     * 发运记录查询148
     */
    public final static String SUPPLYNOTICEQUERY = FANHUI_BASE_URL + "/mobilePort/supplyNotice/supplyNotice_query";

    /**
     * 更改发运记录查看状态
     */
    public final static String SUPPLYNOTICESURE = FANHUI_BASE_URL + "/mobilePort/supplyNotice/supplyNotice_sure";

    /**
     * 获取公告列表152
     */
    public final static String FACTORYMESSAGELIST = FANHUI_BASE_URL + "/mobilePort/venderNotice/notice_query";

    /**
     * 获取新闻圈列表
     */
    public final static String NEWSCIRCLELIST = FANHUI_BASE_URL + "/mobilePort/appNewsPort/newslist";

    /**
     * 发运记录的删除
     */
    public final static String SUPPLYNOTICEDELETE = FANHUI_BASE_URL + "/mobilePort/supplyNotice/supplyNotice_delete";

    /**
     * 获取供应商列表156
     */
    public static final String COMPANYLITSQUERY = FANHUI_BASE_URL + "/mobilePort/vendorManage/companyList_query";

    /**
     * 我的卡券
     */
    public static final String MYCOUPONINFO_QUERY = FANHUI_BASE_URL + "/mobilePort/appointment/myCouponinfo_query";

    /**
     * 获取预约和发运计划的厂家类别
     * 编号167
     */
    public static final String QUERYFACTORYTYPE = FANHUI_BASE_URL + "/mobilePort/appointment/venderinfoType_query";

    /**
     * 获取产品类别
     * 编号168
     */
    public static final String QUERYPRODUCTTYPE = FANHUI_BASE_URL + "/mobilePort/appointment/appointment_product_query";

    /**
     * 添加车辆时根据车牌获取信息172
     */
    public static final String QUERYCARINFO = FANHUI_BASE_URL + "/mobilePort/member/divernumber_query";

    /**
     * 获取车辆动态
     * 编号  :  174
     */
    public static final String QUERYVEHICLETRENDS = FANHUI_BASE_URL + "/mobilePort/dynamicVehicle/vehicleTrends_query";

    /**
     * 查询常用车辆175
     */
    public static final String QUERYCOMMONLYUSEDCAR = FANHUI_BASE_URL + "/mobilePort/dynamicVehicle/commonVehicle_query";

    /**
     * 查询车辆忙碌状态的原因173
     */
    public static final String QUERYBUSYRESON = FANHUI_BASE_URL + "/mobilePort/member/getReasonByCarNumber";

    /**
     * 更改闲忙状态177
     */
    public static final String UPDATEDRIVERSTATE = FANHUI_BASE_URL + "/mobilePort/member/diverstatus_update";

    /**
     * 获取车辆动态 根据货源编号hyid获取所有抢他单的车辆
     * 编号  :  176
     */
    public static final String QUERYVEHICLETRENDS02_HYID = "hyid";//	String	Y		货源编号
    public static final String QUERYVEHICLETRENDS02 = FANHUI_BASE_URL + "/mobilePort/member/getDiverByHyid";

    /**
     * 我的预约排号查询
     * 编号  :    178
     */
    public static final String MYNUMBERQUERY_VENDERID = "venderid";//	String	Y		厂家ID
    public static final String MYNUMBERQUERY_APPOINTMENTDATE = "appointmentdate";//	String	Y		预约日期
    public static final String MYNUMBERQUERY = FANHUI_BASE_URL + "/mobilePort/appointment/myNumber_query";

    /**
     * 停止接单018
     */
    public static final String STOPORDER = FANHUI_BASE_URL + "/mobilePort/member/giveupall";

    /**
     * 合作记录
     */
    public static final String COOPERATIONHISTORY = FANHUI_BASE_URL + "/mobilePort/dynamicVehicle/commonVehicle_detail";

    /**
     * 删除常用车辆
     */
    public static final String DELETECOMMONLYVEHICLE = FANHUI_BASE_URL + "/mobilePort/dynamicVehicle/commonVehicle_delete";

    /**
     * 司机入驻注册
     * 编号183
     */
    public static final String DRIVERREGISTERSAVE = FANHUI_BASE_URL + "/mobilePort/versions2/diver_register_save";

    /**
     * 设置支付密码
     * 编号185
     */
    public static final String SAVEPASSWORD = FANHUI_BASE_URL + "/mobilePort/versions2/payPassword_save";

    /**
     * 修改登录密码
     */
    public static final String MODIFYLOGINPWD = FANHUI_BASE_URL + "/mobilePort/member/loginPassword_update";

    /**
     * 校验修改支付密码时获取的验证码
     */
    public static final String CHECKPAYVERIFICATIONCODE = FANHUI_BASE_URL + "/mobilePort/versions2/checkPayCode";

    /**
     * 获取修改支付密码时的验证码
     */
    public static final String GETPAYVERIFICATIONCODE = FANHUI_BASE_URL + "/mobilePort/versions2/sendCode_updatePayPassword";

    /**
     * 车辆动态定位-单车定位查询
     * 编号189
     */
    public static final String QUERYVEHICLELOCATION = FANHUI_BASE_URL + "/mobilePort/dynamicVehicle/commonVehicle_GPS_query";

    /**
     * 车辆动态根据类型查询月是否充足
     * 编号191
     */
    public static final String BALANCEQUERY = FANHUI_BASE_URL + "/mobilePort/dynamicVehicle/balanceQuery";

    /**
     * 车辆动态轨迹查询
     * 编号  :  190
     */
    public static final String COMMONGPSTRACK_Mobole = "mobile";//	String	Y		手机号
    public static final String COMMONGPSTRACK_Divernumber = "divernumber";//	String	Y		车牌号
    public static final String COMMONGPSTRACK_Userid = "userid";//	String	Y		用户id
    public static final String COMMONGPSTRACK_Starttime = "starttime";//	String	Y		开始时间
    public static final String COMMONGPSTRACK_Endtime = "endtime";//	String	Y		结束时间
    public static final String COMMONGPSTRACK = FANHUI_BASE_URL + "/mobilePort/dynamicVehicle/commonVehicle_GPS_track";

    /**
     * 根据预约编号获取进厂车辆信息，包括车牌，车型，长宽高，拉筋
     * 编号192
     */
    public static final String GETDETAILCARINFO = FANHUI_BASE_URL + "/mobilePort/appointment/getDetailByCarNumber";

    /**
     * 保存油卡
     * 编号198
     */
    public static final String SAVEOILCARD = FANHUI_BASE_URL + "/mobilePort/versions2/oilCard_save";

    /**
     * 油卡列表
     * 编号200
     */
    public static final String OILCARDLIST = FANHUI_BASE_URL + "/mobilePort/versions2/oilCard_list";

    /**
     * 油卡删除
     * 编号199
     */
    public static final String DELETEOILCARD = FANHUI_BASE_URL + "/mobilePort/versions2/oilCard_del";

    /**
     * 铃铛里的通知列表
     * 编号203
     */
    public static final String NOTICEMESSAGELIST = FANHUI_BASE_URL + "/mobilePort/versions2/notificationMessage";

    /**
     * 预约装车保存
     * 编号208
     */
    public static final String APPOINTMENTLOADINGSAVE = FANHUI_BASE_URL + "/mobilePort/appointmentloading/appointmentLoading_save";

    /**
     * 预约装车-获取车牌、供货公司名、货源类型、ordernum
     * 编号211
     */
    public static final String GETAPPOINTMENTLOADINGDATA = FANHUI_BASE_URL + "/mobilePort/appointmentloading/getDriverAndOrderData";

    /**
     * 预约装车-上传进度-保存
     * 编号215
     */
    public static final String REPORTPROGRESSSAVE = FANHUI_BASE_URL + "/mobilePort/versions2/reportProgress_save";

    /**
     * 预约装车-通过预约编号获取详情
     * 编号  :  216
     */
    public static final String JSUP_RESERVATIONXQ_APPOINTMENTNUM = "appointmentnum";//	String	Y		厂商id
    public static final String JSUP_RESERVATIONXQ = FANHUI_BASE_URL + "/mobilePort/appointmentloading/getALoadingByAnum";

    /**
     * 预约装车-通过抢单编号获取预约记录的所有车牌，上报进度页面使用
     * 编号218
     */
    public static final String GETLOADINGDRIVERBYORDERNUM = FANHUI_BASE_URL + "/mobilePort/versions2/getApLoadingDiverByOrderNum";

    /**
     * 预约管理-上报进度保存(预约进场)
     * 编号220
     */
    public static final String APPOINTMENTREPORTPROGRESSSAVE = FANHUI_BASE_URL + "/mobilePort/appointment/appointReportProgress_save";

    /**
     * 货主删除物流司机
     * 编号 222
     */
    public static final String DELLOGISTICSINFO = FANHUI_BASE_URL + "/mobilePort/versions2/logisticsinfo_del";

    /**
     * 修改预约信息
     * 编号223
     */
    public static final String UPDATEAPPOINTMENTINFO = FANHUI_BASE_URL + "/mobilePort/appointment/appointment_update";

    /**
     * 获取银行卡列表
     * 编号230
     */
    public static final String BANKLIST = FANHUI_BASE_URL + "/mobilePort/member/bankCardManage_list";

    /**
     * 图片识别
     */
    public static final String IMAGERECOGNITION = FANHUI_BASE_URL + "/mobilePort/member/imageRecognition";

    /**
     * 上传视频
     */
    public static final String LIFECIRCLESAVEVIDEO = FANHUI_BASE_URL + "/mobilePort/ymbLifecircle/lifecircle_save_video";

    /**
     * 商城列表
     */
    public static final String GOODSLIST = FANHUI_BASE_URL + "/mobilePort/shopping/goodsRecords_list";

    /**
     * 加入购物车
     */
    public static final String ADDTOSHOPCART = FANHUI_BASE_URL + "/mobilePort/shopping/shoppingCart_save";

    /**
     * 购物车列表
     */
    public static final String SHOPCARTLIST = FANHUI_BASE_URL + "/mobilePort/shopping/shoppingCart_list";

    /**
     * 删除购物车订单
     */
    public static final String DELETESHOPPINGCARTORDER = FANHUI_BASE_URL + "/mobilePort/shopping/shoppingCart_delete";

    /**
     * 添加地址
     */
    public static final String SAVEADDRESS = FANHUI_BASE_URL + "/mobilePort/shopping/userAddress_save";

    /**
     * 收货地址列表
     */
    public static final String ADDRESSLIST = FANHUI_BASE_URL + "/mobilePort/shopping/userAddress_list";

    /**
     * 删除收货地址
     */
    public static final String DELETEADDRESS = FANHUI_BASE_URL + "/mobilePort/shopping/userAddress_delete";

    /**
     * 商城详情
     */
    public static final String GOODSINFO = FANHUI_BASE_URL + "/mobilePort/shopping/goodsRecords_detail";

    /**
     * 保存订单
     */
    public static final String SAVEORDER = FANHUI_BASE_URL + "/mobilePort/shopping/shoppingOrder_save";

    /**
     * 订单列表
     */
    public static final String GOODSORDERLIST = FANHUI_BASE_URL + "/mobilePort/shopping/shoppingOrder_list";

}
