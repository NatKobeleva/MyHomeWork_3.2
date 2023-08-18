public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        int myBMI = bmi.calculate(1.87, 98);
        System.out.println(myBMI);
    }

}
