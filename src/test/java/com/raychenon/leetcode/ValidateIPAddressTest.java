package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 17/6/2020
 * https://leetcode.com/problems/validate-ip-address/
 */
public class ValidateIPAddressTest {


    private static ValidateIPAddress instance;

    @BeforeClass
    public static void setUp() {
        instance = new ValidateIPAddress();
    }



    @Test
    public void IPV4addressTest() {
        assertMethods("IPv4", "172.16.254.1");
    }

    @Test
    public void IPaddressV6Test() {
        assertMethods("IPv6", "2001:0db8:85a3:0:0:8A2E:0370:7334");
    }

    @Test
    public void ipaddressNeitherTest() {
        assertMethods("Neither", "02001:0db8:85a3:0000:0000:8a2e:0370:7334");
    }

    @Test
    public void ipaddressNeither2Test() {
        assertMethods("Neither","2001:0db8:85a3:0:0:8A2E:0370:7334:");
    }

    @Test
    public void ipaddresV6Test() {
        assertMethods("IPv6","2001:0db8:85a3:0000:0:8A2E:0370:733a");
    }


    private void assertMethods(String expected, String IP) {
        assertEquals(expected, instance.validIPAddressOriginal(IP));
    }

}
