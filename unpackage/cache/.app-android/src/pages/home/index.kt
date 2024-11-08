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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenPagesHomeIndex : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onCreated(fun() {}, __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_uni_icons = resolveEasyComponent("uni-icons", GenUniModulesUniIconsComponentsUniIconsUniIconsClass);
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "custom-nav"), utsArrayOf(
                createElementVNode("image", utsMapOf("class" to "img", "src" to "/static/back.png")),
                createElementVNode("text", utsMapOf("class" to "nav-title"), "钱包"),
                createElementVNode("image", utsMapOf("class" to "img", "src" to "/static/setting.png"))
            )),
            createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1", "position" to "relative"))), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "user-level-view"), utsArrayOf(
                    createElementVNode("image", utsMapOf("class" to "user-level-icon", "src" to "/static/circle.png")),
                    createElementVNode("text", utsMapOf("class" to "user-level-text"), "尊享用户")
                )),
                createElementVNode("view", utsMapOf("class" to "contact-us-view"), utsArrayOf(
                    createElementVNode("image", utsMapOf("class" to "img", "src" to "/static/customer-service.png")),
                    createElementVNode("text", utsMapOf("class" to "contact-us-text"), "联系我们")
                )),
                createElementVNode("view", utsMapOf("class" to "content-container"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "qr-function", "style" to normalizeStyle(utsMapOf("margin" to "10px 30px 20px 0px", "display" to "flex", "flex-direction" to "row", "flex-wrap" to "wrap", "justify-content" to "space-around"))), utsArrayOf(
                        createElementVNode("view", utsMapOf("onClick" to _ctx.navigateToScanPage, "style" to normalizeStyle(utsMapOf("display" to "flex", "flex-direction" to "column", "justify-content" to "center"))), utsArrayOf(
                            createElementVNode("image", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "35px", "height" to "35px")), "src" to "/static/qr-scan.png"), null, 4),
                            createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "12px", "padding-top" to "5px", "font-weight" to "400"))), "扫一扫", 4)
                        ), 12, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("display" to "flex", "flex-direction" to "column", "justify-content" to "center"))), utsArrayOf(
                            createElementVNode("image", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "35px", "height" to "35px")), "src" to "/static/qr-scan.png"), null, 4),
                            createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "12px", "padding-top" to "5px", "font-weight" to "400"))), "收款码", 4)
                        ), 4)
                    ), 4),
                    createElementVNode("view", utsMapOf("class" to "balance-info-container"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "acc-num-sec"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "acc-display"), utsArrayOf(
                                createElementVNode("image", utsMapOf("class" to "logo-img", "style" to normalizeStyle(utsMapOf<String, Any?>()), "src" to "/static/elephant.png"), null, 4),
                                createElementVNode("text", utsMapOf("class" to "acc-num", "style" to normalizeStyle(utsMapOf<String, Any?>())), "账号 : " + toDisplayString(_ctx.userInformation.account_number), 5),
                                createElementVNode("image", utsMapOf("class" to "copy-img", "style" to normalizeStyle(utsMapOf<String, Any?>()), "src" to "/static/copy.png"), null, 4)
                            )),
                            createElementVNode("view", null, utsArrayOf(
                                createElementVNode("image", utsMapOf("class" to "history-img", "style" to normalizeStyle(utsMapOf<String, Any?>()), "src" to "/static/notes.png"), null, 4)
                            ))
                        )),
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.userInformation.user_balance, fun(item, __key, __index, _cached): Any {
                            return createElementVNode("view", null, utsArrayOf(
                                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("display" to "flex", "flex-direction" to "row", "justify-content" to "space-between", "align-items" to "flex-end", "margin-top" to "20px"))), utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "amount_sec"), utsArrayOf(
                                        createElementVNode("image", utsMapOf("class" to "flag_img", "src" to item.flag), null, 8, utsArrayOf(
                                            "src"
                                        )),
                                        createElementVNode("text", utsMapOf("class" to "balance_text"), "\$" + toDisplayString(item.balance), 1),
                                        createVNode(_component_uni_icons, utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "10px")), "type" to "eye-filled", "size" to "15", "color" to "#ffffff"), null, 8, utsArrayOf(
                                            "style"
                                        ))
                                    )),
                                    createElementVNode("view", utsMapOf("class" to "non-withdraw-sec"), utsArrayOf(
                                        createVNode(_component_uni_icons, utsMapOf("class" to "non-withdraw-img", "type" to "help-filled", "color" to "#ffffff")),
                                        createElementVNode("text", utsMapOf("class" to "non-withdraw-txt"), "不可提现余额: \$0.00")
                                    ))
                                ), 4)
                            ));
                        }
                        ), 256)
                    ))
                ))
            ), 4)
        ), 64);
    }
    open var userInformation: UserInformation by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("userInformation" to UserInformation(membership_level = "Platinum", account_number = "96375064", user_balance = utsArrayOf<ItemCurrency>(ItemCurrency(balance = 2.89, flag = "/static/united-states.png", non_withdraw_amount = 0.00), ItemCurrency(balance = 502, flag = "/static/khmer.png", non_withdraw_amount = 0.00))));
    }
    override fun `$initMethods`() {
        this.goBack = fun() {
            uni_navigateBack(null);
        }
        ;
        this.navigateToScanPage = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/home/scan"));
        }
        ;
    }
    open lateinit var goBack: () -> Unit;
    open lateinit var navigateToScanPage: () -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("custom-nav" to padStyleMapOf(utsMapOf("backgroundImage" to "linear-gradient(to right, #ff7f50, #ff4500)", "paddingTop" to 40, "paddingBottom" to 10, "paddingLeft" to 20, "paddingRight" to 20, "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between")), "nav-title" to padStyleMapOf(utsMapOf("color" to "#FFFFFF", "fontSize" to 12, "fontWeight" to "bold")), "img" to padStyleMapOf(utsMapOf("width" to 16, "height" to 16)), "contact-us-view" to padStyleMapOf(utsMapOf("position" to "fixed", "display" to "flex", "flexDirection" to "row", "alignItems" to "center", "right" to 0, "top" to "9%", "paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5, "backgroundColor" to "#FFFFFF", "borderTopLeftRadius" to 15, "borderBottomLeftRadius" to 15)), "contact-us-text" to padStyleMapOf(utsMapOf("color" to "#1E90FF", "fontSize" to 12, "paddingLeft" to 5)), "user-level-view" to padStyleMapOf(utsMapOf("backgroundImage" to "linear-gradient(to right, #ff7f50, #ff4500)", "paddingBottom" to 25, "paddingTop" to 15, "paddingLeft" to 20, "display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "user-level-text" to padStyleMapOf(utsMapOf("fontSize" to 12, "color" to "#FFFFFF", "paddingLeft" to 5)), "user-level-icon" to padStyleMapOf(utsMapOf("height" to 25, "width" to 25)), "content-container" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to 5, "borderTopRightRadius" to 5, "marginTop" to -10, "backgroundColor" to "#FFFFFF", "paddingTop" to 20, "paddingRight" to 20, "paddingBottom" to 20, "paddingLeft" to 20)), "balance-info-container" to padStyleMapOf(utsMapOf("backgroundImage" to "linear-gradient(to right, #a20006, #d70000)", "paddingTop" to 20, "paddingRight" to 20, "paddingBottom" to 20, "paddingLeft" to 20, "borderRadius" to 10)), "acc-num-sec" to padStyleMapOf(utsMapOf("flexDirection" to "row", "display" to "flex", "alignItems" to "center", "justifyContent" to "space-between")), "acc-display" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "logo-img" to padStyleMapOf(utsMapOf("width" to 30, "height" to 30, "marginRight" to 15)), "acc-num" to padStyleMapOf(utsMapOf("color" to "#FFFFFF", "fontSize" to 13, "fontWeight" to "bold")), "copy-img" to padStyleMapOf(utsMapOf("width" to 12, "height" to 11, "marginLeft" to 10)), "history-img" to padStyleMapOf(utsMapOf("width" to 18, "height" to 18)), "amount_sec" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row")), "flag_img" to padStyleMapOf(utsMapOf("width" to 35, "height" to 33)), "balance_text" to padStyleMapOf(utsMapOf("color" to "#FFFFFF", "textDecorationLine" to "underline", "textDecorationThickness" to "5px", "textDecorationColor" to "white", "fontSize" to 14, "fontWeight" to "bold", "marginLeft" to 10)), "non-withdraw-sec" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "non-withdraw-img" to padStyleMapOf(utsMapOf("marginRight" to 5)), "non-withdraw-txt" to padStyleMapOf(utsMapOf("color" to "#FFFFFF", "fontSize" to 12, "fontWeight" to "700")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
