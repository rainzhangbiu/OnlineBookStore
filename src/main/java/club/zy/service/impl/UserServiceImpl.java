package club.zy.service.impl;

import club.zy.dao.UserRepository;
import club.zy.entity.Account;
import club.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyyy
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Account login(long account) {
        return userRepository.login(account);
    }

    @Override
    public int register(long account, String password) throws Exception {
            return userRepository.register(account, password);
    }
}
