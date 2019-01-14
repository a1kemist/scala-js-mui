package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/button/
  */
object MuiTextField extends ReactBridgeComponent {
    import JsWriterImplicits.vdomNodeWriter

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/TextField", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(
//               autoComplete: Option[String] = None,
              autoFocus: Option[Boolean] = None,
              className: Option[String] = None,
              defaultValue: Option[String | Int] = None,
              disabled: Option[Boolean] = Some(false),
              error: Option[Boolean] = None,
              FormHelperTextProps: js.Object = js.Object(),
              fullWidth: Option[Boolean] = None,
              helperText: Option[VdomNode] = None,
//            id: Option[String] = None,
              InputLabelProps: js.Object = js.Object(),
              InputProps: js.Object = js.Object(),
              inputProps: js.Object = js.Object(),
              inputRef: Option[js.Function] = None,
              label: Option[VdomNode] = None,
              margin: Option[String] = None,
              multiline: Option[Boolean] = None,
              name: Option[String] = None,
//            onBlur: Option[js.Function] = None,
//            onChange: Option[js.Function] = None,
//            onFocus: Option[js.Function] = None,
              placeholder: Option[String] = None,
//            required: Option[Boolean] = Some(false),
              rows: Option[String | Int] = None,
              rowsMax: Option[String | Int] = None,
              select: Option[Boolean] = Some(false),
              SelectProps: js.Object = js.Object(),
//            `type`: Option[String] = None,
//            value: Option[String | Int | js.Array[String | Int]] = None
           ): WithProps = auto
}

