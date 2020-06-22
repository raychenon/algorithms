def validIPAddress(IP):
    """
    https://leetcode.com/problems/validate-ip-address/

    Divide and Conquer
    Time complexity: O(N)
    Space complexity: O(1)
    """

    def isIPv4(s):
        try:
            return str(int(s)) == s and 0 <= int(s) <= 255
        except:
            return False

    def isIPv6(s):
        if len(s) > 4: return False
        try:
            return int(s, 16) >= 0 and s[0] != '-'
        except:
            return False

    if IP.count(".") == 3 and all(isIPv4(i) for i in IP.split(".")):
        return "IPv4"
    if IP.count(":") == 7 and all(isIPv6(i) for i in IP.split(":")):
        return "IPv6"
    return "Neither"


if __name__ == "__main__":
    assert validIPAddress("172.16.254.1") == "IPv4"
    assert validIPAddress("1e1.4.5.6") == "Neither"
    assert validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334") == "IPv6"
    assert validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334") == "Neither"
    assert validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:") == "Neither"
    assert validIPAddress("2001:0db8:85a3:0000:0:8A2E:0370:733a") == "IPv6"
