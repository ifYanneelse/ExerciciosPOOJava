 
package main;

import entity.Cor;
import entity.Marca;
import entity.Modelo;
import entity.Veiculo;
import java.util.Scanner;

// veiculo: carro | moto
// cor: branco, azul, preto 
// marca: sukuzi, fiat, honda | suzuki, bmw, honda
// modelo: jimny, doblo, civic | burgman, motorrad, crf

public class MainApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);            
        
        System.out.print("______ Lavação de Veículos _______\n");
        
        Veiculo veiculo1 = new Veiculo();            
        System.out.print("Digite o id do veículo 1: ");
        veiculo1.setId (entrada.nextInt());       
        veiculo1.setPlaca("23F678Y");    
        veiculo1.setObservacoes("carro");           
        Veiculo veiculo2 = new Veiculo(); 
        System.out.print("Digite o id do veículo 2: ");
        veiculo2.setId (entrada.nextInt()); 
        veiculo2.setPlaca("345TTR8");    
        veiculo2.setObservacoes("moto");    

        Modelo modelo1 = new Modelo();
        modelo1.setId (01);
        modelo1.setDescricao ("Jimny");        
        Modelo modelo2 = new Modelo();
        modelo2.setId (02);
        modelo2.setDescricao ("Doblo");        
        Modelo modelo4 = new Modelo();
        modelo4.setId (04);
        modelo4.setDescricao ("Burgman");
        Modelo modelo5 = new Modelo();
        modelo5.setId (05);
        modelo5.setDescricao ("Motorrad");

        Marca marca1 = new Marca();
        marca1.setId (24);
        marca1.setNome ("Suzuki");
        Marca marca2 = new Marca();
        marca2.setId (25);
        marca2.setNome ("Fiat");
        Marca marca3 = new Marca();
        marca3.setId (26);
        marca3.setNome ("Bmw");
                
        Cor cor1 = new Cor();    
        cor1.setNome("azul");
        cor1.setId(567);
        Cor cor2 = new Cor();  
        cor2.setNome("branco");
        cor2.setId(568);
        Cor cor3 = new Cor(); 
        cor3.setNome("preto");
        cor3.setId(569);        
        
        veiculo1.setModelo(modelo1); modelo1.setMarca(marca1);  veiculo1.setCor(cor2);
        veiculo2.setModelo(modelo4); modelo4.setMarca(marca1);  veiculo2.setCor(cor2);        
        
        imprimirDados(veiculo1);
    //  imprimirDados(veiculo2);
        
}
    
    private static void imprimirDados(Veiculo v){
        System.out.println("\n");
        System.out.println("Dados do veículo 1");
        
        System.out.println("Id do veículo: " + v.getId());
        System.out.println("Placa: " + v.getPlaca());
        System.out.println("Observações: " + v.getObservacoes());        
        
        //System.out.println("Id do modelo: " + veiculo1.getModelo().getId());
        System.out.println("Modelo: " + v.getModelo().getDescricao());
        
        //System.out.println("Id da marca: " + veiculo1.getModelo().getMarca().getId());
        System.out.println("Marca: " + v.getModelo().getMarca().getNome());
        
        //System.out.println("Id da cor: " + veiculo1.getCor());
        System.out.println("Cor: " + v.getCor().getNome());
        System.out.println(" - - - - - - - - - - - - - - - ");
    }
    
//        private static void imprimir(Veiculo veiculo2){
//        System.out.println("\n");
//        System.out.println("Dados do veículo 2");
//        
//        System.out.println("Id do veículo: " + veiculo2.getId());
//        System.out.println("Placa: " + veiculo2.getPlaca());
//        System.out.println("Observações: " + veiculo2.getObservacoes());        
//        
//        //System.out.println("Id do modelo: " + veiculo1.getModelo().getId());
//        System.out.println("Modelo: " + veiculo2.getModelo().getDescricao());
//        
//        //System.out.println("Id da marca: " + veiculo1.getModelo().getMarca().getId());
//        System.out.println("Marca: " + veiculo2.getModelo().getMarca().getNome());
//        
//        //System.out.println("Id da cor: " + veiculo1.getCor());
//        System.out.println("Cor: " + veiculo2.getCor().getNome());
//    }
}
