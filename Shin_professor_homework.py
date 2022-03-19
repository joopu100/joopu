
#1번 문제
my_introduce=[32,172.5,"이근혁",["대","구","광","역","시"]]
print(f'나의 이름은 {my_introduce[-2]}입니다. 그리고 나이는 {my_introduce[0]}살입니다. 참고로 키는 {my_introduce[1]} 마지막으로 고향은 {my_introduce[3][0:]}입니다.')

#2번 문제-문자열 변수에서 특정 인덱싱으로 접근 후 문자열을 변경할 수 있는가?
# 제 생각에는 문자열 변수 안에 내용을 split()으로 나눠준 다음 인덱싱으로 변경하면 될 것 같습니다!
string_1="Life is shorts We need Python!"
string_c=string_1.split()
print(string_c)#['Life', 'is', 'shorts', 'We', 'need', 'Python!']
string_c[2]='long'
print(string_c)#['Life', 'is', 'long', 'We', 'need', 'Python!']
string_d=" ".join(string_c)
print(string_d)#Life is long We need Python!
