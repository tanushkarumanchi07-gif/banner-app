*public class OOPSBannerApp {

    public static void main(String[] args) {
        int height = 5;
        
        for (int i = 0; i < height; i++) {
            System.out.println(
                getCharORow(i) + "  " + 
                getCharORow(i) + "  " + 
                getCharPRow(i) + "  " + 
                getCharSRow(i)
            );
        }
    }

    public static String getCharORow(int row) {
        String[] pattern = {
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        };
        return pattern[row];
    }

    public static String getCharPRow(int row) {
        String[] pattern = {
            " ***** ",
            " * *",
            " ***** ",
            " * ",
            " * "
        };
        return pattern[row];
    }

    public static String getCharSRow(int row) {
        String[] pattern = {
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        };
        return pattern[row];
    }
}*
