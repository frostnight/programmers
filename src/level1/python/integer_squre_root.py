import math


def solution(n):
    answer = math.sqrt(n)

    if answer.is_integer():
        answer = (answer+1) ** 2
    else:
        answer = -1

    return int(answer)


n = 121
print(solution(n))
