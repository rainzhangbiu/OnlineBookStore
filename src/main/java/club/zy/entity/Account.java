package club.zy.entity;

import lombok.Data;

/**
 * @author zyyy
 */
@Data
public class Account {
    private long id;
    private long account;
    private String password;
    private int state;

    public Account(String password, int state) {
        this.password = password;
        this.state = state;
    }

    public Account(int id, int account, String password, int state) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.state = state;
    }
}
