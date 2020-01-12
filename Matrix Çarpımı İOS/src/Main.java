import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException{
        //////////////////////////////////////////////////////////////////////// matrix 1 okuma yazma 
        File file = new File("matrix1.txt");
        Scanner giris1 = new Scanner(file);
        int X1 = giris1.nextInt();
        int Y1 = giris1.nextInt();
        int[][] matrix= new int[Y1][X1];
        System.out.println("X1 "+X1);
        System.out.println("Y1 "+Y1);
        int i,j;
        for(i=0; i<Y1; i++){
            for(j=0; j<X1; j++){
                matrix[i][j]=0;
            }
        }
        i=0;
        while(giris1.hasNextLine()){
            for(int a=0; a<2; a++){
                j=giris1.nextInt();
                matrix[i][j]=giris1.nextInt();
            } 
            i++;
        }
        System.out.println("Matrix 1:");
        for(i=0; i<Y1; i++){
            for(j=0; j<X1; j++){
                System.out.print(matrix[i][j]+" ");           
            }
            System.out.println();
        }
    //////////////////////////////////////////////////////////////////////////// matrix 2 okuma yazma
        File file2 = new File("matrix2.txt");
        Scanner giris2 = new Scanner(file2);
        int X2 = giris2.nextInt();
        int Y2 = giris2.nextInt();
        int[][] matrix2= new int[Y2][X2];
        System.out.println("X2 "+X2);
        System.out.println("Y2 "+Y2);
        int k,l;
        for(k=0; k<Y2; k++){
            for(l=0; l<X2; l++){
                matrix2[k][l]=0;
            }
        }
        k=0;
        l=0;
        while(giris2.hasNextLine()){
            for(int a=0; a<2; a++){
                l=giris2.nextInt();
                matrix2[k][l]=giris2.nextInt();
            } 
            k++;
        }
        System.out.println("Matrix 2:");
        for(k=0; k<Y2; k++){
            for(l=0; l<X2; l++){
                System.out.print(matrix2[k][l]+" ");           
            }
            System.out.println();
        }
    //////////////////////////////////////////////////////////////////////////// Matrix çarpımı için satır sütun sayısı konteolü
        if(Y2!=X1){
         System.out.println("Matrixlerin Sütun ve Satır Sayısını Yeniden Giriniz :");
         
        }
    //////////////////////////////////////////////////////////////////////////// matrix çarpımı ve yazma     
        int cpm = 0;
        System.out.println("Matrix Çarpımı :");
        for(i=0; i<Y1; i++){
          for(j=0; j<X2; j++){
              for(k=0; k<X1; k++){
                  cpm=cpm +(matrix[i][k]*matrix2[k][j]);
              }
              System.out.print(cpm+" ");
              cpm = 0;
          }
          System.out.println("");
        }      
        
    }
}
    
