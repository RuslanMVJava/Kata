public class Out {
    Out(String[] Result){
        if ((Result[4].equals("RIM")) && (Result[5].equals("RIM"))){
            RIM rim = new RIM(Result);
        }else System.out.println("Ответ: " + Result[2]);
    }
}
