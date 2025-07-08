def sort_risks(arr):
    low = 0
    mid = 0
    high = len(arr)-1


    while mid<=high:
        if arr[mid]==0:
            arr[low],arr[mid] = arr[mid],arr[low]
            low+=1
            mid+=1
        elif arr[mid] == 1 :
            mid+=1
        else:
            arr[mid],arr[high] == arr[high],arr[mid]
            high -=1
    return arr


arr1 = [1,0,2,0,1,0,2]
sorted_Arr1 =sort_risks(arr1)

print("Sorted risk levels : ",* sorted_Arr1)


arr2  = [2,1,0,2,1,0,0,1,2,0 ]
sorted_arr2 = sort_risks(arr2)
print("Sorted risk levels : ",*sorted_arr2)