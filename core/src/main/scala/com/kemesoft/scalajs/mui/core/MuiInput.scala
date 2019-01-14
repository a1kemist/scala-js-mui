package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/input/
  */
object MuiInput extends ReactBridgeComponent {
    import JsWriterImplicits.vdomNodeWriter

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/Input", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(
//              autoComplete: Option[String] = None,
              autoFocus: Option[Boolean] = None,
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              defaultValue: Option[String | Int] = None,
//              disabled: Option[Boolean] = None,
              disableUnderline: Option[Boolean] = Some(false),
              endAdornment: Option[VdomNode] = None,
              error: Option[Boolean] = None,
              fullWidth: Option[Boolean] = Some(false),
//              id: Option[String] = None,
              inputComponent: Option[String | js.Function] = None,
              inputProps: js.Object = js.Object(),
              inputRef: Option[js.Function] = None,
              margin: Option[js.Array[String]] = None,
              multiline: Option[Boolean] = Some(false),
              name: Option[String] = None,
//              onBlur: Option[js.Function] = None,
//              onChange: Option[js.Function] = None,
//              onEmpty: Option[js.Function] = None,
//              onFilled: Option[js.Function] = None,
//              onFocus: Option[js.Function] = None,
//              onKeyDown: Option[js.Function] = None,
//              onKeyUp: Option[js.Function] = None,
//              placeholder: Option[String] = None,
//              readOnly: Option[Boolean] = None,
              rows: Option[String | Int] = None,
              rowsMax: Option[String | Int] = None,
              startAdornment: Option[VdomNode] = None,
//              `type`: Option[String] = Some("text")
              value: Option[String | Int] = None
             ): WithProps = auto
}

