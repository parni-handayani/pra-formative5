import java.util.Scanner;
import java.util.logging.*;

public class LoggerTesting {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerTesting.class.getName());
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            Integer inputAngka1 = Integer.parseInt(scanner.next());

            System.out.print("Masukkan angka kedua: ");
            Integer inputAngka2 = Integer.parseInt(scanner.next());

            if (inputAngka2 == 0) {
                throw new ArithmeticException("Pembagian dengan nol tidak diizinkan");
            }

            Integer hasil = inputAngka1 / inputAngka2;
            System.out.println("Hasil: " + hasil);
            logger.info("Hello INFO logger" + logger.getName());

        } catch (java.lang.NumberFormatException e) {
            logger.log(Level.SEVERE, "Error: " + e);
            logger.severe("Hello SEVERE " + logger.getName());
            logger.info("Hello INFO logger" + logger.getName());

        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Error: " + e);
            logger.severe("Hello SEVERE " + logger.getName());
            logger.info("Hello INFO logger" + logger.getName());
        }
    }
}