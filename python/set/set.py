import sys
from datetime import datetime
from operator import itemgetter
sys.path.append('C:\\Users\\shash\\Desktop\\cp\\ds\\')
from python.item.item import item

def show(tag:str="")->None:
    global s
    print(tag)
    print(s)

s = {
    item(1, "Laptop" , datetime(2021, 2, 25, 12, 43, 54)),
    item(3, "Laptop" , datetime(2020, 8, 26, 4, 40, 14)),
    item(4, "Laptop" , datetime(2019, 2, 20, 1, 10, 0)),
    item(5, "Laptop" , datetime(2018, 2, 12, 3, 4, 5)),
    item(2, "Laptop" , datetime(2021, 1, 22, 9, 7, 6))
}
s.add(item(1, "Laptop" , datetime(2021, 2, 25, 12, 43, 54)))
show("Initially")
