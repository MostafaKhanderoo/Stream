import config.ApplicationContext;
import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
//      UserService userService = ApplicationContext.getAdminService();
//        User user = new User();
//        user.setFirstname("Mostafa");
//        user.setLastname("Khanderoo");
//        userService.save(user);


      UserService userService = ApplicationContext.getAdminService();
//        User user = new User();
//       user.setFirstname("Mehran");
//       user.setLastname("Nourozi");
//        userService.save(user);

        userService.selectAllName();


       String [] stream =new String[100];
       stream =userService.selectAllName();









    }
}
