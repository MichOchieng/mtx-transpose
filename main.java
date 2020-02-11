
public class main{    
    private static int arr1[][] = new int[10000][10000];
    private static int arr2[][] = new int[10000][10000];

    public static void main(String[] args){
        transpose t = new transpose(4, 4);
        transpose t1 = new transpose(5, 5);
        transpose t2 = new transpose(6, 6);
        transpose t3 = new transpose(10000, 10000);        
        // ---4x4 Mtx
        // t.insertVal(0,0,4);
        // t.insertVal(1,0,4);
        // t.insertVal(2,2,3);
        // t.insertVal(3,0,5);
        // ---5x5 Mtx
        // t1.insertVal(0,2,1);
        // t1.insertVal(1,1,2);
        // t1.insertVal(2,3,11);
        // t1.insertVal(3,2,10);
        // ---6x6 Mtx
        // t2.insertVal(1,3,3);
        // t2.insertVal(3,0,2);
        // t2.insertVal(4,4,1);
        
        // t.callTranspose();
        // t1.callTranspose();
        // t2.callTranspose();
        /*
        t result:
            4 4 0 5     Row Column Value
            0 0 0 0     0   0      4 
            0 0 3 0     0   1      4 
            0 0 0 0     0   3      5 
                        2   2      3             
        t1 result:
            0  0  0  0  0   Row Column Value 
            0  2  0  0  0   1   1      2
            1  0  0 10  0   2   0      1
            0  0 11  0  0   2   3      10
            0  0  0  0  0   3   2      11        
        t2 result:
            0 0 0 2 0 0 0   Row Column Value
            0 0 0 0 0 0 0   0   3      2 
            0 0 0 0 0 0 0   3   1      3 
            0 3 0 0 0 0 0   4   4      1 
            0 0 0 0 1 0 0 
            0 0 0 0 0 0 0
        */
        t3.insertVal(0,0,4);
        t3.insertVal(1,0,4);
        t3.insertVal(2,2,3);
        t3.insertVal(3,0,5);
        long startTime = System.currentTimeMillis();
        t3.callTranspose();
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Time elapsed for fast transpose: "+duration+"ms.");

        arr1[50][0] = 4;
        arr1[1][90] = 4;
        arr1[20][2] = 3;
        arr1[300][0] = 5;
        long startTime2 = System.currentTimeMillis();
        slowTranspose();
        long endTime2 = System.currentTimeMillis();
        long duration2 = (endTime2 - startTime2);
        System.out.println("Time elapsed for slow transpose: "+duration2+"ms.");
        // cuckoo c = new cuckoo(11);
        // Test for adding values
        // c.add(3);
        // c.add(5);
        // c.add(16);
        // c.add(27);
        // c.add(38); 
        // c.add(33); 
        // c.add(49);   
        // c.add(44); 
        // c.add(133); 
        // Rehash test
        // c.add(121);
        // Deletion test  
        // c.evict(121); 
        // c.evict(3000);
        // Lookup test
        // c.lookup(44);
        // c.lookup(3000);       
    }

    // Unoptimized transpose for sparse matrices
    private static void slowTranspose(){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j] = arr1[j][i];
            }
        }
    }

}