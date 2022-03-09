#아이디랑 비밀번호 입력 받는 프로그램

input_id=input("id: ")
id='joopu'
input_password=input("password: ")
password='1234'

if input_id==id:
    if input_password==password:
        print("Welcome")
    else:
        print("wrong password")
else:
    print("wrong id")
