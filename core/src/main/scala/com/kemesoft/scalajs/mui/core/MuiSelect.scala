package com.kemesoft.scalajs.mui.core

import com.keme.scalajs.mui.internal.svgicons.ArrowDropDown
import com.kemesoft.scalajs.mui.internal.svgicons.ArrowDropDown
import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/selects/
  */
object MuiSelect extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Select", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(autoWidth: Option[Boolean] = Some(false),
              classes: js.Object = js.Object(),
              displayEmpty: Option[Boolean] = Some(false),
              IconComponent: Option[String | js.Function] = Some(ArrowDropDown),
              input: Option[React.Element] = Some(MuiInput()().rawElement),
              inputProps: js.Object = js.Object(),
              MenuProps: js.Object = js.Object(),
              multiple: Option[Boolean] = Some(false),
              native: Option[Boolean] = Some(false),
              onClose: Option[js.Function] = None,
              onOpen: Option[js.Function] = None,
              renderValue: Option[js.Function] = None,
              SelectDisplayProps: js.Object = js.Object(),
              value: Option[String | Int] = None
              // TODO: MuiInput inherited props?
             ): WithProps = auto
}

/** Legacy Facade */
/*
object MuiSelect {
  @JSImport("@material-ui/core/Select", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    var autoWidth: js.UndefOr[Boolean] = js.native
    var classes: js.Object = js.native
    var displayEmpty: js.UndefOr[Boolean] = js.native
    var input: js.UndefOr[React.Element] = js.native
    var inputProps: js.Object = js.native
    var MenuProps: js.Object = js.native
    var multiple: js.UndefOr[Boolean] = js.native
    var native: js.UndefOr[Boolean] = js.native
    var onChange: js.UndefOr[js.Function] = js.native
    var onClose: js.UndefOr[js.Function] = js.native
    var onOpen: js.UndefOr[js.Function] = js.native
    var renderValue: js.UndefOr[js.Function] = js.native
    var SelectDisplayProps: js.Object = js.native
    var value: js.UndefOr[String | Int | Array[String] | Array[Int]] = js.native
  }

  def props(autoWidth: Option[Boolean] = Some(false),
            classes: js.Object = js.Object(),
            displayEmpty: Option[Boolean] = Some(false),
            input: Option[React.Element] = Some(MuiInput()().raw),
            inputProps: js.Object = js.Object(),
            MenuProps: js.Object = js.Object(),
            multiple: Option[Boolean] = Some(false),
            native: Option[Boolean] = Some(false),
            onChange: Option[js.Function] = None,
            onClose: Option[js.Function] = None,
            onOpen: Option[js.Function] = None,
            renderValue: Option[js.Function] = None,
            SelectDisplayProps: js.Object = js.Object(),
            value: Option[String | Int | Array[String] | Array[Int]] = None): Props = {
    val p = (new js.Object).asInstanceOf[Props]
    p.autoWidth = autoWidth.orUndefined
    p.classes = classes
    p.displayEmpty = displayEmpty.orUndefined
    p.input = input.orUndefined
    p.inputProps = inputProps
    p.MenuProps = MenuProps
    p.multiple = multiple.orUndefined
    p.native = native.orUndefined
    p.onChange = onChange.orUndefined
    p.onClose = onClose.orUndefined
    p.onOpen = onOpen.orUndefined
    p.renderValue = renderValue.orUndefined
    p.SelectDisplayProps = SelectDisplayProps
    p.value = value.orUndefined
    p
  }

  val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

  def apply(autoWidth: Option[Boolean] = Some(false),
            classes: js.Object = js.Object(),
            displayEmpty: Option[Boolean] = Some(false),
            input: Option[React.Element] = Some(MuiInput()().raw),
            inputProps: js.Object = js.Object(),
            MenuProps: js.Object = js.Object(),
            multiple: Option[Boolean] = Some(false),
            native: Option[Boolean] = Some(false),
            onChange: Option[js.Function] = None,
            onClose: Option[js.Function] = None,
            onOpen: Option[js.Function] = None,
            renderValue: Option[js.Function] = None,
            SelectDisplayProps: js.Object = js.Object(),
            value: Option[String | Int | Array[String] | Array[Int]] = None)(children: VdomNode*) = {
    impl(props(
      autoWidth,
      classes,
      displayEmpty,
      input,
      inputProps,
      MenuProps,
      multiple,
      native,
      onChange,
      onClose,
      onOpen,
      renderValue,
      SelectDisplayProps,
      value
    ))(children: _*)
  }
}
*/
