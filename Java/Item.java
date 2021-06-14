package Java;

import java.time.LocalDateTime;

public class Item {
    private Integer id;
    private String name;
    private LocalDateTime manufactureTime;
    public Item(Integer id, String name, LocalDateTime manufactureTime) {
        this.id = id;
        this.name = name;
        this.manufactureTime = manufactureTime;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDateTime getManufactureTime() {
        return manufactureTime;
    }
    public void setManufacturTime(LocalDateTime manufactureTime) {
        this.manufactureTime = manufactureTime;
    }
    @Override
    public String toString() {
        return "Item [id=" + id + ", manufactureTime=" + manufactureTime + ", name=" + name + "]";
    }

    
    
}
