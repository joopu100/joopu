str_txt="vehicle 0 0 50 50 vehicle 50 50 250 250"

vehicle_set=[]
word= ''
for letter in str_txt:
    # print(letter)
    if letter == ' ':
        vehicle_set.append(word)
        # print(vehicle_set)
        word=''
    else:
        word = word + letter
        # print(vehicle_set)

# if word !='':
#     vehicle_set.append(word)

print(vehicle_set)
