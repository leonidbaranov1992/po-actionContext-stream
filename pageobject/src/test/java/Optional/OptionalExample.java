package Optional;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static Optional.User.createManyRandomUsers;
import static Optional.User.findUserByPassId;


public class OptionalExample {

    public static void main(String[] args) {
        List<User> userList = createManyRandomUsers(10);

        User Maxim = findUserByPassId(11, userList);

//        System.out.println(Maxim.age);

        Optional<User> user = Optional.of(new User(11));

        System.out.println( user.get());
    }






}
