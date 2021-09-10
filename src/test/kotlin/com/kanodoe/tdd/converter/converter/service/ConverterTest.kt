package com.kanodoe.tdd.converter.converter.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ConverterTest {

  private val converter: ConverterImpl = ConverterImpl()

  @Test
  fun convertNumberToTextBasicTrue() {
    val randomNumber: Long = (1..100).random().toLong()

    converter.convertFromNumber(randomNumber)?.let { assertTrue(it.isNotEmpty() ) }
  }

  @Test
  fun convertNumberToTextUno() {
    val numero = 1L

    assertEquals(converter.convertFromNumber(numero), "uno")
  }

  @Test
  fun convertNumberToTextDos() {
    val numero = 2L

    assertEquals(converter.convertFromNumber(numero), "dos")
  }

  @Test
  fun convertNumberToTextTres() {
    val numero = 3L

    assertEquals(converter.convertFromNumber(numero), "tres")
  }

  @Test
  fun convertNumberToTextCuatro() {
    val numero = 4L

    assertEquals(converter.convertFromNumber(numero), "cuatro")
  }

  @Test
  fun convertNumberToTextCinco() {
    val numero = 5L

    assertEquals(converter.convertFromNumber(numero), "cinco")
  }

  @Test
  fun convertNumberToTextSeis() {
    val numero = 6L

    assertEquals(converter.convertFromNumber(numero), "seis")
  }

  @Test
  fun convertNumberToTextSiete() {
    val numero = 7L

    assertEquals(converter.convertFromNumber(numero), "siete")
  }

  @Test
  fun convertNumberToTextOcho() {
    val numero = 8L

    assertEquals(converter.convertFromNumber(numero), "ocho")
  }

  @Test
  fun convertNumberToTextNueve() {
    val numero = 9L

    assertEquals(converter.convertFromNumber(numero), "nueve")
  }

  @Test
  fun convertNumberToTextDiez() {
    val numero = 10L

    assertEquals(converter.convertFromNumber(numero), "diez")
  }

  @Test
  fun convertNumberToTextOnce() {
    val numero = 11L

    assertEquals(converter.convertFromNumber(numero), "once")
  }

  @Test
  fun convertNumberToTextDoce() {
    val numero = 12L

    assertEquals(converter.convertFromNumber(numero), "doce")
  }

  @Test
  fun convertNumberToTextTrece() {
    val numero = 13L

    assertEquals(converter.convertFromNumber(numero), "trece")
  }

  @Test
  fun convertNumberToTextCatorce() {
    val numero = 14L

    assertEquals(converter.convertFromNumber(numero), "catorce")
  }

  @Test
  fun convertNumberToTextQuince() {
    val numero = 15L

    assertEquals(converter.convertFromNumber(numero), "quince")
  }
}
