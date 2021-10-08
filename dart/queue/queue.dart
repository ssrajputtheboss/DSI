import '../Item.dart';
import 'dart:collection';

void show(Queue<Item> queue, String msg) {
  print('$msg\n');
  //traversal
  for (Item item in queue) print(item.toString());
}

void main() {
  // or use var
  List<Item> items = [
    Item('Item1', 4, DateTime(2021, 5, 25, 6, 45, 56)),
    Item('Item2', 2, DateTime(2021, 6, 25, 6, 45, 56)),
    Item('Item3', 1, DateTime(2029, 5, 25, 6, 45, 56)),
    Item('Item4', 3, DateTime(2020, 5, 25, 6, 45, 56))
  ];
  Queue<Item> queue = Queue<Item>.from(items);
  show(queue, 'initially');
  // addition removal element
  queue.add(Item('Item5', 5, DateTime(2016, 2, 5, 6, 40, 6)));
  //items.removeAt(0);
  show(queue, 'after adding an element');
  print('top = ${queue.first.toString()}');
}
