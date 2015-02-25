package net.sazzad.service;

import net.sazzad.dao.JdbcUserDaoImpl;
import net.sazzad.dao.UserDao;
import net.sazzad.domain.User;

/**
 *
 * @author: therapJavaFestTeam
 * @since: 10/2/12 4:11 PM
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(){
        userDao = new JdbcUserDaoImpl();
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public User verifyUser(User user) {
        User verifiedUser = userDao.getUserByUserName(user.getUserName());
        if(verifiedUser != null && verifiedUser.getPassword().equals(user.getPassword())) {
            return verifiedUser;
        }
        return null;
    }
}
