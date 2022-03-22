#as: alias name 약자 (pandas.df)
#pd.Series..
#import pandas as panda로 써도 됨., import numpy as np
import pandas as pd

#Series에는 Dictionary type이 인자로 입력
#Dictionary type 정의
dict_data={'a':1, 'b':2, 'c':3}

sr=pd.Series(dict_data)
print(type(sr))
print(sr)

