package dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {
    private String nome;
    private String stack;
    private Set<Curso> cursosPalestrados = new LinkedHashSet<>();

    public Professor(String nome, String stack) {
        this.nome = nome;
        this.stack = stack;
        this.cursosPalestrados = new LinkedHashSet<>();
    }

    public void adicionarCurso(Curso curso){
        cursosPalestrados.add(curso);
    }

    public void removerCurso(Curso curso){
        cursosPalestrados.remove(curso);
    }

    public void exibirCursosPalestrados(){
        System.out.println("O professor " +nome + " já palestrou: " + cursosPalestrados);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Set<Curso> getCursosPalestrados() {
        return cursosPalestrados;
    }

    public void setCursosPalestrados(Set<Curso> cursosPalestrados) {
        this.cursosPalestrados = cursosPalestrados;
    }

}