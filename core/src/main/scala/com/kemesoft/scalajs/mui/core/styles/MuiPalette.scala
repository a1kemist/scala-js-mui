package com.kemesoft.scalajs.mui.core.styles

import com.keme.scalajs.mui.core.colors
import com.keme.scalajs.mui.core.colors.MuiColor
import com.kemesoft.scalajs.mui.core.colors.MuiColor

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.annotation.JSImport

@js.native
trait MuiPalette extends js.Object {
    def common: colors.common.type = js.native
    def `type`: String = js.native
    def primary: js.Object = js.native
    def secondary: js.Object = js.native
    def error: js.Object = js.native
    def grey: MuiColor = js.native
    def constrastThreshold: Int = js.native
    def getContrastText: String = js.native
    def augmentColor(): Unit = js.native
    def tonalOffset: Double = js.native
    def text: MuiPaletteText = js.native
    def divider: String = js.native
    def background: MuiPaletteBackground = js.native
    def light: js.Object = js.native
    def dark: js.Object = js.native
    def action: MuiPaletteAction = js.native
}

@js.native
trait MuiPaletteText extends js.Object {
    def primary: String = js.native
    def secondary: String = js.native
    def disabled: String = js.native
    def hint: String = js.native
    def icon: String = js.native
}

@js.native
trait MuiPaletteBackground extends js.Object {
    def paper: String = js.native
    def default: String = js.native
}

@js.native
trait MuiPaletteAction extends js.Object {
    def active: String = js.native
    def hover: String = js.native
    def hoverOpacity: Double = js.native
    def selected: String = js.native
    def disabled: String = js.native
    def disabledBackground: String = js.native
}

@js.native
trait MuiColorPalette extends MuiColor {
    def light: String = js.native
    def main: String = js.native
    def dark: String = js.native
    def contrastText: String = js.native
}

object MuiPaletteType extends Enumeration {
    type Flavor = Value
    val light, dark = Value
}

@JSImport("@material-ui/core/styles/createPalette", "light")
@js.native
object Light extends js.Object

@JSImport("@material-ui/core/styles/createPalette", "dark")
@js.native
object Dark extends js.Object

object MuiPalette {
    def apply(primary: MuiColor = colors.indigo,
              secondary: MuiColor = colors.pink,
              error: MuiColor = colors.red,
              grey: MuiColor = colors.grey,
              paletteType: MuiPaletteType.Flavor = MuiPaletteType.light,
              contrastThreshold: Int = 3,
              tonalOffset: Double = 0.2)(otherInput: js.Any*): MuiPalette = {
        val o: Map[String, Any] = Map[String, Any](
            Seq(
                "primary" -> primary,
                "secondary" -> secondary,
                "error" -> error,
                "grey" -> grey,
                "type" -> paletteType.toString,
                "contrastThreshold" -> contrastThreshold,
                "tonalOffset" -> 0.2
            ) ++ otherInput.map(input => input.toString -> input): _*
        )
        createPalette(o.toJSDictionary.asInstanceOf[js.Object]).asInstanceOf[MuiPalette]
    }
}