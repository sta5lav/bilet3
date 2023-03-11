import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();
        for (int i = 0; i < (inputWord.length()/2); i++) {
            System.out.print(inputWord.charAt(i));
        }
    }
}