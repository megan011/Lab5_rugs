public class Vertical {
    public static void main(String[] args) {
        weave(vertical(11,11)); //prints 2D array row by row
    }

    public static void weave(String[][] rug) {
        for (int i = 0; i < rug.length; i++) { //outerloop controls rows 
            for (int j = 0; j < rug[i].length; j++) { //inner loop controls columns
                System.out.print(rug[i][j]);
            }
            System.out.println("");
        }
    }
    public static String[][] vertical(int width, int height) {
        String[][] rug = new String[width][height];
        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                String emoji;
                if (j % 2 == 0) { //checks if column index is even
                    emoji = "🩷 ";
                } else {
                    emoji = "🌴";
                }
                rug[i][j] = emoji; //stores emoji in array
            }
        }
        return rug;
    }
}