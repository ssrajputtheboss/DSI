import '../Item.dart';

void main() {
  Map<String, Item> items = {
    'Laptop': Item('Item1', 4, DateTime(2021, 5, 25, 6, 45, 56)),
    '''Desktop''': Item('Item2', 2, DateTime(2021, 6, 25, 6, 45, 56)),
    r'Mobile': Item('Item3', 1, DateTime(2029, 5, 25, 6, 45, 56)),
    "Tablet": Item('Item4', 3, DateTime(2020, 5, 25, 6, 45, 56))
  };
  //adding
  items["New"] = Item('Item5', 5, DateTime(2020, 6, 5, 6, 45, 56));
  items.remove("New"); //remove by key
  //traversal
  items.forEach((String key, Item value) {
    print(value.toString());
  });
  //sort keys
  items.keys.toList().sort();
}
