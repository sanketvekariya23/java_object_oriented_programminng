 public class multidimantion_array {
    public static void main(String[] args) {
        // 2 D array
        int [][] flats = new int[2][3];
        //  101 102 103
        //  201 202 203

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for(int i=0; i<=flats.length-1; i++){
            for (int j=0; j<=flats[i].length - 1; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.printf("\n");
        }

    }
}
