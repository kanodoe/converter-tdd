package com.kanodoe.tdd.converter.converter.service

interface Converter {

  fun convertFromNumber(number: Long) : String?

  fun convertFromText(number: String): Long

}
