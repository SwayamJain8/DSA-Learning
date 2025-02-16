// StringBuilder class is used over normal String class because it is mutable, which means it can be modified after it is created without creating a new object in memory.

public class Strbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}