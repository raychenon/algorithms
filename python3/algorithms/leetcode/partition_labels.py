#!/bin/python3
from typing import List


class PartitionLabels:
    """
    https://leetcode.com/problems/partition-labels/
    """

    def partitionLabels(self, S: str) -> List[int]:
        """
        Time complexity: O(n)
        Space complexity: O(1), dict_letter contains no more than all alphabet letters
        :param S:
        :return:
        """
        dict_letter = dict()
        for i in range(len(S)):
            c = S[i]
            if c in dict_letter:
                dict_letter[c].end = i
            else:
                dict_letter[c] = Letter(c, i, i)

        dist_list = []
        start = 0
        end = 0
        for k, v in dict_letter.items():
            # print("k = %s , v = %s" % (k, v))
            if v.start > end:
                distance = end - start + 1
                dist_list.append(distance)
                start = v.start
            end = max(end, v.end)

        distance = end - start + 1
        dist_list.append(distance)

        return dist_list

    def partitionLabelsGreedy(self, S: str) -> List[int]:
        """
        Time complexity: O(n)
        Space complexity: O(1)
        :param S:
        :return:
        """
        last = {c: i for i, c in enumerate(S)}
        # print(f"last = {last}")
        j = anchor = 0
        partition_list = []
        for i, c in enumerate(S):
            j = max(j, last[c])
            if i == j:
                partition_list.append(i - anchor + 1)
                anchor = i + 1
        return partition_list


class Letter:
    def __init__(self, letter: str, start: int, end: int):
        self.letter = letter
        self.start = start
        self.end = end

    def __repr__(self):
        return f"letter={self.letter},start={self.start},end={self.end}"


def assert_partition_labels(partition_labels: PartitionLabels, S: str, expected: List[int]):
    assert partition_labels.partitionLabels(S) == expected
    assert partition_labels.partitionLabelsGreedy(S) == expected


if __name__ == "__main__":
    instance = PartitionLabels()
    assert_partition_labels(instance, "ababcbacadefegdehijhklij", [9, 7, 8])
    assert_partition_labels(instance, "ababcbadefegdehijhklijopop", [7, 7, 8, 4])
    assert_partition_labels(instance, "abcdefghijkl", [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1])
