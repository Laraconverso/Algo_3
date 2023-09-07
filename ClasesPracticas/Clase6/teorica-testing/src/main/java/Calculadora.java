public class Calculadora {
    public Calculadora() {

    }

    public int calcularFactorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
