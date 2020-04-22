package club.zy.dao;

import club.zy.entity.Account;

/**
 * @author zyyy
 */
public interface UserRepository {
    /**
     * 登陆功能
     * @param account 用户账号
     * @return 返回一个 Account 对象，有用户的密码以及身份
     */
    Account login(long account);

    /**
     * 注册
     * @param account 注册账号
     * @param password 注册密码
     * @return 返回 sql 执行结果
     * @throws Exception   如果注册的账号已经存在，则会抛出异常
     */
    int register(long account, String password) throws Exception;
}
