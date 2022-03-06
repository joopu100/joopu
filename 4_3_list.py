students=["egoing","sori","maru"]
grades=[2,1,4]
num1=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22]

print(students[1])
print("len(students)",len(students))#3개의 원소로 되어있음.
print("min(grades)",min(grades))
print(min(grades))
print("max(grades)",max(grades))

#리스트는 통계에서 가장 많이 사용된다. 
#statistics(통계),mean(평균)

import statistics
print(statistics.mean(grades))#grades의 평균을 구함.

import random
print(random.choice(students))
