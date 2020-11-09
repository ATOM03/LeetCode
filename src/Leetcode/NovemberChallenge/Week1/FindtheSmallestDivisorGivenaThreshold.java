package Leetcode.NovemberChallenge.Week1;
import java.util.Scanner;

public class FindtheSmallestDivisorGivenaThreshold {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[]=new int[N];
        for (int i = 0; i <N ; i++) {
            ar[i]=sc.nextInt();
        }
        int threshold=sc.nextInt();
        System.out.println(smallest(ar,threshold));
    }

    private static int smallest(int[] ar, int threshold) {
        int smallest=Integer.MAX_VALUE;
        int i=1;
        while(i<=threshold){
            int temp[]=ar;
            int sum=0;
            for (int j = 0; j < ar.length; j++) {
                temp[j]=(int)Math.ceil(temp[j]/i);
                sum+=temp[j];
            }
            smallest=Math.min(smallest,sum);
            i++;
        }
        return smallest;
    }
}
