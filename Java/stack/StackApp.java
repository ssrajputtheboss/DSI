package Java.stack;

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

import Java.Item;

public class StackApp {
    private static Stack<Item> stackItems;

    public static void initialize(){
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Laptop" , LocalDateTime.of(2021, 2, 25, 12, 43, 54)));
        items.add(new Item(3, "Laptop" , LocalDateTime.of(2020, 8, 26, 4, 40, 14)));
        items.add(new Item(4, "Laptop" , LocalDateTime.of(2019, 2, 20, 1, 10, 0)));
        items.add(new Item(5, "Laptop" , LocalDateTime.of(2018, 2, 12, 3, 4, 5)));
        items.add(new Item(2, "Laptop" , LocalDateTime.of(2021, 1, 22, 9, 7, 6)));
        stackItems = new Stack<>();
        items.forEach((Item item)->{
            stackItems.push(item);
        });
    }

    public static void show() {
        System.out.println();
        stackItems.forEach((Item item)->{
            System.out.println(item.toString());
        });
        System.out.println();
    }

    public static void main(String args[]) {
        initialize();
        System.out.println("Initially");
        show();
        stackItems.pop();
        System.out.println("After pop");
        show();
    }
}