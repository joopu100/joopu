# 014 if가 True이면 elif와 else가 무시된다.
print(0)
if True:
    print(1)
elif True:
    print(2)
else:
    print(3)
print(4)

print('------')

# 024
print(0)
if False:
    print(1)
elif True:
    print(2)
else:
    print(3)
print(4)

print('------')

# 034
print(0)
if False:
    print(1)
elif False:
    print(2)
else:
    print(3)
print(4)

