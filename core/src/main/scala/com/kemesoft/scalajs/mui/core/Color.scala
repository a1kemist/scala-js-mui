package com.kemesoft.scalajs.mui.core

import enumeratum.{Enum, EnumEntry}

sealed abstract class Color(override val entryName: String) extends EnumEntry
object Color extends Enum[Color] {
    val values = findValues

    case object Inherit extends Color("inherit")
    case object Primary extends Color("primary")
    case object Secondary extends Color("secondary")
    case object Default extends Color("default")
}
