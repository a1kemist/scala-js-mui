package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui.com/api/slide/
  */
object MuiGrow extends ReactBridgeComponent {
    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Grow", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(direction: Option[String] = Some("down"),
              in: Option[Boolean] = Some(false),
              onEnter: Option[js.Function] = None,
              onEntering: Option[js.Function] = None,
              onExit: Option[js.Function] = None,
              onExited: Option[js.Function] = None,
              timeout: Option[js.Object | Int] = None,
             ): WithProps = auto
}