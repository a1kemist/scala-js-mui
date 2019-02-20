package com.kemesoft.scalajs.mui.core

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.scalajs.js.JSConverters._

/**
  * https://material-ui-next.com/api/paper/
  */
/** Legacy Facade */
/*
import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

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
*/

object MuiPaper {
    @JSImport("@material-ui/core/Paper", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    @js.native
    trait Props extends js.Object {
        def classes: js.Object = js.native
        def className: String = js.native
        def component: js.UndefOr[String | js.Function] = js.native
        def elevation: js.UndefOr[Int] = js.native
        def square: js.UndefOr[Boolean] = js.native
    }

    object Props {
        def apply(classes: js.Object,
                  className: js.UndefOr[String] = js.undefined,
                  component: js.UndefOr[String | js.Function] = js.undefined,
                  elevation: js.UndefOr[Int] = js.undefined,
                  square: js.UndefOr[Boolean] = js.undefined): Props = {
            val p = Map(
                "classes" -> classes,
                "className" -> className,
                "component" -> component,
                "elevation" -> elevation,
                "square" -> square
            )
            p.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Props]
        }
    }

    val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

    def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

    def apply(classes: js.Object,
              className: js.UndefOr[String] = js.undefined,
              component: js.UndefOr[String | js.Function] = js.undefined,
              elevation: js.UndefOr[Int] = js.undefined,
              square: js.UndefOr[Boolean] = js.undefined)(children: VdomNode*) = {
        impl(
            Props(
                classes,
                className,
                component,
                elevation,
                square
            )
        )(children: _*)
    }
}
