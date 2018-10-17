import java.io.IOException;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) throws IOException {

        System.out.printf("Щука Богдан ИПЗ-33"+'\n');
        System.out.printf("Enter array size:");

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Value = "+n);

        double[][]arr1 = new double[n][n];
        double[][]arr2 = new double[n][n];



        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++){
                arr1[i][j] = Math.random()*20;
            }
        }

        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++){
                arr2[n-1-j][i] = arr1[i][j];
            }
        }

        System.out.print("Начальная матрица:" + '\n');
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.print('\n');
        }

        System.out.print("Повернутая матрица:" + '\n');
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.print('\n');
        }

    }
}