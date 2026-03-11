import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patterns) {

        int height = 5;

        for (int row = 0; row < height; row++) {
            for (char c : word.toCharArray()) {

                String[] pattern = patterns.get(c);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}
