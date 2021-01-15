package OptionalTask;

import java.util.ArrayList;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> poem = new ArrayList<>();
        poem.add("Гляну в поле, гляну в небо");
        poem.add("И в полях и в небе рай");
        poem.add("Снова тонет в копнах хлеба");
        poem.add("Незапаханный мой край");

        System.out.println(poem);
        poem.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(poem);

    }
}
