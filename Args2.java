package com.company;

public class Args2 {
    public static void args2(){
        int[][]args={{1,2,3},{4,5},{6,7,8,9}};  //инициальзация многомерного массива

        for (int row=0; row<args.length;row++){                   //цикл for идущий по столбцам,  .length-длина (массива)
            for (int col=0; col<args[row].length;col++){            //цикл for идущий по строкам
                System.out.print(args[row][col]);                       // выводит текущюю ячейку
            }
            System.out.println();                                       //перевод на новую строку для разделения строк и столбцов
        }

    }
}
