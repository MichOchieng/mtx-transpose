public class transpose{
    private static int cols;
    private int a[][];
    private int b[][];
    // Number of entries in each column
    private int Colsize[] = new int [cols+1];
    // The sum of rownext & colsize at that position
    private int Rownext[] = new int [cols+1];

    private void findEntries(int Colsize[]){
        for (int i = 0; i < cols; i++) {
            Colsize[i] = 0;
        }
        for (int i = 0; i < Colsize.length; i++) {
            Colsize[a[i].col]++;
        }
    }

    private void findStart(){
        Rownext[1] = 0;
        for (int i = 0; i < cols; i++) {
            Rownext[i] = Rownext[i-1] + Colsize[i-1];
        }
        for (int i = 0; i < Colsize.length; i++) {
            int j = Rownext[a[i].col]++;

            b[j].row = a[i].col;
            b[j].col = a[i].row;
            b[j].value = a[i].value;
        }
    }
    
}