import heapq


def candy_box_merge(test_cases):
    for case in test_cases:
        min_heap = case
        heapq.heapify(min_heap)
        
        total_time = 0


        while(len(min_heap))>1:
            first  = heapq.heappop(min_heap)
            second = heapq.heappop(min_heap)


            merge_time = first + second
            total_time+=merge_time
            heapq.heappush(min_heap,merge_time)
        print(total_time)


t=2 
tezt_cases = [
    [1,2,3,4,5],
    [2,3,7]
]


candy_box_merge(tezt_cases)
