package test5;

public class Item {

    private final int capacity;
    private final int value;
    private final String name;

    public Item (int capacity, int value, String name) {
        this.capacity = capacity;
        this.value = value;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }


}
