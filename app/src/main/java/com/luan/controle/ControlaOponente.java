package com.luan.controle;

import android.widget.Toast;

import com.luan.jogodavelha.MainActivity;

import java.util.Random;

public class ControlaOponente {
    private static int[][] matriz;
    private static boolean jogada = false;

    public static int oponente(int[][] matriz_local, int turno){
        matriz = matriz_local;
        jogada = false;




        return primeiraJogada(matriz_local,  turno);
    }



    public static int primeiraJogada(int[][] matriz_local, int turno){
        matriz = matriz_local;
        Random r= new Random();
        int primeira_jogada = r.nextInt(4);

        if(matriz[1][1] == 1 && turno == 1 ){
            if (matriz[0][2] == 0 && primeira_jogada == 0){
                matriz[0][2]= 2;
                jogada = true;
            }else

            if (matriz[0][0] == 0 && primeira_jogada == 2){
                matriz[0][0]= 2;
                jogada = true;
            }else

            if (matriz[2][0] == 0 && primeira_jogada == 1){
                matriz[2][0]= 2;
                jogada = true;
            }else

            if (matriz[2][2] == 0 && primeira_jogada == 3){
                matriz[2][2]= 2;
                jogada = true;
            }

        }else
        if(matriz[1][1] == 0 && turno == 1 ){
            matriz[1][1] = 2;
            jogada = true;
        }

        return ataque(matriz_local);
    }

