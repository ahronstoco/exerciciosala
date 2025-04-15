package com.mycompany.exerciciosala;

import javax.swing.JOptionPane;

/**
 *
 * @author Ahron
 */
public class Exerciciosala {

    public static void main(String[] args) {
        int soma = 0;
             for(int i = 1; i <= 10; i++){
                 int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para somar " + i + ":"));
                 soma += num;
             }
                 JOptionPane.showMessageDialog(null,"A soma dos números é: " + soma);
    }
}
