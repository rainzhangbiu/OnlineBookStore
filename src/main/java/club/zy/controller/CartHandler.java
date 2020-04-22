package club.zy.controller;

import club.zy.entity.Cart;
import club.zy.service.CartService;

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
@RequestMapping("/cart")
public class CartHandler {
    @Autowired
    private CartService cartService;

    @GetMapping("/show/{account}")
    public List<Cart> show(@PathVariable("account") int account) {
        return cartService.show(account);
    }

    @GetMapping("/add/{account}/{bookId}/{number}")
    public int add(@PathVariable("account") int account,@PathVariable("bookId") int bookId,@PathVariable("number") int number) {
        return cartService.add(account,bookId,number);
    }

    @GetMapping("/update/{account}/{bookId}/{number}")
    public int update(@PathVariable("account") int account,@PathVariable("bookId") int bookId,@PathVariable("number") int number) {
        return cartService.update(account,bookId,number);
    }

    @GetMapping("/remove/{account}/{bookId}")
    public int remove(@PathVariable("account") int account,@PathVariable("bookId") int bookId) {
        return cartService.remove(account,bookId);
    }
}
