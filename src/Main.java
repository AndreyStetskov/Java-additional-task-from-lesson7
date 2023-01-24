import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> someList = new ArrayList<>();
        List<String> anotherList = new LinkedList<>();

        someList.add("I adore Java");
        someList.add("Our group is the best");
        someList.add("We have the coolest mentor");

        anotherList.add("Today is nice day");
        anotherList.add("I enjoy living");
        anotherList.add("The greatest people around me");

        someList.set(2, "I adore Java");
        someList.add(1,"Our group is the best");
        someList.remove(3);

        anotherList.addAll(someList);

        for (int i = 0; i < anotherList.size(); i++) {
            String theLongestString = "0";
            if (theLongestString.length() <= anotherList.get(i).length()) {
                theLongestString = anotherList.get(i);
            }
        }
    }
}