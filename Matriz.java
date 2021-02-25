import java.util.Scanner;
public class Matriz {
    public static void main (String args[]) {
        Scanner sc= new Scanner (System.in);

        int matriz[][][]= new int [3][3][3];

        System.out.println ("Ingrese los elementos de la MATRIZ");

        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                for (int h=0; h < 3; h++) {
                    System.out.print ("matriz[" +i+ "][" +j+ "][" +h+ "]= ");
                    matriz[i][j][h]= sc.nextInt();

                }
            }
        }

            System.out.println ("M A T R I Z");
        for (int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                for (int h=0; h <matriz[j].length; h++) {

                    System.out.print (matriz[i][j][h] +" ");
                }
            }
            System.out.println ();
        }

    }
    
}