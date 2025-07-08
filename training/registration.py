date = int(input("Enter the date: "))
fine = 200
arrays = [1, 2, 3, 4, 5, 6]

extra_fine = 0  # global fine counter

def check(lastDigit):
    global extra_fine  # needed to modify the global variable
    if (lastDigit % 2 == 0 and date % 2 == 0) or (lastDigit % 2 != 0 and date % 2 != 0):
        extra_fine += 0  # No fine
    else:
        extra_fine += fine  # Mismatch in parity => fine

for i in range(len(arrays)):
    check(arrays[i])

print("Your fine is:", extra_fine)
