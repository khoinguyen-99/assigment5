
package avegareprogram;


public class ArrayAndForLoops {

    
    public static void main(String[] args) {
        int [] numbers = new int[10];
        for (int i=0;i<8;i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        for(int i=0 ;i<8;i++) {
            numbers[i] = 2*1;
        }
    }
    
}
