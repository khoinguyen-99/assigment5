package avegareprogram;


import java.util.Scanner;


public class arrayparameter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so luong mang");
        int so = scanner.nextInt();
        int[]numbers =new int[so];
        
        for (int i=0;i<numbers.length;i++) {
            System.out.print("nhap so thu"+(i+1)+"la:");
            numbers[i]=scanner.nextInt();
            
            
        }
        double average =Average(numbers);     
        System.out.println("average"+ average);
    }
    public static double Average(int[]numbers) {
        int sum=0;
        for (int i=0;i<numbers.length;i++) {
            sum+=numbers[i];
            
        }
        return (double)sum/numbers.length;
    }
}
