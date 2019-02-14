public class Operator {

    public final static  int ORANGE = 1;
    public final static  int MTN = 2;
    public final static  int NEXTTEL = 3;
    public final static  int UNKNOWN = -1;

    public int getOperator(String phoneNumber){

        // decision with 2 first caracteres

        if(phoneNumber.length() != 9){
            return UNKNOWN;
        }

        if(phoneNumber.startsWith("69")){
            return  ORANGE;
        }else if(phoneNumber.startsWith("67")){
            return MTN;
        }else if(phoneNumber.startsWith("66")){
            return NEXTTEL;
        }else if(phoneNumber.startsWith("650") || phoneNumber.startsWith("651") || phoneNumber.startsWith("652") ||
            phoneNumber.startsWith("653") || phoneNumber.startsWith("654") || phoneNumber.startsWith("680") ||
                phoneNumber.startsWith("681") || phoneNumber.startsWith("682") || phoneNumber.startsWith("683")){
            return MTN;
        }else if(phoneNumber.startsWith("655") || phoneNumber.startsWith("656") || phoneNumber.startsWith("657") ||
                phoneNumber.startsWith("658") || phoneNumber.startsWith("659")
        ){
            return ORANGE;
        }else if(phoneNumber.startsWith("685")){
            return NEXTTEL;
        }

        return  UNKNOWN;
    }
}
