package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/paper/
  */
object MuiModal extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/Modal", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(BackdropComponent: Option[String | js.Function] = None,
              BackdropProps: Option[js.Object] = None,
              classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              container: Option[String | js.Function] = None,
              disableAutoFocus: Option[Boolean] = Some(false),
              disableBackdropClick: Option[Boolean] = Some(false),
              disableEnforceFocus: Option[Boolean] = Some(false),
              disableEscapeKeyDown: Option[Boolean] = Some(false),
              disablePortal: Option[Boolean] = Some(false),
              disableRestoreFocus: Option[Boolean] = Some(false),
              hideBackdrop: Option[Boolean] = Some(false),
              keepMounted: Option[Boolean] = Some(false),
              onBackDropClick: Option[js.Function] = None,
              onClose: Option[js.Function] = None,
              onEscapeKeyDown: Option[js.Function] = None,
              onRendered: Option[js.Function] = None,
              open: Option[Boolean] = Some(false)): WithProps = auto
}
