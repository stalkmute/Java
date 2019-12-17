package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame{
    JButton b1, b2;                                                                                                     //кнопки
    JLabel l1, l2;                                                                                                      //текст
    JTextField t1;                                                                                                      //окно ввода
    int i, k;
    String a, b;
    Lisoner lisoner = new Lisoner();

    public Window(String s){
        super(s);                                                                                                       //передача значения в супер клас (вроде как)
        setLayout(new FlowLayout());                                                                                    //установка раскладки
        b1= new JButton("Очистить");                                                                               //добавление кнопки
        b2= new JButton("Посчитать");                                                                              //добавление кнопки
        l1= new JLabel("Введите число");                                                                           //добавление текста
        l2= new JLabel(" ");                                                                                       //добавление пустой текстовой области ХЗ зачем
        t1= new JTextField(10);                                                                                //добавление окна для ввода (здесь будет выводиться овет)
        add(b1);                                                                                                        //это и неже добавление элементов на экнан в порядке написания
        add(b2);
        add(l1);
        add(t1);
        add(l2);
        b1.addActionListener(lisoner);                                                                                  //присвоение действия к кнопке
        b2.addActionListener(lisoner);                                                                                  //присвоение действия к кнопке
    }

    public class Lisoner implements ActionListener{                                                                     //implements это ключевое слово, предназначенное для реализации интерфейса (interface).
        public void actionPerformed(ActionEvent lololo) {
            try {                                                                                                       //конструкция try нужна для выявления исключение и написания Экзепштнов
                if (lololo.getSource()==b2){                                                                            //(дословно) если нажата кнопка два
                    i=Integer.parseInt(t1.getText());                                                                   //в переменную i присваивается значение введеное в t1 и конвертируется в int
                    i++;
                    a="Теперь твоё число "+i;                                                                          //в переменную А присваевается стринговое значение текста
                    l2.setText(a);                                                                                      //в l2 присваивается значение переменной А , которое потом мы увидем
                }

                if (lololo.getSource()==b1){                                                                            //(дословно) если нажата кнопка один
                    t1.setText(null);                                                                                   //очищается t1
                    l2.setText("");                                                                                     //очищается l2
                }
            }catch (Exception oshibka){ JOptionPane.showMessageDialog(null,"Нужно вводить числа!");} //выводин окошко с ошибкой , если в try произошло исключительная ситуация
        }
    }
}
