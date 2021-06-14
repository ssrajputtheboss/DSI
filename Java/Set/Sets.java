package Java.Set;

import Java.Item;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.time.LocalDateTime;

public class Sets{
    private static Set<Item> items;

    public static void show(){
        System.out.println();
        items.forEach((Item item)->{
            System.out.print(item.toString());
        });
        System.out.println();
    }

    public static void initialize(){
        items = new HashSet<>();
        items.add(new Item(1, "Laptop" , LocalDateTime.of(2021, 2, 25, 12, 43, 54)));
        items.add(new Item(3, "Laptop" , LocalDateTime.of(2020, 8, 26, 4, 40, 14)));
        items.add(new Item(4, "Laptop" , LocalDateTime.of(2019, 2, 20, 1, 10, 0)));
        items.add(new Item(5, "Laptop" , LocalDateTime.of(2018, 2, 12, 3, 4, 5)));
        items.add(new Item(2, "Laptop" , LocalDateTime.of(2021, 1, 22, 9, 7, 6)));
    }

    public static void removeById(Integer id){
        items.removeIf(new Predicate<Item>(){
            @Override
            public boolean test(Item item){
                return item.getId().equals(id);
            }
        });
    }
    public static void main(String args[]) {
        initialize();
        System.out.println("Initially");
        show();
        removeById(1);
        System.out.println("\nafter removing id=1 ");
        show();
    }
}