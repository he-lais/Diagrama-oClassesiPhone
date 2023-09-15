+-----------------------+
|        iPhone         |
+-----------------------+
| -reprodutor: ReprodutorMusical |
| -aparelho: AparelhoTelefonico  |
| -navegador: NavegadorInternet |
+-----------------------+
           |
           | implements
           |
+-----------------------+
|   ReprodutorMusical   |
+-----------------------+
|                       |
| +reproduzirMusica()   |
| +pausarMusica()       |
| +pararMusica()        |
| +avancarMusica()      |
| +voltarMusica()       |
|                       |
+-----------------------+
           |
           | implements
           |
+-----------------------+
|  AparelhoTelefonico   |
+-----------------------+
|                       |
| +fazerLigacao(numero: String): void   |
| +receberLigacao(numero: String): void |
| +enviarMensagem(destinatario: String, mensagem: String): void |
| +receberMensagem(remetente: String, mensagem: String): void |
|                       |
+-----------------------+
           |
           | implements
           |
+-----------------------+
| NavegadorInternet     |
+-----------------------+
|                       |
| +abrirPagina(url: String): void        |
| +fecharPagina(): void                  |
| +navegarParaFrente(): void            |
| +navegarParaTras(): void              |
|                       |
+-----------------------+
