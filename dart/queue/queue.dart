import '../Item.dart';
import 'dart:collection';

void main() {
  // or use var
  List<Item> items = [
    Item('Item1', 4, DateTime(2021, 5, 25, 6, 45, 56)),
    Item('Item2', 2, DateTime(2021, 6, 25, 6, 45, 56)),
    Item('Item3', 1, DateTime(2029, 5, 25, 6, 45, 56)),
    Item('Item4', 3, DateTime(2020, 5, 25, 6, 45, 56))
  ];
  Queue<Item> queue = Queue<Item>.from(items);
  //traversal
  for (Item item in queue) print(item.toString());
  //sorting
  items.sort((Item i1, Item i2) => i1.id.compareTo(i2.id));
  // addition remoival element
  items.add(Item('Item5', 5, DateTime(2016, 2, 5, 6, 40, 6)));
  items.removeAt(0);
}
