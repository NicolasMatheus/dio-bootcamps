import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Java");
        c1.setDescricao("curso java");
        c1.setCargaHoraria(26);

        Curso c2 = new Curso();
        c2.setTitulo("Spring");
        c2.setDescricao("curso spring framework");
        c2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("Poo em java");
        mentoria.setTitulo("Poo");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Desenvolvedor Java");
        bootcamp.setNome("Bootcamp Java FULL");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(mentoria);

        Dev d1 = new Dev();
        d1.setNome("Judite");
        d1.inscreverBootcamp(bootcamp);
        d1.progredir();
        d1.progredir();
        d1.progredir();

        Dev d2 = new Dev();
        d2.setNome("Joaquim");
        d2.inscreverBootcamp(bootcamp);
        d2.progredir();

//        System.out.println(d1.calcularTotalXp());
//        System.out.println(d2.calcularTotalXp());
//        System.out.println(d1.getConteudosConcluidos());
//        System.out.println(d2.getConteudosConcluidos());
//        System.out.println(d1.getConteudosInscritos());
//        System.out.println(d2.getConteudosInscritos());
    }
}
