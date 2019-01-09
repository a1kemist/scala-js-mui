package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui.com/api/hidden/
  */
object MuiHidden extends ReactBridgeComponent {
    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Hidden", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(className: Option[String] = None,
              implementation: Option[String] = None,
              initialWidth: Option[String] = None,
              lgDown: Option[Boolean] = None,
              lgUp: Option[Boolean] = None,
              mdDown: Option[Boolean] = None,
              mdUp: Option[Boolean] = None,
              only: Option[Boolean] = None,
              smDown: Option[Boolean] = None,
              smUp: Option[Boolean] = None,
              xlDown: Option[Boolean] = None,
              xlUp: Option[Boolean] = None,
              xsDown: Option[Boolean] = None,
              xsUp: Option[Boolean] = None): WithProps = auto
}