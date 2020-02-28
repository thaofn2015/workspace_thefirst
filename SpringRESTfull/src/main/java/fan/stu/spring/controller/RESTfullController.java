package fan.stu.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fan.stu.spring.model.User;

@RestController
public class RESTfullController {

    public static HashMap<Integer, User> mapUser = new HashMap<Integer, User>();
    static {
        mapUser.put(1, new User(1, "Thao1", "thao1@gmail.com"));
        mapUser.put(2, new User(2, "Thao2", "thao2@gmail.com"));
        mapUser.put(3, new User(3, "Thao3", "thao3@gmail.com"));
        mapUser.put(4, new User(4, "Thao4", "thao4@gmail.com"));
        mapUser.put(5, new User(5, "Thao5", "thao5@gmail.com"));
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> listUser = new ArrayList<User>(mapUser.values());
        return new ResponseEntity<List<User>>(listUser, HttpStatus.OK);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getUserById(@PathVariable int id) {
        User user = mapUser.get(id);
        if (user == null) {
            return new ResponseEntity<Object>("Not Found User", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Object>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<String> addUser(@RequestBody User user) {
        int key = user.getId();
        if (mapUser.get(key) == null) {
            mapUser.put(key, user);
            return new ResponseEntity<String>("Add User", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("User ID exits", HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        if (mapUser.containsKey(id)) {
            mapUser.remove(id);
            return new ResponseEntity<String>("Delete", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Not Found User", HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        int key = user.getId();
        if (mapUser.containsKey(key)) {
            User tmpUser = mapUser.get(key);

            tmpUser.setName(user.getName());
            tmpUser.setEmail(user.getEmail());

            return new ResponseEntity<String>("Update OK", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Not Found User", HttpStatus.NO_CONTENT);
        }
    }
}
