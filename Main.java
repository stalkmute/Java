package com.company;

import javax.swing.*;

public class Main {																										// главный класс


    public static void main(String[] args) {                                                                            //исполняемый метод
		/*//никуда не портировано
		//Я пытался портировать это дерьмо в другой класс, но он начал запрашивать создание surer s  переменной, после создания, было вводить передаваемый параметр при инициализации классс ииии   я забил...

		Window window = new Window("Окошко-кокошко");                                              		                //инициализация класса наследника
		window.setVisible(true);                                                                                        //для того что бы окно из Window было видно
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                          //что бы окно можно было закрыть крестиком
		window.setSize(300, 200);                                                                         				// установка параметров окна
		window.setResizable(false);                                                                                     //запрещаем изменение размера окна
		window.setLocationRelativeTo(null);                                                                             //размещение окна по центру
    	 */

		/* //это было реализовано через класс PodClass
		Args mass =new Args();
		System.out.println(mass.massivMetod(5));																		//Выводим результат работы метода massivMetod, 5 - это будет 6 элемент массива (нумерация с нуля)
		 */

		PodClass podclass = new PodClass();
		podclass.podClass2();

		PodClass2 podclass3 = new PodClass2();
		podclass3.podClass2();

		/* Инициализация и реализация класса который просто выводит многомерный массив
		Args2 args2 = new Args2();
		args2.args2();

		 */
/* 										//было перенесено в класс PodClass
//	Unter unter = new Unter(); 																							//инициализация класса наследника
	//unter.dick(); 																									//вызов метода dick из класса Unter
	unter.dick2();																										// вызов метода dick2 из класса Unter, делает тоже самое что и dick, но в окнонном режиме
	unter.spik(); 																										//вызов метода spik из класса Unter
	unter.kapusta(); 																									//вызов абстрактного метода kapusta из класса Unter (AbstractTest)
	unter.x=biba(unter.x);																								//присваивает переменной Х значение полученное в методе biba
	//unter.say();																										//вызов метода say из класса Unter
	unter.say2();																										// вызов метода say2 из класса Unter, делает тоже самое что и say, но в окнонном режиме
    }				//если захочешь раскоментить то нужно будет убрать скобку в конце

    private static int biba(int x){
    	x=x+1;
    	return x;
	}
*/
	}
}
