list1 = [1,2,4,84,6,23,1,67]
for i in range(len(list1)):
	for j in range(len(list1) - 1):
		if list1[j] > list1[j+1]:
			list1[j+1], list1[j] = list1[j], list1[j+1]

print (list1)
