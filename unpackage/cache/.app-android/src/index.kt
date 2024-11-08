@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNIuniappx;
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
import io.dcloud.uniapp.extapi.exit as uni_exit;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
val runBlock1 = run {
    try {
        UTSAndroid.registerProvider("payment", "alipay", UniPaymentAlipayProviderImpl());
    }
     catch (e: Throwable) {}
    try {
        UTSAndroid.registerProvider("payment", "wxpay", UniPaymentWxpayProviderImpl());
    }
     catch (e: Throwable) {}
    try {
        UTSAndroid.registerProvider("location", "system", UniLocationSystemProviderImpl());
    }
     catch (e: Throwable) {}
    try {
        UTSAndroid.registerProvider("location", "tencent", UniLocationTencentProviderImpl());
    }
     catch (e: Throwable) {}
}
open class TestConsole : IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("TestConsole", "test-main-console.uts", 2, 14);
    }
    constructor(){
        console.log("test main.uts console.log", " at test-main-console.uts:4");
    }
}
val ts = TestConsole();
open class SafeArea (
    @JsonNotNull
    open var top: Number,
    @JsonNotNull
    open var right: Number,
    @JsonNotNull
    open var bottom: Number,
    @JsonNotNull
    open var left: Number,
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSReactiveObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("SafeArea", "store/index.uts", 1, 13)
    }
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SafeAreaReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SafeAreaReactiveObject : SafeArea, IUTSReactive<SafeArea> {
    override var __v_raw: SafeArea;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SafeArea, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(top = __v_raw.top, right = __v_raw.right, bottom = __v_raw.bottom, left = __v_raw.left, width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SafeAreaReactiveObject {
        return SafeAreaReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var top: Number
        get() {
            return trackReactiveGet(__v_raw, "top", __v_raw.top, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("top")) {
                return;
            }
            val oldValue = __v_raw.top;
            __v_raw.top = value;
            triggerReactiveSet(__v_raw, "top", oldValue, value);
        }
    override var right: Number
        get() {
            return trackReactiveGet(__v_raw, "right", __v_raw.right, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("right")) {
                return;
            }
            val oldValue = __v_raw.right;
            __v_raw.right = value;
            triggerReactiveSet(__v_raw, "right", oldValue, value);
        }
    override var bottom: Number
        get() {
            return trackReactiveGet(__v_raw, "bottom", __v_raw.bottom, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("bottom")) {
                return;
            }
            val oldValue = __v_raw.bottom;
            __v_raw.bottom = value;
            triggerReactiveSet(__v_raw, "bottom", oldValue, value);
        }
    override var left: Number
        get() {
            return trackReactiveGet(__v_raw, "left", __v_raw.left, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("left")) {
                return;
            }
            val oldValue = __v_raw.left;
            __v_raw.left = value;
            triggerReactiveSet(__v_raw, "left", oldValue, value);
        }
    override var width: Number
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
open class State (
    @JsonNotNull
    open var lifeCycleNum: Number,
    @JsonNotNull
    open var statusBarHeight: Number,
    @JsonNotNull
    open var safeArea: SafeArea,
    @JsonNotNull
    open var devicePixelRatio: Number,
    @JsonNotNull
    open var eventCallbackNum: Number,
    @JsonNotNull
    open var noMatchLeftWindow: Boolean = false,
    @JsonNotNull
    open var active: String,
    @JsonNotNull
    open var leftWinActive: String,
) : UTSReactiveObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("State", "store/index.uts", 10, 6)
    }
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return StateReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class StateReactiveObject : State, IUTSReactive<State> {
    override var __v_raw: State;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: State, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(lifeCycleNum = __v_raw.lifeCycleNum, statusBarHeight = __v_raw.statusBarHeight, safeArea = __v_raw.safeArea, devicePixelRatio = __v_raw.devicePixelRatio, eventCallbackNum = __v_raw.eventCallbackNum, noMatchLeftWindow = __v_raw.noMatchLeftWindow, active = __v_raw.active, leftWinActive = __v_raw.leftWinActive) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): StateReactiveObject {
        return StateReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var lifeCycleNum: Number
        get() {
            return trackReactiveGet(__v_raw, "lifeCycleNum", __v_raw.lifeCycleNum, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("lifeCycleNum")) {
                return;
            }
            val oldValue = __v_raw.lifeCycleNum;
            __v_raw.lifeCycleNum = value;
            triggerReactiveSet(__v_raw, "lifeCycleNum", oldValue, value);
        }
    override var statusBarHeight: Number
        get() {
            return trackReactiveGet(__v_raw, "statusBarHeight", __v_raw.statusBarHeight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("statusBarHeight")) {
                return;
            }
            val oldValue = __v_raw.statusBarHeight;
            __v_raw.statusBarHeight = value;
            triggerReactiveSet(__v_raw, "statusBarHeight", oldValue, value);
        }
    override var safeArea: SafeArea
        get() {
            return trackReactiveGet(__v_raw, "safeArea", __v_raw.safeArea, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("safeArea")) {
                return;
            }
            val oldValue = __v_raw.safeArea;
            __v_raw.safeArea = value;
            triggerReactiveSet(__v_raw, "safeArea", oldValue, value);
        }
    override var devicePixelRatio: Number
        get() {
            return trackReactiveGet(__v_raw, "devicePixelRatio", __v_raw.devicePixelRatio, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("devicePixelRatio")) {
                return;
            }
            val oldValue = __v_raw.devicePixelRatio;
            __v_raw.devicePixelRatio = value;
            triggerReactiveSet(__v_raw, "devicePixelRatio", oldValue, value);
        }
    override var eventCallbackNum: Number
        get() {
            return trackReactiveGet(__v_raw, "eventCallbackNum", __v_raw.eventCallbackNum, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("eventCallbackNum")) {
                return;
            }
            val oldValue = __v_raw.eventCallbackNum;
            __v_raw.eventCallbackNum = value;
            triggerReactiveSet(__v_raw, "eventCallbackNum", oldValue, value);
        }
    override var noMatchLeftWindow: Boolean
        get() {
            return trackReactiveGet(__v_raw, "noMatchLeftWindow", __v_raw.noMatchLeftWindow, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("noMatchLeftWindow")) {
                return;
            }
            val oldValue = __v_raw.noMatchLeftWindow;
            __v_raw.noMatchLeftWindow = value;
            triggerReactiveSet(__v_raw, "noMatchLeftWindow", oldValue, value);
        }
    override var active: String
        get() {
            return trackReactiveGet(__v_raw, "active", __v_raw.active, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("active")) {
                return;
            }
            val oldValue = __v_raw.active;
            __v_raw.active = value;
            triggerReactiveSet(__v_raw, "active", oldValue, value);
        }
    override var leftWinActive: String
        get() {
            return trackReactiveGet(__v_raw, "leftWinActive", __v_raw.leftWinActive, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("leftWinActive")) {
                return;
            }
            val oldValue = __v_raw.leftWinActive;
            __v_raw.leftWinActive = value;
            triggerReactiveSet(__v_raw, "leftWinActive", oldValue, value);
        }
}
val state = reactive(State(lifeCycleNum = 0, statusBarHeight = 0, devicePixelRatio = 1, eventCallbackNum = 0, noMatchLeftWindow = true, active = "componentPage", leftWinActive = "/pages/component/view/view", safeArea = SafeArea(top = 0, right = 0, bottom = 0, left = 0, width = 0, height = 0)));
val setLifeCycleNum = fun(num: Number){
    state.lifeCycleNum = num;
}
;
var firstBackTime: Number = 0;
open class GenGlobalData {
    open var str = "default globalData str";
    open var num: Number = 0;
    open var bool = false;
    open var obj = object : UTSJSONObject() {
        var str = "default globalData obj str"
        var num: Number = 0
        var bool = false
    };
    open var `null` = null as String?;
    open var arr = utsArrayOf<Number>();
    open var mySet = Set<String>();
    open var myMap = Map<String, Any>();
    open var func = fun(): String {
        return "globalData func";
    }
    ;
    open var launchOptions = OnLaunchOptions(path = "");
    open var onShowOption = OnShowOptions(path = "");
}
open class GenApp : BaseApp {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLaunch(fun(res: OnLaunchOptions) {
            this.globalData.launchOptions = res;
            setLifeCycleNum(state.lifeCycleNum + 1000);
            console.log("App Launch", " at App.uvue:36");
        }
        , __ins);
        onAppShow(fun(res: OnShowOptions) {
            this.globalData.onShowOption = res;
            var url = this.getRedirectUrl(res.appScheme, res.appLink);
            if (null != url) {
                uni_navigateTo(NavigateToOptions(url = url));
            }
            setLifeCycleNum(state.lifeCycleNum + 100);
            console.log("App Show", " at App.uvue:73");
        }
        , __ins);
        onHide(fun() {
            setLifeCycleNum(state.lifeCycleNum - 100);
            console.log("App Hide", " at App.uvue:88");
        }
        , __ins);
        onLastPageBackPress(fun() {
            setLifeCycleNum(state.lifeCycleNum - 1000);
            console.log("App LastPageBackPress", " at App.uvue:104");
            if (firstBackTime == 0) {
                uni_showToast(ShowToastOptions(title = "再按一次退出应用", position = "bottom"));
                firstBackTime = Date.now();
                setTimeout(fun(){
                    firstBackTime = 0;
                }, 2000);
            } else if (Date.now() - firstBackTime < 2000) {
                firstBackTime = Date.now();
                uni_exit(null);
            }
        }
        , __ins);
        onExit(fun() {
            console.log("App Exit", " at App.uvue:120");
        }
        , __ins);
    }
    open var globalData = GenGlobalData();
    override fun `$initMethods`() {
        this.increasetLifeCycleNum = fun() {
            setLifeCycleNum(state.lifeCycleNum + 100);
            console.log("App increasetLifeCycleNum", " at App.uvue:138");
        }
        ;
        this.getRedirectUrl = fun(scheme: String?, ulink: String?): String? {
            var url: String? = null;
            if (null != scheme && scheme.length > 0) {
                val PATHPRE = "redirect";
                var parts: String? = null;
                var pos = scheme.search("//");
                if (pos > 0) {
                    parts = scheme.substring(pos + 2);
                }
                if (null != parts && parts.startsWith(PATHPRE)) {
                    url = parts.substring(PATHPRE.length);
                }
            } else if (null != ulink && ulink.length > 0) {
                val PATH = "ulink/redirect.html";
                var parts = ulink.split("?");
                if (parts.length > 1 && parts[0].endsWith(PATH) && parts[1].length > 0) {
                    parts[1].split("&").forEach(fun(e){
                        var params = e.split("=");
                        if (params.length > 1 && params[0].length > 0 && params[1].length > 0) {
                            if ("url" == params[0]) {
                                if (null == url) {
                                    url = UTSAndroid.consoleDebugError(decodeURIComponent(params[1]), " at App.uvue:164");
                                }
                            }
                        }
                    }
                    );
                }
            }
            return url;
        }
        ;
    }
    open lateinit var increasetLifeCycleNum: () -> Unit;
    open lateinit var getRedirectUrl: (scheme: String?, ulink: String?) -> String?;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-padding-wrap" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to 15, "paddingBottom" to 0, "paddingLeft" to 15)), "uni-title" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 0, "paddingBottom" to 10, "paddingLeft" to 0)), "uni-title-text" to padStyleMapOf(utsMapOf("fontSize" to 15, "fontWeight" to "bold")), "uni-subtitle-text" to padStyleMapOf(utsMapOf("color" to "#888888", "fontSize" to 12, "fontWeight" to "bold", "marginTop" to 5)), "uni-common-mb" to padStyleMapOf(utsMapOf("marginBottom" to 15)), "uni-common-pb" to padStyleMapOf(utsMapOf("paddingBottom" to 15)), "uni-common-pl" to padStyleMapOf(utsMapOf("paddingLeft" to 15)), "uni-common-mt" to padStyleMapOf(utsMapOf("marginTop" to 15)), "uni-hello-text" to padStyleMapOf(utsMapOf("color" to "#7A7E83", "lineHeight" to "22px")), "uni-list" to padStyleMapOf(utsMapOf("backgroundColor" to "#FFFFFF", "position" to "relative", "display" to "flex", "flexDirection" to "column", "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#c8c7cc")), "uni-list-cell" to padStyleMapOf(utsMapOf("position" to "relative", "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center")), "uni-list-cell-padding" to padStyleMapOf(utsMapOf("paddingTop" to 16, "paddingRight" to 16, "paddingBottom" to 16, "paddingLeft" to 16)), "uni-list-cell-line" to padStyleMapOf(utsMapOf("borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#c8c7cc")), "uni-list-cell-hover" to padStyleMapOf(utsMapOf("backgroundColor" to "#eeeeee")), "uni-list-cell-pd" to padStyleMapOf(utsMapOf("paddingTop" to 11, "paddingRight" to 15, "paddingBottom" to 11, "paddingLeft" to 0)), "uni-list-cell-left" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to 15, "paddingBottom" to 0, "paddingLeft" to 10)), "uni-list-cell-db" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-list-cell-right" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-label" to padStyleMapOf(utsMapOf("width" to 105)), "uni-input" to padStyleMapOf(utsMapOf("height" to 25, "paddingTop" to 8, "paddingRight" to 13, "paddingBottom" to 8, "paddingLeft" to 13, "fontSize" to 14, "backgroundColor" to "#FFFFFF", "flex" to 1, "boxSizing" to "content-box")), "uni-flex" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-flex-item" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-column" to padStyleMapOf(utsMapOf("flexDirection" to "column")), "uni-bg-red" to padStyleMapOf(utsMapOf("backgroundColor" to "#F76260")), "uni-bg-green" to padStyleMapOf(utsMapOf("backgroundColor" to "#09BB07")), "uni-bg-blue" to padStyleMapOf(utsMapOf("backgroundColor" to "#007AFF")), "uni-btn-v" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0)), "uni-btn" to padStyleMapOf(utsMapOf("marginTop" to 10)), "uni-link" to padStyleMapOf(utsMapOf("color" to "#576B95", "fontSize" to 13)), "uni-center" to padStyleMapOf(utsMapOf("flexDirection" to "row", "justifyContent" to "center")), "uni-textarea" to padStyleMapOf(utsMapOf("paddingTop" to 9, "paddingRight" to 9, "paddingBottom" to 9, "paddingLeft" to 9, "lineHeight" to 1.6, "fontSize" to 14)), "uni-icon-size" to padStyleMapOf(utsMapOf("width" to 14, "height" to 14)), "uni-container" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "backgroundColor" to "#f8f8f8")), "uni-header-logo" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "flexDirection" to "column", "justifyContent" to "center", "alignItems" to "center", "marginTop" to 5)), "uni-header-image" to padStyleMapOf(utsMapOf("width" to 80, "height" to 80)), "uni-text-box" to padStyleMapOf(utsMapOf("marginBottom" to 20)), "hello-text" to padStyleMapOf(utsMapOf("color" to "#7A7E83", "fontSize" to 14, "lineHeight" to "20px")), "uni-panel" to padStyleMapOf(utsMapOf("marginBottom" to 12)), "text-disabled" to padStyleMapOf(utsMapOf("!color" to "#a0a0a0")), "uni-panel-h" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffffff", "!flexDirection" to "row", "!justifyContent" to "space-between", "!alignItems" to "center", "paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12)), "uni-panel-h-on" to padStyleMapOf(utsMapOf("backgroundColor" to "#f0f0f0")), "uni-panel-text" to padStyleMapOf(utsMapOf("color" to "#000000", "fontSize" to 14, "fontWeight" to "normal")), "uni-navigate-item" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center", "backgroundColor" to "#FFFFFF", "borderTopStyle" to "solid", "borderTopColor" to "#f0f0f0", "borderTopWidth" to 1, "paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12, "justifyContent" to "space-between", "backgroundColor:active" to "#f8f8f8")), "is--active" to padStyleMapOf(utsMapOf("backgroundColor" to "#f8f8f8")), "uni-navigate-text" to padStyleMapOf(utsMapOf("color" to "#000000", "fontSize" to 14, "fontWeight" to "normal")), "left-win-active" to padStyleMapOf(utsMapOf("!color" to "#007AFF")), "page-scroll-view" to padStyleMapOf(utsMapOf("flex" to 1)));
            }
    }
}
val GenAppClass = CreateVueAppComponent(GenApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "app", name = "", inheritAttrs = true, inject = Map(), props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenApp.styles);
}
, fun(instance): GenApp {
    return GenApp(instance);
}
);
open class IconsDataItem (
    @JsonNotNull
    open var font_class: String,
    @JsonNotNull
    open var unicode: String,
) : UTSObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("IconsDataItem", "uni_modules/uni-icons/components/uni-icons/uniicons_file.ts", 11, 13)
    }
}
val fontData = utsArrayOf<IconsDataItem>(IconsDataItem(font_class = "arrow-down", unicode = "\ue6be"), IconsDataItem(font_class = "arrow-left", unicode = "\ue6bc"), IconsDataItem(font_class = "arrow-right", unicode = "\ue6bb"), IconsDataItem(font_class = "arrow-up", unicode = "\ue6bd"), IconsDataItem(font_class = "auth", unicode = "\ue6ab"), IconsDataItem(font_class = "auth-filled", unicode = "\ue6cc"), IconsDataItem(font_class = "back", unicode = "\ue6b9"), IconsDataItem(font_class = "bars", unicode = "\ue627"), IconsDataItem(font_class = "calendar", unicode = "\ue6a0"), IconsDataItem(font_class = "calendar-filled", unicode = "\ue6c0"), IconsDataItem(font_class = "camera", unicode = "\ue65a"), IconsDataItem(font_class = "camera-filled", unicode = "\ue658"), IconsDataItem(font_class = "cart", unicode = "\ue631"), IconsDataItem(font_class = "cart-filled", unicode = "\ue6d0"), IconsDataItem(font_class = "chat", unicode = "\ue65d"), IconsDataItem(font_class = "chat-filled", unicode = "\ue659"), IconsDataItem(font_class = "chatboxes", unicode = "\ue696"), IconsDataItem(font_class = "chatboxes-filled", unicode = "\ue692"), IconsDataItem(font_class = "chatbubble", unicode = "\ue697"), IconsDataItem(font_class = "chatbubble-filled", unicode = "\ue694"), IconsDataItem(font_class = "checkbox", unicode = "\ue62b"), IconsDataItem(font_class = "checkbox-filled", unicode = "\ue62c"), IconsDataItem(font_class = "checkmarkempty", unicode = "\ue65c"), IconsDataItem(font_class = "circle", unicode = "\ue65b"), IconsDataItem(font_class = "circle-filled", unicode = "\ue65e"), IconsDataItem(font_class = "clear", unicode = "\ue66d"), IconsDataItem(font_class = "close", unicode = "\ue673"), IconsDataItem(font_class = "closeempty", unicode = "\ue66c"), IconsDataItem(font_class = "cloud-download", unicode = "\ue647"), IconsDataItem(font_class = "cloud-download-filled", unicode = "\ue646"), IconsDataItem(font_class = "cloud-upload", unicode = "\ue645"), IconsDataItem(font_class = "cloud-upload-filled", unicode = "\ue648"), IconsDataItem(font_class = "color", unicode = "\ue6cf"), IconsDataItem(font_class = "color-filled", unicode = "\ue6c9"), IconsDataItem(font_class = "compose", unicode = "\ue67f"), IconsDataItem(font_class = "contact", unicode = "\ue693"), IconsDataItem(font_class = "contact-filled", unicode = "\ue695"), IconsDataItem(font_class = "down", unicode = "\ue6b8"), IconsDataItem(font_class = "bottom", unicode = "\ue6b8"), IconsDataItem(font_class = "download", unicode = "\ue68d"), IconsDataItem(font_class = "download-filled", unicode = "\ue681"), IconsDataItem(font_class = "email", unicode = "\ue69e"), IconsDataItem(font_class = "email-filled", unicode = "\ue69a"), IconsDataItem(font_class = "eye", unicode = "\ue651"), IconsDataItem(font_class = "eye-filled", unicode = "\ue66a"), IconsDataItem(font_class = "eye-slash", unicode = "\ue6b3"), IconsDataItem(font_class = "eye-slash-filled", unicode = "\ue6b4"), IconsDataItem(font_class = "fire", unicode = "\ue6a1"), IconsDataItem(font_class = "fire-filled", unicode = "\ue6c5"), IconsDataItem(font_class = "flag", unicode = "\ue65f"), IconsDataItem(font_class = "flag-filled", unicode = "\ue660"), IconsDataItem(font_class = "folder-add", unicode = "\ue6a9"), IconsDataItem(font_class = "folder-add-filled", unicode = "\ue6c8"), IconsDataItem(font_class = "font", unicode = "\ue6a3"), IconsDataItem(font_class = "forward", unicode = "\ue6ba"), IconsDataItem(font_class = "gear", unicode = "\ue664"), IconsDataItem(font_class = "gear-filled", unicode = "\ue661"), IconsDataItem(font_class = "gift", unicode = "\ue6a4"), IconsDataItem(font_class = "gift-filled", unicode = "\ue6c4"), IconsDataItem(font_class = "hand-down", unicode = "\ue63d"), IconsDataItem(font_class = "hand-down-filled", unicode = "\ue63c"), IconsDataItem(font_class = "hand-up", unicode = "\ue63f"), IconsDataItem(font_class = "hand-up-filled", unicode = "\ue63e"), IconsDataItem(font_class = "headphones", unicode = "\ue630"), IconsDataItem(font_class = "heart", unicode = "\ue639"), IconsDataItem(font_class = "heart-filled", unicode = "\ue641"), IconsDataItem(font_class = "help", unicode = "\ue679"), IconsDataItem(font_class = "help-filled", unicode = "\ue674"), IconsDataItem(font_class = "home", unicode = "\ue662"), IconsDataItem(font_class = "home-filled", unicode = "\ue663"), IconsDataItem(font_class = "image", unicode = "\ue670"), IconsDataItem(font_class = "image-filled", unicode = "\ue678"), IconsDataItem(font_class = "images", unicode = "\ue650"), IconsDataItem(font_class = "images-filled", unicode = "\ue64b"), IconsDataItem(font_class = "info", unicode = "\ue669"), IconsDataItem(font_class = "info-filled", unicode = "\ue649"), IconsDataItem(font_class = "left", unicode = "\ue6b7"), IconsDataItem(font_class = "link", unicode = "\ue6a5"), IconsDataItem(font_class = "list", unicode = "\ue644"), IconsDataItem(font_class = "location", unicode = "\ue6ae"), IconsDataItem(font_class = "location-filled", unicode = "\ue6af"), IconsDataItem(font_class = "locked", unicode = "\ue66b"), IconsDataItem(font_class = "locked-filled", unicode = "\ue668"), IconsDataItem(font_class = "loop", unicode = "\ue633"), IconsDataItem(font_class = "mail-open", unicode = "\ue643"), IconsDataItem(font_class = "mail-open-filled", unicode = "\ue63a"), IconsDataItem(font_class = "map", unicode = "\ue667"), IconsDataItem(font_class = "map-filled", unicode = "\ue666"), IconsDataItem(font_class = "map-pin", unicode = "\ue6ad"), IconsDataItem(font_class = "map-pin-ellipse", unicode = "\ue6ac"), IconsDataItem(font_class = "medal", unicode = "\ue6a2"), IconsDataItem(font_class = "medal-filled", unicode = "\ue6c3"), IconsDataItem(font_class = "mic", unicode = "\ue671"), IconsDataItem(font_class = "mic-filled", unicode = "\ue677"), IconsDataItem(font_class = "micoff", unicode = "\ue67e"), IconsDataItem(font_class = "micoff-filled", unicode = "\ue6b0"), IconsDataItem(font_class = "minus", unicode = "\ue66f"), IconsDataItem(font_class = "minus-filled", unicode = "\ue67d"), IconsDataItem(font_class = "more", unicode = "\ue64d"), IconsDataItem(font_class = "more-filled", unicode = "\ue64e"), IconsDataItem(font_class = "navigate", unicode = "\ue66e"), IconsDataItem(font_class = "navigate-filled", unicode = "\ue67a"), IconsDataItem(font_class = "notification", unicode = "\ue6a6"), IconsDataItem(font_class = "notification-filled", unicode = "\ue6c1"), IconsDataItem(font_class = "paperclip", unicode = "\ue652"), IconsDataItem(font_class = "paperplane", unicode = "\ue672"), IconsDataItem(font_class = "paperplane-filled", unicode = "\ue675"), IconsDataItem(font_class = "person", unicode = "\ue699"), IconsDataItem(font_class = "person-filled", unicode = "\ue69d"), IconsDataItem(font_class = "personadd", unicode = "\ue69f"), IconsDataItem(font_class = "personadd-filled", unicode = "\ue698"), IconsDataItem(font_class = "personadd-filled-copy", unicode = "\ue6d1"), IconsDataItem(font_class = "phone", unicode = "\ue69c"), IconsDataItem(font_class = "phone-filled", unicode = "\ue69b"), IconsDataItem(font_class = "plus", unicode = "\ue676"), IconsDataItem(font_class = "plus-filled", unicode = "\ue6c7"), IconsDataItem(font_class = "plusempty", unicode = "\ue67b"), IconsDataItem(font_class = "pulldown", unicode = "\ue632"), IconsDataItem(font_class = "pyq", unicode = "\ue682"), IconsDataItem(font_class = "qq", unicode = "\ue680"), IconsDataItem(font_class = "redo", unicode = "\ue64a"), IconsDataItem(font_class = "redo-filled", unicode = "\ue655"), IconsDataItem(font_class = "refresh", unicode = "\ue657"), IconsDataItem(font_class = "refresh-filled", unicode = "\ue656"), IconsDataItem(font_class = "refreshempty", unicode = "\ue6bf"), IconsDataItem(font_class = "reload", unicode = "\ue6b2"), IconsDataItem(font_class = "right", unicode = "\ue6b5"), IconsDataItem(font_class = "scan", unicode = "\ue62a"), IconsDataItem(font_class = "search", unicode = "\ue654"), IconsDataItem(font_class = "settings", unicode = "\ue653"), IconsDataItem(font_class = "settings-filled", unicode = "\ue6ce"), IconsDataItem(font_class = "shop", unicode = "\ue62f"), IconsDataItem(font_class = "shop-filled", unicode = "\ue6cd"), IconsDataItem(font_class = "smallcircle", unicode = "\ue67c"), IconsDataItem(font_class = "smallcircle-filled", unicode = "\ue665"), IconsDataItem(font_class = "sound", unicode = "\ue684"), IconsDataItem(font_class = "sound-filled", unicode = "\ue686"), IconsDataItem(font_class = "spinner-cycle", unicode = "\ue68a"), IconsDataItem(font_class = "staff", unicode = "\ue6a7"), IconsDataItem(font_class = "staff-filled", unicode = "\ue6cb"), IconsDataItem(font_class = "star", unicode = "\ue688"), IconsDataItem(font_class = "star-filled", unicode = "\ue68f"), IconsDataItem(font_class = "starhalf", unicode = "\ue683"), IconsDataItem(font_class = "trash", unicode = "\ue687"), IconsDataItem(font_class = "trash-filled", unicode = "\ue685"), IconsDataItem(font_class = "tune", unicode = "\ue6aa"), IconsDataItem(font_class = "tune-filled", unicode = "\ue6ca"), IconsDataItem(font_class = "undo", unicode = "\ue64f"), IconsDataItem(font_class = "undo-filled", unicode = "\ue64c"), IconsDataItem(font_class = "up", unicode = "\ue6b6"), IconsDataItem(font_class = "top", unicode = "\ue6b6"), IconsDataItem(font_class = "upload", unicode = "\ue690"), IconsDataItem(font_class = "upload-filled", unicode = "\ue68e"), IconsDataItem(font_class = "videocam", unicode = "\ue68c"), IconsDataItem(font_class = "videocam-filled", unicode = "\ue689"), IconsDataItem(font_class = "vip", unicode = "\ue6a8"), IconsDataItem(font_class = "vip-filled", unicode = "\ue6c6"), IconsDataItem(font_class = "wallet", unicode = "\ue6b1"), IconsDataItem(font_class = "wallet-filled", unicode = "\ue6c2"), IconsDataItem(font_class = "weibo", unicode = "\ue68b"), IconsDataItem(font_class = "weixin", unicode = "\ue691"));
val GenUniModulesUniIconsComponentsUniIconsUniIconsClass = CreateVueComponent(GenUniModulesUniIconsComponentsUniIconsUniIcons::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesUniIconsComponentsUniIconsUniIcons.name, inheritAttrs = GenUniModulesUniIconsComponentsUniIconsUniIcons.inheritAttrs, inject = GenUniModulesUniIconsComponentsUniIconsUniIcons.inject, props = GenUniModulesUniIconsComponentsUniIconsUniIcons.props, propsNeedCastKeys = GenUniModulesUniIconsComponentsUniIconsUniIcons.propsNeedCastKeys, emits = GenUniModulesUniIconsComponentsUniIconsUniIcons.emits, components = GenUniModulesUniIconsComponentsUniIconsUniIcons.components, styles = GenUniModulesUniIconsComponentsUniIconsUniIcons.styles);
}
, fun(instance): GenUniModulesUniIconsComponentsUniIconsUniIcons {
    return GenUniModulesUniIconsComponentsUniIconsUniIcons(instance);
}
);
open class ItemCurrency (
    @JsonNotNull
    open var balance: Number,
    @JsonNotNull
    open var flag: String,
    @JsonNotNull
    open var non_withdraw_amount: Number,
) : UTSReactiveObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("ItemCurrency", "pages/home/index.uvue", 61, 6)
    }
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemCurrencyReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemCurrencyReactiveObject : ItemCurrency, IUTSReactive<ItemCurrency> {
    override var __v_raw: ItemCurrency;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemCurrency, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(balance = __v_raw.balance, flag = __v_raw.flag, non_withdraw_amount = __v_raw.non_withdraw_amount) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemCurrencyReactiveObject {
        return ItemCurrencyReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var balance: Number
        get() {
            return trackReactiveGet(__v_raw, "balance", __v_raw.balance, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("balance")) {
                return;
            }
            val oldValue = __v_raw.balance;
            __v_raw.balance = value;
            triggerReactiveSet(__v_raw, "balance", oldValue, value);
        }
    override var flag: String
        get() {
            return trackReactiveGet(__v_raw, "flag", __v_raw.flag, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("flag")) {
                return;
            }
            val oldValue = __v_raw.flag;
            __v_raw.flag = value;
            triggerReactiveSet(__v_raw, "flag", oldValue, value);
        }
    override var non_withdraw_amount: Number
        get() {
            return trackReactiveGet(__v_raw, "non_withdraw_amount", __v_raw.non_withdraw_amount, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("non_withdraw_amount")) {
                return;
            }
            val oldValue = __v_raw.non_withdraw_amount;
            __v_raw.non_withdraw_amount = value;
            triggerReactiveSet(__v_raw, "non_withdraw_amount", oldValue, value);
        }
}
open class UserInformation (
    @JsonNotNull
    open var membership_level: String,
    @JsonNotNull
    open var account_number: String,
    @JsonNotNull
    open var user_balance: UTSArray<ItemCurrency>,
) : UTSReactiveObject(), IUTSSourceMap {
    override fun `__$getOriginalPosition`(): UTSSourceMapPosition? {
        return UTSSourceMapPosition("UserInformation", "pages/home/index.uvue", 67, 6)
    }
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return UserInformationReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class UserInformationReactiveObject : UserInformation, IUTSReactive<UserInformation> {
    override var __v_raw: UserInformation;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: UserInformation, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(membership_level = __v_raw.membership_level, account_number = __v_raw.account_number, user_balance = __v_raw.user_balance) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UserInformationReactiveObject {
        return UserInformationReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var membership_level: String
        get() {
            return trackReactiveGet(__v_raw, "membership_level", __v_raw.membership_level, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("membership_level")) {
                return;
            }
            val oldValue = __v_raw.membership_level;
            __v_raw.membership_level = value;
            triggerReactiveSet(__v_raw, "membership_level", oldValue, value);
        }
    override var account_number: String
        get() {
            return trackReactiveGet(__v_raw, "account_number", __v_raw.account_number, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("account_number")) {
                return;
            }
            val oldValue = __v_raw.account_number;
            __v_raw.account_number = value;
            triggerReactiveSet(__v_raw, "account_number", oldValue, value);
        }
    override var user_balance: UTSArray<ItemCurrency>
        get() {
            return trackReactiveGet(__v_raw, "user_balance", __v_raw.user_balance, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("user_balance")) {
                return;
            }
            val oldValue = __v_raw.user_balance;
            __v_raw.user_balance = value;
            triggerReactiveSet(__v_raw, "user_balance", oldValue, value);
        }
}
val GenPagesHomeIndexClass = CreateVueComponent(GenPagesHomeIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesHomeIndex.inheritAttrs, inject = GenPagesHomeIndex.inject, props = GenPagesHomeIndex.props, propsNeedCastKeys = GenPagesHomeIndex.propsNeedCastKeys, emits = GenPagesHomeIndex.emits, components = GenPagesHomeIndex.components, styles = GenPagesHomeIndex.styles);
}
, fun(instance): GenPagesHomeIndex {
    return GenPagesHomeIndex(instance);
}
);
val GenPagesHomeScanClass = CreateVueComponent(GenPagesHomeScan::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesHomeScan.inheritAttrs, inject = GenPagesHomeScan.inject, props = GenPagesHomeScan.props, propsNeedCastKeys = GenPagesHomeScan.propsNeedCastKeys, emits = GenPagesHomeScan.emits, components = GenPagesHomeScan.components, styles = GenPagesHomeScan.styles);
}
, fun(instance): GenPagesHomeScan {
    return GenPagesHomeScan(instance);
}
);
fun createApp(): UTSJSONObject {
    val app = createSSRApp(GenAppClass);
    return UTSJSONObject(Map<String, Any?>(utsArrayOf(
        utsArrayOf(
            "app",
            app
        )
    )));
}
fun main(app: IApp) {
    definePageRoutes();
    defineAppConfig();
    (createApp()["app"] as VueApp).mount(app);
}
open class UniAppConfig : io.dcloud.uniapp.appframe.AppConfig {
    override var name: String = "LearnUniAppX";
    override var appid: String = "";
    override var versionName: String = "1.5";
    override var versionCode: String = "10500";
    override var uniCompilerVersion: String = "4.29";
    constructor() : super() {}
}
fun definePageRoutes() {
    __uniRoutes.push(UniPageRoute(path = "pages/home/index", component = GenPagesHomeIndexClass, meta = UniPageMeta(isQuit = true), style = utsMapOf("navigationStyle" to "custom")));
    __uniRoutes.push(UniPageRoute(path = "pages/home/scan", component = GenPagesHomeScanClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationStyle" to "custom")));
}
val __uniTabBar: Map<String, Any?>? = null;
val __uniLaunchPage: Map<String, Any?> = utsMapOf("url" to "pages/home/index", "style" to utsMapOf("navigationStyle" to "custom"));
fun defineAppConfig() {
    __uniConfig.entryPagePath = "/pages/home/index";
    __uniConfig.globalStyle = utsMapOf("navigationBarTextStyle" to "black", "navigationBarTitleText" to "uni-app x", "navigationBarBackgroundColor" to "#F8F8F8", "backgroundColor" to "#F8F8F8");
    __uniConfig.tabBar = __uniTabBar as Map<String, Any>?;
    __uniConfig.conditionUrl = "";
    __uniConfig.uniIdRouter = utsMapOf();
    __uniConfig.themeConfig = utsMapOf("light" to utsMapOf("navigationBarTextStyle" to "white", "navigationBarBackgroundColor" to "#007AFF", "backgroundColorContent" to "#efeff4", "backgroundColor" to "#efeff4", "tabBarColor" to "#7A7E83", "tabBarSelectedColor" to "#007AFF", "tabBarBorderStyle" to "black", "tabBarBackgroundColor" to "#F8F8F8", "tabBarComponentIconPath" to "static/component.png", "tabBarComponentSelectedIconPath" to "static/componentHL.png", "tabBarAPIIconPath" to "static/api.png", "tabBarAPISelectedIconPath" to "static/apiHL.png", "tabBarCSSIconPath" to "static/css.png", "tabBarCSSSelectedIconPath" to "static/cssHL.png", "tabBarTemplateIconPath" to "static/template.png", "tabBarTemplateSelectedIconPath" to "static/templateHL.png"), "dark" to utsMapOf("navigationBarTextStyle" to "white", "navigationBarBackgroundColor" to "#1F1F1F", "backgroundColor" to "#1F1F1F", "backgroundColorContent" to "#646464", "tabBarColor" to "#cacaca", "tabBarSelectedColor" to "#007AFF", "tabBarBorderStyle" to "white", "tabBarBackgroundColor" to "#1F1F1F", "tabBarComponentIconPath" to "static/component.png", "tabBarComponentSelectedIconPath" to "static/componentHL.png", "tabBarAPIIconPath" to "static/api.png", "tabBarAPISelectedIconPath" to "static/apiHL.png", "tabBarCSSIconPath" to "static/css.png", "tabBarCSSSelectedIconPath" to "static/cssHL.png", "tabBarTemplateIconPath" to "static/template.png", "tabBarTemplateSelectedIconPath" to "static/templateHL.png"));
    __uniConfig.ready = true;
}
fun getApp(): GenApp {
    return getBaseApp() as GenApp;
}
