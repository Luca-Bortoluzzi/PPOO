import java.util.Scanner;

public class Array2DMetodiIntES {

    public static void search_num(int[][] a, int e){
        boolean found = false;
         for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] == e){
                    found = true;
                }
            }
        }
        System.out.println(found);
    }

    public static void search_max(int[][] a){
        int max = a[0][0];
         for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("num max: " + max);
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("num rows: ");
        int dim_r = myObj.nextInt();
        System.out.println("num cols: ");
        int dim_c = myObj.nextInt();

        int[][] a = new int[dim_r][dim_c];
        System.out.println("valori arr bidim:");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = myObj.nextInt();
            }
        }
        System.out.println("num da cercare: ");
        int e = myObj.nextInt(); 
        search_num(a, e);
        search_max(a);
    }
}