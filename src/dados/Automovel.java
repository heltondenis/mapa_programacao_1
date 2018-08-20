/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author heltondenis
 */
public class Automovel {
    
     Boolean motor; // Verifica se o motor está ligado ou desligado
     int roda; // Verifica a quantidade de rodas
     int portas; // Verifica a quantidade de portas
     int velocidade_atual; // Verifica a velocidade atual
     Boolean vidro; // Verifica se o vidro está aberto ou fechado
     Boolean radio; // Verifica se o rádio está ligado

  // Método Construtor, irá setar os valores padrões da classe
  public Automovel(Boolean motor, int roda, int portas, int velocidade_atual, Boolean vidro, Boolean radio){
        this.motor = motor;
        this.roda = roda;
        this.portas = portas;
        this.velocidade_atual = velocidade_atual;
        this.vidro = vidro;
        this.radio = radio;
    }
    
    public Automovel(){
        this(false, 4, 4, 0, false, false);
    }
    
    public void ligar(){
        this.motor = true;
        System.out.println("Ligando motor...");
    }
    
    public void desligar(){
        this.motor = false;
        System.out.println("Desligando motor...");
    }
    
    public int acelerar(){
        return 0;    
    }
    
    public int diminuir(){
        return 0;
    }
    
     public int trocarPneus(int pneu){
      int custoPneu = 150;
      int valorPneu = custoPneu * pneu;
      
     return valorPneu;
    }
    
    public String exibeEstado(){
        Boolean motorv = this.motor;
        
        // Caso a propriedade motor seja true, a variável estado_motor vai ser Ligado
        if (motorv == false) {
           String estado_motor = "Desligado";
           System.out.println("Estado do motor: "+estado_motor);
        }
        
        // Caso a propriedade motor seja true, a variável estado_motor vai ser Ligado
        if (motorv == true) {
           String estado_motor = "Ligado";
           System.out.println("Estado do motor: "+estado_motor);
        }
        
        // Velocidade atual do veículo
        System.out.println("Velocidade Atual: "+this.velocidade_atual); 
        return null;
    }
    
    // Abre o vidro do automovel
    public Boolean abre_vidro(){
        this.vidro = true;
        System.out.println("O vidro está aberto!");
        return true;
    }
 
    // Fecha o vidro do automovel
    public Boolean fecha_vidro(){
        this.vidro = false;
        System.out.println("O vidro está fechado!");
        return false;
    }
    
    public Boolean liga_radio(){
        this.radio = true;
        System.out.println("Ligando o rádio");
        return true;
    }
    
    public Boolean desliga_radio(){
        this.radio = false;
        return false;
    }
}
