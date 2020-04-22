package club.zy.service;

import club.zy.entity.Book;

/**
 * @author zyyy
 */
public interface AdminService {
    /**
     * 管理员添加书籍
     * @param book 要添加的书籍信息
     * @return 执行结果
     */
    int addBook(Book book);

    /**
     * 根据书籍 id 删除书籍
     * @param bookId 书籍 id
     * @return 执行结果
     */
    int removeBook(int bookId);
}
