#include<iostream>
#include<queue>
#include<vector>
#include<algorithm>
#include "../item.cpp"
using namespace std;

int compare_greater_id(item a, item b){
    return b.getId()>a.getId() ? 1: 0;
}

int main(int argc, char const *argv[])
{
    priority_queue<item> pq; // by default a max heap is created
    pq.push(item(5,"Laptop"));
    item top = pq.top();
    pq.pop();

    /*priority queue using comparator*/
    priority_queue<item,vector<item>,decltype(compare_greater_id)> pq2;
    return 0;
}
