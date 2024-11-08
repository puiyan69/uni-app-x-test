@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.uniStat;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.unicloud.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.addInterceptor as uni_addInterceptor;
import io.dcloud.uniapp.extapi.getAppBaseInfo as uni_getAppBaseInfo;
import io.dcloud.uniapp.extapi.getPushClientId as uni_getPushClientId;
import io.dcloud.uniapp.extapi.getStorageSync as uni_getStorageSync;
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync;
import io.dcloud.uniapp.extapi.setStorageSync as uni_setStorageSync;
open class ReportSuccess (
    @JsonNotNull
    open var errMsg: String,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("ReportSuccess", "uni_modules/uni-stat/utssdk/interface.uts", 1, 13)
    }
}
open class ReportFail (
    @JsonNotNull
    open var errMsg: String,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("ReportFail", "uni_modules/uni-stat/utssdk/interface.uts", 5, 13)
    }
}
open class ReportOptions (
    @JsonNotNull
    open var name: String,
    open var options: Any? = null,
    open var success: ((res: ReportSuccess) -> Unit)? = null,
    open var fail: ((res: ReportFail) -> Unit)? = null,
    open var complete: ((res: Any) -> Unit)? = null,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("ReportOptions", "uni_modules/uni-stat/utssdk/interface.uts", 14, 13)
    }
}
typealias Report = (options: ReportOptions) -> Unit;
open class UniStatOptions (
    open var debug: Boolean? = null,
    open var reportInterval: Number? = null,
    open var uniCloud: UniCloudInitOptions? = null,
    open var collectItems: UniStatCollectItemsOptions? = null,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("UniStatOptions", "uni_modules/uni-stat/utssdk/interface.uts", 110, 13)
    }
}
open class UniStatCollectItemsOptions (
    open var uniPushClientID: Boolean? = null,
    open var uniStatPageLog: Boolean? = null,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("UniStatCollectItemsOptions", "uni_modules/uni-stat/utssdk/interface.uts", 121, 13)
    }
}
open class OnLaunchOptionsWithCst (
    open var path: String? = null,
    open var cst: Number? = null,
    open var scene: Number? = null,
    open var query: String? = null,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("OnLaunchOptionsWithCst", "uni_modules/uni-stat/utssdk/interface.uts", 131, 13)
    }
}
open class ResidenceTimeReturn (
    @JsonNotNull
    open var residenceTime: Number,
    @JsonNotNull
    open var overtime: Boolean = false,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("ResidenceTimeReturn", "uni_modules/uni-stat/utssdk/interface.uts", 145, 13)
    }
}
open class RouteParams (
    @JsonNotNull
    open var path: String,
    @JsonNotNull
    open var fullpath: String,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("RouteParams", "uni_modules/uni-stat/utssdk/interface.uts", 155, 13)
    }
}
open class TitleConfigParams (
    @JsonNotNull
    open var config: String,
    @JsonNotNull
    open var page: String,
    @JsonNotNull
    open var report: String,
    @JsonNotNull
    open var lt: String,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("TitleConfigParams", "uni_modules/uni-stat/utssdk/interface.uts", 163, 13)
    }
}
open class PageParams (
    open var url: String? = null,
    open var ttpj: String? = null,
    open var ttn: String? = null,
    open var ttc: String? = null,
    open var ttct: String? = null,
    @JsonNotNull
    open var urlref: String,
    @JsonNotNull
    open var urlref_ts: Number,
    open var urlref_tt: String? = null,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("PageParams", "uni_modules/uni-stat/utssdk/interface.uts", 178, 13)
    }
}
open class RequestData (
    @JsonNotNull
    open var usv: String,
    @JsonNotNull
    open var t: Number,
    @JsonNotNull
    open var requests: String,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("RequestData", "uni_modules/uni-stat/utssdk/interface.uts", 201, 13)
    }
}
open class EventParams (
    @JsonNotNull
    open var key: String,
    open var value: String? = null,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("EventParams", "uni_modules/uni-stat/utssdk/interface.uts", 226, 13)
    }
}
open class StatDefault (
    @JsonNotNull
    open var uuid: String,
    @JsonNotNull
    open var ak: String,
    @JsonNotNull
    open var p: String,
    @JsonNotNull
    open var ut: String,
    open var mpn: String? = null,
    open var usv: String? = null,
    open var v: String? = null,
    open var ch: String? = null,
    open var cn: String? = null,
    open var pn: String? = null,
    open var ct: String? = null,
    @JsonNotNull
    open var t: Number,
    open var tt: String? = null,
    open var brand: String? = null,
    open var md: String? = null,
    open var sv: String? = null,
    open var mpsdk: String? = null,
    open var mpv: String? = null,
    open var lang: String? = null,
    open var pr: Number? = null,
    open var ww: Number? = null,
    open var wh: Number? = null,
    open var sw: Number? = null,
    open var sh: Number? = null,
    open var sc: Number? = null,
    open var lt: String? = null,
    open var odid: String? = null,
    open var url: String? = null,
    open var fvts: Number? = null,
    open var lvts: Number? = null,
    open var tvc: Number? = null,
    open var cst: Number? = null,
    open var urlref_ts: Number? = null,
    open var urlref: String? = null,
    open var ttpj: String? = null,
    open var ttn: String? = null,
    open var ttc: String? = null,
    open var ttct: String? = null,
    open var cid: String? = null,
    open var e_n: String? = null,
    open var e_v: String? = null,
    open var lat: String? = null,
    open var lng: String? = null,
    open var net: String? = null,
    open var em: String? = null,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("StatDefault", "uni_modules/uni-stat/utssdk/interface.uts", 237, 13)
    }
}
typealias ErrorCallback = (is_err: Boolean, errMsg: String) -> Unit;
val APPID = uni_getSystemInfoSync().appId;
fun <T> dbSet(name: String, value: T) {
    var data = uni_getStorageSync("\$\$STAT__DBDATA:" + APPID);
    var newData: UTSJSONObject = object : UTSJSONObject(UTSSourceMapPosition("newData", "uni_modules/uni-stat/utssdk/common/utils/db.uts", 4, 9)) {
    };
    if (data != null && UTSAndroid.`typeof`( data) == "object") {
        newData = data as UTSJSONObject;
    }
    newData[name] = value;
    uni_setStorageSync("\$\$STAT__DBDATA:" + APPID, newData);
}
fun <T> dbGet(name: String): T? {
    var data = uni_getStorageSync("\$\$STAT__DBDATA:" + APPID);
    if (data == null) {
        return null;
    }
    if (UTSAndroid.`typeof`( data) != "object") {
        return null;
    }
    val newData = data as UTSJSONObject;
    return newData[name] as T;
}
fun dbRemove(name: String) {
    var data = uni_getStorageSync("\$\$STAT__DBDATA:" + APPID);
    if (data == "") {
        data = UTSJSONObject();
    }
    if (data != null) {
        var newData = data as UTSJSONObject;
        if (newData[name] != null) {
            newData[name] = null;
            uni_setStorageSync("\$\$STAT__DBDATA:" + APPID, newData);
        }
    }
}
val sys = uni_getSystemInfoSync();
val sysAppBase = uni_getAppBaseInfo(null);
val STAT_VERSION = sys.uniCompilerVersion;
val PAGE_PVER_TIME: Number = 1800;
val APP_PVER_TIME: Number = 300;
val OPERATING_TIME: Number = 10;
open class ConfigData : IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("ConfigData", "uni_modules/uni-stat/utssdk/common/config.uts", 13, 7);
    }
    private var options: UniStatOptions? = null;
    private constructor(){}
    open fun setOptions(reassignedOptions: UniStatOptions?) {
        var options = reassignedOptions;
        if (options == null) {
            options = UniStatOptions();
        }
        if (options.debug == null) {
            options.debug = false;
        }
        if (options.reportInterval == null) {
            options.reportInterval = 10;
        }
        if (options.collectItems == null) {
            options.collectItems = UniStatCollectItemsOptions();
        }
        var collectItems = options.collectItems as UniStatCollectItemsOptions;
        if (collectItems.uniPushClientID === null) {
            collectItems.uniPushClientID = false;
        }
        if (collectItems.uniStatPageLog === null) {
            collectItems.uniStatPageLog = true;
        }
        options.collectItems = collectItems;
        this.options = options;
    }
    open fun getOptions(): UniStatOptions {
        if (this.options == null) {
            this.setOptions(null);
        }
        return this.options as UniStatOptions;
    }
    companion object {
        var __config_instance: ConfigData? = null;
        public fun getInstance(): ConfigData {
            if (ConfigData.__config_instance == null) {
                ConfigData.__config_instance = ConfigData();
            }
            return ConfigData.__config_instance as ConfigData;
        }
    }
}
val Config = ConfigData.getInstance();
val FIRST_VISIT_TIME_KEY = "__first__visit__time";
val LAST_VISIT_TIME_KEY = "__last__visit__time";
val TOTAL_VISIT_COUNT = "__total__visit__count";
val FIRST_TIME = "__first_time";
val PAGE_RESIDENCE_TIME = "__page__residence__time";
var First_Page_Residence_Time: Number = 0;
var Last_Page_Residence_Time: Number = 0;
val get_time = fun(): Number {
    return Math.floor(Date().getTime() / 1000);
}
;
val set_first_time = fun(): Number {
    var time = get_time();
    dbSet(FIRST_TIME, time);
    return time;
}
;
val get_first_visit_time = fun(): Number {
    val timeStorge = dbGet<Number>(FIRST_VISIT_TIME_KEY);
    var time: Number;
    if (timeStorge != null && timeStorge != 0) {
        time = timeStorge as Number;
    } else {
        time = get_time();
        dbSet(FIRST_VISIT_TIME_KEY, time);
        dbRemove(LAST_VISIT_TIME_KEY);
    }
    return time;
}
;
val get_last_visit_time = fun(): Number {
    val timeStorge = dbGet<Number>(LAST_VISIT_TIME_KEY);
    var time: Number = 0;
    if (timeStorge != null && timeStorge != 0) {
        time = timeStorge as Number;
    }
    dbSet(LAST_VISIT_TIME_KEY, get_time());
    return time;
}
;
val get_total_visit_count = fun(): Number {
    val timeStorge = dbGet<Number>(TOTAL_VISIT_COUNT);
    var count: Number = 1;
    if (timeStorge != null) {
        count = timeStorge as Number;
        count++;
    }
    dbSet(TOTAL_VISIT_COUNT, count);
    return count;
}
;
val get_residence_time = fun(type: String): ResidenceTimeReturn {
    var residenceTime: Number = 0;
    val last_time = get_time();
    val first_time = (dbGet(FIRST_TIME) ?: last_time) as Number;
    if (first_time != 0) {
        residenceTime = last_time - first_time;
    }
    residenceTime = if (residenceTime < 1) {
        1;
    } else {
        residenceTime;
    }
    ;
    var timeData = ResidenceTimeReturn(residenceTime = residenceTime, overtime = false);
    if (type === "app") {
        var overtime = if (residenceTime > APP_PVER_TIME) {
            true;
        } else {
            false;
        }
        ;
        timeData.overtime = overtime;
        return timeData;
    }
    if (type === "page") {
        var overtime = if (residenceTime > PAGE_PVER_TIME) {
            true;
        } else {
            false;
        }
        ;
        timeData.overtime = overtime;
        return timeData;
    }
    return timeData;
}
;
val set_page_residence_time = fun(): Number {
    First_Page_Residence_Time = get_time();
    dbSet(PAGE_RESIDENCE_TIME, First_Page_Residence_Time);
    return First_Page_Residence_Time;
}
;
val get_page_residence_time = fun(): Number {
    Last_Page_Residence_Time = get_time();
    First_Page_Residence_Time = dbGet<Number>(PAGE_RESIDENCE_TIME) ?: 0;
    val diff: Number = Last_Page_Residence_Time - First_Page_Residence_Time;
    return diff;
}
;
open class StatType : IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("StatType", "uni_modules/uni-stat/utssdk/common/core/stat-type.uts", 5, 14);
    }
    companion object {
        var LifeCycleLaunch: Number = 1;
        var LifeCycleLoad: Number = 2;
        var LifeCycleAppShow: Number = 3;
        var LifeCycleAppHide: Number = 4;
        var LifeCyclePageShow: Number = 5;
        var LifeCyclePageHide: Number = 6;
        var LifeCyclePageUnLoad: Number = 7;
        var LifeCycleError: Number = 8;
    }
}
open class ReportType : IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("ReportType", "uni_modules/uni-stat/utssdk/common/core/stat-type.uts", 27, 14);
    }
    companion object {
        var AppStart: String = "1";
        var AppShow: String = "2";
        var AppHide: String = "3";
        var AppExit: String = "4";
        var PageShow: String = "11";
        var PageHide: String = "12";
        var Event: String = "21";
        var UTSError: String = "31";
        var Push: String = "101";
    }
}
open class ReprotCstType : IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("ReprotCstType", "uni_modules/uni-stat/utssdk/common/core/stat-type.uts", 62, 14);
    }
    companion object {
        var AppNormal: Number = 1;
        var AppAwakenTimeout: Number = 2;
        var PageStayTimeout: Number = 3;
    }
}
val AppShowParamsKeys = utsArrayOf(
    "uuid",
    "ak",
    "lt",
    "ut",
    "mpsdk",
    "mpv",
    "mpn",
    "v",
    "p",
    "sv",
    "net",
    "brand",
    "md",
    "lang",
    "lat",
    "lng",
    "pr",
    "ww",
    "wh",
    "sw",
    "sh",
    "url",
    "tt",
    "ch",
    "fvts",
    "lvts",
    "cn",
    "pn",
    "ct",
    "sc",
    "tvc",
    "usv",
    "t",
    "odid",
    "cst"
);
val AppHideParamsKeys = utsArrayOf(
    "ak",
    "uuid",
    "ttn",
    "ttpj",
    "ttc",
    "lt",
    "ut",
    "p",
    "urlref",
    "urlref_ts",
    "ch",
    "usv",
    "t"
);
val PageShowParamsKeys = utsArrayOf(
    "ak",
    "uuid",
    "lt",
    "ut",
    "p",
    "url",
    "ttpj",
    "ttn",
    "ttc",
    "ttct",
    "urlref",
    "urlref_ts",
    "ch",
    "usv",
    "t"
);
val PushParamsKeys = utsArrayOf(
    "lt",
    "cid",
    "t",
    "ut"
);
val EventParamsKeys = utsArrayOf(
    "ak",
    "uuid",
    "p",
    "lt",
    "ut",
    "url",
    "ch",
    "e_n",
    "e_v",
    "usv",
    "t"
);
val ErrorParamsKeys = utsArrayOf(
    "ak",
    "uuid",
    "p",
    "lt",
    "url",
    "ut",
    "ch",
    "mpsdk",
    "mpv",
    "v",
    "em",
    "usv",
    "t"
);
fun Serialize(obj: UTSJSONObject): String {
    var str: UTSArray<String> = utsArrayOf();
    for(p in obj){
        if (obj.hasOwnProperty(p)) {
            var key = obj[p];
            if (obj[p] == null) {
                key = "";
            }
            val text = p + "=" + key;
            str.push(text);
        }
    }
    return "?" + str.join("&");
}
fun IsNumber(value: Any?): Boolean {
    return UTSAndroid.`typeof`( value) === "number";
}
fun <T> FilterParam(keys: UTSArray<String> = utsArrayOf(), data: StatDefault): T {
    var result = object : UTSJSONObject(UTSSourceMapPosition("result", "uni_modules/uni-stat/utssdk/common/utils/index.uts", 42, 9)) {
    };
    keys.forEach(fun(key){
        result[key] = data[key];
    }
    );
    var formdata: T = result as T;
    return formdata;
}
fun Log(data: StatDefault, type: Boolean = false) {
    var logData = getEventData(data.lt!!, data);
    var msg_type: String = "";
    when (data.lt) {
        "1" -> 
            msg_type = "应用启动";
        "3" -> 
            msg_type = "应用进入后台";
        "11" -> 
            msg_type = "页面切换";
        "21" -> 
            msg_type = "事件触发";
        "31" -> 
            msg_type = "应用错误";
        "101" -> 
            msg_type = "PUSH";
    }
    if (type) {
        console.log("=== \u7EDF\u8BA1\u961F\u5217\u6570\u636E\u4E0A\u62A5 ===", " at uni_modules/uni-stat/utssdk/common/utils/index.uts:84");
        console.log(logData, " at uni_modules/uni-stat/utssdk/common/utils/index.uts:85");
        console.log("=== \u4E0A\u62A5\u7ED3\u675F ===", " at uni_modules/uni-stat/utssdk/common/utils/index.uts:86");
        return;
    }
    if (msg_type != "") {
        console.log("=== \u7EDF\u8BA1\u6570\u636E\u91C7\u96C6\uFF1A" + msg_type + " ===", " at uni_modules/uni-stat/utssdk/common/utils/index.uts:91");
        console.log(logData, " at uni_modules/uni-stat/utssdk/common/utils/index.uts:92");
        console.log("=== \u91C7\u96C6\u7ED3\u675F ===", " at uni_modules/uni-stat/utssdk/common/utils/index.uts:93");
    }
}
fun Map2String(statData: Map<String, UTSArray<StatDefault>>): String {
    var statDataJson = object : UTSJSONObject(UTSSourceMapPosition("statDataJson", "uni_modules/uni-stat/utssdk/common/utils/index.uts", 101, 9)) {
    };
    statData.forEach(fun(rd: UTSArray<StatDefault>, key: String){
        statDataJson[key] = rd;
    }
    );
    return JSON.stringify(statDataJson);
}
fun Map2Json(statData: Map<String, UTSArray<StatDefault>>): UTSJSONObject {
    var statDataJson = object : UTSJSONObject(UTSSourceMapPosition("statDataJson", "uni_modules/uni-stat/utssdk/common/utils/index.uts", 109, 9)) {
    };
    statData.forEach(fun(rd: UTSArray<StatDefault>, key: String){
        var arr: UTSArray<Any> = utsArrayOf();
        rd.forEach(fun(elm: StatDefault){
            var data = getEventData(key, elm);
            arr.push(data);
        }
        );
        statDataJson[key] = arr;
    }
    );
    return statDataJson;
}
val handle_data = fun(statData: Map<String, UTSArray<StatDefault>>): String {
    var firstArr: UTSArray<Any> = utsArrayOf();
    var contentArr: UTSArray<Any> = utsArrayOf();
    var lastArr: UTSArray<Any> = utsArrayOf();
    statData.forEach(fun(rd: UTSArray<StatDefault>, key: String){
        rd.forEach(fun(elm: StatDefault){
            var data = getEventData(key, elm);
            if (key == "1") {
                firstArr.push(data);
            } else if (key == "4") {
                lastArr.push(data);
            } else {
                contentArr.push(data);
            }
        }
        );
    }
    );
    firstArr.push(*contentArr.toTypedArray(), *lastArr.toTypedArray());
    return JSON.stringify(firstArr);
}
;
fun getEventData(lt: String, elm: StatDefault): Any {
    var data: Any = UTSJSONObject();
    when (lt) {
        "1" -> 
            data = FilterParam(AppShowParamsKeys, elm);
        "3" -> 
            data = FilterParam(AppHideParamsKeys, elm);
        "11" -> 
            data = FilterParam(PageShowParamsKeys, elm);
        "21" -> 
            data = FilterParam(EventParamsKeys, elm);
        "31" -> 
            data = FilterParam(ErrorParamsKeys, elm);
        "101" -> 
            data = FilterParam(PushParamsKeys, elm);
    }
    return data;
}
val APPID1 = sys.appId;
val RUNTIME_VERSION = sys.appVersion;
val get_uuid = fun(): String {
    return sys.deviceId;
}
;
val get_odid = fun(): String {
    return sys.deviceId;
}
;
val get_platform_name = fun(): String {
    var platformList = object : UTSJSONObject(UTSSourceMapPosition("platformList", "uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts", 92, 7)) {
        var app = "n"
        var `app-plus` = "n"
        var h5 = "h5"
        var web = "web"
        var `mp-weixin` = "wx"
        var `mp-baidu` = "bd"
        var `mp-toutiao` = "tt"
        var `mp-qq` = "qq"
        var `quickapp-native` = "qn"
        var `mp-kuaishou` = "ks"
        var `mp-lark` = "lark"
        var `quickapp-webview` = "qw"
    };
    val aliArr = utsArrayOf(
        "y",
        "a",
        "p",
        "mp-ali"
    );
    val aliKey = aliArr.reverse().join("");
    platformList[aliKey] = "ali";
    val platform = sys.uniPlatform;
    return platformList[platform] as String;
}
;
val get_pack_name = fun(): String {
    var packName = "";
    if (get_platform_name() === "n") {
        if (sys.osName == "android") {
            packName = sysAppBase.packageName ?: "";
        }
        if (sys.osName == "ios") {
            packName = sysAppBase.bundleId ?: "";
        }
    }
    return packName;
}
;
val get_channel = fun(): String {
    var channel = "";
    return channel;
}
;
val get_scene = fun(_: OnLaunchOptionsWithCst): Number {
    return 1001;
}
;
val is_page = fun(appInstance: ComponentPublicInstance): Boolean {
    return true;
}
;
val get_page_name = fun(routepath: String): String {
    var page = get_page_vm();
    if (page == null) {
        return "";
    }
    if (page.route != routepath) {
        val pages = getCurrentPages();
        var page_now = pages.find(fun(v): Boolean {
            if (v.route == routepath) {
                return true;
            }
            return false;
        }
        );
        if (page_now == null) {
            return "";
        }
        page = page_now;
    }
    val pageStyle = page.`$getPageStyle`();
    val titleText = pageStyle["navigationBarTitleText"] ?: "";
    return titleText as String;
}
;
val get_page_vm = fun(): Page? {
    var pages = getCurrentPages();
    if (pages.length == 0) {
        return null;
    }
    var page = pages[pages.length - 1];
    return page;
}
;
fun get_route(page: Page? = null): RouteParams {
    var _self = page ?: get_page_vm();
    if (_self == null) {
        val data = RouteParams(path = "", fullpath = "");
        return data;
    }
    val opts = UTSJSONObject(_self.options, UTSSourceMapPosition("opts", "uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts", 275, 9));
    var url_params = Serialize(opts);
    var params = "";
    if (url_params != "?") {
        params = url_params;
    }
    var route = _self.route;
    val data = RouteParams(path = route, fullpath = route + params);
    return data;
}
val is_page_report = fun(): Boolean {
    val uniStatConfig = Config.getOptions();
    val collectItems = uniStatConfig.collectItems;
    if (collectItems != null) {
        val statPageLog = collectItems.uniStatPageLog;
        if (statPageLog == null) {
            return true;
        }
        return if (UTSAndroid.`typeof`( statPageLog) == "boolean") {
            statPageLog;
        } else {
            true;
        }
        ;
    }
    return true;
}
;
val IS_HANDLE_DEVECE_ID = "is_handle_device_id";
val is_handle_device = fun(): Boolean {
    var isHandleDevice = dbGet(IS_HANDLE_DEVECE_ID) ?: "";
    dbSet(IS_HANDLE_DEVECE_ID, "1");
    return isHandleDevice === "1";
}
;
val get_default_data = fun(): StatDefault {
    var statData = StatDefault(uuid = get_uuid(), ak = APPID1, p = if (sys.osName == "android") {
        "a";
    } else {
        "i";
    }
    , ut = get_platform_name(), mpn = get_pack_name(), usv = STAT_VERSION, v = RUNTIME_VERSION, ch = get_channel(), cn = "", pn = "", ct = "", t = get_time(), tt = "", brand = sys.deviceBrand, md = sys.deviceModel, sv = sys.osVersion.replace(UTSRegExp("(Android|iOS)\\s", ""), ""), mpsdk = sys.SDKVersion, mpv = sys.uniCompilerVersionCode.toString(), lang = sys.osLanguage, pr = sys.devicePixelRatio, ww = sys.windowWidth, wh = sys.windowHeight, sw = sys.screenWidth, sh = sys.screenHeight, lat = "", lng = "", net = "", odid = "");
    return statData;
}
;
val get_report_Interval = fun(defaultTime: Number): Number {
    val uniStatConfig = Config.getOptions();
    var time = uniStatConfig.reportInterval;
    if (!IsNumber(time)) {
        return defaultTime;
    }
    if (time == 0) {
        return 0;
    }
    return time as Number;
}
;
val uni_cloud_config = fun(): UniCloudInitOptions? {
    return null;
}
;
val get_space = fun(config: UniCloudInitOptions): UniCloudInitOptions? {
    val uniCloudConfig = uni_cloud_config();
    if (uniCloudConfig == null) {
        console.log(config, " at uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts:419");
        if (config.spaceId != "") {
            return config;
        }
        return null;
    }
    var spaceId = uniCloudConfig.spaceId;
    var provider = uniCloudConfig.provider;
    var clientSecret = uniCloudConfig.clientSecret;
    var secretKey = uniCloudConfig.secretKey;
    var accessKey = uniCloudConfig.accessKey;
    val space_type = utsArrayOf(
        "tcb",
        "tencent",
        "aliyun",
        "alipay"
    );
    val is_space_id = spaceId != "";
    val is_provider = space_type.indexOf(provider) != -1;
    val is_aliyun = provider == "aliyun" && is_space_id && clientSecret != null;
    val is_tcb = (provider == "tcb" || provider === "tencent") && is_space_id;
    val is_alipay = provider == "alipay" && is_space_id && secretKey != null && accessKey != null;
    if (is_provider && (is_aliyun || is_tcb || is_alipay)) {
        return uniCloudConfig;
    }
    return null;
}
;
val is_push_clientid = fun(): Boolean {
    val uniStatConfig = Config.getOptions();
    val collectItems = uniStatConfig.collectItems;
    if (collectItems != null) {
        val ClientID = collectItems.uniPushClientID ?: false;
        return if (UTSAndroid.`typeof`( ClientID) == "boolean") {
            ClientID;
        } else {
            false;
        }
        ;
    }
    return false;
}
;
val calibration = fun(eventName: String, options: Any?): Boolean {
    if (eventName == "") {
        console.error("uni.report Missing [eventName] parameter", " at uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts:476");
        return true;
    }
    if (UTSAndroid.`typeof`( eventName) != "string") {
        console.error("uni.report [eventName] Parameter type error, it can only be of type String", " at uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts:480");
        return true;
    }
    if (eventName.length > 255) {
        console.error("uni.report [eventName] Parameter length cannot be greater than 255", " at uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts:486");
        return true;
    }
    if (UTSAndroid.`typeof`( options) != "string" && UTSAndroid.`typeof`( options) != "object") {
        console.error("uni.report [options] Parameter type error, Only supports String or Object type", " at uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts:493");
        return true;
    }
    if (UTSAndroid.`typeof`( options) == "string" && (options as String).length > 255) {
        console.error("uni.report [options] Parameter length cannot be greater than 255", " at uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts:500");
        return true;
    }
    if (eventName == "title" && UTSAndroid.`typeof`( options) != "string") {
        console.error("uni.report [eventName] When the parameter is title, the [options] parameter can only be of type String", " at uni_modules/uni-stat/utssdk/common/utils/pageInfo.uts:507");
        return true;
    }
    return false;
}
;
open class CloudObjectToDo : InternalUniCloudCloudObjectCaller, IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("CloudObjectToDo", "uni_modules/uni-stat/utssdk/common/core/report.uts", 12, 7);
    }
    constructor(obj: InternalUniCloudCloudObject) : super(obj) {}
    open fun report(vararg do_not_transform_spread: Any?): UTSPromise<UTSJSONObject> {
        return this._obj.callMethod("report", this._getArgs(*do_not_transform_spread));
    }
}
open class Report1 : IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("Report", "uni_modules/uni-stat/utssdk/common/core/report.uts", 24, 14);
    }
    open var licationShow: Boolean = false;
    open var licationHide: Boolean = false;
    open var statData: StatDefault;
    open var eportInterval = get_report_Interval(OPERATING_TIME);
    open var _navigationBarTitle: TitleConfigParams = TitleConfigParams(config = "", page = "", report = "", lt = "");
    constructor(){
        this.statData = get_default_data();
        var registerInterceptor = UTSAndroid.`typeof`( uni_addInterceptor) === "function";
        if (registerInterceptor) {
            this.interceptSetNavBar();
            this.interceptLogin();
            this.interceptShare(true);
            this.interceptRequestPayment();
        }
    }
    open fun interceptSetNavBar() {
        var self = this;
        uni_addInterceptor("setNavigationBarTitle", Interceptor(invoke = fun(args: SetNavigationBarTitleOptions) {
            self._navigationBarTitle.page = args.title;
        }
        ));
    }
    open fun interceptLogin() {
        var self = this;
        uni_addInterceptor("login", Interceptor(complete = fun() {
            self._login();
        }
        ));
    }
    open fun interceptShare(type: Boolean = false) {
        var self = this;
        if (!type) {
            self._share();
            return;
        }
        uni_addInterceptor("share", Interceptor(complete = fun() {
            self._share();
        }
        ));
    }
    open fun interceptRequestPayment() {
        var self = this;
        uni_addInterceptor("requestPayment", Interceptor(success = fun() {
            self._payment("pay_success");
        }
        , fail = fun() {
            self._payment("pay_fail");
        }
        ));
    }
    private fun _login() {
        this.sendEventRequest(EventParams(key = "login"));
    }
    private fun _share() {
        this.sendEventRequest(EventParams(key = "share"));
    }
    private fun _payment(key: String) {
        this.sendEventRequest(EventParams(key = key));
    }
    open fun launch(options: Any) {
        set_page_residence_time();
        this.licationShow = true;
        dbSet("__launch_options", options);
        var request_option = OnLaunchOptionsWithCst(path = (options as OnLaunchOptions).path, cst = ReprotCstType.AppNormal);
        this.sendAppRequest(request_option, true);
    }
    open fun load() {}
    open fun appShow() {
        if (!this.licationHide) {
            return;
        }
        val time = get_residence_time("app");
        if (time.overtime) {
            var lastPageRoute = uni_getStorageSync("_STAT_LAST_PAGE_ROUTE") as String;
            var options = OnLaunchOptionsWithCst(path = lastPageRoute, scene = this.statData.sc, cst = ReprotCstType.AppAwakenTimeout);
            this.sendAppRequest(options);
        }
        this.licationHide = false;
    }
    open fun appHide(type: Boolean = false) {
        this.licationHide = true;
        val time = get_residence_time("outher");
        val route = get_route().fullpath;
        uni_setStorageSync("_STAT_LAST_PAGE_ROUTE", route);
        val formdata = PageParams(url = route, urlref = route, urlref_ts = time.residenceTime);
        this.sendHideRequest(formdata, type);
        set_first_time();
    }
    open fun pageShow(self: Page) {
        this._navigationBarTitle = TitleConfigParams(config = "", page = "", report = "", lt = "");
        val _get_route = get_route(self);
        val path = _get_route.path;
        val fullpath = _get_route.fullpath;
        val pageTitle = get_page_name(path);
        this._navigationBarTitle.config = pageTitle;
        if (this.licationShow) {
            set_first_time();
            uni_setStorageSync("_STAT_LAST_PAGE_ROUTE", fullpath);
            this.licationShow = false;
            return;
        }
        val time = get_residence_time("page");
        if (time.overtime) {
            var options = OnLaunchOptionsWithCst(path = fullpath, scene = this.statData.sc, cst = ReprotCstType.PageStayTimeout);
            this.sendAppRequest(options);
        }
        set_first_time();
    }
    open fun pageHide(self: Page) {
        if (this.licationHide) {
            return;
        }
        val time = get_residence_time("page");
        var fullpath = get_route(self).fullpath;
        var lastPageRoute = uni_getStorageSync("_STAT_LAST_PAGE_ROUTE");
        if (lastPageRoute == null) {
            lastPageRoute = fullpath;
        }
        uni_setStorageSync("_STAT_LAST_PAGE_ROUTE", fullpath);
        val options = PageParams(url = fullpath, urlref = lastPageRoute as String, urlref_ts = time.residenceTime, urlref_tt = "");
        this.sendPageRequest(options);
    }
    open fun appError(em: Any) {
        console.log("发生了错误123", " at uni_modules/uni-stat/utssdk/common/core/report.uts:294");
        console.log(em, " at uni_modules/uni-stat/utssdk/common/core/report.uts:295");
        var errmsg: String;
        if (em is Exception) {
            errmsg = em.message ?: "";
        } else if (em is UTSError) {
            errmsg = em.message;
        } else {
            errmsg = JSON.stringify(em);
        }
        var route = get_route().path;
        var options = StatDefault(ak = this.statData.ak, uuid = this.statData.uuid, p = this.statData.p, lt = "31", url = route, ut = this.statData.ut, ch = this.statData.ch, mpsdk = this.statData.mpsdk, mpv = this.statData.mpv, v = this.statData.v, em = errmsg, usv = this.statData.usv, t = get_time());
        this.request(options, false);
    }
    open fun sendAppRequest(options: OnLaunchOptionsWithCst, type: Boolean = false) {
        var is_opt = options.query != null && JSON.stringify(options.query) != "{}";
        var query = if (is_opt) {
            "?" + JSON.stringify(options.query);
        } else {
            "";
        }
        ;
        val last_time = get_last_visit_time();
        if (last_time != 0) {
            val odid = get_odid();
            val have_device = is_handle_device();
            if (!have_device) {
                this.statData.odid = odid;
            }
        }
        this.statData.lt = ReportType.AppStart;
        this.statData.url = options.path + query;
        this.statData.t = get_time();
        this.statData.sc = get_scene(options);
        this.statData.fvts = get_first_visit_time();
        this.statData.lvts = last_time;
        this.statData.tvc = get_total_visit_count();
        this.statData.cst = options.cst ?: ReprotCstType.AppNormal;
        this.request(this.statData, type);
    }
    open fun sendPageRequest(opt: PageParams) {
        var url = opt.url;
        var urlref = opt.urlref;
        var urlref_ts = opt.urlref_ts;
        this._navigationBarTitle.lt = ReportType.PageShow;
        var options = StatDefault(ak = this.statData.ak, uuid = this.statData.uuid, p = this.statData.p, lt = ReportType.PageShow, ut = this.statData.ut, url = url, tt = this.statData.tt, urlref = urlref, urlref_ts = urlref_ts, ch = this.statData.ch, usv = this.statData.usv, t = get_time());
        this.request(options);
    }
    open fun sendHideRequest(opt: PageParams, type: Boolean) {
        var urlref = opt.urlref;
        var urlref_ts = opt.urlref_ts;
        var options = StatDefault(ak = this.statData.ak, uuid = this.statData.uuid, p = this.statData.p, lt = ReportType.AppHide, ut = this.statData.ut, urlref = urlref, urlref_ts = urlref_ts, ch = this.statData.ch, usv = this.statData.usv, t = get_time());
        this.request(options, type);
    }
    open fun sendPushRequest(options: Any, cid: String) {
        var time = get_time();
        val statData = StatDefault(uuid = this.statData.uuid, p = this.statData.p, ak = this.statData.ak, lt = ReportType.Push, cid = cid, t = time, ut = this.statData.ut);
        val dataStr = JSON.stringify(statData);
        var uniStatData = UTSAndroid.consoleDebugError(JSON.parse<Map<String, UTSArray<StatDefault>>>(dataStr), " at uni_modules/uni-stat/utssdk/common/core/report.uts:453");
        if (uniStatData == null) {
            uniStatData = Map(utsArrayOf());
        }
        val hasKey = uniStatData.has(ReportType.Push);
        if (!hasKey) {
            uniStatData.set(ReportType.Push, utsArrayOf());
        }
        uniStatData.get(ReportType.Push)!!.push(statData);
        val stat_data = handle_data(uniStatData);
        var optionsData = RequestData(usv = STAT_VERSION, t = time, requests = stat_data);
        this.sendRequest(optionsData);
    }
    open fun sendEventRequest(data: EventParams) {
        val key = data.key;
        val value = data.value ?: "";
        var routepath = get_route().fullpath;
        val lt = ReportType.Event;
        this._navigationBarTitle.config = get_page_name(routepath);
        this._navigationBarTitle.lt = lt;
        var options = StatDefault(ak = this.statData.ak, uuid = this.statData.uuid, p = this.statData.p, lt = lt, ut = this.statData.ut, url = routepath, ch = this.statData.ch, e_n = key, e_v = if (UTSAndroid.`typeof`( value) === "object") {
            JSON.stringify(value);
        } else {
            value.toString();
        }
        , usv = this.statData.usv, t = get_time());
        this.request(options);
    }
    open fun request(data: StatDefault, type: Boolean = false) {
        val statConfig = Config.getOptions();
        var time = get_time();
        val title = this._navigationBarTitle;
        data.ttn = title.page;
        data.ttpj = title.config;
        data.ttc = title.report;
        if (statConfig.debug!!) {
            Log(data);
        }
        val lt = data.lt!!;
        var statData = dbGet<String>("__UNI__STAT__DATA");
        if (statData == null) {
            statData = "{}";
        }
        var uniStatData = UTSAndroid.consoleDebugError(JSON.parse<Map<String, UTSArray<StatDefault>>>(statData), " at uni_modules/uni-stat/utssdk/common/core/report.uts:538");
        if (uniStatData == null) {
            uniStatData = Map(utsArrayOf());
        }
        val hasKey = uniStatData.has(lt);
        if (!hasKey) {
            uniStatData.set(lt, utsArrayOf());
        }
        uniStatData.get(lt)!!.push(data);
        val statDataStr = Map2String(uniStatData);
        dbSet("__UNI__STAT__DATA", statDataStr);
        var page_residence_time = get_page_residence_time();
        val is_timeout = page_residence_time < this.eportInterval && !type;
        if (is_timeout) {
            return;
        }
        set_page_residence_time();
        if (statConfig.debug!!) {
            console.log("=== \u7EDF\u8BA1\u5F85\u4E0A\u4F20\u961F\u5217\u6570\u636E ===", " at uni_modules/uni-stat/utssdk/common/core/report.uts:569");
            val statJSON = Map2Json(uniStatData);
            console.log(statJSON, " at uni_modules/uni-stat/utssdk/common/core/report.uts:571");
            console.log("=== \u91C7\u96C6\u7ED3\u675F ===", " at uni_modules/uni-stat/utssdk/common/core/report.uts:572");
        }
        val stat_data = handle_data(uniStatData);
        var optionsData = RequestData(usv = STAT_VERSION, t = time, requests = stat_data);
        dbRemove("__UNI__STAT__DATA");
        this.sendRequest(optionsData);
    }
    open fun sendRequest(options: RequestData) {
        val statConfig = Config.getOptions();
        if (Report1.uniCloudInstance != null) {
            val app = Report1.uniCloudInstance!!;
            val uniCloudObj = app.importObject("uni-stat-receiver", UniCloudImportObjectOptions(customUI = true), CloudObjectToDo::class.java);
            uniCloudObj.report(options).then(fun(){
                if (statConfig.debug!!) {
                    console.log("=== \u7EDF\u8BA1\u961F\u5217\u6570\u636E\u4E0A\u62A5 ===", " at uni_modules/uni-stat/utssdk/common/core/report.uts:621");
                    console.log(options, " at uni_modules/uni-stat/utssdk/common/core/report.uts:622");
                    console.log("=== \u4E0A\u62A5\u7ED3\u675F ===", " at uni_modules/uni-stat/utssdk/common/core/report.uts:623");
                }
            }
            ).`catch`(fun(err: Any?){
                console.log("=== 统计上报错误 ===", " at uni_modules/uni-stat/utssdk/common/core/report.uts:627");
                console.error(err, " at uni_modules/uni-stat/utssdk/common/core/report.uts:628");
                console.log("=== \u4E0A\u62A5\u7ED3\u675F ===", " at uni_modules/uni-stat/utssdk/common/core/report.uts:629");
            }
            );
        }
    }
    companion object {
        var uniCloudInstance: UniCloud? = null;
    }
}
open class Stat : IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("Stat", "uni_modules/uni-stat/utssdk/common/core/stat.uts", 8, 14);
    }
    open var report: Report1;
    open var appInstance: Page? = null;
    private var isHide: Boolean = false;
    constructor(){
        this.report = Report1();
    }
    open fun init(options: UTSJSONObject) {
        Stat.is_register = true;
        Config.setOptions(UTSJSONObject.assign<UniStatOptions>(UTSJSONObject(), options) as UniStatOptions);
        val uniStatConfig = Config.getOptions();
        this.report.eportInterval = uniStatConfig.reportInterval ?: 10;
    }
    open fun onLaunch(options: OnLaunchOptions, appInstance: ComponentPublicInstance) {}
    open fun onLoad(appInstance: Page) {
        this.registerEvent(StatType.LifeCycleLoad, appInstance);
    }
    open fun onShow(appInstance: Page) {
        this.isHide = false;
        val mptype = is_page(appInstance);
        if (mptype) {
            this.registerEvent(StatType.LifeCyclePageShow, appInstance, null);
        }
    }
    open fun onHide(appInstance: Page) {
        this.isHide = true;
        val mptype = is_page(appInstance);
        if (mptype) {
            this.registerEvent(StatType.LifeCyclePageHide, appInstance, null);
        }
    }
    open fun onUnload(appInstance: Page) {
        if (this.isHide) {
            this.isHide = false;
            return;
        }
        this.registerEvent(StatType.LifeCyclePageUnLoad, appInstance, null);
    }
    open fun onError(error: String) {
        this.error(error);
    }
    open fun pushEvent(options: Any) {
        val ClientID = is_push_clientid();
        if (ClientID) {
            uni_getPushClientId(GetPushClientIdOptions(success = fun(res){
                val cid = res.cid;
                this.report.sendPushRequest(options, cid);
            }
            ));
        }
    }
    open fun registerEvent(EventType: Number, appInstance: Page?, options: Any? = null, error: Any? = "") {
        this.appInstance = appInstance;
        val isPageReport = is_page_report();
        when (EventType) {
            StatType.LifeCycleLaunch -> 
                {
                    this.report.launch(options!!);
                    this.pushEvent(options);
                }
            StatType.LifeCycleAppShow -> 
                this.report.appShow();
            StatType.LifeCycleAppHide -> 
                this.report.appHide(true);
            StatType.LifeCycleLoad -> 
                {}
            StatType.LifeCyclePageShow -> 
                if (isPageReport) {
                    this.report.pageShow(appInstance!!);
                }
            StatType.LifeCyclePageHide -> 
                if (isPageReport) {
                    this.report.pageHide(appInstance!!);
                }
            StatType.LifeCyclePageUnLoad -> 
                if (isPageReport) {
                    this.report.pageHide(appInstance!!);
                }
            StatType.LifeCycleError -> 
                if (error != null) {
                    this.report.appError(error);
                }
        }
    }
    open fun error(em: String) {}
    open fun appEvent(name: String, options: Any? = null, fn: ErrorCallback) {
        if (!Stat.is_register) {
            fn(false, "统计服务尚未初始化，请在main.uts中引入统计插件。");
            return;
        }
        if (name == "uni-app-launch" && options == null) {
            fn(false, "uniStatReport options参数错误，请检查！");
            return;
        }
        fn(true, "report:ok");
        if (name == "uni-app-launch") {
            this.registerEvent(StatType.LifeCycleLaunch, null, options);
            return;
        }
        if (name == "uni-app-show") {
            this.registerEvent(StatType.LifeCycleAppShow, null, null);
            return;
        }
        if (name == "uni-app-hide") {
            this.registerEvent(StatType.LifeCycleAppHide, null, null);
            return;
        }
        if (name == "uni-app-error") {
            this.registerEvent(StatType.LifeCycleError, null, null, options);
            return;
        }
        val is_calibration = calibration(name, options);
        if (is_calibration) {
            return;
        }
        if (name === "title") {
            this.report._navigationBarTitle.report = (options as String);
            return;
        }
        val value = if (UTSAndroid.`typeof`( options) === "object") {
            JSON.stringify(options);
        } else {
            options;
        }
         as String;
        val data = EventParams(key = name, value = value as String);
        this.report.sendEventRequest(data);
    }
    companion object {
        var __stat_instance: Stat? = null;
        var is_register: Boolean = false;
        fun getInstance(): Stat {
            var space = get_space(uniCloud.config);
            if (Report1.uniCloudInstance == null) {
                if (space != null) {
                    var spaceData = UniCloudInitOptions(provider = space.provider, spaceId = space.spaceId, clientSecret = space.clientSecret);
                    val endpoint = space.endpoint;
                    if (endpoint != null) {
                        spaceData.endpoint = space.endpoint;
                    }
                    if (space.provider == "alipay") {
                        spaceData.secretKey = space.secretKey;
                        spaceData.accessKey = space.accessKey;
                        spaceData.spaceAppId = space.spaceAppId;
                    }
                    Report1.uniCloudInstance = uniCloud.init(spaceData);
                } else {
                    console.error("应用已集成uni统计，但未关联服务空间，请在uniCloud目录右键关联服务空间", " at uni_modules/uni-stat/utssdk/common/core/stat.uts:44");
                }
            }
            if (this.__stat_instance == null) {
                this.__stat_instance = Stat();
            }
            return this.__stat_instance as Stat;
        }
    }
}
val stat = Stat.getInstance();
val report: Report = fun(options: ReportOptions) {
    val name = options.name;
    val option = options.options;
    stat.appEvent(name, option, fun(type: Boolean, msg: String){
        if (type) {
            val res = ReportSuccess(errMsg = "report:ok");
            options.success?.invoke(res);
            options.complete?.invoke(res);
        } else {
            val err = ReportFail(errMsg = "report fail:" + msg);
            options.fail?.invoke(err);
            options.complete?.invoke(err);
        }
    }
    );
}
;
