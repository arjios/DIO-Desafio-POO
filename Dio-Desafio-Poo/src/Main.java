import java.time.LocalDate;

import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
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
		
		System.out.println(curso1);
		System.out.println(curso1);
		
		System.out.println(mentoria1);
		System.out.println(mentoria2);
		
	}

}
