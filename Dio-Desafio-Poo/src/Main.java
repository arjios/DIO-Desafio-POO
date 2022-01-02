import java.time.LocalDate;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Conteudo;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria1 = new Mentoria();
		Mentoria mentoria2 = new Mentoria();
		
		curso1.setTitulo("Curso JAVA");
		curso1.setDescricao("Descrição do Curso de JAVA");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição do Curso de JavaScript");
		curso2.setCargaHoraria(8);
		
		mentoria1.setTitulo("Mentoria JAVA");
		mentoria1.setDescricao("Descrição da Mentoria de JavaScript");
		mentoria1.setData(LocalDate.now());
		
		mentoria2.setTitulo("Mentoria JAVA");
		mentoria2.setDescricao("Descrição da Mentoria de JavaScript");
		mentoria2.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(mentoria2);
		
		Dev dev1 = new Dev();
		dev1.setNome("Camila");
		dev1.inscreverBootcamp(bootcamp);
				
		Dev dev2 = new Dev();
		dev2.setNome("João");
		dev2.inscreverBootcamp(bootcamp);

		System.out.println("-------------------Cursos--------------------------");
		System.out.println(curso1);
		System.out.println(curso1);
		
		System.out.println("");
		System.out.println("-------------------Mentorias--------------------------");
		System.out.println(mentoria1);
		System.out.println(mentoria2);
		
		System.out.println("");
		System.out.println("-------------------Conteudo--------------------------");
		System.out.println(conteudo);
		
		System.out.println("");
		System.out.println("---------------Conteudos Inscritos--------------------------");
		System.out.println("Conteudos Inscritos Camila: " + dev1.getConteudoInscritos());
		System.out.println("Conteudos Inscritos João: " + dev2.getConteudoInscritos());
		
		System.out.println("");
		System.out.println("---------------Conteudos Concluidos--------------------------");
		dev1.progredir();
		System.out.println("Conteudos Concluidos Camila: " + dev1.getConteudoConcluidos());		
		dev2.progredir();
		System.out.println("Conteudos Concluidos João: " + dev2.getConteudoConcluidos());

		
	}

}
