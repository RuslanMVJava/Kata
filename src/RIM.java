public class RIM {

    RIM(String[] Result){
        int result = Integer.parseInt(Result[2]);
        int temp = 0;

        System.out.printf("Ответ: ");
        if ((result <= 10) && (result > 0)){
            out(result);
        } else if ((result > 10) && (result <= 30)) {
            for (int i = 0; i < 3; i++) {
                if (result >= 10) {
                    result = result - 10;
                }else {
                    temp = i;
                    break;
                }
            }
            System.out.printf("X".repeat(temp));
            out(result);
        } else if ((result >= 40) && (result < 50)) {
            System.out.printf("XL");
            result = result - 40;
            out(result);
        } else if ((result >= 50) && (result < 60)){
            System.out.printf("L");
            result = result - 50;
            out(result);
        } else if ((result >= 60) && (result<90)) {
            for (int i = 0; i < 4; i++) {
                if (result>=60){
                    result = result -10;
                }else {
                    temp = i;
                    result = result - 50;
                    break;
                }
            }
            System.out.printf("L" + "X".repeat(temp));
            out(result);
        } else if ((result >= 90) && (result < 100)) {
            System.out.printf("XC");
            result = result - 90;
            out(result);
        } else if (result >= 100) {
            System.out.printf("C");
            result = result - 100;
            out(result);
        }

    }
    public static void out(int result){
        String[] NumRim = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X","L","C",""};
        if (result == 0) {
            System.out.println(NumRim[12]);
        }else System.out.println(NumRim[result-1]);
        
        
    }
}
