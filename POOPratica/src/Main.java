
import dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("");
        Certificado certificadoJava = new Certificado();
        certificadoJava.gerarCertificado("Java Expert", devCamila.getNome(), "2024-11-09", "JSPTRS");
        certificadoJava.exebirCertficados();

        System.out.println("");
        Professor sauloDaMata = new Professor("Alexandre Sobrino", "Web Stack");
        sauloDaMata.adicionarCurso(curso1);
        sauloDaMata.adicionarCurso(curso2);
        sauloDaMata.exibirCursosPalestrados();
        sauloDaMata.removerCurso(curso2);
        sauloDaMata.exibirCursosPalestrados();

        
        System.out.println("");
        Projeto CursoProject = new Projeto();
        CursoProject.adicionarProjeto("POO Conta Banco Java", "Criando um Banco digital usando os conceitos de POO");
        CursoProject.adicionarTec("Java");
        CursoProject.adicionarTec("AWS");
        CursoProject.adicionarTec("SpringBoot");

        CursoProject.adicionarMembros(devCamila);
        CursoProject.adicionarMembros(devCamila);
        CursoProject.adicionarMembros(devCamila);
        System.out.println("Quantidade de Membros: "+ CursoProject.obterNumeroMembros());
        CursoProject.obterTecnologiasUtilizadas();
        CursoProject.removeTec("Java");
        CursoProject.obterTecnologiasUtilizadas();
        CursoProject.removerMembros(devCamila);
        System.out.println("Quantidade de Membros: "+ CursoProject.obterNumeroMembros());

    }
}
