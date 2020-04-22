package club.zy.dao;

import club.zy.entity.Book;

import java.util.List;

/**
 * @author zyyy
 */
public interface BookDao {
    /**
     * 展示所有书籍信息
     * @return 返回所有书籍信息的 List 集合
     */
    List<Book> show();

    /**
     * 根据书名和作者名获取书籍的数量
     * @param name 书名
     * @param writer 作者名
     * @return 该书的数量
     */
    Integer count(String name, String writer);
}
