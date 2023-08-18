public class BmiService {
    public int calculate(double meter, int kg){
        double index = kg / (meter * meter);

        return (int) index;
    }
}
