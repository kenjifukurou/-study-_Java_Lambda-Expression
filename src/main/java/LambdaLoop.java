import java.util.ArrayList;
import java.util.List;

public class LambdaLoop {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("aText");
        list.add("bText");
        list.add("cText");
        list.add("dText");

//        System.out.println(list);
//
//        for (String s : list) {
//            System.out.println(s);
//        }

        list.forEach((i) -> System.out.println(i));

        list.forEach((i) -> {
            System.out.println(i + " add some text");
        });

    }

}
