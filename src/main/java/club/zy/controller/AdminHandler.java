package club.zy.controller;

import club.zy.entity.Book;
import club.zy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zyyy
 */
@RestController
public class AdminHandler {
    @Autowired
    private AdminService adminService;

    @PostMapping("/admin/add/{name}/{writer}/{price}")
    public int addBook(@PathVariable("name") String name,@PathVariable("writer") String writer,@PathVariable("price") double price) {
        Book book = new Book(name,writer,price);
        return adminService.addBook(book);
    }

    @GetMapping("/admin/remove/{bookId}")
    public int removeBook(@PathVariable("bookId") int bookId) {
        return adminService.removeBook(bookId);
    }
}
