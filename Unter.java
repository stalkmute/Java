package com.company;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Unter extends AbstractTest{
    int x;
    String s;

    public void spik(){ System.out.println("Yooooou!"); }                                                         // выводит Yooooou!

    @Override
    public void kapusta() { System.out.println(x+" Okayyyy(("); }                                                    // выводит значение переменной Х и  " Okayyyy(("

    public void dick(){                                                                                                 // присваивает в Х введённое значение в консоль
        System.out.println("Введи число");
        Scanner scn = new Scanner(System.in);
        x= scn.nextInt();
    }
    public void say(){System.out.println("Поздравляю получилось "+ x +" похлопаем"); }                              // выводит значение переменной Х и  "Поздравляю получилось "+ Значение Х +" похлопаем"

    public void dick2(){                                                                                                //появляется диалоговое окно с текстом и ячейкой для ввода
        s= JOptionPane.showInputDialog("Введи число ");
        x=Integer.parseInt(s);
    }
    public void say2(){                                                                                                 // появляется окно с текстом ( почему вначале пишется null хз)
        JOptionPane.showMessageDialog(null,"Поздравляю получилось "+ x +" похлопаем");
    }

}
