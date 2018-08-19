/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dados.Caminhao;
import dados.Carro;
import dados.Moto;

/**
 *
 * @author heltondenis
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caminhao cm = new Caminhao();
        Carro c = new Carro();
        Moto m = new Moto();
        
        // INTRODUÇÃO
        System.out.println("----------- MAPA DE PROGRAMAÇÃO I ------------");
        
        // CARRO
        System.out.println("Carro:");
        c.ligar();
        c.acelerar();
        c.acelerar();
        c.exibeEstado();
        System.out.println("-------------------------");
        
        // MOTO
        System.out.println("Moto:");
        m.ligar();
        m.acelerar();
        m.acelerar();
        m.exibeEstado();
        System.out.println("-------------------------");
        
        // CAMINHAO
        System.out.println("Caminhao:");
        cm.acelerar();
        cm.acelerar();
        System.out.println("Custo troca de pneus: R$"+cm.trocarPneus(4));
        cm.abre_vidro();
        cm.exibeEstado();
        System.out.println("-------------------------");
    }
    
}