/** Legacy Facade */
/*
object MuiInput {
  @JSImport("@material-ui/core/Input", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    var autoComplete: js.UndefOr[String] = js.native
    var autoFocus: js.UndefOr[Boolean] = js.native
    var classes: js.Object = js.native
    var className: js.UndefOr[String] = js.native
    var defaultValue: js.UndefOr[String | Int] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var disableUnderline: js.UndefOr[Boolean] = js.native
    var endAdornment: js.UndefOr[VdomNode] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var id: js.UndefOr[String] = js.native
    var inputComponent: js.UndefOr[String | js.Function] = js.native
    var inputProps: js.Object = js.native
    var inputRef: js.UndefOr[js.Function] = js.native
    var margin: js.UndefOr[Array[String]] = js.native
    var multiline: js.UndefOr[Boolean] = js.native
    var name: js.UndefOr[String] = js.native
    var onBlur: js.UndefOr[js.Function] = js.native
    var onChange: js.UndefOr[js.Function] = js.native
    var onEmpty: js.UndefOr[js.Function] = js.native
    var onFilled: js.UndefOr[js.Function] = js.native
    var onFocus: js.UndefOr[js.Function] = js.native
    var onKeyDown: js.UndefOr[js.Function] = js.native
    var onKeyUp: js.UndefOr[js.Function] = js.native
    var placeholder: js.UndefOr[String] = js.native
    var readOnly: js.UndefOr[Boolean] = js.native
    var rows: js.UndefOr[String | Int] = js.native
    var rowsMax: js.UndefOr[String | Int] = js.native
    var startAdornment: js.UndefOr[VdomNode] = js.native
    var `type`: js.UndefOr[String] = js.native
    var value: js.UndefOr[String | Int | js.Array[String] | js.Array[Int]] = js.native
  }

  def props(autoComplete: Option[String] = None,
            autoFocus: Option[Boolean] = None,
            classes: js.Object = js.Object(),
            className: Option[String] = None,
            defaultValue: Option[String | Int] = None,
            disabled: Option[Boolean] = None,
            disableUnderline: Option[Boolean] = Some(false),
            endAdornment: Option[VdomNode] = None,
            error: Option[Boolean] = None,
            fullWidth: Option[Boolean] = Some(false),
            id: Option[String] = None,
            inputComponent: Option[String | js.Function] = None,
            inputProps: js.Object = js.Object(),
            inputRef: Option[js.Function] = None,
            margin: Option[Array[String]] = None,
            multiline: Option[Boolean] = Some(false),
            name: Option[String] = None,
            onBlur: Option[js.Function] = None,
            onChange: Option[js.Function] = None,
            onEmpty: Option[js.Function] = None,
            onFilled: Option[js.Function] = None,
            onFocus: Option[js.Function] = None,
            onKeyDown: Option[js.Function] = None,
            onKeyUp: Option[js.Function] = None,
            placeholder: Option[String] = None,
            readOnly: Option[Boolean] = None,
            rows: Option[String | Int] = None,
            rowsMax: Option[String | Int] = None,
            startAdornment: Option[VdomNode] = None,
            `type`: Option[String] = Some("text"),
            value: Option[String | Int | js.Array[String] | js.Array[Int]] = None) : Props = {
    val p = (new js.Object).asInstanceOf[Props]
    p.autoComplete = autoComplete.orUndefined
    p.autoFocus = autoFocus.orUndefined
    p.classes = classes
    p.className = className.orUndefined
    p.defaultValue = defaultValue.orUndefined
    p.disabled = disabled.orUndefined
    p.disableUnderline = disableUnderline.orUndefined
    p.endAdornment = endAdornment.orUndefined
    p.error = error.orUndefined
    p.fullWidth = fullWidth.orUndefined
    p.id = id.orUndefined
    p.inputComponent = inputComponent.orUndefined
    p.inputProps = inputProps
    p.inputRef = inputRef.orUndefined
    p.margin = margin.orUndefined
    p.multiline = multiline.orUndefined
    p.name = name.orUndefined
    p.onBlur = onBlur.orUndefined
    p.onChange = onChange.orUndefined
    p.onEmpty = onEmpty.orUndefined
    p.onFilled = onFilled.orUndefined
    p.onFocus = onFocus.orUndefined
    p.onKeyDown = onKeyDown.orUndefined
    p.onKeyUp = onKeyUp.orUndefined
    p.placeholder = placeholder.orUndefined
    p.readOnly = readOnly.orUndefined
    p.rows = rows.orUndefined
    p.rowsMax = rowsMax.orUndefined
    p.startAdornment = startAdornment.orUndefined
    p.`type` = `type`.orUndefined
    p.value = value.orUndefined
    p
  }

  val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

  def apply(autoComplete: Option[String] = None,
            autoFocus: Option[Boolean] = None,
            classes: js.Object = js.Object(),
            className: Option[String] = None,
            defaultValue: Option[String | Int] = None,
            disabled: Option[Boolean] = None,
            disableUnderline: Option[Boolean] = Some(false),
            endAdornment: Option[VdomNode] = None,
            error: Option[Boolean] = None,
            fullWidth: Option[Boolean] = Some(false),
            id: Option[String] = None,
            inputComponent: Option[String | js.Function] = None,
            inputProps: js.Object = js.Object(),
            inputRef: Option[js.Function] = None,
            margin: Option[Array[String]] = None,
            multiline: Option[Boolean] = Some(false),
            name: Option[String] = None,
            onBlur: Option[js.Function] = None,
            onChange: Option[js.Function] = None,
            onEmpty: Option[js.Function] = None,
            onFilled: Option[js.Function] = None,
            onFocus: Option[js.Function] = None,
            onKeyDown: Option[js.Function] = None,
            onKeyUp: Option[js.Function] = None,
            placeholder: Option[String] = None,
            readOnly: Option[Boolean] = None,
            rows: Option[String | Int] = None,
            rowsMax: Option[String | Int] = None,
            startAdornment: Option[VdomNode] = None,
            `type`: Option[String] = Some("text"),
            value: Option[String | Int | js.Array[String] | js.Array[Int]] = None)(children: VdomNode*) = {
    impl(props(
      autoComplete,
      autoFocus,
      classes,
      className,
      defaultValue,
      disabled,
      disableUnderline,
      endAdornment,
      error,
      fullWidth,
      id,
      inputComponent,
      inputProps,
      inputRef,
      margin,
      multiline,
      name,
      onBlur,
      onChange,
      onEmpty,
      onFilled,
      onFocus,
      onKeyDown,
      onKeyUp,
      placeholder,
      readOnly,
      rows,
      rowsMax,
      startAdornment,
      `type`,
      value
    ))(children: _*)
  }
}
*/

