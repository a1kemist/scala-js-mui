package com.kemesoft.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiTheme extends js.Object {
    def breakpoints: js.Object = js.native
    def direction: String = js.native
    def mixins: js.Object = js.native
    // Inject custom styles
    def overrides: js.Object = js.native
    def palette: MuiPalette = js.native
    // Inject custom properties
    def props: js.Object = js.native
    def shadows: js.Array[String] = js.native
    def typography: js.Object = js.native
    def transitions: js.Object = js.native
    def spacing: MuiSpacing = js.native
    def zIndex: js.Object = js.native
}

object MuiTheme {
    def shallowMerge(obj1: js.Dictionary[js.Any], obj2: js.Dictionary[js.Any]): js.Dictionary[js.Any] = {
        obj2.toMap.foldLeft(obj1){
            case (agg: js.Dictionary[js.Any], (key: String, value: Any)) => {
                agg.update(key, value )
                agg
            }
        }
    }

    def shallowMerge(obj1: Map[String, Any], obj2: Map[String, Any]): Map[String, Any] = {
        obj2.foldLeft(obj1){
            case (agg: Map[String, Any], (key: String, value: Any)) => {
                agg + (key -> value)
            }
        }
    }

    def deepMerge(obj1: js.Dictionary[js.Any], obj2: js.Dictionary[js.Any]): js.Dictionary[js.Any] = {
        obj2.toMap.foldLeft(obj1){
            case (agg: js.Dictionary[js.Any], (key: String, value: Any)) => {
                value match {
                    case recurse: Map[String, js.Any] => {
                        agg.update(key, deepMerge(agg.get(key).asInstanceOf[js.Dictionary[js.Any]], recurse.toJSDictionary))
                        agg
                    }
                    case _ => {
                        agg.update(key, value )
                        agg
                    }
                }
            }
        }
    }

    def apply(paletteInput: js.Object = js.Object(),
              breakpointsInput: js.Object = js.Object(),
              mixinsInput: js.Object = js.Object(),
              typographyInput: js.Object = js.Object(),
              shadowsInput: js.UndefOr[js.Array[String]] = js.undefined)(otherInput: js.Any*): MuiTheme = {
        val breakpoints = createBreakpoints(breakpointsInput)
        val palette = createPalette(paletteInput).asInstanceOf[MuiPalette]

        val o: Map[String, js.Any] = Map(
            "breakpoints" -> breakpoints,
            "direction" -> "ltr",
            "mixins" -> createMixins(breakpoints, spacing, mixinsInput),
            "overrides" -> js.Object(),
            "palette" -> palette,
            "props" -> js.Object(),
            "shadows" -> shadowsInput.getOrElse(shadows),
            "typography" -> createTypography(palette, typographyInput)
        )

        val otherObj = js.Dictionary[js.Any](otherInput.map(input => input.toString -> input): _*)

        val mergeObj: js.Dictionary[js.Any] = js.Dictionary[js.Any](
            "transitions" -> transitions,
            "spacing" -> spacing,
            "zIndex" -> zIndex
        )

        // now deepmerge other and mergeObj
        val deepMerged: js.Dictionary[js.Any] = deepMerge(mergeObj, otherObj)

        val finalMerged: MuiTheme = shallowMerge(o.toJSDictionary, deepMerged).asInstanceOf[MuiTheme]
        finalMerged
    }
}
