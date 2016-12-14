package integralcalculator;

public class IntegralCalculator { 
    public double a, b, n; 
    public double function(double x) {
        return Math.sin(x);
    }
    public IntegralCalculator() {
        a = 0;
        b = Math.PI;
        n = 100;
    }
    
    public double integCalculator() {
        double sum = 0, h;
        h = (b - a)/n;
        while (a <= b) {
            sum += function(a)*h;
            a += h;
        }
        sum = Math.round(sum*1000);
        return sum/1000;
    }
    

    public static void main(String[] args) {
        IntegralCalculator intCal = new IntegralCalculator();
        System.out.println(intCal.integCalculator());
    }
    
}
