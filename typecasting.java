/*TYPE CONVERSION AND TYPE CASTING*/
/*TYPE CONVERSION: EXPLICITLY DOESNT NEED TO CHANGE THE DATATYPE BY CASTING.LETS SAY AN INT a and byte b then a = b doesnt give us 
 error. 
 
 TYPE CASTING: casting the tyoe we want to convert it into is reffered to as type casting.examples are given below*/

class hi{
    public static void main(String s[]){
        byte b = 124;
        int a = 500;
        byte k = (byte)a;
        


    float f = 5.6f;
    int t = (int) f;
        System.out.println(t);
        System.out.println(k);

    }
}
