public class Plaid {
    
    public static void main(String[] args) {
        weave(plaid(11,11));
    }

//prints 2D array

    public static void weave(String[][] rug) {
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) { 
                System.out.print(rug[i][j]);
            }
            System.out.println("");
        }
    }
    public static String[][] plaid(int width, int height) {
        String[][] rug = new String[width][height];
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                String emoji;
                if ((i % 2 == 0) && (j % 2 == 0)) { //if both row and column are even, place emoji
                    emoji = " 🌴";
                } else {
                    emoji = " 🩷 ";
                }
                rug[i][j] = emoji; 
            }
        }
        return rug;
    }
}
