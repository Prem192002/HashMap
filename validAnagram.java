import java.util.*;

public class validAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();

        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();
        if (st1.length() != st2.length()) {
            System.out.println("false");
        }

        for (int i = 0; i < st1.length(); i++) {
            if (!mp1.containsKey(st1.charAt(i))) {
                mp1.put(st1.charAt(i), 1);
            } else {
                mp1.put(st1.charAt(i), mp1.get(st1.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < st2.length(); i++) {
            if (!mp2.containsKey(st2.charAt(i))) {
                mp2.put(st2.charAt(i), 1);
            } else {
                mp2.put(st2.charAt(i), mp2.get(st2.charAt(i)) + 1);
            }
        }

        boolean res = mp1.equals(mp2);
        System.out.println(res);

    }
}
