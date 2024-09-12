public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    private String modelo;
    private String numeroSerie;

    public IPhone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void atender(String numero) {
        System.out.println("atendendo chamada do numero: " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("encerrando chamada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero);
    }

    @Override
    public void abrirPagina() {
        System.out.println("abrindo pagina");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println(url + " adicionado aos favoritos");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");
    }

    @Override
    public void pausarMusica() {
        System.out.println("musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
    }

    @Override
    public void tocarMusica() {
        System.out.println("tocando musica");
    }

    public String getModelo(){
        return modelo;
    }

    public String getNumeroSerie(){
        return numeroSerie;
    }


}
