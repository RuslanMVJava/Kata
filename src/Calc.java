import java.lang.reflect.Array;

public class Calc {
    Calc(String[] Result) throws Exceptions {
        String[] mass = new String[]{"-","/","+","*"};
//        String[] Num = new String[]{"1","2","3","5","6","7","8","9","10"};

//        //*Проверка условий.
//        boolean a = false;
//        boolean b = false;
//        for (int i = 0; i < 9; i++) {
//            if (Result[0].equals(Num[i])){
//                a = true;
//                break;
//            }
//        }
//        for (int i = 0; i < 9; i++) {
//            if (Result[1].equals(Num[i])){
//                b = true;
//                break;
//            }
//        }
//        if ((a == false) || (b == false)){
//            System.out.println("Исключение");
//        }
//        //*
        Check check = new Check(Result);
        String[] tempArray = check.getResult();

        Result[0] = tempArray[0];
        Result[1] = tempArray[1];
        Result[4] = tempArray[2];
        Result[5] = tempArray[3];

        //* Условие. Выполняется действие в зависемости от знака и ответ записывается в результат
        if (Result[3].equals(mass[0])){
            int temp = Integer.parseInt(Result[0]) - Integer.parseInt(Result[1]);
            Result[2] = String.valueOf(temp);
        } else if (Result[3].equals(mass[1])) {
            int temp = Integer.parseInt(Result[0]) / Integer.parseInt(Result[1]);
            Result[2] = String.valueOf(temp);
        }else if (Result[3].equals(mass[2])) {
            int temp = Integer.parseInt(Result[0]) + Integer.parseInt(Result[1]);
            Result[2] = String.valueOf(temp);
        }else if (Result[3].equals(mass[3])) {
            int temp = Integer.parseInt(Result[0]) * Integer.parseInt(Result[1]);
            Result[2] = String.valueOf(temp);
        }
        //*
        Out out = new Out(Result);
    }
}
