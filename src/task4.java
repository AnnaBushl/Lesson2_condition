public class task4 {
    public static void main(String[] args) {
        int time = 1;
        int deliveryDistance = 60;    // интервал от [0;20] - 1 день; от (20;60] - 2 дня; от (60;100] - 3 дня
        if (deliveryDistance > 20){
            if (deliveryDistance > 60 && deliveryDistance <=100){
                time=time+2;
                System.out.println("Потребуется дней: " + time);
            }else {
                time=time+1;
                System.out.println("Потребуется дней: " + time);}

        }else System.out.println("Потребуется дней: " + time);

    }
}
