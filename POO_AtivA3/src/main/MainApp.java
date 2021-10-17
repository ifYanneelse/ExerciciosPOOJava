
package main;

import entity.Cor;
import entity.Marca;
import entity.Modelo;
import entity.PessoaFisica;
import entity.PessoaJuridica;
import entity.Veiculo;
import java.util.Date;
import java.util.Scanner;

// veiculo: carro | moto // cor: branco, azul, preto 
// marca: sukuzi, fiat, honda | suzuki, bmw, honda
// modelo: jimny, doblo, civic | burgman, motorrad, crf

public class MainApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);            
        
        System.out.print("__________ Lavação de Veículos __________\n");
        
        Veiculo veiculo1 = new Veiculo();             
        System.out.print("Digite o id do veículo 1: "); veiculo1.setId (entrada.nextInt());       
        veiculo1.setPlaca("23F678Y");    
        veiculo1.setObservacoes("carro");           
        Veiculo veiculo2 = new Veiculo(); 
        System.out.print("Digite o id do veículo 2: "); veiculo2.setId (entrada.nextInt()); 
        veiculo2.setPlaca("345TTR8");    
        veiculo2.setObservacoes("seminovo");    

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
        
        imprimirDadosVeiculo(veiculo1);
        imprimirDadosVeiculo(veiculo2);       
        
        PessoaFisica pf1 = new PessoaFisica ("123.456.789-00", new Date(), 123, "Francisco", "48988881234", "chico@email.com", new Date(), veiculo1);
        PessoaFisica pf2 = new PessoaFisica ("155.456.789-00", new Date(), 33, "Ana", "48977881234", "ana@email.com", new Date(), veiculo2);
        
        PessoaJuridica pj1 = new PessoaJuridica("23.456.000/0001-33", "2345", 4, "Rafael", "48988881234", "rafael@email.com", new Date(), veiculo2);   
                                                                 
        imprimirDadosCliente(pf1);
        imprimirDadosCliente(pj1);   
}
    
    private static void imprimirDadosVeiculo(Veiculo v){
        System.out.println("\n"); 
        System.out.println("Dados do veículo");        
        System.out.println("Id do veículo:.... " + v.getId());
        System.out.println("Placa:............ " + v.getPlaca());
        System.out.println("Observações:...... " + v.getObservacoes());          
        //System.out.println("Id do modelo: " + veiculo1.getModelo().getId());
        System.out.println("Modelo:........... " + v.getModelo().getDescricao());     
        //System.out.println("Id da marca: " + veiculo1.getModelo().getMarca().getId());
        System.out.println("Marca:............ " + v.getModelo().getMarca().getNome());      
        //System.out.println("Id da cor: " + veiculo1.getCor());
        System.out.println("Cor:.............. " + v.getCor().getNome());
        System.out.println("Categoria:........ " + v.getModelo().getCategoria());        
        System.out.println("__________________________________");   
    }
    
    //com StringBuilder
    private static void imprimirDadosCliente(PessoaFisica pf){
        System.out.println("\n"); 
        System.out.println("Dados do cliente" + "\n" + pf.getDadosCliente());
        System.out.println("__________________________________");   
    }
    
        //com StringBuilder
    private static void imprimirDadosCliente(PessoaJuridica pj){
        System.out.println("\n"); 
        System.out.println("Dados do cliente" + "\n" + pj.getDadosCliente());
        System.out.println("__________________________________");   
    }
    
}
