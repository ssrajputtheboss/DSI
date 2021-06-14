import sys
from datetime import datetime
from operator import itemgetter
sys.path.append('C:\\Users\\shash\\Desktop\\cp\\ds\\')
from python.item.item import item

def show(tag:str=""):
    global d
    print(tag)
    print(d)

def sort_by_key(inc:bool=True):
    global d
    d=dict([(i,d[i]) for i in sorted(d , key= lambda x: x , reverse=not inc)])

def sort_by_id(inc:bool=True):
    global d
    d=dict([(i,d[i]) for i in sorted(d , key= lambda x: d[x].id , reverse=not inc)])

def sort_by_mntime(inc:bool=True):
    global d
    d=dict([(i,d[i]) for i in sorted(d , key= lambda x: d[x].mntime , reverse=not inc)])

l: list= [
    item(1, "Laptop" , datetime(2021, 2, 25, 12, 43, 54)),
    item(3, "Laptop" , datetime(2020, 8, 26, 4, 40, 14)),
    item(4, "Laptop" , datetime(2019, 2, 20, 1, 10, 0)),
    item(5, "Laptop" , datetime(2018, 2, 12, 3, 4, 5)),
    item(2, "Laptop" , datetime(2021, 1, 22, 9, 7, 6))
]
d : dict = dict()
for i in range(len(l)):
    d[f"Item{i}"] = l[i]
show("Initially")
sort_by_key()
show("after sorting of keys in decreasing order")
sort_by_id()
show("sort increasing order of id")
sort_by_mntime()
show("increasing order of mntime")
