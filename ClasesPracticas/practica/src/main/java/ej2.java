
import java.io.*;
public class ej2 {
    public static final java.util.Scanner teclado = new java.util.Scanner(System.in);
    public static final java.io.PrintStream pantalla = new java.io.PrintStream(System.out);

    public static void main(String[] args) throws FileNotFoundException, IOException {
        pantalla.println("Ingrese el nombre de un archivo (si es necesario, con su ruta)");
        pantalla.println("Por ejemplo: src/main/java/ejercicio2/Main.java");
        pantalla.print("Archivo: ");
        String nombreArchivo = teclado.nextLine();
        FileReader fileReader = new FileReader(nombreArchivo);
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
        String renglon;
        while ((renglon = lineNumberReader.readLine()) != null) {
            pantalla.printf("%3d) %s\n", lineNumberReader.getLineNumber(), renglon);
        }
    }
}