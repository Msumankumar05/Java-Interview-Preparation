import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();

        Map<Character, Integer> fmap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c == ' ')continue;
            fmap.put(c, fmap.getOrDefault(c, 0) + 1);
        }

        fmap.forEach((Key, Value) -> System.out.println(Key + ":" + Value));
        sc.close();

    }
}
