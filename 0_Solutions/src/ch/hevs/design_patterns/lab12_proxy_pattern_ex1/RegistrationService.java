package ch.hevs.design_patterns.lab12_proxy_pattern_ex1;

import java.util.ArrayList;
import java.util.List;

public class RegistrationService {
    static private List<User> registeredUsers = new ArrayList<User>();

    static public void register(User user) {
        registeredUsers.add(user);
        System.out.println(user.getName() + " is registered \n");
    }

    static public boolean isRegistered(User user) {
        return registeredUsers.contains(user);
    }
}
