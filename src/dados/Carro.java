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
public class Carro extends Automovel {
    
  // Método Construtor, irá setar os valores padrões da classe
  public Carro(Boolean motor, int roda, int portas, int velocidade_atual){
        this.motor = motor;
        this.roda = roda;
        this.portas = portas;
        this.velocidade_atual = velocidade_atual;
    }
    
    public Carro(){
        this(false, 4, 4, 0);
    }
    
    @Override
    public void ligar(){
        this.motor = true;
        System.out.println("Ligando motor...");
    }
    
    @Override
    public void desligar(){
        this.motor = false;
        System.out.println("Desligando motor...");
    }
    
    @Override
    public int acelerar(){
        if (motor == true) {
            this.velocidade_atual += 10;   
        } else {
            System.out.println("Para acelerar o carro precisa estar ligado.");
        } if (velocidade_atual > 110) {
            System.out.println("Reduza a Velocidade, sua velocidade atual é: "+velocidade_atual);
        }
        return velocidade_atual;
    }
    
    @Override
    public int diminuir(){
        if (motor == true) {
            this.velocidade_atual -= 10;  
        } else {
            System.out.println("Para diminuir o carro precisa estar ligado.");
        }     
        return velocidade_atual;
    }
    
    @Override
    public int trocarPneus(int pneu){
      int custoPneu = 150;
      int valorPneu = custoPneu * pneu;
      
     return valorPneu;
    }
    
    @Override
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
    
    @Override    
    // Abre o vidro do carro    
    public Boolean abre_vidro(){
        this.vidro = true;
        System.out.println("O vidro está aberto!");
        return true;
    }
    
    @Override
    // Fecha o vidro do carro
    public Boolean fecha_vidro(){
        this.vidro = false;
        System.out.println("O vidro está fechado!");
        return false;
    }
}
