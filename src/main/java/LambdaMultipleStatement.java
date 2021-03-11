
interface doSomething {
    String say(String message);
}

public class LambdaMultipleStatement {

    public static void main(String[] args) {
        //implements with lambda
        doSomething doSomething = (message) -> {
            String s1 = "first sentences and ";
            String fullText = s1 + message;
            return fullText;
        };

        System.out.println(doSomething.say("second sentence"));

    }

}
