package Java.map;

import Java.Item;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDateTime;

public class MyMap{
    private static Map<String , Item> items;

    public static void show(){
        System.out.println();
        items.forEach((String key , Item value)->{
            System.out.println("Key:"+key+"Value:"+value.toString());
        });
        System.out.println();
    }

    public static void initialize(){
        //LinkedHashMap is an unordered map in HashMap or TreeMap entryset is sorted automatically wrt keys
        items = new LinkedHashMap<>();
        items.put("Laptop1" ,new Item(1, "Laptop" , LocalDateTime.of(2021, 2, 25, 12, 43, 54)));
        items.put("Laptop3" ,new Item(3, "Laptop" , LocalDateTime.of(2020, 8, 26, 4, 40, 14)));
        items.put("Laptop4" ,new Item(4, "Laptop" , LocalDateTime.of(2019, 2, 20, 1, 10, 0)));
        items.put("Laptop5" ,new Item(5, "Laptop" , LocalDateTime.of(2018, 2, 12, 3, 4, 5)));
        items.put("Laptop2" ,new Item(2, "Laptop" , LocalDateTime.of(2021, 1, 22, 9, 7, 6)));
    }

    public static void sortByKey() {
        //treemap will sort wrt keys
        TreeMap<String,Item> map = new TreeMap<>(items);
        items.clear();
        map.forEach((String key , Item value)->{
            items.put(key, value);
        });
    }

    public static void sortByValueById(Boolean inc){
        List<Map.Entry<String,Item>> list = new LinkedList<>(items.entrySet());
        Collections.sort( list,new Comparator<Map.Entry<String,Item>>(){
            @Override
            public int compare(Map.Entry<String,Item> a,Map.Entry<String,Item> b){
                return inc ? a.getValue().getId().compareTo(b.getValue().getId()) : b.getValue().getId().compareTo(a.getValue().getId());
            }
        });
        items.clear();
        list.forEach((Map.Entry<String,Item> entry)->{
            items.put(entry.getKey(), entry.getValue());
        });
    }
    public static void main(String args[]) {
        initialize();
        System.out.println("Initially");
        show();
        sortByKey();
        System.out.println("\nsorted by keys ");
        show();
        sortByValueById(false);
        System.out.println("\nsorted by value(item id) decreasing order");
        show();
    }
}