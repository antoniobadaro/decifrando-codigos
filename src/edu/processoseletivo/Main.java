package edu.processoseletivo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer expected0 = 724;
        Integer actual0 = DecifradorDeCodigos.calculaNumeroDaSenha(Arrays.asList("0110100000","1001011111","1110001010","0111010101","0011100110","1010011001","1101100100","1011010100","1001100111","1000011000"));
        System.out.println(expected0+" "+actual0);

    }
}