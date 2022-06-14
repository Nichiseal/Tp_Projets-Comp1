#nested loops = a loop inside another loop (the inner loop will finish before the outer loop)

rows = int(input("How many rows do you want : "))
columns = int(input("How many columns do you want : "))
symbol = input("enter a symbol to use : ")

for i in range(rows):
    for j in range(columns):
        print(symbol,end=" ")
    print()