public class Horizontal { 
        public static void main(String[] args) { 
        weave(horizontal(11,11));
    }
        public static void weave(String[][] rug) {
        //Method to print 2D emoji arrays. 
        for (int i = 0; i < rug.length; i++) { 
            for (int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j]);
            }
            // Break the line at the end of every row. 
            System.out.println(""); 
        }
    }

//creates horizontal stripes based on row number 

    public static String[][] horizontal(int width, int height) {
        String[][] rug = new String[height][width];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                if (i % 2 == 0) { //if row is even, use one emoji
                    rug[i][j] = "🩷 "; 
                } else {
                    rug[i][j] = "🌴"; 
                }
            }
        }
        return rug;
    }
}

