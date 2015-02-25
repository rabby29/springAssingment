package net.sazzad.dao;

import net.sazzad.domain.User;

/**
 *
 * @author: therapJavaFestTeam
 * @since: 10/2/12 4:11 PM
 */
public interface UserDao {

    public void saveUser(User user);

    public User getUserByUserName(String userName);
}
