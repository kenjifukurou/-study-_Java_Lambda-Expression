
interface DrawableMultipleMethods {
    public void draw();
    public void write();
}

interface DrawableSingleMethod {
    public void draw();
}

interface SaySomething {
    public String say();
}

interface SayMyName {
    public String say(String name);
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello lambda!");

        //codes without lambda: implement drawable
        DrawableMultipleMethods d = new DrawableMultipleMethods() {
            int width = 100;

            @Override
            public void draw() {
                System.out.println("drawing your ass! " + width);
            }

            @Override
            public void write() {
                System.out.println("writing dirty dairy");
            }
        };
        d.draw();
        d.write();


        //codes lambda:
        int width = 100;
        DrawableSingleMethod dL = () -> {
            System.out.println("lambda drawing your pussy! " + width);
        };
        dL.draw();

        // ---------------------------

        SaySomething say = () -> {
            return "I love you!";
        };
        System.out.println(say.say());


        SayMyName s1 = (name) -> {
            return "Hello " + name;
        };

        System.out.println(s1.say("Arshiva"));

    }
}
