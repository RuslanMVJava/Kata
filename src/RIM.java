public class RIM {
    public String temp = "";

    RIM(String[] Result){
        int result = Integer.parseInt(Result[2]);
        int temp = 0;


        if ((result <= 10) && (result > 0)){
            out(result);
        } else if ((result > 10) && (result < 40)) {
            for (int i = 0; i < 4; i++) {
                if (result >= 10) {
                    result = result - 10;
                    temp = i;
                }else {
                    temp = i;
                    break;
                }
            }

            this.temp = "X".repeat(temp);
            out(result);
        } else if ((result >= 40) && (result < 50)) {

            this.temp = "XL";
            result = result - 40;
            out(result);
        } else if ((result >= 50) && (result < 60)){

            this.temp = "L";
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

            this.temp = "L"+"X".repeat(temp);
            out(result);
        } else if ((result >= 90) && (result < 100)) {

            this.temp = "XC";
            result = result - 90;
            out(result);
        } else if (result >= 100) {

            this.temp = "C";
            result = result - 100;
            out(result);
        }

    }
    public void out(int result){
        String[] NumRim = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X","L","C",""};
        if (result == 0) {

            this.temp = this.temp + NumRim[12];
        }else {
            this.temp = this.temp + NumRim[result - 1];

        }
        
        
    }

    public String getTemp() {
        return temp;
    }
}
