""""
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

https://leetcode.com/problems/subarray-sums-divisible-by-k
"""


def subarraysDivByK(self, nums: List[int], k: int) -> int:
    n = len(nums)
    map = dict()
    map[0] = 1
    count = 0
    sum = 0

    for i in range(n):
        sum = (sum + nums[i]) % k
        if sum < k:
            sum += k
        count += map.get(sum, 0)
        map[sum] = map.get(sum, 0) + 1

    return count


if __name__ == "__main__":
    assert subarraysDivByK([4, 5, 0, -2, -3, 1], 5) == 7
    assert subarraysDivByK([5], 9) == 0
    assert subarraysDivByK([3, 4, 5, 1, 2], 5) == 3
