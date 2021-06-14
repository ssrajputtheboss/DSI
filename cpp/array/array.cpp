#include<iostream>
#include<algorithm>
#include "../item.cpp"
using namespace std;

void show(item items[]){
    for(int i=0;i<4;++i)cout<<items[i].to_string();
    cout<<endl;
}

int compare_lower_id(item a, item b){
    return a.getId()>b.getId() ? 1: 0;
}

int main(int argc, char const *argv[])
{
    item items[] = {item(5,"Laptop"),item(3,"Computer"),item(1,"Calculator"),item(4,"Mobile")};
    cout<<"\nInitially:\n";
    show(items);
    sort(items , items+ 4 , compare_lower_id);
    cout<<"\nsorted items are(decreasing order):\n";
    show(items);
    return 0;
}
