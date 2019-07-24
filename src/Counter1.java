public class Counter1 {
    public static void main(String[] args) {
        double number=0;

        do{
            System.out.printf("%.1f\n", number);
            number=number+0.1;
        }while(number<=3.1);
    }
}
