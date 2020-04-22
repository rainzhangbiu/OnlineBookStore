package club.zy.service.impl;

import club.zy.dao.CartRepository;
import club.zy.entity.Book;
import club.zy.entity.Cart;
import club.zy.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyyy
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> show(int account) {
        return cartRepository.show(account);
    }

    @Override
    public int add(int account, int bookId, int number) {
        return cartRepository.add(account, bookId, number);
    }

    @Override
    public int update(int account, int bookId, int number) {
        return cartRepository.update(account, bookId, number);
    }

    @Override
    public int remove(int account, int bookId) {
        return cartRepository.remove(account, bookId);
    }
}
