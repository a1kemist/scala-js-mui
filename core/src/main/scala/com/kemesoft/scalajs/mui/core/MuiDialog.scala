package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/dialog/
  */

object MuiDialog extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Dialog/Dialog", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(BackdropProps: Option[js.Object] = Some(js.Object()),
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              disableBackdropClick: Option[Boolean] = Some(false),
              disableEscapeKeyDown: Option[Boolean] = Some(false),
              disableRestoreFocus: Option[Boolean] = Some(false),
              fullScreen: Option[Boolean] = Some(false),
              fullWidth: Option[Boolean] = Some(false),
              maxWidth: Option[String | Boolean] = Some("sm"),
              onBackDropClick: Option[js.Function] = None,
              onClose: Option[js.Function] = None,
              onEnter: Option[js.Function] = None,
              onEntered: Option[js.Function] = None,
              onEntering: Option[js.Function] = None,
              onEscapeKeyDown: Option[js.Function] = None,
              onExit: Option[js.Function] = None,
              onExited: Option[js.Function] = None,
              onExiting: Option[js.Function] = None,
              open: Option[Boolean] = Some(true),
              PaperProps: Option[js.Object] = Some(js.Object()),
              TransitionComponent: Option[String | js.Function] = None,
              transitionDuration: Option[Int | js.Object] = None,
              TransitionProps: Option[js.Object] = None,
         ): WithProps = auto

}