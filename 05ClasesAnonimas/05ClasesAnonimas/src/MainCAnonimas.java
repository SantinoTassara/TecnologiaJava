import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainCAnonimas {
    public static void main(String[] args) {
        // se crea lista y se le agrega elemento con list.of()
        List<String> palabras1 = List.of("hola", "jajaja", "Ay", "Cocodrilo", "Huevo Acuña", "Messi");

        // lista modificable
        List<String> palabras = new ArrayList<String>(palabras1);

        // se crea el comparador
        Comparator<String> cantLetras = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        // Ordena la lista por cant de letras
        palabras.sort(cantLetras);

        System.out.println("---------- Comparator: Cantidad Letras ----------");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Creamos un comparador pero que su orden este invertido
        Comparator<String> cantLetrasInvertido = cantLetras.reversed();

        palabras.sort(cantLetrasInvertido);

        System.out.println("---------- Comparator: Cantidad Letras INVERTIDO ----------");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        // El código de la clase anónima generada sería equivalente a algo como esto
        Comparator<String> cantLetrasInvertido_2 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() - o2.length()) * -1;
            }
        };

        // Vamos a usar en nuevo criterio
        palabras.sort(cantLetrasInvertido_2);

        System.out.println("---------- Comparator: Cantidad Letras INVERTIDO CLASE ANONIMA ----------");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // ---------------------------- FUNCTION ----------------------------//

        // Creamos la clase anonima con la interfaz Function
        Function<String, Integer> cuantasLetras = new Function<String, Integer>() {

            @Override
            public Integer apply(String t) {
                // Me devuelve la cantidad de letras que tiene el String
                return t.length();
            }
        };

        // Utilizamos la interfaz
        System.out.println("---------- Function: Cantidad de palabras ----------");
        for (String palabra : palabras) {
            System.out.println(palabra + ". Cantidad de letras: " + cuantasLetras.apply(palabra));
        }

        // ---------------------------- CONSUMER ----------------------------//

        // Creamos la clase anonima con la interfaz Consumer
        Consumer<String> mostrar = new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println("Palabra: " + t);
            }
        };

        System.out.println("---------- Consumer: Mostar palabras ----------");
        // Utilizamos la interfaz
        palabras.forEach(mostrar);

        // ---------------------------- PREDICATE ----------------------------//

        // Creamos la clase anonima con la interfaz Predicate
        Predicate<String> prediMayor4 = new Predicate<String>() {

            @Override
            public boolean test(String t) {
                // La condicion es evaluar si la longitud del string es mayor a 4
                return t.length() > 4;
            }
        };

        // Utilizamos la interfaz en un metodo llamado removeIf()
        palabras.removeIf(prediMayor4);

        System.out.println("---------- Predicate: Mayor a 4 letras ----------");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }
}
