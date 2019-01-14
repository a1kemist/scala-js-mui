package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/paper/
  */
object MuiPaper extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Paper", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = None,
              elevation: Option[Int] = None,
              square: Option[Boolean] = None): WithProps = auto
}

/** Legacy Facade */
/*
object MuiPaper {
    @JSImport("@material-ui/core/Paper", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    @js.native
    trait Props extends js.Object {
        var classes: js.Object = js.native
        var component: js.UndefOr[String | js.Function] = js.native
        var elevation: js.UndefOr[Int] = js.native
        var square: js.UndefOr[Boolean] = js.native
    }

    def props(classes: js.Object,
              component: Option[String | js.Function] = None,
              elevation: Option[Int] = None,
              square: Option[Boolean] = None): Props = {
        val p = (new js.Object).asInstanceOf[Props]
        p.classes = classes
        p.component = component.orUndefined
        p.elevation = elevation.orUndefined
        p.square = square.orUndefined
        p
    }

    val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

    def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

    def apply(classes: js.Object,
              component: Option[String | js.Function] = None,
              elevation: Option[Int] = None,
              square: Option[Boolean] = None)(children: VdomNode*) = {
        impl(props(
            classes,
            component,
            elevation,
            square
        ))(children: _*)
    }
}
*/
