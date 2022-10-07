import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Java", 26);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}
