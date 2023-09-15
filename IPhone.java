public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico aparelho;
    private NavegadorInternet navegador;

    public IPhone(ReprodutorMusical reprodutor, AparelhoTelefonico aparelho, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.aparelho = aparelho;
        this.navegador = navegador;
    }

    @Override
    public void reproduzirMusica() {
        reprodutor.reproduzirMusica();
    }

    @Override
    public void pausarMusica() {
        reprodutor.pausarMusica();
    }

    @Override
    public void pararMusica() {
        reprodutor.pararMusica();
    }

    @Override
    public void avancarMusica() {
        reprodutor.avancarMusica();
    }

    @Override
    public void voltarMusica() {
        reprodutor.voltarMusica();
    }

    @Override
    public void fazerLigacao(String numero) {
        aparelho.fazerLigacao(numero);
    }

    @Override
    public void receberLigacao(String numero) {
        aparelho.receberLigacao(numero);
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        aparelho.enviarMensagem(destinatario, mensagem);
    }

    @Override
    public void receberMensagem(String remetente, String mensagem) {
        aparelho.receberMensagem(remetente, mensagem);
    }

    @Override
    public void abrirPagina(String url) {
        navegador.abrirPagina(url);
    }

    @Override
    public void fecharPagina() {
        navegador.fecharPagina();
    }

    @Override
    public void navegarParaFrente() {
        navegador.navegarParaFrente();
    }

    @Override
    public void navegarParaTras() {
        navegador.navegarParaTras();
    }
}
