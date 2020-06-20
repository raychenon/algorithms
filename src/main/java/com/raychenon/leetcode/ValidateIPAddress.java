package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 17/6/2020
 * https://leetcode.com/problems/validate-ip-address/
 */
public class ValidateIPAddress {


    private final String neither = "Neither";
    private final String IPv4 = "IPv4";
    private final String IPv6 = "IPv6";

    public String validIPAddress(String IP) {
        String[] ipv4 = IP.split("\\.", -1);
        String[] ipv6 = IP.split("\\:", -1);
        if (IP.chars().filter(ch -> ch == '.').count() == 3) {
            for (String s : ipv4)
                if (isIPv4(s)) continue;
                else return neither;
            return IPv4;
        }
        if (IP.chars().filter(ch -> ch == ':').count() == 7) {
            for (String s : ipv6)
                if (isIPv6(s)) continue;
                else return neither;
            return IPv6;
        }
        return neither;
    }

    private boolean isIPv4(String s) {
        try {
            return String.valueOf(Integer.valueOf(s)).equals(s) && Integer.parseInt(s) >= 0 && Integer.parseInt(s) <= 255;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isIPv6(String s) {
        if (s.length() > 4) return false;
        try {
            return Integer.parseInt(s, 16) >= 0 && s.charAt(0) != '-';
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public String validIPAddressOriginal(String IP) {

        if (IP.contains(".")) {
            return isIPV4(IP) ? IPv4 : neither;
        } else if (IP.contains(":")) {
            return isIPV6(IP) ? IPv6 : neither;
        } else {
            return neither;
        }
    }

    private boolean isIPV4(String IP) {
        if (IP.charAt(IP.length() - 1) == '.') return false;
        String[] ipv4Arr = IP.split("\\.");
        for (String ip4 : ipv4Arr) {
            int value = 0;
            try {
                value = Integer.parseInt(ip4);
            } catch (NumberFormatException e) {
                return false;
            }

            if (value > 255 || value < 0 || containsTrailingZero(ip4)) {
                return false;
            }
        }
        //return IPv4;
        return (ipv4Arr.length == 4);
    }

    private boolean isIPV6(String IP) {
        if (IP.charAt(IP.length() - 1) == ':') return false;

        String[] ipv6Arr = IP.split(":");
        for (String ip6 : ipv6Arr) {
            if (ip6.length() != 4 && !"0".equals(ip6)) {
                return false;
            }
            if ("0000".equals(ip6)) {
                return false;
            }
        }

        return (ipv6Arr.length == 8);
    }

    private boolean containsTrailingZero(String str) {
        int len = str.length();
//        if (len == 4) {
//            return str.charAt(0) == '0' && str.charAt(1) == '0';
//        } else
        if (len > 1) {
            return str.charAt(0) == '0';
        }
        return false;
    }

}