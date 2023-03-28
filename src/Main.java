import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição de Mentoria Java");
        mentoria1.setData(LocalDate.now());



//        System.out.println(curso1);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGavassa = new Dev();
        devGavassa.setNome("Gavassa");
        devGavassa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devGavassa.getConteudosInscritos());

        devGavassa.progredir();
        devGavassa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devGavassa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devGavassa.getConteudosConcluidos());
        System.out.println("XP: " + devGavassa.calcularTotalXp());

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devBruno.getConteudosInscritos());

        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());

    }

}