package com.kemesoft.scalajs.mui.core

import enumeratum.{Enum, EnumEntry}

sealed abstract class Margin(override val entryName: String) extends EnumEntry
object Margin extends Enum[Margin] {
    val values = findValues

    case object None extends Margin("none")
    case object Dense extends Margin("dense")
    case object Normal extends Margin("normal")
}
