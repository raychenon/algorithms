package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 22/6/2020
 * https://leetcode.com/problems/validate-ip-address/
 */
class ValidateIPAddressTest {


    @Test
    fun IPV4addressTest() {
        assertMethods("IPv4", "172.16.254.1")
    }

    @Test
    fun IPV4addressBeyondRangeTest() {
        assertMethods("Neither", "257.16.264.1")
    }

    @Test
    fun IPv4addressWithETest() {
        assertMethods("Neither", "1e1.4.5.6")
    }

    @Test
    fun IPaddressV6Test() {
        assertMethods("IPv6", "2001:0db8:85a3:0:0:8A2E:0370:7334")
    }

    @Test
    fun IPv6AddressNeither1Test() {
        assertMethods("Neither", "02001:0db8:85a3:0000:0000:8a2e:0370:7334")
    }

    @Test
    fun IPv6AddressNeither2Test() {
        assertMethods("Neither", "2001:0db8:85a3:0:0:8A2E:0370:7334:")
    }

    @Test
    fun IPAddressNeitherTest() {
        assertMethods("Neither", "whatever")
    }

    @Test
    fun IPv6AddressTest() {
        assertMethods("IPv6", "2001:0db8:85a3:0000:0:8A2E:0370:733a")
    }

    private fun assertMethods(expected: String, IP: String) {
        TestCase.assertEquals(expected, ValidateIPAddress.validIPAddressRegex(IP))
    }

}