package Java.array;

import java.util.Arrays;
import java.util.Comparator;

import Java.Item;

import java.time.LocalDateTime;

public class Arr{
    private static Item items[];

    public static void show(){
        System.out.println();
        for(Item item: items){
            System.out.println(item.toString());
        }
        System.out.println();
    }

    public static void initialize(){
        items = new Item[5];
        items[0] = new Item(1, "Laptop" , LocalDateTime.of(2021, 2, 25, 12, 43, 54));
        items[1] = new Item(3, "Laptop" , LocalDateTime.of(2020, 8, 26, 4, 40, 14));
        items[2] = new Item(4, "Laptop" , LocalDateTime.of(2019, 2, 20, 1, 10, 0));
        items[3] = new Item(5, "Laptop" , LocalDateTime.of(2018, 2, 12, 3, 4, 5));
        items[4] = new Item(2, "Laptop" , LocalDateTime.of(2021, 1, 22, 9, 7, 6));
    }

    public static void sortById(Boolean inc) {
        Arrays.sort(items, new Comparator<Item>(){
            @Override
            public int compare(final Item a, final Item b){
                return inc ? a.getId().compareTo(b.getId()) : b.getId().compareTo(a.getId()); 
            }
        });
    }

    public static void sortByManufactureTime(Boolean inc) {
        Arrays.sort(items, new Comparator<Item>(){
            @Override
            public int compare(final Item a, final Item b){
                return inc ? a.getManufactureTime().compareTo(b.getManufactureTime()) : b.getManufactureTime().compareTo(a.getManufactureTime());
            }
        });
    }
    public static void main(String args[]) {
        initialize();
        System.out.println("Initially");
        show();
        sortById(false);
        System.out.println("\nsorted in decreasing order id ids ");
        show();
        sortByManufactureTime(true);
        System.out.println("\nsorting increasing datetime ");
        show();
    }
}