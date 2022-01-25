import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = new String[5];
        System.out.println("Введите 5 слов в две строки");
        for (int i = 0; i < 5; i++) {
            word[i] = scanner.next();
        }
        Arrays.asList(word).forEach(System.out::println);
        scanner.close();
    }
}
