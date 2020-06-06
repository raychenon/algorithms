#!/bin/python3
from typing import List


def reconstructQueue(people: List[List[int]]) -> List[List[int]]:
    """
    https://leetcode.com/problems/queue-reconstruction-by-height

    solution: https://leetcode.com/problems/queue-reconstruction-by-height/discuss/89345/Easy-concept-with-PythonC%2B%2BJava-Solution
    :param people:
    :return:
    """
    if not people: return []

    people_dict, height, res = dict(), [], []
    for i in range(len(people)):
        p = people[i]
        if p[0] in people_dict:
            people_dict[p[0]].append((p[1], i))
        else:
            people_dict[p[0]] = [(p[1], i)]
            height.append(p[0])

    height.sort()

    # sort decreasing order
    for h in height[::-1]:
        people_dict[h].sort()
        for p in people_dict[h]:
            res.insert(p[0], people[p[1]])

    return res


if __name__ == "__main__":
    assert reconstructQueue([[7, 0], [4, 4], [7, 1], [5, 0], [6, 1], [5, 2]]) == [[5, 0], [7, 0], [5, 2], [6, 1],
                                                                                  [4, 4], [7, 1]]
