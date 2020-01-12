import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
      
      int x,y,i,j,k,cpm = 0; 
      Scanner giris = new Scanner(System.in);
      System.out.println("1.Matrixin Sütun ve Satır Sayısını Giriniz :");
      int X1 = giris.nextInt();
      int Y1 = giris.nextInt();
      int[][] matrix1= new int[Y1][X1];
      System.out.println("2.Matrixin Sütun ve Satır Sayısını Giriniz :");
      int X2 = giris.nextInt();
      int Y2 = giris.nextInt();
      int[][] matrix2= new int[Y2][X2];
      
      while(Y2!=X1){
         System.out.println("1.Matrixin Sütun ve Satır Sayısını Yeniden Giriniz :");
         X1 = giris.nextInt();
         Y1 = giris.nextInt(); 
         System.out.println("2.Matrixin Sütun ve Satır Sayısını Yeniden Giriniz :");
         X2 = giris.nextInt();
         Y2 = giris.nextInt();
        }
      
      for(y=0; y<Y1; y++){
          for(x=0; x<X1; x++){
              System.out.println("Matrix1["+y+"]["+x+"]");
              matrix1[y][x] = giris.nextInt();
            }
        }
      
      for(y=0; y<Y2; y++){
          for(x=0; x<X2; x++){
              System.out.println("Matrix2["+y+"]["+x+"]");
              matrix2[y][x] = giris.nextInt();
            }
        }
      
      for(i=0; i<Y1; i++){
          for(j=0; j<X2; j++){
              for(k=0; k<X1; k++){
                  cpm=cpm +(matrix1[i][k]*matrix2[k][j]);
              }
              System.out.print(cpm+" ");
              cpm = 0;
          }
          System.out.println("");
      }      
    }
    
}
