package club.zy.service;


import club.zy.entity.Cart;

import java.util.List;

/**
 * @author zyyy
 */
public interface CartService {
    /**
     * 显示当前用户购物车内所有书籍信息
     * @param account 用户账号
     * @return 书籍信息的 List 集合
     */
    List<Cart> show(int account);

    /**
     * 根据用户账号和书籍的 ID 删除购物车中书籍
     * @param account 用户账号
     * @param bookId 书籍 ID
     * @param number 书籍数量
     * @return 成功执行返回 1，否则返回 0
     */
    int add(int account, int bookId, int number);

    /**
     * 更新购物车信息
     * @param account 用户账号
     * @param bookId 书籍 ID
     * @param number 书籍数量
     * @return 成功执行返回 1，否则返回 0
     */
    int update(int account, int bookId, int number);

    /**
     * 根据用户账号和书籍的 ID 删除购物车中书籍
     * @param account 用户账号
     * @param bookId 书籍 ID
     * @return 成功执行返回 1，否则返回 0
     */
    int remove(int account, int bookId);
}
