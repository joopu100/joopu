import pandas as pd

#튜플 자료형을 판다스 시리즈로 변환
#index라는 예약어, 지정어를 통하요 index도 지정
tup_data = ('이근혁', '1991-09-27', '남', True)
sr= pd.Series(tup_data, index=['이름', '생년월일','성별','학생여부'])
# print(sr)

# #시리즈의 원소를 선택 (1개)
# print(sr[0], sr['생년월일'])
# #여러 개의 원소를 선택: [[,]]<==콤마로 구분
# #slicing을로 여러 개의 원소를 선택 가능함.
# print(sr[[0, 1]], sr[['생년월일', '성별']])
print(sr[0:2])#slicing을 사용할 때는 [] 한 개, 0:2 ==> 0ㅡ1(last index-1번째까지)
# print(sr['이름':'성별'])#last index-1 아니고, 이름~성별

