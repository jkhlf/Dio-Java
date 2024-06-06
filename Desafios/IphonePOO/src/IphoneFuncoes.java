import aparelho.Iphone;

public class IphoneFuncoes {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho Telefonico
        iphone.ligar("25574531");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        //Reprodutor de Musica
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Humanos");

        //Navegar na internet
        iphone.exibirPagina("testando.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();
    }
}
