package com.company;

public class PodClass extends Unter{

    public static void podClass() {
        Unter unter = new Unter();                                                                                      //инициализация класса наследника
        //unter.dick(); 																								//вызов метода dick из класса Unter
        unter.dick2();                                                                                                  // вызов метода dick2 из класса Unter, делает тоже самое что и dick, но в окнонном режиме
        unter.spik();                                                                                                   //вызов метода spik из класса Unter
        unter.kapusta();                                                                                                //вызов абстрактного метода kapusta из класса Unter (AbstractTest)
        unter.x = biba(unter.x);                                                                                        //присваивает переменной Х значение полученное в методе biba
        //unter.say();																									//вызов метода say из класса Unter
        unter.say2();                                                                                                   // вызов метода say2 из класса Unter, делает тоже самое что и say, но в окнонном режиме
        unter.x = massivMetod3(unter.x);
    }

    private static int biba(int x){                                                                                     // метод который прибавляет 1
        x=x+1;
        return x;
    }

    //тот же метод podClass ,но без лишней шелухе
    public static void podClass2() {
        Unter unter = new Unter();                                                                                      //инициализация класса наследника
        unter.dick2();                                                                                                  // вызов метода dick2 из класса Unter, делает тоже самое что и dick, но в окнонном режиме
        unter.say2();                                                                                                   // вызов метода say2 из класса Unter, делает тоже самое что и say, но в окнонном режиме
        unter.x = massivMetod3(unter.x);
    }

    //Раньше находился в классе Args
    public static int massivMetod3(int x){                  //int метод принимает значение
        int[] massiv = new int[x+1];                //создаём массив на 1 больше передоного значяения , то будет переполнение массива
        for (int i=0; i<=x; i++){                   // ставим <=, если будет < , то последняя операция не выполница
            massiv[x]=i;                            //присваиваем i-тому элементу массива, i-тое значение
        }
        return massiv[x];                           //возвращаем значение
    }
}