    public static int ataque(int[][] matriz_local){
        matriz = matriz_local;




        for (int i = 0; i < 3;i++) {
            if ((matriz[i][0] == 2 && matriz[i][1] == 2 && matriz[i][2] == 0) && jogada == false) {
                matriz[i][2] = 2;
                jogada= true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[i][0] == 2 && matriz[i][2] == 2 && matriz[i][1] == 0) && jogada == false) {
                matriz[i][1] = 2;
                jogada= true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[i][1] == 2 && matriz[i][2] == 2 && matriz[i][0] == 0) && jogada == false) {
                matriz[i][0] = 2;
                jogada= true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[0][i] == 2 && matriz[1][i] == 2 && matriz[2][i] == 0) && jogada == false) {
                matriz[2][i] = 2;
                jogada= true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[0][i] == 2 && matriz[2][i] == 2 && matriz[1][i] == 0) && jogada == false) {
                matriz[1][i] = 2;
                jogada= true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[1][i] == 2 && matriz[2][i] == 2 && matriz[0][i] == 0) && jogada == false) {
                matriz[0][i] = 2;
                jogada= true;
            }
        }

        if ((matriz[0][0] == 2 && matriz[1][1] == 2 && matriz[2][2] == 0) && jogada == false) {
            matriz[2][2] = 2;
            jogada= true;
        }

        if ((matriz[0][0] == 2 && matriz[2][2] == 2 && matriz[1][1] == 0) && jogada == false) {
            matriz[1][1] = 2;
            jogada= true;
        }

        if ((matriz[2][2] == 2 && matriz[1][1] == 2 && matriz[0][0] == 0) && jogada == false) {
            matriz[0][0] = 2;
            jogada= true;
        }

        if ((matriz[0][2] == 2 && matriz[1][1] == 2 && matriz[2][0] == 0) && jogada == false) {
            matriz[2][0] = 2;
            jogada= true;
        }

        if ((matriz[1][1] == 2 && matriz[2][0] == 2 && matriz[0][2] == 0) && jogada == false) {
            matriz[0][2] = 2;
            jogada= true;
        }

        if ((matriz[0][2] == 2 && matriz[2][0] == 2 && matriz[1][1] == 0) && jogada == false) {
            matriz[1][1] = 2;
            jogada= true;
        }




        return defesa(matriz_local);
    }

    public static int defesa(int[][] matriz_local){
        matriz = matriz_local;


        for (int i = 0; i < 3;i++) {
            if ( (matriz[i][0] == 1 && matriz[i][1] == 1 && matriz[i][2] == 0) && jogada == false )  {
                matriz[i][2] = 2;
                jogada = true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[i][0] == 1 && matriz[i][2] == 1 && matriz[i][1] == 0) && jogada == false) {
                matriz[i][1] = 2;
                jogada = true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[i][1] == 1 && matriz[i][2] == 1 && matriz[i][0] == 0) && jogada == false) {
                matriz[i][0] = 2;
                jogada = true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[0][i] == 1 && matriz[1][i] == 1 && matriz[2][i] == 0) && jogada == false) {
                matriz[2][i] = 2;
                jogada = true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[0][i] == 1 && matriz[2][i] == 1 && matriz[1][i] == 0) && jogada == false) {
                matriz[1][i] = 2;
                jogada = true;
            }
        }

        for (int i = 0; i < 3;i++) {
            if ((matriz[2][i] == 1 && matriz[1][i] == 1 && matriz[0][i] == 0) && jogada == false) {
                matriz[0][i] = 2;
                jogada = true;
            }
        }

        if ((matriz[0][0] == 1 && matriz[2][2] == 1 && matriz[1][1] == 0) && jogada == false) {
            matriz[1][1] = 2;
            jogada = true;
        }

        if ((matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 0) && jogada == false) {
            matriz[2][2] = 2;
            jogada = true;
        }

        if ((matriz[1][1] == 1 && matriz[2][2] == 1 && matriz[0][0] == 0) && jogada == false) {
            matriz[0][0] = 2;
            jogada = true;
        }

        if ((matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 0) && jogada == false) {
            matriz[2][0] = 2;
            jogada = true;
        }

        if ((matriz[0][2] == 1 && matriz[2][0] == 1 && matriz[1][1] == 0) && jogada == false) {
            matriz[1][1] = 2;
            jogada = true;
        }

        if ((matriz[1][1] == 1 && matriz[2][0] == 1 && matriz[0][2] == 0) && jogada == false) {
            matriz[0][2] = 2;
            jogada = true;
        }



        return jogadaAlternativa(matriz_local);

    }

    public static int jogadaAlternativa(int[][] matriz_local){
        matriz = matriz_local;

        for(int i = 0 ; i < 3 ; i++) {
            if ((matriz[i][0] == 0 && matriz[i][1] == 0 && matriz[i][2] == 2) && jogada ==false) {

                matriz[i][0] = 2;
                jogada = true;
            }
        }

        for(int i = 0 ; i < 3 ; i++) {
            if ((matriz[i][2] == 0 && matriz[i][0] == 0 && matriz[i][1] == 2) && jogada ==false) {
                matriz[i][0] = 2;
                jogada = true;
            }
        }

        for(int i = 0 ; i < 3 ; i++) {
            if ((matriz[i][2] == 0 && matriz[i][1] == 0 && matriz[i][0] == 2) && jogada ==false) {
                matriz[i][2] = 2;
                jogada = true;
            }
        }

        for(int i = 0 ; i < 3 ; i++) {
            if ((matriz[0][i] == 0 && matriz[1][i] == 0 && matriz[2][i] == 2) && jogada ==false) {
                matriz[0][i] = 2;
                jogada = true;
            }
        }

        for(int i = 0 ; i < 3 ; i++) {
            if ((matriz[2][i] == 0 && matriz[1][i] == 0 && matriz[0][i] == 2) && jogada ==false) {
                matriz[2][i] = 2;
                jogada = true;
            }
        }



        if(jogada == false){
            for(int i = 0; i < 3 ; i++){
                for(int j = 0; j < 3 ; j++) {
                    if (matriz[i][j] == 0 && jogada == false) {
                        matriz[i][j] = 2;
                        jogada = true;
                    }
                }

            }
        }



        if(jogada)
            return 1 ;
        else
            return 0;
    }

}
