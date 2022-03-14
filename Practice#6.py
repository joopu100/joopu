str_txt ="vehicle 0 0 50 50 vehicle 50 50 250 250"
vehicle_set = str_txt.split()
print(vehicle_set)

vehicle_count= vehicle_set.count("vehicle")
for i in range(vehicle_count):#2
    
        if int(vehicle_set[(i*5)+3])>=100:
            vehicle_set[(i*5)]="Truck"


# result="  ".join(vehicle_set)#문자열 빈칸 삽입
# print(result)

result=" ".join(vehicle_set)
print(result)
print(vehicle_set)










