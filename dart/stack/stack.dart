import 'dart:collection';

import '../Item.dart';

late Queue<Item> stack;

void show(String msg) {
  print('$msg\n');
  //traversal
  for (Item item in stack) print(item.toString());
}

Item top() => stack.last;

Item pop() {
  Item item = stack.last;
  stack.removeLast();
  return item;
}

void push(Item item) => stack.addLast(item);

void main() {
  // or use var
  List<Item> items = [
    Item('Item1', 4, DateTime(2021, 5, 25, 6, 45, 56)),
    Item('Item2', 2, DateTime(2021, 6, 25, 6, 45, 56)),
    Item('Item3', 1, DateTime(2029, 5, 25, 6, 45, 56)),
    Item('Item4', 3, DateTime(2020, 5, 25, 6, 45, 56))
  ];
  stack = Queue<Item>.from(items);
  show('initially');
  print('top = ${pop()}');
  show('afterpop');
  push(Item('Item5', 5, DateTime(2016, 2, 5, 6, 40, 6)));
}
