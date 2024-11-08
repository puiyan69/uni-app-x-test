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
open class GenPagesHomeScan : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLoad(fun(_: OnLoadOptions) {
            this.startScanning();
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "custom-nav"), utsArrayOf(
            createElementVNode("image", utsMapOf("onClick" to _ctx.goBack, "class" to "img", "src" to "/static/back.png"), null, 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("text", utsMapOf("class" to "nav-title"), "扫一扫"),
            createElementVNode("image", utsMapOf("class" to "img", "src" to "/static/setting.png"))
        ));
    }
    open var scanResult: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("scanResult" to "");
    }
    override fun `$initMethods`() {
        this.goBack = fun() {
            uni_navigateBack(null);
        }
        ;
        this.startScanning = fun() {};
    }
    open lateinit var goBack: () -> Unit;
    open lateinit var startScanning: () -> Unit;
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
                return utsMapOf("custom-nav" to padStyleMapOf(utsMapOf("backgroundImage" to "linear-gradient(to right, #ff7f50, #ff4500)", "paddingTop" to 40, "paddingBottom" to 10, "paddingLeft" to 20, "paddingRight" to 20, "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between")), "nav-title" to padStyleMapOf(utsMapOf("color" to "#FFFFFF", "fontWeight" to "bold")), "img" to padStyleMapOf(utsMapOf("width" to 16, "height" to 16)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
