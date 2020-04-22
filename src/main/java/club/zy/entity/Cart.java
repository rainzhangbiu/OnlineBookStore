package club.zy.entity;

import lombok.Data;

/**
 * @author 章雨
 */
@Data
public class Cart {
    private int id;
    private String name;
    private String writer;
    private double price;
    private int number;

    public Cart(int id, String name, String writer, double price, int number) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.price = price;
        this.number = number;
    }
}
