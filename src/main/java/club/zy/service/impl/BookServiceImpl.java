package club.zy.service.impl;

import club.zy.dao.BookDao;
import club.zy.entity.Book;
import club.zy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyyy
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> show() {
        return bookDao.show();
    }

    @Override
    public Integer count(String name, String writer) {
        return bookDao.count(name, writer);
    }
}
