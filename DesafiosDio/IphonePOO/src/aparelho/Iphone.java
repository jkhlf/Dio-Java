package aparelho;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void exibirPagina(String url) {
        
        System.out.println("Acessando site: " + url);
    }

    @Override
    public void adicionarAba() {
        
        System.out.println("Atendendo a ligação!");
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println("Pagina atualizada.");
    }

    @Override
    public void tocar() {
        
        System.out.println("Tocando sua musica selecionada!");
    }

    @Override
    public void pausar() {
        
        System.out.println("Pausando musica");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando seu correiro de voz");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a musica: " + musica);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação!");
    }
   

    }

