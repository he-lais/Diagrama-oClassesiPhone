public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String numero);
    void enviarMensagem(String destinatario, String mensagem);
    void receberMensagem(String remetente, String mensagem);
}
