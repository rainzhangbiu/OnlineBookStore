package club.zy.controller;

import club.zy.entity.Book;
import club.zy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zyyy
 */
@RestController
@RequestMapping("/book")
public class BookHandler {

    @Autowired
    private BookService bookService;

    @GetMapping("/show")
    public List<Book> show() {
        int i = 0;
        return bookService.show();
    }

    @GetMapping("/count/{name}/{writer}")
    public Integer count(@PathVariable("name") String name, @PathVariable("writer") String writer) {
        return bookService.count(name, writer);
    }
}
