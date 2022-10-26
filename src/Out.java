public class Out {
    public String temp;
    Out(String[] Result){
        if ((Result[4].equals("RIM")) && (Result[5].equals("RIM"))){
            RIM rim = new RIM(Result);
            this.temp = rim.getTemp();
        }else {

            this.temp = Result[2];
        }
    }

    public String getTemp() {
        return temp;
    }
}
