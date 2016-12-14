package integralcalculatortrap;

public class IntegralCalculatorTrap { 
    public double a, b, n; 
    public double function(double x) {
        return Math.sin(x);
    }
    public IntegralCalculatorTrap() {
        a = 0;
        b = 2*Math.PI;
        n = 100;
    }
    
    public double integCalculator() {
        double sum = 0, h;
        h = (b - a)/n;
        while (a < b) {
            sum += (function(a)+function(a+h))/2*h;
            a += h;
        }
        sum = Math.round(sum*1000);
        return sum/1000;
    }
    

    public static void main(String[] args) {
        IntegralCalculatorTrap intCal = new IntegralCalculatorTrap();
        System.out.println(intCal.integCalculator());
    }
    
}
