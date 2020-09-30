/**
 * NestedForLoop
 * An example of a nested loop to display a times tables, usinf a for loop.
 */
public class NestedForLoop {
    public static void main(String[] args){

        for(int i=1; i<=12; i++){
            for(int j=0; j<=12; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.println("* * * * *");
        } 
        
    }
}