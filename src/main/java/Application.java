import java.util.ArrayList;
import java.util.List;

public class Application {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        List<Integer> checkedList = new ArrayList<Integer>();

        for (Integer integer: a){
            if (checkedList.contains(integer)) {
                checkedList.remove(integer);
            } else checkedList.add(integer);
        }

        int result = checkedList.get(0);

        return result;
    }
}
