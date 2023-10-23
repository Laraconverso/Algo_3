public class CajaDeAhorro {
    private int pesos;
    private  int centavos;

    public CajaDeAhorro(){
        pesos = 0;
        centavos = 0;
    }

    public int getPesos() {
        return pesos;
    }

    public int getCentavos() {
        return centavos;
    }

    public void depositar(int pesos, int centavos){
        if (pesos < 0 || centavos < 0) {
            System.out.println("No se pueden depositar valores negativos.");
        } else {
            // Suma los pesos y los centavos del depósito a los existentes
            this.pesos += pesos;
            this.centavos += centavos;

            // Si los centavos superan 99, se convierten en pesos
            if (this.centavos >= 100) {
                int extraPesos = this.centavos / 100;
                this.centavos = centavos % 100;
                this.pesos += extraPesos;
            }
        }
    }

    public void extraer(int pesos, int centavos) {
        if (pesos < 0 || centavos < 0) {
            System.out.println("No se pueden extraer valores negativos.");
        } else if (pesos > this.pesos || (pesos == this.pesos && centavos > this.centavos)) {
            System.out.println("No hay suficiente saldo para realizar la extracción.");
        } else {
            // Resta los pesos y los centavos del retiro a los existentes
            this.pesos -= pesos;
            this.centavos -= centavos;

            // Ajusta los centavos si son negativos
            if (this.centavos < 0) {
                this.centavos += 100;
                this.pesos--;
            }
        }
    }
}
