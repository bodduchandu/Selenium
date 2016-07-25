items = [1,2,4,84,6,23,1,67]
for i in range(1, len(items)):
                j = i
                while j > 0 and items[j] < items[j-1]:
                        items[j], items[j-1] = items[j-1], items[j]
                        j -= 1

print (items)
