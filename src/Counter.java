public class Counter {
    public static void main(String[] args) {
        double number=0;
        while(number<3.0){
            System.out.printf("%.1f, ", number);
            number=number+0.1;
        }
        System.out.println("3.0");
    }
}

