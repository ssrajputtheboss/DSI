#include<iostream>
#include<algorithm>
#include<vector>
#include<set>
#include "../item.cpp"

using namespace std;

void show(set<item> items){
    cout<<endl;
    for(item i:items)cout<<i.to_string();
    cout<<endl;
}

int main(int argc, char const *argv[])
{
    set<item> items_set;
    vector<item> items({item(5,"Laptop"),item(3,"Computer"),item(1,"Calculator"),item(4,"Mobile")});
    for(auto i:items)
        items_set.insert(i);
    cout<<"Initially";
    show(items_set);
    items_set.erase(items[0]);
    cout<<"After removing id = 5:";
    show(items_set);
    return 0;
}
