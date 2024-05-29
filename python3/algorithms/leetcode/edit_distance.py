def minDistance(word1: str, word2: str) -> int:
    """
    https://leetcode.com/problems/edit-distance
    Levenshtein distance intuitive explanation https://www.youtube.com/watch?v=MiqoA-yF-0M
    Time Complexity: O(len_word1 * len_word2)
    Space Complexity: O(len_word1 * len_word2)
    """
    n1 = len(word1)
    n2 = len(word2)
    dp = [[0] * (n2 + 1) for _ in range(n1 + 1)]

    for i in range(1, n1 + 1):
        dp[i][0] = i

    for i in range(1, n2 + 1):
        dp[0][i] = i

    for i1 in range(1, n1 + 1):
        for i2 in range(1, n2 + 1):
            if word1[i1 - 1] == word2[i2 - 1]:
                dp[i1][i2] = dp[i1 - 1][i2 - 1]
            else:
                dp[i1][i2] = 1 + min(dp[i1 - 1][i2 - 1], dp[i1][i2 - 1], dp[i1 - 1][i2])

    return dp[n1][n2]


def minDistance1Darray(word1: str, word2: str) -> int:
    """
    https://leetcode.com/problems/edit-distance
    Levenshtein distance
    Time Complexity: O(len_word1 * len_word2)
    Space Complexity: O(len_word2)

    :param word1:
    :param word2:
    :return:
    """
    n = len(word1)
    dp = [i for i in range(n + 1)]
    for i in range(1, len(word2) + 1):
        p, dp[0] = dp[0], i
        for j in range(1, n + 1):
            t = dp[j]
            dp[j] = p if word1[j - 1] == word2[i - 1] else min(p, dp[j], dp[j - 1]) + 1
            p = t
    return dp[n]


def assertminDistance(expected: int, word1: str, word2: str) -> None:
    assert minDistance(word1, word2) == expected
    assert minDistance1Darray(word1, word2) == expected


def test_min_distance():
    assertminDistance(3, "horse", "ros")
    assertminDistance(5, "intention", "execution")
    assertminDistance(10, "zoologicoarchaeologist", "zoogeologist")
    assertminDistance(1, "", "a")
