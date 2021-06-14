import sys
from datetime import datetime
from operator import itemgetter
sys.path.append('C:\\Users\\shash\\Desktop\\cp\\ds\\')
from python.item.item import item

def sort_by_id(inc:bool=True):
    global l
    l.sort(key = lambda i:i.id , reverse= not inc)
    #l.sort(key = lambda i:itemgetter(0) , reverse= not inc)

def sort_by_mntime(inc:bool=True):
    global l
    l.sort(key = lambda i: i.mntime , reverse= not inc)
    #l.sort(key = lambda i:itemgetter(2) , reverse= not inc)
    
l: list= [
    item(1, "Laptop" , datetime(2021, 2, 25, 12, 43, 54)),
    item(3, "Laptop" , datetime(2020, 8, 26, 4, 40, 14)),
    item(4, "Laptop" , datetime(2019, 2, 20, 1, 10, 0)),
    item(5, "Laptop" , datetime(2018, 2, 12, 3, 4, 5)),
    item(2, "Laptop" , datetime(2021, 1, 22, 9, 7, 6))
]

print("initial:\n",l)
sort_by_id(False)
print("sorted in decreasing order of ids\n" , l)
sort_by_mntime()
print('Sorted in increasing order of mntime:\n' , l)