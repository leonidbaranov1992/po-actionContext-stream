package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamHelper {


    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = -3; i < 10; i++) {
            intList.add(i);
        }
        Stream stream = intList.stream();
       List<Object> objList = (List<Object>) stream.filter(x -> Integer.parseInt(x.toString()) > 0).
                sorted((o1, o2) -> Integer.parseInt(o2.toString()) - Integer.parseInt(o1.toString())).collect(Collectors.toList());

        System.out.println(objList.toString());

        System.out.println(intList.toString());

        Stream stream1 = intList.stream();

        System.out.println("второй вызов стрима  " + stream1.findFirst().get().toString());
    }

}
