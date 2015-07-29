package com.nature.hub.gotest.main

import org.hamcrest.CoreMatchers.is
import org.hamcrest.MatcherAssert.assertThat
import org.scalatest.FunSuite

class SomeIntegrationTest extends FunSuite{
  test("test main1 and main2") {
   val one = new One()
    val two = new Two()
    val actual = s"${one.useTheCommon("hey")} - ${two.useTheCommon("yo","you")}"
    assertThat(actual, is("this is a common [hey] - this is a common [yo,you]"))
  }
}
