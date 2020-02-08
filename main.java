import java.util.*;


public class main{    
    public static void main(String[] args){
        transpose t = new transpose(5, 5);

        t.insertVal(0,0,4);
        t.insertVal(1,0,4);
        t.insertVal(2,2,3);
        t.insertVal(4,0,4);

        t.callTranspose();
    }

}