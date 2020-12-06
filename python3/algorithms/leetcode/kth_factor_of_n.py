def kthFactor(self, n: int, k: int) -> int:
    """
    https://leetcode.com/problems/the-kth-factor-of-n/
    Time complexity: O(n)
    Space complexity: O(1)
    """
    count = 0
    for i in range(1, n + 1):
        if n % i == 0:
            count = count + 1
        if count == k:
            return i
    return -1


def assert_methods(expected_result: int, n: int, k: int) -> None:
    assert kthFactor(n, k) == expected_result


if __name__ == "__main__":
    assert_methods(3, 12, 3)
    assert_methods(7, 7, 2)
    assert_methods(-1, 4, 4)
    assert_methods(1, 1, 1)
    assert_methods(4, 1000, 3)
