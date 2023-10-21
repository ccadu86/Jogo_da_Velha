public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        int sair = 0;
        while(sair == 0){
            jogo.View_Tabuleiro();
            jogo.JogadorX();
            sair = jogo.validacao();
            if(sair == 1){
                jogo.View_Tabuleiro();
                break;
            }
            jogo.View_Tabuleiro();
            jogo.JogadorO();
            sair = jogo.validacao();
            if(sair == 1){
                jogo.View_Tabuleiro();
                break;
            }
        }
    }
}