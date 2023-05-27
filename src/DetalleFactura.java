import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Precio de la compra");
        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        }catch (NumberFormatException e){
            System.out.println("Error debe de ingresar un numero entero");
            main(args);
            System.exit(0);
        }

    }
}
