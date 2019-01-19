package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import enumeratum.{EnumEntry, Enum}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/grid/
  */
object MuiGrid extends ReactBridgeComponent {

    import JsWriterImplicits.enumeratumWriter
    import JsWriterImplicits.breakpointWriter

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Grid", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(alignContent: Option[GridContentAlignment] = Some(GridContentAlignment.Stretch),
              alignItems: Option[GridItemsAlignment] = Some(GridItemsAlignment.Stretch),
              classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = Some("div"),
              container: Option[Boolean] = Some(false),
              direction: Option[GridDirection] = Some(GridDirection.Row),
              item: Option[Boolean] = Some(false),
              justify: Option[GridJustification] = Some(GridJustification.FlexStart),
              xs: Option[String | Boolean | Int] = Some(false),
              sm: Option[String | Boolean | Int] = Some(false),
              md: Option[String | Boolean | Int] = Some(false),
              lg: Option[String | Boolean | Int] = Some(false),
              xl: Option[String | Boolean | Int] = Some(false),
              spacing: Option[Int] = Some(0),
              wrap: Option[GridWrap] = Some(GridWrap.Wrap),
              zeroMinWidth: Option[Boolean] = Some(false)): WithProps = auto
}

sealed abstract class GridItemsAlignment(override val entryName: String) extends EnumEntry

object GridItemsAlignment extends Enum[GridItemsAlignment] {
    val values = findValues

    case object FlexStart extends GridItemsAlignment("flex-start")
    case object Center extends GridItemsAlignment("center")
    case object FlexEnd extends GridItemsAlignment("flex-end")
    case object Stretch extends GridItemsAlignment("stretch")
    case object Baseline extends GridItemsAlignment("baseline")
}

sealed abstract class GridContentAlignment(override val entryName: String) extends EnumEntry

object GridContentAlignment extends Enum[GridContentAlignment] {
    val values = findValues

    case object Stretch extends GridContentAlignment("stretch")
    case object FlexStart extends GridContentAlignment("flex-start")
    case object Center extends GridContentAlignment("center")
    case object FlexEnd extends GridContentAlignment("flex-end")
    case object SpaceBetween extends GridContentAlignment("space-between")
    case object SpaceAround extends GridContentAlignment("space-around")
}

sealed abstract class GridDirection(override val entryName: String) extends EnumEntry

object GridDirection extends Enum[GridDirection] {
    val values = findValues

    case object Row extends GridDirection("row")
    case object RowReverse extends GridDirection("row-reverse")
    case object Column extends GridDirection("column-reverse")
    case object ColumnReverse extends GridDirection("column-reverse")
}

sealed abstract class GridJustification(override val entryName: String) extends EnumEntry

object GridJustification extends Enum[GridJustification] {
    val values = findValues

    case object FlexStart extends GridJustification("flex-start")
    case object Center extends GridJustification("center")
    case object FlexEnd extends GridJustification("flex-end")
    case object SpaceBetween extends GridJustification("space-between")
    case object SpaceAround extends GridJustification("space-around")
    case object SpaceEvenly extends GridJustification("space-evenly")
}

sealed abstract class GridWrap(override val entryName: String) extends EnumEntry

object GridWrap extends Enum[GridWrap] {
    val values = findValues

    case object NoWrap extends GridWrap("nowrap")
    case object Wrap extends GridWrap("wrap")
    case object WrapReverse extends GridWrap("wrap-reverse")
}
