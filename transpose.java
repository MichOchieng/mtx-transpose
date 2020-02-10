import java.util.Arrays;

public class transpose{  

    private static int rows;
    private static int cols;
    private static int terms;
    // Holds values and their positions
    private static int a[][]; 
    public transpose(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.terms = 0;
        a = new int[rows*cols][3];
    }
    
    // Result matrix    
    private static int result[][];
    
    

    public void insertVal(int x,int y,int z){ 
        if(x< rows && y <cols){
            // Values row position       
            a[terms][0] = x;
            // Values column position
            a[terms][1] = y;
            // Value 
            a[terms][2] = z;
            terms++;
        }else{
            System.out.println("The position (" + x + "," + y + ") doesn't exisit.");
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

        for (int i = 2; i <= cols; i++) {
            Rownext[i] = Rownext[i-1] + Colsize[i-1];            
        }

        result = new int[cols][rows];

        for (int i = 0; i < terms; i++) {
            int j = Rownext[a[i][1]]++;
            // Transposing row => col then col => row
            result[a[i][1]][a[i][0]] = a[i][2];            
        }
    }


    // private static void slowTranspose(){
    //     for (int i = 0; i < result.length; i++) {
    //         for (int j = 0; j < result.length; j++) {
                
    //         }            
    //     }
    // }

    // Prints out result matrix    
    private static void viewResultMtx(){
        System.out.println("Transposed matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}