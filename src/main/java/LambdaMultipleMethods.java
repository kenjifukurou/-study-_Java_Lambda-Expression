
@FunctionalInterface
interface Attack {
    int dealMagicDamage(int x, int y);
}

@FunctionalInterface
interface SkillX {
    double OmniSlash(double x);
}

@FunctionalInterface
interface FoolYou {
    String FuckYou(String curseWord);
}

public class LambdaMultipleMethods {

    public static void main(String[] args) {
        Attack a1 = (x, y) -> x * y;
        System.out.println("deal damage " + a1.dealMagicDamage(100, 5));

        double baseAttack = 100;
        SkillX s1 = (x) -> x * baseAttack * 15;
        System.out.println(s1.OmniSlash(1));

        //multiple methods is not working in Lambda!

    }

}
