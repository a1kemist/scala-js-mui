package com.keme.scalajs.mui.core.styles

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiThemeProvider extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/styles/MuiThemeProvider", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(disableStylesGeneration: Option[Boolean] = None,
              sheetsManager: Option[js.Object] = None,
              theme: js.Object | js.Function): WithProps = auto
}

/** Legacy Facade */
/*
object MuiThemeProvider {
    @JSImport("@material-ui/core/styles/MuiThemeProvider", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    @js.native
    trait Props extends js.Object {
        var disableStylesGeneration: js.UndefOr[Boolean] = js.native
        var sheetsManager: js.UndefOr[js.Object] = js.native
        var theme: js.Object | js.Function = js.native
    }

    def props(disableStylesGeneration: Option[Boolean] = None,
              sheetsManager: Option[js.Object] = None,
              theme: js.Object | js.Function): Props = {
        val p = (new js.Object).asInstanceOf[Props]
        p.disableStylesGeneration = disableStylesGeneration.orUndefined
        p.sheetsManager = sheetsManager.orUndefined
        p.theme = theme
        p
    }

    val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

    def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

    def apply(disableStylesGeneration: Option[Boolean] = None,
              sheetsManager: Option[js.Object] = None,
              theme: js.Object | js.Function)(children: VdomNode*) = {
        impl(props(disableStylesGeneration, sheetsManager, theme))(children: _*)
    }
}
*/
