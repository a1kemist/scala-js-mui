package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/list-item/
  */
object MuiListItem extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/ListItem", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(button: Option[Boolean] = Some(false),
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              component: Option[String | js.Function] = None,
              ContainerComponent: Option[String | js.Function] = Some("li"),
              ContainerProps: js.Object = js.Object(),
              dense: Option[Boolean] = Some(false),
              disabled: Option[Boolean] = Some(false),
              disableGutters: Option[Boolean] = Some(false),
              divider: Option[Boolean] = Some(false)): WithProps = auto
}

/** Legacy Facade */
/*
object MuiListItem {
    @JSImport("@material-ui/core/List/ListItem", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    @js.native
    trait Props extends js.Object {
        //    var classes: js.Object = js.native
//    var className: js.UndefOr[String] = js.native
//    var component: js.UndefOr[String | js.Function] = js.native
//    var role: js.UndefOr[String] = js.native
//    var selected: js.UndefOr[Boolean] = js.native
var button: js.UndefOr[Boolean] = js.native
        var classes: js.Object = js.native
        var className: js.UndefOr[String] = js.native
        var component: js.UndefOr[String | js.Function] = js.native
        var ContainerComponent: js.UndefOr[String | js.Function] = js.native
        var ContainerProps: js.Object = js.native
        var dense: js.UndefOr[Boolean] = js.native
        var disabled: js.UndefOr[Boolean] = js.native
        var disableGutters: js.UndefOr[Boolean] = js.native
        var divider: js.UndefOr[Boolean] = js.native
    }


    def props(button: Option[Boolean] = Some(false),
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              component: Option[String | js.Function] = None,
              ContainerComponent: Option[String | js.Function] = Some("li"),
              ContainerProps: js.Object = js.Object(),
              dense: Option[Boolean] = Some(false),
              disabled: Option[Boolean] = Some(false),
              disableGutters: Option[Boolean] = Some(false),
              divider: Option[Boolean] = Some(false)) : Props = {
        val p = (new js.Object).asInstanceOf[Props]
        p.button = button.orUndefined
        p.classes = classes
        p.className = className.orUndefined
        p.component = component.orUndefined
        p.ContainerComponent = ContainerComponent.orUndefined
        p.ContainerProps = ContainerProps
        p.dense = dense.orUndefined
        p.disabled = disabled.orUndefined
        p.disableGutters = disableGutters.orUndefined
        p.divider = divider.orUndefined
        p
    }

    val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

    def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

    def apply(button: Option[Boolean] = Some(false),
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              component: Option[String | js.Function] = None,
              ContainerComponent: Option[String | js.Function] = Some("li"),
              ContainerProps: js.Object = js.Object(),
              dense: Option[Boolean] = Some(false),
              disabled: Option[Boolean] = Some(false),
              disableGutters: Option[Boolean] = Some(false),
              divider: Option[Boolean] = Some(false))(children: VdomNode*) = {
        impl(props(
            button,
            classes,
            className,
            component,
            ContainerComponent,
            ContainerProps,
            dense,
            disabled,
            disableGutters,
            divider
        ))(children: _*)
    }
}
*/
