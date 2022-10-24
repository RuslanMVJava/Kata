public class Split {
    Split(String Line) throws Exceptions {
        String[] Result = new String[6];

        String[] mass = new String[]{"-","/","\\+","\\*"};
        String[] Array = new String[3];
        int temp = -1;

        //*Цикл. разделяет строку и добавляет в массив.
        for (int i = 0; i < 4; i++) {
            Array = Line.split(mass[i]);

            if (Array.length == 2){
                temp = i;
                break;
            }
            else if (Array.length > 2) {
                throw new Exceptions("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }
        if (temp == -1){
            throw new Exceptions("throws Exception //т.к. строка не является математической операцией");
        }
        //*Цикл. Переписывает числа в массив результат.
        for (int i = 0; i < 2; i++) {

            String Trim = Array[i].trim();
            Result[i] = Trim;
        }
        //*Условие. Определяю знак и записываю его в результат
        if (temp == 0) {
            Result[3] = mass[0];
        }
        else if (temp == 1) {
            Result[3] = mass[1];
        }
        else if (temp == 2) {
            Result[3] = "+";
        }
        else if (temp == 3) {
            Result[3] = "*";
        }
        Calc calc = new Calc(Result);

    }
}
