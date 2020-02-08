import java.util.Arrays;

public class transpose{  

    private static int rows;
    private static int cols;
    private static int terms;
    public transpose(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.terms = 0;
    }
    
    // Result matrix    
    private static int result[][] = new int[cols][rows];
    private static int a[][] = new int[4][3];
    

    public void insertVal(int x,int y,int z){ 
        if(x< rows && y <cols){
            // Values row position       
            a[terms][0] = x;
            // Values column position
            a[terms][1] = y;
            // Value 
            a[terms][2] = z;
        }else{
            System.out.println("The position " + x + ",0" + y + " doesn't exisit.");
        }
    }

    public static void callTranspose(){      
      transposeMtx();        
      viewResultMtx();
    }

    private static void transposeMtx(){   
    // Number of entries in each column
        int Colsize[] = new int [cols+1];
        
        for (int i = 1; i <= cols; i++) {
            Colsize[i] = 0;
        }
        for (int i = 0; i < terms; i++) {
            Colsize[a[i][1]]++;
        }
    // The sum of rownext & colsize at that position
        int Rownext[] = new int [cols+1];

        Rownext[1] = 0;

        for (int i = 2; i < terms; i++) {
            Rownext[i] = Rownext[i-1] + Colsize[i-1];
        }

        for (int i = 0; i < terms; i++) {
            int j = Rownext[a[i][1]]++;

            result[j][0] = a[i][1];
            result[j][1] = a[i][0];
            result[j][2] = a[i][2];

            System.out.println(result[j][0]);
            System.out.println(result[j][1]);
            System.out.println(result[j][2]);
        }
    }


    // Prints out result matrix    
    private static void viewResultMtx(){
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}