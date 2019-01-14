package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/form-control/
  */
object MuiFormControl extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/FormControl", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
              component: Option[String | js.Function] = None,
              disabled: Option[Boolean] = None,
              error: Option[Boolean] = None,
              fullWidth: Option[Boolean] = None,
              margin: Option[String] = None,
              onBlur: Option[js.Function] = None,
              required: Option[Boolean] = None): WithProps = auto
}

/** Lagecy Facade */
/*
object MuiFormControl {
  @JSImport("@material-ui/core/Form/FormControl", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
//    var classes: js.Object = js.native
//    var component: js.UndefOr[String | js.Function] = js.native
//    var elevation: js.UndefOr[Int] = js.native
//    var square: js.UndefOr[Boolean] = js.native
    var classes: js.Object = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | js.Function] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var margin: js.UndefOr[String] = js.native
    var onBlur: js.UndefOr[js.Function] = js.native
    var required: js.UndefOr[Boolean] = js.native
  }

  def props(classes: js.Object = js.Object(),
            className: Option[String] = None,
            component: Option[String | js.Function] = None,
            disabled: Option[Boolean] = None,
            error: Option[Boolean] = None,
            fullWidth: Option[Boolean] = None,
            margin: Option[String] = None,
            onBlur: Option[js.Function] = None,
            required: Option[Boolean] = None): Props = {
    val p = (new js.Object).asInstanceOf[Props]
    p.classes = classes
    p.className = className.orUndefined
    p.component = component.orUndefined
    p.disabled = disabled.orUndefined
    p.error = error.orUndefined
    p.fullWidth = fullWidth.orUndefined
    p.margin = margin.orUndefined
    p.onBlur = onBlur.orUndefined
    p.required = required.orUndefined
    p
  }

  val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

  def apply(classes: js.Object = js.Object(),
            className: Option[String] = None,
            component: Option[String | js.Function] = None,
            disabled: Option[Boolean] = None,
            error: Option[Boolean] = None,
            fullWidth: Option[Boolean] = None,
            margin: Option[String] = None,
            onBlur: Option[js.Function] = None,
            required: Option[Boolean] = None)(children: VdomNode*) = {
    impl(props(
      classes,
      className,
      component,
      disabled,
      error,
      fullWidth,
      margin,
      onBlur,
      required
    ))(children: _*)
  }
}
*/
