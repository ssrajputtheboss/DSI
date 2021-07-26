package Java.priorityqueue;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import Java.Item;

class ItemComparatorById implements Comparator<Item>{

    //Max Priority Queue
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
}

class ItemComparatorByManufactureTime implements Comparator<Item>{
    
    //Min Priority Queue
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getManufactureTime().compareTo(o2.getManufactureTime());
    }
    
}

public class Pq{
    private static PriorityQueue<Item> pQueueId; 
    private static PriorityQueue<Item> pQueueMt;

    public static void showId(){
        pQueueId.forEach((Item item)->{
            System.out.println(item.toString());
        });
    }

    public static void showMt(){
        pQueueMt.forEach((Item item)->{
            System.out.println(item.toString());
        });
    }

    public static void initialize(){
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Laptop" , LocalDateTime.of(2021, 2, 25, 12, 43, 54)));
        items.add(new Item(3, "Laptop" , LocalDateTime.of(2020, 8, 26, 4, 40, 14)));
        items.add(new Item(4, "Laptop" , LocalDateTime.of(2019, 2, 20, 1, 10, 0)));
        items.add(new Item(5, "Laptop" , LocalDateTime.of(2018, 2, 12, 3, 4, 5)));
        items.add(new Item(2, "Laptop" , LocalDateTime.of(2021, 1, 22, 9, 7, 6)));
        pQueueId = new PriorityQueue<>(new ItemComparatorById());
        pQueueMt = new PriorityQueue<>(new ItemComparatorByManufactureTime());
        pQueueId.addAll(items);
        pQueueMt.addAll(items);
    }
    public static void main(String args[]){
        System.out.println("Initially Priority Queue By Id");
        showId();
        System.out.println("Current peek = " + pQueueId.peek());
        System.out.println("Removing peek item = " + pQueueId.poll());
        System.out.println("Pq now :");
        showId();
        System.out.println("Initially Priority Queue By Mt");
        showMt();
        System.out.println("Current peek = " + pQueueMt.peek());
        System.out.println("Removing peek item = " + pQueueMt.poll());
        System.out.println("Pq now :");
        showId();
    }
}