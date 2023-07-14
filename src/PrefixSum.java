import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=scanner.nextInt();
        int array[]=new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        int p[]=Prefix(size,array);
        for(int i=0;i<size;i++)
        {
            System.out.print(p[i]+" ");
        }
    }
    public static int[] Prefix(int size,int array[]) {
        int p[] = new int[size];
        p[0] = array[0];
        for (int i = 1; i < size; i++) {
            p[i] = p[i - 1] + array[i];
        }
        return p;

    }
}
