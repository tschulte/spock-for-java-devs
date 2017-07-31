package de.gliderpilot.spock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserService {

    private List<User> users = new ArrayList<>();

    public void saveUser(User user) {
        users.add(user);
    }

    public User findById(Long id) {
        return users.stream().filter(user -> Objects.equals(id, user.getId())).findFirst().orElse(null);
    }

}
