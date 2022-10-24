import java.io.IOException;

public class Check {
    public String[] Result = new String[4];
    //Этот массив будет содержать
    // 1)число а
    // 2)число b
    // 3)Римское или Арабское число а
    // 4)Для b

    Check(String[] Result) throws Exceptions {
        String[] Num = new String[]{"1","2","3","4","5","6","7","8","9","10"};
        String[] NumRim = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        //*Проверка условий.

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (Result[i].equals(Num[j])){
                    this.Result[i] = Result[i];
                    this.Result[i+2] = "Arab";
                    break;
                    }
                }
            }
        if ((this.Result[2] != "Arab") || (this.Result[3] != "Arab")){

            //*Проверка условий.Римские цифры

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 10; j++) {
                    if (Result[i].equalsIgnoreCase(NumRim[j])){
                        this.Result[i] = Num[j];
                        this.Result[i+2] = "RIM";
                        break;
                        }
                    }
                }
            if (this.Result[0]== null || (this.Result[1] == null)){
                throw new Exceptions("throws Exception //т.к. одно из чисел не подходит по условию задания");
            }
                if (((this.Result[2].equals("RIM")) && (this.Result[3].equals("Arab"))) || ((this.Result[2].equals("Arab")) && (this.Result[3].equals("RIM")))){
                    throw new Exceptions("throws Exception //т.к. используются одновременно разные системы счисления");
                }
                int t0 = Integer.parseInt(this.Result[0]);
                int t1 = Integer.parseInt(this.Result[1]);

            if (((this.Result[2].equals("RIM")) && (this.Result[3].equals("RIM"))) && ((t0 < t1)&& Result[3].equals("-"))) {
                    throw new Exceptions("throws Exception //т.к. в римской системе нет отрицательных чисел");
                }
            }
        //*
        }
    public String[] getResult() {
        return Result;
    }
}
