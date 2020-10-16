package ex1_imageviewer;


import java.util.ArrayList;

public class RegistrationService {
    private static ArrayList<User> registeredUsers = new ArrayList<>();

    public static void register(User user) {
        registeredUsers.add(user);
        System.out.println(user.getName() + " is registered \n");
    }

    public static boolean isRegistered(User user) {
        return registeredUsers.contains(user);
    }
}
