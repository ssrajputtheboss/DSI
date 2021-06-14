#include<vector>
#include<algorithm>
#include<iostream>
#include<string>
#include "../item.cpp"

using namespace std;

void show(vector<item> items){
    cout<<endl;
    for(item i:items)cout<<i.to_string();
    cout<<endl;
}

int compare_greater_id(item a, item b){
    return b.getId()>a.getId() ? 1: 0;
}

int compare_lower_id(item a, item b){
    return a.getId()>b.getId() ? 1: 0;
}

int compare_greater_name(item a, item b){
    return b.getName()>a.getName() ? 1: 0;
}

int compare_lower_name(item a, item b){
    return a.getName()>b.getName() ? 1: 0;
}

void sort_by_id(vector<item> &items , bool inc=true){
    if(inc)
        sort(items.begin(), items.end(), compare_greater_id);
    else
        sort(items.begin(), items.end(), compare_lower_id);
}

void sort_by_name(vector<item> &items , bool inc=true){
    if(inc)
        sort(items.begin(), items.end(), compare_greater_name);
    else
        sort(items.begin(), items.end(), compare_lower_name);
}

int main(int argc, char const *argv[])
{
    vector<item> items({item(5,"Laptop"),item(3,"Computer"),item(1,"Calculator"),item(4,"Mobile")});
    cout<<"Initially";
    show(items);
    sort_by_id(items);
    cout<<"items sorted by id(increasing order)";
    show(items);
    sort_by_name(items,false);
    cout<<"items sorted by name(decreasing order)";
    show(items);
    return 0;
}
