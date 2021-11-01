package section5;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("John Baugh");
        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(5,"Philip");
        System.out.println(sb);

        sb.replace(22,29,"amazing");
        System.out.println(sb);

        sb.delete(5,13);
        System.out.println(sb);

        sb.replace(0,4,"Dr.");
        System.out.println(sb);
    }
}
