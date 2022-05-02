public class task3 {
    public static void main(String[] args) {
        int year = 2021;// первый вариант решения
        if ((year%4 == 0 && year%100!=0) || year%400==0 ){
            System.out.println(year + " год является високосным.");
        }else System.out.println(year + " год не является високосным.");
/*
        int year = 2021;// второй вариант решения
        if (year%4 == 0 ){
            if (year%100 == 0){
               if (year%400 == 0){
                   System.out.println(year + " год является високосным.");
               }else System.out.println(year + " год не является високосным.");
           }else System.out.println(year + " год является високосным.");
        }else System.out.println(year + " год не является високосным.");
*/
    }
}
