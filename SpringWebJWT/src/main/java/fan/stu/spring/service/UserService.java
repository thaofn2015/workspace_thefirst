package fan.stu.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import fan.stu.spring.entities.User;

@Service
public class UserService {

    public static List<User> listUser = new ArrayList<User>();

    static {
        User userKai = new User(1, "kai", "123456");
        userKai.setRoles(new String[] { "ROLE_ADMIN" });

        User userThao = new User(1, "Thao", "123456");
        userThao.setRoles(new String[] { "ROLE_USER" });

        listUser.add(userKai);
        listUser.add(userThao);
    }

    public List<User> findAll() {
        return listUser;
    }

    public User findById(int id) {
        for (User user : listUser) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public boolean add(User userNew) {
        for (User userExist : listUser) {
            if (userNew.getId() == userExist.getId()
                    || StringUtils.equals(userNew.getUsername(), userExist.getUsername())) {
                return false;
            }
        }
        listUser.add(userNew);
        return true;
    }

    public void delete(int id) {
        listUser.removeIf(user -> user.getId() == id);
    }

    public User loadUserByUsername(String username) {
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean checkLogin(User user) {
        for (User userExist : listUser) {
            if (StringUtils.equals(user.getUsername(), userExist.getUsername())
                    && StringUtils.equals(user.getPassword(), userExist.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
