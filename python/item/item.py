from datetime import datetime
class item():
    def __init__(this ,id : int , name : str , mntime : datetime):
        this._id = id 
        this._name = name 
        this._mntime = mntime
    def __repr__(this) -> str:
        return repr(( this._id , this._name , this._mntime ))
    def __str__(this) -> str:
        return f" [ Item(id:{this._id} , name:{this._name} , mndate:{this._mntime}) ];"
    def __lt__(this,other) -> bool:
        return this.id < other.id
    @property
    def id(this) -> int:
        return this._id
    @id.setter
    def id(this,id:int) -> None:
        this._id = id
    @property
    def name(this) -> str:
        this._name
    @name.setter
    def name(this,name:str) -> None:
        this.name = name
    @property
    def mntime(this) -> datetime:
        return this._mntime
    @mntime.setter
    def mntime(this , mntime:datetime) -> None:
        this._mntime = mntime

if __name__ == '__main__':
    pass