/** Legacy Facade */
/*
object MuiTextField {
    @JSImport("@material-ui/core/TextField", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    @js.native
    trait Props extends js.Object {
        /**
          * This property helps users to fill forms faster, especially on mobile devices.
          * The name can be confusing, as it's more like an autofill.
          * You can learn more about it here:
          * https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill
          */
        var autoComplete: js.UndefOr[String] = js.native
        /**
          * If `true`, the input will be focused during the first mount.
          */
        var autoFocus: js.UndefOr[Boolean] = js.native
        var className: js.UndefOr[String] = js.native
        /**
          * The default value of the `Input` element.
          */
        var defaultValue: js.UndefOr[String | Int] = js.native
        /**
          * If `true`, the input will be disabled.
          */
        var disabled: js.UndefOr[Boolean] = js.native
        /**
          * If `true`, the label will be displayed in an error state.
          */
        var error: js.UndefOr[Boolean] = js.native
        /**
          * Properties applied to the `FormHelperText` element.
          */
        var FormHelperTextProps: js.Object = js.native
        /**
          * If `true`, the input will take up the full width of its container.
          */
        var fullWidth: js.UndefOr[Boolean] = js.native
        /**
          * The helper text content.
          */
        var helperText: js.UndefOr[VdomNode] = js.native
        /**
          * The id of the `input` element.
          * Use that property to make `label` and `helperText` accessible for screen readers.
          */
        var id: js.UndefOr[String] = js.native
        /**
          * Properties applied to the `InputLabel` element.
          */
        var InputLabelProps: js.Object = js.native
        /**
          * Properties applied to the `Input` element.
          */
        var InputProps: js.Object = js.native
        /**
          * Properties applied to the native `input` element.
          */
        var inputProps: js.Object = js.native
        /**
          * Use that property to pass a ref callback to the native input component.
          */
        var inputRef: js.UndefOr[js.Function] = js.native
        /**
          * The label content.
          */
        var label: js.UndefOr[VdomNode] = js.native
        /**
          * If `dense` or `normal`, will adjust vertical spacing of this and contained components.
          * 'none' or 'dense' or 'normal'
          */
        var margin: js.UndefOr[String] = js.native
        /**
          * If `true`, a textarea element will be rendered instead of an input.
          */
        var multiline: js.UndefOr[Boolean] = js.native
        /**
          * Name attribute of the `input` element.
          */
        var name: js.UndefOr[String] = js.native
        var onBlur: js.UndefOr[js.Function] = js.native
        /**
          * Callback fired when the value is changed.
          *
          * parameter: {object} event The event source of the callback.
          * You can pull out the new value by accessing `event.target.value`.
          */
        var onChange: js.UndefOr[js.Function] = js.native
        var onFocus: js.UndefOr[js.Function] = js.native
        /**
          * The short hint displayed in the input before the user enters a value.
          */
        var placeholder: js.UndefOr[String] = js.native
        /**
          * If `true`, the label is displayed as required.
          */
        var required: js.UndefOr[Boolean] = js.native
        /**
          * Number of rows to display when multiline option is set to true.
          */
        var rows: js.UndefOr[String | Int] = js.native
        /**
          * Maximum number of rows to display when multiline option is set to true.
          */
        var rowsMax: js.UndefOr[String | Int] = js.native
        /**
          * Render a `Select` element while passing the `Input` element to `Select` as `input` parameter.
          * If this option is set you must pass the options of the select as children.
          */
        var select: js.UndefOr[Boolean] = js.native
        /**
          * Properties applied to the `Select` element.
          */
        var SelectProps: js.Object = js.native
        /**
          * Type attribute of the `Input` element. It should be a valid HTML5 input type.
          */
        var `type`: js.UndefOr[String] = js.native
        /**
          * The value of the `Input` element, required for a controlled component.
          */
        var value: js.UndefOr[String | Int | js.Array[String | Int]] = js.native
    }

    def props(autoComplete: Option[String] = None,
              autoFocus: Option[Boolean] = None,
              className: Option[String] = None,
              defaultValue: Option[String | Int] = None,
              disabled: Option[Boolean] = None,
              error: Option[Boolean] = None,
              FormHelperTextProps: js.Object,
              fullWidth: Option[Boolean] = None,
              helperText: Option[VdomNode] = None,
              id: Option[String] = None,
              InputLabelProps: js.Object,
              InputProps: js.Object,
              inputProps: js.Object,
              inputRef: Option[js.Function] = None,
              label: Option[VdomNode] = None,
              margin: Option[String] = None,
              multiline: Option[Boolean] = None,
              name: Option[String] = None,
              onBlur: Option[js.Function] = None,
              onChange: Option[js.Function] = None,
              onFocus: Option[js.Function] = None,
              placeholder: Option[String] = None,
              required: Option[Boolean] = Some(false),
              rows: Option[String | Int] = None,
              rowsMax: Option[String | Int] = None,
              select: Option[Boolean] = Some(false),
              SelectProps: js.Object,
              `type`: Option[String] = None,
              value: Option[String | Int | js.Array[String | Int]] = None): Props = {
        val p = (new js.Object).asInstanceOf[Props]
        p.autoComplete = autoComplete.orUndefined
        p.autoFocus = autoFocus.orUndefined
        p.className = className.orUndefined
        p.defaultValue = defaultValue.orUndefined
        p.disabled = disabled.orUndefined
        p.error = error.orUndefined
        p.FormHelperTextProps = FormHelperTextProps
        p.fullWidth = fullWidth.orUndefined
        p.helperText = helperText.orUndefined
        p.id = id.orUndefined
        p.InputLabelProps = InputLabelProps
        p.InputProps = InputProps
        p.inputProps = inputProps
        p.inputRef = inputRef.orUndefined
        p.label = label.orUndefined
        p.margin = margin.orUndefined
        p.multiline = multiline.orUndefined
        p.name = name.orUndefined
        p.onBlur = onBlur.orUndefined
        p.onChange = onChange.orUndefined
        p.onFocus = onFocus.orUndefined
        p.placeholder = placeholder.orUndefined
        p.required = required.orUndefined
        p.rows = rows.orUndefined
        p.rowsMax = rowsMax.orUndefined
        p.select = select.orUndefined
        p.SelectProps = SelectProps
        p.`type` = `type`.orUndefined
        p.value = value.orUndefined
        p
    }

    val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

    def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

    def apply(autoComplete: Option[String] = None,
              autoFocus: Option[Boolean] = None,
              className: Option[String] = None,
              defaultValue: Option[String | Int] = None,
              disabled: Option[Boolean] = None,
              error: Option[Boolean] = None,
              FormHelperTextProps: js.Object = js.Object(),
              fullWidth: Option[Boolean] = None,
              helperText: Option[VdomNode] = None,
              id: Option[String] = None,
              InputLabelProps: js.Object = js.Object(),
              InputProps: js.Object = js.Object(),
              inputProps: js.Object = js.Object(),
              inputRef: Option[js.Function] = None,
              label: Option[VdomNode] = None,
              margin: Option[String] = None,
              multiline: Option[Boolean] = None,
              name: Option[String] = None,
              onBlur: Option[js.Function] = None,
              onChange: Option[js.Function] = None,
              onFocus: Option[js.Function] = None,
              placeholder: Option[String] = None,
              required: Option[Boolean] = Some(false),
              rows: Option[String | Int] = None,
              rowsMax: Option[String | Int] = None,
              select: Option[Boolean] = Some(false),
              SelectProps: js.Object = js.Object(),
              `type`: Option[String] = None,
              value: Option[String | Int | js.Array[String | Int]] = None)(children: VdomNode*) = {
        impl(props(
            autoComplete,
            autoFocus,
            className,
            defaultValue,
            disabled,
            error,
            FormHelperTextProps,
            fullWidth,
            helperText,
            id,
            InputLabelProps,
            InputProps,
            inputProps,
            inputRef,
            label,
            margin,
            multiline,
            name,
            onBlur,
            onChange,
            onFocus,
            placeholder,
            required,
            rows,
            rowsMax,
            select,
            SelectProps,
            `type`,
            value
        ))(children: _*)
    }
}
*/
