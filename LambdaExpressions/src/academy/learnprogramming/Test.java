package academy.learnprogramming;

public class Test {

    public static void main(String[] args) {

        String s1 = "Rekha";
        String s2 = new String("Rekha");
//        String s2 = "Rekha";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        for(int i = 5; i > 0; i--) {
            System.out.println(i);
        }


    }
}
