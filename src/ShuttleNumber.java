public class ShuttleNumber {
    public static void main (String [] args){
        int shuttleNumber = 1;
        for (int i = 0; i < 100; i++) {
            if(shuttleNumber %10 == 4 || shuttleNumber %10 ==9){
                shuttleNumber ++;
            }

            if (shuttleNumber /10%10 ==4 || shuttleNumber / 10%10 ==9){
                shuttleNumber +=10;
            }

            System.out.println(shuttleNumber);
            shuttleNumber ++;
        }

    }
}
