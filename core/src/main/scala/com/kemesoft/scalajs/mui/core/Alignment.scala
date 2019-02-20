package com.kemesoft.scalajs.mui.core

import enumeratum.{Enum, EnumEntry}

sealed abstract class Alignment(override val entryName: String) extends EnumEntry
object Alignment extends Enum[Alignment] {
    val values = findValues

    case object Inherit extends Alignment("inherit")
    case object Left extends Alignment("left")
    case object Center extends Alignment("center")
    case object Right extends Alignment("right")
    case object Justify extends Alignment("justify")
}