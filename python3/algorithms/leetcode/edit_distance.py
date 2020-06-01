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
    assert minDistance1Darray(word1, word2) == expected


if __name__ == '__main__':
    assertminDistance(3, "horse", "ros")
    assertminDistance(5, "intention", "execution")
    assertminDistance(10, "zoologicoarchaeologist", "zoogeologist")
