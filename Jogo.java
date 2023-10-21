import java.util.Scanner;

public class Jogo {
    private String[][] tabuleiro = new String[3][3];
    private String posicao = "";
    Scanner in = new Scanner(System.in);
    public Jogo(){
        System.out.println("Start Jogo da Velha");
        int cont = 1;
        String valor = "";
        for(int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                valor = String.valueOf(cont++);
                tabuleiro[i][j] = valor;
            }
        }
    }

    public void View_Tabuleiro(){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[i].length; j++){
                System.out.print(tabuleiro[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void JogadorX(){
        System.out.println("Qual a posição JOGADOR X deseja jogar ?");
        posicao = in.next();

        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[i].length; j++){
                if(posicao.equals(tabuleiro[i][j])){
                    tabuleiro[i][j] = "X";
                }
            }
        }
    }
    public void JogadorO(){
        System.out.println("Qual a posição JOGADOR O deseja jogar ?");
        posicao = in.next();

        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[i].length; j++){
                if(posicao.equals(tabuleiro[i][j])){
                    tabuleiro[i][j] = "O";
                }
            }
        }
    }
    public int validacao() {
        String valorX = "X";
        String valorO = "O";

        if (valorX.equals(tabuleiro[0][0]) && valorX.equals(tabuleiro[0][1]) && valorX.equals(tabuleiro[0][2])) {
            System.out.println("Parabens Jogador X, VOCE GANHOU");
            return 1;
        }
        else if (valorO.equals(tabuleiro[0][0]) && valorO.equals(tabuleiro[0][1]) && valorO.equals(tabuleiro[0][2])) {
            System.out.println("Parabens Jogador O, VOCE GANHOU");
            return 1;
        }
        //////////////////////////////////////////////////////////////////
        else if (valorX.equals(tabuleiro[1][0]) && valorX.equals(tabuleiro[1][1]) && valorX.equals(tabuleiro[1][2])) {
            System.out.println("Parabens Jogador X, VOCE GANHOU");
            return 1;
        }
        else if (valorO.equals(tabuleiro[1][0]) && valorO.equals(tabuleiro[1][1]) &&
                valorO.equals(tabuleiro[1][2])) {
            System.out.println("Parabens Jogador O, VOCE GANHOU");
            return 1;
        }
        //////////////////////////////////////////////////////////////////////////
        else if (valorX.equals(tabuleiro[2][0]) && valorX.equals(tabuleiro[2][1]) && valorX.equals(tabuleiro[2][2])) {
            System.out.println("Parabens Jogador X, VOCE GANHOU");
            return 1;
        }
        else if (valorO.equals(tabuleiro[2][0]) && valorO.equals(tabuleiro[2][1]) && valorO.equals(tabuleiro[2][2])) {
            System.out.println("Parabens Jogador O, VOCE GANHOU");
            return 1;
        }
        ////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////
        else if (valorX.equals(tabuleiro[0][0]) && valorX.equals(tabuleiro[1][0]) && valorX.equals(tabuleiro[2][0])) {
            System.out.println("Parabens Jogador X, VOCE GANHOU");
            return 1;
        }
        else if (valorO.equals(tabuleiro[0][0]) && valorO.equals(tabuleiro[1][0]) && valorO.equals(tabuleiro[2][0])) {
            System.out.println("Parabens Jogador O, VOCE GANHOU");
            return 1;
        }
        //////////////////////////////////////////////////////////////////
        else if (valorX.equals(tabuleiro[0][1]) && valorX.equals(tabuleiro[1][1]) && valorX.equals(tabuleiro[2][1])) {
            System.out.println("Parabens Jogador X, VOCE GANHOU");
            return 1;
        }
        else if (valorO.equals(tabuleiro[0][1]) && valorO.equals(tabuleiro[1][1]) && valorO.equals(tabuleiro[2][1])) {
            System.out.println("Parabens Jogador O, VOCE GANHOU");
            return 1;
        }
        //////////////////////////////////////////////////////////////////////////
        else if (valorX.equals(tabuleiro[0][2]) && valorX.equals(tabuleiro[1][2]) && valorX.equals(tabuleiro[2][2])) {
            System.out.println("Parabens Jogador X, VOCE GANHOU");
            return 1;
        }
        else if (valorO.equals(tabuleiro[0][2]) && valorO.equals(tabuleiro[1][2]) && valorO.equals(tabuleiro[2][2])) {
            System.out.println("Parabens Jogador O, VOCE GANHOU");
            return 1;
        }
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        else if (valorX.equals(tabuleiro[0][0]) && valorX.equals(tabuleiro[1][1]) && valorX.equals(tabuleiro[2][2])) {
            System.out.println("Parabens Jogador X, VOCE GANHOU");
            return 1;
        }
        else if (valorO.equals(tabuleiro[0][0]) && valorO.equals(tabuleiro[1][1]) && valorO.equals(tabuleiro[2][2])) {
            System.out.println("Parabens Jogador O, VOCE GANHOU");
            return 1;
        }
        //////////////////////////////////////////////////////////////////
        else if (valorX.equals(tabuleiro[2][0]) && valorX.equals(tabuleiro[1][1]) && valorX.equals(tabuleiro[0][2])) {
            System.out.println("Parabens Jogador X, VOCE GANHOU");
            return 1;
        }
        else if (valorO.equals(tabuleiro[2][0]) && valorO.equals(tabuleiro[1][1]) && valorO.equals(tabuleiro[0][2])) {
            System.out.println("Parabens Jogador O, VOCE GANHOU");
            return 1;
        }
        else {
            return 0;
        }
    }
}
