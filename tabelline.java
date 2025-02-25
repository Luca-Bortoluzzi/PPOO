import java.util.Scanner;
public class tabelline {

    public static void stampa_tabellina(int[][] matr){
        for(int i=0; i<10; i++){
            System.out.println(matr[i][0] + " " + matr[i][1] + " " + matr[i][2] + " " + matr[i][3]+ " " + matr[i][4] + " " +
            matr[i][5] + " " + matr[i][6] + " " + matr[i][7] + " " + matr[i][8] + " " + matr[i][9]);
        }
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int[][] matr = new int[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                matr[i][j] = (i+1)*(j+1);
            }
        }
        stampa_tabellina(matr);
        int n1;
        int n2;

        do{
        System.out.println("Inserire 2 numeri:");
        n1 = myObj.nextInt();
        n2 = myObj.nextInt();
        } while(n1 > 10 || n2 > 10);

        int prod = matr[n1-1][n2-1];
        System.out.println("prod = " + prod);
    }
}