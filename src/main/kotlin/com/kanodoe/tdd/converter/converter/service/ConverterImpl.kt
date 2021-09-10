package com.kanodoe.tdd.converter.converter.service

class ConverterImpl : Converter {

  private var oneToFifteenMap: HashMap<Long, String> = HashMap()

  init {
    initLowNumbersMap()
  }

  private fun initLowNumbersMap() {
    oneToFifteenMap[1L] = "uno"
    oneToFifteenMap[2L] = "dos"
    oneToFifteenMap[3L] = "tres"
    oneToFifteenMap[4L] = "cuatro"
    oneToFifteenMap[5L] = "cinco"
    oneToFifteenMap[6L] = "seis"
    oneToFifteenMap[7L] = "siete"
    oneToFifteenMap[8L] = "ocho"
    oneToFifteenMap[9L] = "nueve"
    oneToFifteenMap[10L] = "diez"
    oneToFifteenMap[11L] = "once"
    oneToFifteenMap[12L] = "doce"
    oneToFifteenMap[13L] = "trece"
    oneToFifteenMap[14L] = "catorce"
    oneToFifteenMap[15L] = "quince"
  }

  override fun convertFromNumber(number: Long): String? {
    return if (number < 16L) {
      convertIrregularNumberWords(number)
    } else {
      "vacio"
    }
  }

  private fun convertIrregularNumberWords(number: Long): String? {

    return oneToFifteenMap[number]
  }

  override fun convertFromText(number: String): Long {
    TODO("Not yet implemented")
  }
}
