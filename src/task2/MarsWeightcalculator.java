public class Marsweightcalculator {

    String name ="Edirin";
    float earthweightOluku;
    float marsgravityOluku;
    float marsweightFloatOluku;
    float marsweightDoubleOluku;
    int marsweightIntOluku;
    char marsweightCharOluku;
    int finalIntOluku;

    public static void main(String[] args){
        Marsweightcalculator calc = new Marsweightcalculator();

        calc.earthweightOluku = 70.0f;
        calc.marsgravityOluku = 0.38f;

        System.out.println("Earth weight (float): " + calc.earthweightOluku);
        System.out.println("Mars gravity factor (float): " + calc.marsgravityOluku);

        calc.marsweightFloatOluku = calc.earthweightOluku * calc.marsgravityOluku;
        System.out.println("Mars weight (float): " + calc.marsweightIntOluku);

        calc.marsweightDoubleOluku = calc.marsweightFloatOluku;
        System.out.printf("Mars weight (double, 4 decimals): %.4f%n", calc.marsweightDoubleOluku);

        calc.marsweightIntOluku = (int) calc.marsweightDoubleOluku;
        System.out.println("Mars weight cast to int: " + calc.marsweightIntOluku);

        calc.marsweightCharOluku = (char) calc.marsweightDoubleOluku;
        System.out.println("Mars weight cast to char: " + calc.marsweightCharOluku);

        calc.finalIntOluku = calc.marsweightCharOluku + 5;
        System.out.println("char + 5 result stored in int: " + calc.finalIntOluku);
    }
}






