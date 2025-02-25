import java.util.Scanner;

public class ArrayMetodiIntES {

    public static void search_num(int[] a, int e){
        boolean found = false;
        for(int i = 0; i < a.length && !found; i++){
            if(a[i] == e){
                found = true;
            }
        }
        System.out.println(found);
    }

    public static void search_max(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Val max: " + max);
    }


    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("dim arr: ");
        int dim = myObj.nextInt();

        int[] a = new int[dim];
        System.out.println("valori arr:");
        for(int i = 0; i < a.length; i++){
            a[i] = myObj.nextInt();
        }
        System.out.println("num da cercare: ");
        int e = myObj.nextInt(); 
        search_num(a, e);
        search_max(a);
    }
}