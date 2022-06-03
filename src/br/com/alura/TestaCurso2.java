package br.com.alura;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso curso = new Curso("Java Completo", "Paulo Silveira");

        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando um ArrayList", 20));
        curso.adiciona(new Aula("Adicionando objetos em um ArrayList", 22));


        curso.getAulas().stream().sorted().forEach(System.out::println);
    }
}
