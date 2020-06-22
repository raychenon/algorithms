package com.raychenon.kotlin.leetcode

import java.util.regex.Pattern

/**
 * User: raychenon
 * Date: 22/6/2020
 * https://leetcode.com/problems/validate-ip-address/
 */
object ValidateIPAddress {

    /**
     * Time complexity: O(1), patterns to match have constant length
     * Space complexity: O(1)
     *
     * @param IP
     * @return
     */
    fun validIPAddressRegex(IP: String?): String? {
        val chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"
        val pattenIPv4 =
            Pattern.compile("^($chunkIPv4\\.){3}$chunkIPv4$")
        if (pattenIPv4.matcher(IP).matches()) return "IPv4"
        val chunkIPv6 = "([0-9a-fA-F]{1,4})"
        val pattenIPv6 =
            Pattern.compile("^($chunkIPv6\\:){7}$chunkIPv6$")
        return if (pattenIPv6.matcher(IP).matches()) {
            "IPv6"
        } else {
            "Neither"
        }
    }
}