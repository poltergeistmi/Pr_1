package Pr_1;

public class Main {

    public static void main(String[] args) {
    float[][] matrix = new float[5][5]; //инициализация матрицы
        System.out.println("Кишенец А.С." + "\n");//Вывод фамилии и инициалов
         for(int i = 0; i<5; i++){ //заполнение матрицы и вывод её на экран
             for(int j=0; j<5; j++){
                 matrix[i][j] = (float)(Math.random()*100);
                 System.out.printf("%.2f",matrix[i][j]);
                 System.out.print("\t");
             }
             System.out.println();
         } //конец заполения матрицы и вывода её на экран
    System.out.println();
         float z2 = 0;
        for(int i = 0; i<5; i++){//циклический сдвиг матрицы вправо
            float z1 = matrix[i][0];
            for(int j = 0; j<4; j++){
                z2 = matrix[i][j+1];
                matrix[i][j+1] = z1;
                z1 = z2;
            }
            matrix[i][0] = z2;
        }//конец цикла
        for (int i1 = 0; i1<5; i1++){ //Начало вывода конечной матрицы
            for(int j1 =0; j1<5; j1++){
                System.out.printf("%.2f",matrix[i1][j1]);
                System.out.print("\t");
            }
            System.out.println();
        }//Конец вывода конечной матрицы
    }
}
