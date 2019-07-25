public class Counter1 {
    public static void main(String[] args) {
        double number=0;

        do{
            System.out.printf("%.1f, ", number);
            number=number+0.1;
        }while(number<=3.0);
        System.out.println("3.0");
    }
}
