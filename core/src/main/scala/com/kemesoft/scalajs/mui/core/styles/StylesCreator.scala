package com.kemesoft.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait StylesCreator extends js.Object {
    def create: js.Function2[Theme, String, StyleRules] = js.native
    def options: StylesCreatorOptions = js.native
    def themingEnabled: Boolean = js.native
}

object StylesCreator {
    def apply(create: (Theme, String) => StyleRules,
              options: StylesCreatorOptions,
              themingEnabled: Boolean): StylesCreator = {
        val o: Map[String, Any] = Map(
            "create" -> create,
            "options" -> options,
            "themingEnabled" -> themingEnabled
        )
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[StylesCreator]
    }
}

@js.native
trait StylesCreatorOptions extends js.Object {
    def index: Int = js.native
}

object StylesCreatorOptions {
    def apply(index: Int) = {
        val o: Map[String, Any] = Map("index" -> index)
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[StylesCreatorOptions]
    }
}