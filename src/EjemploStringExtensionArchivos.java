public class EjemploStringExtensionArchivos {
    public static void main(String[] args) {

        String archivo = "alguna_imagen.png";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
        




    }

}
