package academy.learnprogramming;

public class StringBuilderMethods {

    public static void main(String[] args) {
        // charAt, indexOf, length, substring
        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
        // .substring() returns a String, not a StringBuilder
        // sub = gram
        int len = sb.length();
        char ch = sb.charAt(5);
        System.out.println(sub + " " + len + " " + ch);

        StringBuilder b = new StringBuilder().append(1).append("L");
        b.append("-").append(true);
        System.out.println(b); // 1L-true

        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, "-");
        builder.insert(2, 2);
        System.out.println(builder); // pr2ogram-ming

        // delete, deleteCharAt
        builder.delete(4, 9); // from index 4 to 9
        System.out.println(builder); // pr2oming
        builder.deleteCharAt(2);
        System.out.println(builder); // proming

//        builder.delete(2, 1); // causes error because out of bounds (first larger than last)
        builder.delete(1,1); // does not change anything, similar to substring returning "" from this type of call
        System.out.println(builder);

        // reverse
        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println(sb1);

        String myString = sb1.toString();
        myString = myString.toLowerCase();
        System.out.println(myString);
//        StringBuilder.toLowerCase() does not exist


    }
}
