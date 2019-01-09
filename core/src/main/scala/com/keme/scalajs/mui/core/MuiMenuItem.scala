package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/menu-item/
  */
object MuiMenuItem extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/MenuItem", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(component: Option[String | js.Function] = Some("li"),
              role: Option[String] = Some("menuitem"),
              selected: Option[Boolean] = Some(false)): WithProps = auto
}

/** Lagecy Facade */
/*
object MuiMenuItem {
  @JSImport("@material-ui/core/Menu/MenuItem", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  @js.native
  trait Props extends MuiListItem.Props {
    // var classes: js.Object = js.native
    // var className: js.UndefOr[String] = js.native
    // var component: js.UndefOr[String | js.Function] = js.native
    var role: js.UndefOr[String] = js.native
    var selected: js.UndefOr[Boolean] = js.native
  }


//  def props(liProps: MuiListItem.Props,
//            classes: js.Object = js.Object(),
//            className: Option[String] = None,
//            component: Option[String | js.Function] = Some("li"),
//            role: Option[String] = Some("menuitem" ),
//            selected: Option[Boolean] = Some(false)) : Props = {
  def props(liProps: MuiListItem.Props,
            role: Option[String] = Some("menuitem"),
            selected: Option[Boolean] = Some(false)) : Props = {
    val p = (new js.Object).asInstanceOf[Props]
//    p.classes = classes
//    p.className = className.orUndefined
//    p.component = component.orUndefined
    p.role = role.orUndefined
    p.selected = selected.orUndefined

    // Inherited from MuiListItem Props
    p.button = liProps.button
    p.classes = liProps.classes
    p.className = liProps.className
    p.component = liProps.component
    p.ContainerComponent = liProps.ContainerComponent
    p.ContainerProps = liProps.ContainerProps
    p.dense = liProps.dense
    p.disabled = liProps.disabled
    p.disableGutters = liProps.disableGutters
    p.divider = liProps.divider
    p
  }

  val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

  def apply(liProps: MuiListItem.Props,
            role: Option[String] = Some("menuitem"),
            selected: Option[Boolean] = Some(false))(children: VdomNode*) = {
    impl(props(
      liProps,
      role,
      selected
    ))(children: _*)
  }
}
*/
