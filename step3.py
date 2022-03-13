def get_vat(price, vat_rate=0.2):
    #print(price*vat_rate) 이거는 좋은 부품은 아니다. 하나에 한 개의 기능이 좋다.
    return price*vat_rate

print(get_vat(10000))#2000.0/ 함수도 값이 될 수 있다. 그렇게 되면 
                     #화면에 출력할 수도 있고, 메일로 보낼 수도 있고,
                     #  파일로도 저장할 수 있다.
#email.send('joopu100@naver.com',get_vat(20000,0.3))