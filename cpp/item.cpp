#include<string>
#include<iostream>
class item
{
private:
    int id;
    std::string name;
public:
    item(int id , std::string name){
        setId(id);
        setName(name);
    }

    int getId(){return id;}

    std::string getName(){return name;}

    void setName(std::string name){this->name = name;}

    void setId(int id){this->id=id;}

    std::string to_string();

    //operator < needed for creating set or this class as keys of map
    bool operator< (item const &i)const{
        return id < i.id;
    }
    
    ~item(){}
};

std::string item::to_string(){
    return "[Item(id="+std::to_string(this->id)+",name="+this->name+")]";
}
