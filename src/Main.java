import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exceptions {
        Scanner scanner = new Scanner(System.in);
        String Line = scanner.nextLine();
        String answer = calc(Line);
        System.out.println("Ответ: " + answer);
    }
    public static String calc(String input) throws Exceptions {
        Split split = new Split(input);
        String answer = split.getTemp();
        return answer;
    }
}