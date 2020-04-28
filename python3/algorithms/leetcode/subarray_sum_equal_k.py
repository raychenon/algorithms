from typing import List


def subarraySum(nums: List[int], k: int) -> int:
    """
    https://leetcode.com/problems/subarray-sum-equals-k/

    Time complexity: O(n)
    Space complexity: O(n)

    [1, 2, 1, 3, 4, 5, 9]
           j     i

    sum[i] - sum[j] = k , where sum[i] is the cumulative sum from index 0 to index i.

    """
    sum = 0
    nb_subarray = 0
    map = dict()
    map[0] = 1
    for e in nums:
        sum += e
        if (sum - k) in map:
            nb_subarray += map.get(sum - k)
        map[sum] = map.get(sum, 0) + 1
    return nb_subarray


if __name__ == "__main__":
    assert subarraySum([1, 1, 1], 2) == 2
    assert subarraySum([1, -2, 3, 1, 2, -3, 1], -1) == 2
    assert subarraySum([1, 2, 1, 3, 4, 5, 9], 6) == 1
