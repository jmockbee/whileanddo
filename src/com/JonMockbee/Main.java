package com.JonMockbee;

public class Main {

    public static void main(String[] args) {
//	 int count = 1;
//             while(count!=6){
//                 System.out.println(" count value is " + count);
//                 count++;
//             }
//
////         count = 1;
////
////             while (true){
////                 if( count == 6) {
////                     break;
////
////                 }
////
////                 System.out.println(" count value is " + count);
////                 count++;
////             }
////
//
//        count = 6;
//do {
//    System.out.println(" count value again is " + count);
//    count++;
////prevents infinite loop with a break
//    if (count >100) {
//        break;
//    }
//} while(count !=6);

//        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

//        int number =4;
//        int finishnumber =20;
//        while (number <= finishnumber){
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("even number"+number);
//        }
//    }













        int number =4;
        int finishnumber =20;
        int evenNumbersfound = 0;

            while (number <= finishnumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
                System.out.println("even number"+number);
            evenNumbersfound++;
            if (evenNumbersfound >=5){
                break;
            }

            }
        System.out.println("total even numbers found =" + evenNumbersfound);
    }
        public static boolean isEvenNumber ( int number){
            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }


    }
}



