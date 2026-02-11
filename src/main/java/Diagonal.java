public class Diagonal {
    
    public static void main(String[] args) {
        weave(diagonal(11,11));
    }

    public static void weave(String[][] rug) {
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) { //creates diagonal lines
                System.out.print(rug[i][j]);
            }
            System.out.println("");
        }
    }
    public static String[][] diagonal(int width, int height) {
        String[][] rug = new String[width][height];
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                String emoji;
            if ((i - j) % 2 == 0) { //If row minus column is even, place emoji to create the pattern
                emoji = "🩷 "; 
            } else {
                emoji = "🌴";
            }
                rug[i][j] = emoji;
            }
        }
        return rug;
    }
}
