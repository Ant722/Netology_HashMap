import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>(26);
        saveMap(map);
        Map.Entry<Character, Integer> maxValue = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        System.out.println("Самая часто встречающаяся буква " + maxValue);
        Map.Entry<Character, Integer> minValue = Collections.min(map.entrySet(), Map.Entry.comparingByValue());
        System.out.println("Самая редко встречающаяся буква " + minValue);
    }

    private static void saveMap(Map<Character, Integer> map) {
        for (int i =0; i < text.length(); i++){
            char s = Character.toLowerCase(text.charAt(i));
            if(Character.isLetter(s)){
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
    }
}