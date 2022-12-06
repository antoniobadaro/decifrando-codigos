/*Esse desafio te da um array de string de 10 posições com numeros binários de 10 caracteres
 formando uma matriz. A partir dessa matriz 10x10 você irá tirar um número binário e depois convertelô em
  base decimal.
  o numero que mais se repetir em cada coluna é o número que vai compor o numero binário a ser transformado
  no final e se a quantidade de 0 e 1 for igual na coluna, considere o valor 1. ex:
  1100
  0100
  1110
  0011
  coluna 1: 1
  coluna 2: 1
  coluna 3: 1
  coluna 4: 0

  numero a ser convertido em decimal: 1110
  resposta esperada : 14 (que é o valor em decimal)
  */
package edu.desafiodecodigo;
import java.util.List;

public class DecifradorDeCodigos {
    public static Integer calculaNumeroDaSenha(List<String> senha) {
        String aux;
        StringBuilder numero= new StringBuilder();
        int num0=0;
        int num1=0;
        for (int i=0;i<10;i++) {
            num0=0;
            num1=0;
            for (int j = 0; j < 10; j++) {
                aux = senha.get(j);
                char c = aux.charAt(i);
                if(c==49){
                    num1+=1;
                }else{
                    num0+=1;
                }
            }
            numero.append(num0 > num1 ? "0" : "1");
        }
        return Integer.parseInt(numero.toString(),2);

    }
}
