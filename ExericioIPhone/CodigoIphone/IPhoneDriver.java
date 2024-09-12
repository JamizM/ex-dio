public class IPhoneDriver {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("1234", "1324");

        iPhone.abrirPagina();
        iPhone.adicionarAosFavoritos("https://olamundo");
        iPhone.atualizarPagina();
        
        iPhone.atender("111222333");
        iPhone.encerrarChamada();
        iPhone.ligar("333444555666");

        iPhone.tocarMusica();
        iPhone.selecionarMusica("333");
        iPhone.pausarMusica();

        iPhone.getModelo();
        iPhone.getNumeroSerie();
    }
}
