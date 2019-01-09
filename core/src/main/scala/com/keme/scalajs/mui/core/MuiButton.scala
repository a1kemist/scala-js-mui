package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/button/
  */
object MuiButton extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Button", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    /**
      *
      * @param classes               Useful to extend the style applied to components.
      * @param className             Ignore
      * @param color                 The color of the component.
      *                              It supports those theme colors that make sense for this component.
      *                              'default' or 'inherit' or 'primary' or 'secondary'
      * @param component             The component used for the root node.
      *                              Either a string to use a DOM element or a component.
      *                              The default value is a `button`.
      * @param disabled              If `true`, the button will be disabled.
      * @param disableFocusRipple    If `true`, the  keyboard focus ripple will be disabled.
      *                              `disableRipple` must also be true.
      * @param disableRipple         If `true`, the ripple effect will be disabled.
      * @param focusVisibleClassName Ignore
      * @param fullWidth             If `true`, the button will take up the full width of its container.
      * @param href                  The URL to link to when the button is clicked.
      *                              If defined, an `a` element will be used as the root node.
      * @param mini                  If `true`, and `variant` is `'fab'`,
      *                              will use mini floating action button styling.
      * @param size                  The size of the button.
      *                              'small' or 'medium' or 'large'
      *                              'small' is equivalent to the dense button styling.
      * @param `type`                Ignore
      * @param variant               The base style of the button
      *                              'flat' or 'raised' or 'fab'
      * @return                      WithProps component
      */
    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
              color: Option[String] = Some("primary"),
              component: Option[String | js.Function] = None,
              disabled: Option[Boolean] = Some(false),
              disableFocusRipple: Option[Boolean] = Some(false),
              disableRipple: Option[Boolean] = None,
              focusVisibleClassName: Option[String] = None,
              fullWidth: Option[Boolean] = Some(false),
              href: Option[String] = None,
              mini: Option[Boolean] = Some(false),
              size: Option[String] = Some("medium"),
              `type`: Option[String] = Some("button"),
              variant: Option[String] = Some("flat")): WithProps = auto
}

/** Legacy Facade */
/*
object MuiButton {
    @JSImport("@material-ui/core/Button", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    @js.native
    trait Props extends js.Object {
        /**
          * Useful to extend the style applied to components.
          */
        var classes: js.Object = js.native
        /**
          * Ignore
          */
        var className: js.UndefOr[String] = js.native
        /**
          * The color of the component. It supports those theme colors that make sense for this component.
          * 'default' or 'inherit' or 'primary' or 'secondary'
          */
        var color: js.UndefOr[String] = js.native
        /**
          * The component used for the root node.
          * Either a string to use a DOM element or a component.
          * The default value is a `button`.
          */
        var component: js.UndefOr[String | js.Function] = js.native
        /**
          * If `true`, the button will be disabled.
          */
        var disabled: js.UndefOr[Boolean] = js.native
        /**
          * If `true`, the  keyboard focus ripple will be disabled.
          * `disableRipple` must also be true.
          */
        var disableFocusRipple: js.UndefOr[Boolean] = js.native
        /**
          * If `true`, the ripple effect will be disabled.
          */
        var disableRipple: js.UndefOr[Boolean] = js.native
        /**
          * Ignore
          */
        var focusVisibleClassName: js.UndefOr[String] = js.native
        /**
          * If `true`, the button will take up the full width of its container.
          */
        var fullWidth: js.UndefOr[Boolean] = js.native
        /**
          * The URL to link to when the button is clicked.
          * If defined, an `a` element will be used as the root node.
          */
        var href: js.UndefOr[String] = js.native
        /**
          * If `true`, and `variant` is `'fab'`, will use mini floating action button styling.
          */
        var mini: js.UndefOr[Boolean] = js.native
        /**
          * The size of the button.
          * 'small' or 'medium' or 'large'
          * 'small' is equivalent to the dense button styling.
          */
        var size: js.UndefOr[String] = js.native
        /**
          * Ignore
          */
        var `type`: js.UndefOr[String] = js.native
        /**
          * The base style of the button
          * 'flat' or 'raised' or 'fab'
          */
        var variant: js.UndefOr[String] = js.native
    }

    def props(classes: js.Object,
              className: Option[String] = None,
              color: Option[String] = Some("primary"),
              component: Option[String | js.Function] = None,
              disabled: Option[Boolean] = Some(false),
              disableFocusRipple: Option[Boolean] = Some(false),
              disableRipple: Option[Boolean] = None,
              focusVisibleClassName: Option[String] = None,
              fullWidth: Option[Boolean] = Some(false),
              href: Option[String] = None,
              mini: Option[Boolean] = Some(false),
              size: Option[String] = Some("medium"),
              `type`: Option[String] = Some("button"),
              variant: Option[String] = Some("flat")
             ) : Props = {
        val p = (new js.Object).asInstanceOf[Props]
        p.classes = classes
        p.className = className.orUndefined
        p.color =  color.orUndefined
        p.component = component.orUndefined
        p.disabled = disabled.orUndefined
        p.disableFocusRipple = disableFocusRipple.orUndefined
        p.disableRipple = disableRipple.orUndefined
        p.focusVisibleClassName = focusVisibleClassName.orUndefined
        p.fullWidth = fullWidth.orUndefined
        p.href = href.orUndefined
        p.mini = mini.orUndefined
        p.size = size.orUndefined
        p.`type` = `type`.orUndefined
        p.variant = variant.orUndefined
        p
    }

    val impl = JsComponent[Props, Children.Varargs, Null](RawComponent)

    def apply(props: Props)(children: VdomNode*) = impl(props)(children: _*)

    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
              color: Option[String] = Some("primary"),
              component: Option[String | js.Function] = None,
              disabled: Option[Boolean] = Some(false),
              disableFocusRipple: Option[Boolean] = Some(false),
              disableRipple: Option[Boolean] = None,
              focusVisibleClassName: Option[String] = None,
              fullWidth: Option[Boolean] = Some(false),
              href: Option[String] = None,
              mini: Option[Boolean] = Some(false),
              size: Option[String] = Some("medium"),
              `type`: Option[String] = Some("button"),
              variant: Option[String] = Some("flat"))(children: VdomNode*) = {
        impl(props(
            classes,
            className,
            color,
            component,
            disabled,
            disableFocusRipple,
            disableRipple,
            focusVisibleClassName,
            fullWidth,
            href,
            mini,
            size,
            `type`,
            variant
        ))(children: _*)
    }
}
*/
