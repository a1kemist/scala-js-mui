package com.kemesoft.scalajs.mui.core.styles

import scala.scalajs.js

@js.native
trait Mixins extends js.Object {
    def gutters: js.Function1[js.UndefOr[CSSProperties], CSSProperties] = js.native
    def toolbar: CSSProperties = js.native
}
