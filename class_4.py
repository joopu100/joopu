#dictionary to DataFrame
import pandas as pd
dict_data={'c0':[1,2,3], 'c1':[4,5,6],'c2':[7,8,9]}

df=pd.DataFrame(dict_data)
print(df)

#리스트로 데이터를 만들고, index, columns라는 파라미터에 row, column이름 정해주기
df=pd.DataFrame([[23,'남', '대구'], [24, '여', '부산']], index=['이근혁', '최윤정'], columns=['나이', '성별', '지역'])
print(df)
print(df, df.index, df.columns)

# indes, column 이름 변경
df.index = ['학생1', '학생2']
df.columns = ['연령', '남녀', '주소지']
print(df)

df.rename(index={'이근혁':'학생'})#이렇게 해도 이근혁->학생으로 변경 가능