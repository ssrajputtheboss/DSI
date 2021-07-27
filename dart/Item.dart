class Item {
  late String _name;
  late int _id;
  late DateTime _manufactureTime;
  Item(String name, int id, DateTime manufactureTime) {
    _name = name;
    _id = id;
    _manufactureTime = manufactureTime;
  }
  //getters setters
  String get name => this._name;
  void set name(String n) {
    this._name = n;
  }

  int get id => this._id;
  void set id(int i) {
    this._id = i;
  }

  DateTime get manufactureTime => this._manufactureTime;
  void set manufactureTime(DateTime mft) {
    this._manufactureTime = mft;
  }

  @override
  String toString() {
    return 'Item(id=$_id,name=$name,manufactureTime=${_manufactureTime.toString()})';
  }
}
