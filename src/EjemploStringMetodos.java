public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Mauricio";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toUpperCase() " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Mauricio\")" + nombre.equals("Mauricio"));
        System.out.println("nombre.equals(\"mauricio\")" + nombre.equals("mauricio"));
        System.out.println("nombre.equalsIgnoreCase(\"mauricio\")" + nombre.equalsIgnoreCase("mauricio"));
        System.out.println("nombre.compareto(\"Mauricio\") = " + nombre.compareTo("Mauricio"));
        System.out.println("nombre.compareto(\"Maria\") = " + nombre.compareTo("Maria"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(a) = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('t') = " + trabalenguas.lastIndexOf('t'));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas  " );
        System.out.println(" trabalenguas  ".trim() );
    }
}
