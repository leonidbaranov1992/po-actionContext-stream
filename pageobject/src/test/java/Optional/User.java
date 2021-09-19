package Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class User {
    int age;
    String name;
    long passId;

    User(long passId) {
        this.passId = passId;
    }

    public static User findUserByPassId(long passId, List<User> users) {
        for (User user : users) {
            if (user.passId == passId){
                return user;
            }
        }
        return null;
    }

    public static List<User> createManyRandomUsers(int countOfUsers){
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < countOfUsers ; i++) {
            userList.add(new User(i));
        }
        return userList;
    }
}