/** Humongous example bridge **/
/*
object MuiInput extends ReactBridgeComponent {


    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/Input", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    @js.native
    trait Props extends js.Object {
        var autoComplete: js.UndefOr[String] = js.native
        var autoFocus: js.UndefOr[Boolean] = js.native
        var classes: js.Object = js.native
        var className: js.UndefOr[String] = js.native
        var defaultValue: js.UndefOr[String | Int] = js.native
        var disabled: js.UndefOr[Boolean] = js.native
        var disableUnderline: js.UndefOr[Boolean] = js.native
        var endAdornment: js.UndefOr[VdomNode] = js.native
        var error: js.UndefOr[Boolean] = js.native
        var fullWidth: js.UndefOr[Boolean] = js.native
        var id: js.UndefOr[String] = js.native
        var inputComponent: js.UndefOr[String | js.Function] = js.native
        var inputProps: js.Object = js.native
        var inputRef: js.UndefOr[js.Function] = js.native
        var margin: js.UndefOr[Array[String]] = js.native
        var multiline: js.UndefOr[Boolean] = js.native
        var name: js.UndefOr[String] = js.native
        var onBlur: js.UndefOr[js.Function] = js.native
        var onChange: js.UndefOr[js.Function] = js.native
        var onEmpty: js.UndefOr[js.Function] = js.native
        var onFilled: js.UndefOr[js.Function] = js.native
        var onFocus: js.UndefOr[js.Function] = js.native
        var onKeyDown: js.UndefOr[js.Function] = js.native
        var onKeyUp: js.UndefOr[js.Function] = js.native
        var placeholder: js.UndefOr[String] = js.native
        var readOnly: js.UndefOr[Boolean] = js.native
        var rows: js.UndefOr[String | Int] = js.native
        var rowsMax: js.UndefOr[String | Int] = js.native
        var startAdornment: js.UndefOr[VdomNode] = js.native
        var `type`: js.UndefOr[String] = js.native
        var value: js.UndefOr[String | Int | js.Array[String] | js.Array[Int]] = js.native
    }

    def props(autoComplete: Option[String] = None,
              autoFocus: Option[Boolean] = None,
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              defaultValue: Option[String | Int] = None,
              disabled: Option[Boolean] = None,
              disableUnderline: Option[Boolean] = Some(false),
              endAdornment: Option[VdomNode] = None,
              error: Option[Boolean] = None,
              fullWidth: Option[Boolean] = Some(false),
              id: Option[String] = None,
              inputComponent: Option[String | js.Function] = None,
              inputProps: js.Object = js.Object(),
              inputRef: Option[js.Function] = None,
              margin: Option[Array[String]] = None,
              multiline: Option[Boolean] = Some(false),
              name: Option[String] = None,
              onBlur: Option[js.Function] = None,
              onChange: Option[js.Function] = None,
              onEmpty: Option[js.Function] = None,
              onFilled: Option[js.Function] = None,
              onFocus: Option[js.Function] = None,
              onKeyDown: Option[js.Function] = None,
              onKeyUp: Option[js.Function] = None,
              placeholder: Option[String] = None,
              readOnly: Option[Boolean] = None,
              rows: Option[String | Int] = None,
              rowsMax: Option[String | Int] = None,
              startAdornment: Option[VdomNode] = None,
              `type`: Option[String] = Some("text"),
              value: Option[String | Int | js.Array[String] | js.Array[Int]] = None) : Props = {
        val p = (new js.Object).asInstanceOf[Props]
        p.autoComplete = autoComplete.orUndefined
        p.autoFocus = autoFocus.orUndefined
        p.classes = classes
        p.className = className.orUndefined
        p.defaultValue = defaultValue.orUndefined
        p.disabled = disabled.orUndefined
        p.disableUnderline = disableUnderline.orUndefined
        p.endAdornment = endAdornment.orUndefined
        p.error = error.orUndefined
        p.fullWidth = fullWidth.orUndefined
        p.id = id.orUndefined
        p.inputComponent = inputComponent.orUndefined
        p.inputProps = inputProps
        p.inputRef = inputRef.orUndefined
        p.margin = margin.orUndefined
        p.multiline = multiline.orUndefined
        p.name = name.orUndefined
        p.onBlur = onBlur.orUndefined
        p.onChange = onChange.orUndefined
        p.onEmpty = onEmpty.orUndefined
        p.onFilled = onFilled.orUndefined
        p.onFocus = onFocus.orUndefined
        p.onKeyDown = onKeyDown.orUndefined
        p.onKeyUp = onKeyUp.orUndefined
        p.placeholder = placeholder.orUndefined
        p.readOnly = readOnly.orUndefined
        p.rows = rows.orUndefined
        p.rowsMax = rowsMax.orUndefined
        p.startAdornment = startAdornment.orUndefined
        p.`type` = `type`.orUndefined
        p.value = value.orUndefined
        p
    }

    def apply(autoComplete: Option[String] = None,
              autoFocus: Option[Boolean] = None,
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              defaultValue: Option[String | Int] = None,
              disabled: Option[Boolean] = None,
              disableUnderline: Option[Boolean] = Some(false),
              endAdornment: Option[VdomNode] = None,
              error: Option[Boolean] = None,
              fullWidth: Option[Boolean] = Some(false),
              id: Option[String] = None,
              inputComponent: Option[String | js.Function] = None,
              inputProps: js.Object = js.Object(),
              inputRef: Option[js.Function] = None,
              margin: Option[Array[String]] = None,
              multiline: Option[Boolean] = Some(false),
              name: Option[String] = None,
              onBlur: Option[js.Function] = None,
              onChange: Option[js.Function] = None,
              onEmpty: Option[js.Function] = None,
              onFilled: Option[js.Function] = None,
              onFocus: Option[js.Function] = None,
              onKeyDown: Option[js.Function] = None,
              onKeyUp: Option[js.Function] = None,
              placeholder: Option[String] = None,
              readOnly: Option[Boolean] = None,
              rows: Option[String | Int] = None,
              rowsMax: Option[String | Int] = None,
              startAdornment: Option[VdomNode] = None,
              `type`: Option[String] = Some("text"),
              value: Option[String | Int | js.Array[String] | js.Array[Int]] = None)(attrAndChildren: TagMod*) = {
        def mergeJSObjects(objs: js.Dynamic*): js.Dynamic = {
            val result = js.Dictionary.empty[Any]
            for (source <- objs) {
                for ((key, value) <- source.asInstanceOf[js.Dictionary[Any]])
                    result(key) = value
            }
            result.asInstanceOf[js.Dynamic]
        }

        def extractPropsAndChildren(attrAndChildren: Seq[TagMod]): (js.Object, List[VdomNode]) = {
            import japgolly.scalajs.react.vdom.Implicits._

            val b = new japgolly.scalajs.react.vdom.Builder.ToJs {}
            attrAndChildren.toTagMod.applyTo(b)
            b.addClassNameToProps()
            b.addStyleToProps()

            (b.props, b.childrenAsVdomNodes)
        }

        val (props1, children) = extractPropsAndChildren(attrAndChildren)

        val mergedProps = mergeJSObjects(
            props1.asInstanceOf[js.Dynamic],
            props(
                autoComplete,
                autoFocus,
                classes,
            className,
            defaultValue,
            disabled,
            disableUnderline,
            endAdornment,
            error,
            fullWidth,
            id,
            inputComponent,
            inputProps,
            inputRef,
            margin,
            multiline,
            name,
            onBlur,
            onChange,
            onEmpty,
            onFilled,
            onFocus,
            onKeyDown,
            onKeyUp,
            placeholder,
            readOnly,
            rows,
            rowsMax,
            startAdornment,
            `type`,
            value
        ).asInstanceOf[js.Dynamic])

        new WithPropsAndTagsMods(jsComponent, mergedProps.asInstanceOf[js.Object], children)
    }
}
*/
