import pandas as pd

list_data=['2022-03-22', 3.141592, 'ABC', 100, True]#list 안에는 어떠한 것도 들어감

sr=pd.Series(list_data)
# print(sr)

idx=sr.index #rangeIndex(start, end, step)
val=sr.values#인덱스를 별도로 뽑아 보고 싶다. 디테일 하게 알고 싶어서
print(idx, val)
