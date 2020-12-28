import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char []chars = text.toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        text = new String(chars);
        System.out.println(text);

    }
}
