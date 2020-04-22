package club.zy.entity;

import lombok.Data;

/**
 * @author zyyy
 */
@Data
public class Book {
    private int id;
    private String name;
    private String writer;
    private double price;

    public Book(int id, String name, String writer, double price) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.price = price;
    }

    public Book(String name, String writer, double price) {
        this.name = name;
        this.writer = writer;
        this.price = price;
    }
}
