package club.zy.service.impl;

import club.zy.dao.AdminRepository;
import club.zy.entity.Book;
import club.zy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyyy
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public int removeBook(int bookId) {
        return adminRepository.removeBook(bookId);
    }

    @Override
    public int addBook(Book book) {
        return adminRepository.addBook(book);
    }

}
