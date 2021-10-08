#include<vector>
#include<map> 
#include<unordered_map>
#include<algorithm>
#include<iostream>
#include<string>
#include "../item.cpp"

using namespace std;

typedef pair<string,item> my_pair;

void show(unordered_map<string ,item>& items){
    cout<<endl;
    for(my_pair p:items)cout<<"{Key:"<<p.first<<",Value:"<<p.second.to_string()<<"}";
    cout<<endl;
}

int compare_greater_id(my_pair a, my_pair b){
    return b.second.getId()>a.second.getId() ? 1: 0;
}

int compare_lower_id(my_pair a, my_pair b){
    return a.second.getId()>b.second.getId() ? 1: 0;
}

int compare_greater_name(my_pair a, my_pair b){
    return b.second.getName()>a.second.getName() ? 1: 0;
}

int compare_lower_name(my_pair a, my_pair b){
    return a.second.getName()>b.second.getName() ? 1: 0;
}

void sort_by_key(unordered_map<string,item> &items_map,bool inc=true){
    vector<my_pair> items;
    for(my_pair p:items_map)
        items.push_back(p);
    if(inc)
        sort(items.begin(),items.end(),greater<my_pair>());
    else
        sort(items.begin(),items.end());
    items_map.clear();
    for(my_pair p:items)
        items_map.insert(p);
}

void sort_by_id(unordered_map<string,item> &items_map,bool inc=true){
    vector<my_pair> items;
    for(my_pair p:items_map)
        items.push_back(p);
    if(inc)
        sort(items.begin(),items.end(),compare_lower_id);
    else
        sort(items.begin(),items.end(),compare_greater_id);
    items_map.clear();
    for(my_pair p:items)
        items_map.insert(p);
}

void sort_by_name(unordered_map<string,item> &items_map,bool inc=true){
    vector<my_pair> items;
    for(my_pair p:items_map)
        items.push_back(p);
    if(inc)
        sort(items.begin(),items.end(),compare_lower_name);
    else
        sort(items.begin(),items.end(),compare_greater_name);
    items_map.clear();
    for(my_pair p:items)
        items_map.insert(p);
}

int main(int argc, char const *argv[])
{
    unordered_map<string ,item> items({
        {"Item1",item(5,"Laptop")},
        {"Item3",item(3,"Computer")},
        {"Item4",item(4,"Mobile")},
        {"Item2",item(1,"Calculator")}
        });
    /*
    unorderd_map -> hashmap in java elements are in random order
    ordered_map -> Treemap in java elements are always in sorted order
    */
    cout<<"Initially";
    show(items);
    sort_by_id(items);
    //sort_by_key(items);
    cout<<"items sorted by id(increasing order)";
    show(items);
    sort_by_name(items,false);
    cout<<"items sorted by name(decreasing order)";
    show(items);
    return 0;
}
