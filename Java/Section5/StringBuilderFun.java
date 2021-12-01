package Java.Section5;

public class StringBuilderFun {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("john bought");
        System.out.println(sb);
        sb.append(5);  // add int value to string
        System.out.println(sb);
        System.out.println(sb.indexOf("hn")); // gives the index of SubString
        sb.insert(5,"philip ");  // we can add any string and also if we want int char double values using this
        System.out.println(sb);
        sb.append(" is awesome");
        System.out.println(sb);
        sb.deleteCharAt(18);  // delete any char at particular index
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        sb.insert(0,"john");
        System.out.println(sb);
        sb.replace(22,29,"amazing");
        System.out.println(sb);

        sb.append(" "+3.14);
        System.out.println(sb);

        String sb2 = sb.toString();
        System.out.println(sb2);

        sb.setCharAt(0,'J');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println( sb.equals(sb2));


    }


}
