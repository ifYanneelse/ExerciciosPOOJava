
package main;

import entity.Marca;
import entity.Modelo;
import entity.Veiculo;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);            
       
        Marca marca1 = new Marca();
        System.out.print("Digite id da marca1: ");
        marca1.setId (entrada.nextInt());
        System.out.print("Digite nome da marca1: ");
        marca1.setNome (entrada.next());        
                
        Marca marca2 = new Marca();
        System.out.print("Digite id da marca2: ");
        marca2.setId (entrada.nextInt());
        System.out.print("Digite nome da marca2: ");
        marca2.setNome (entrada.next());
        
        
        Modelo modelo1 = new Modelo();
        System.out.print("Digite o id do modelo1: ");
        modelo1.setId (entrada.nextInt());
        System.out.print("Descrição do modelo1: ");
        modelo1.setDescricao (entrada.next());
        
        modelo1.setMarca(marca2);
         
        Modelo modelo2 = new Modelo();
        System.out.print("Digite o id do modelo2: ");
        modelo2.setId (entrada.nextInt());
        System.out.print("Descrição do modelo2: ");
        modelo2.setDescricao (entrada.next());
        
        modelo2.setMarca(marca1);   
        
        
        Veiculo veiculo1 = new Veiculo();            
        System.out.print("Digite o id do veículo1: ");
        veiculo1.setId (entrada.nextInt());       
        System.out.print("Digite a placa do veículo1: ");
        veiculo1.setPlaca (entrada.next());
        
        Veiculo veiculo2 = new Veiculo();            
        System.out.print("Digite o id do veículo2: ");
        veiculo2.setId (entrada.nextInt());       
        System.out.print("Digite a placa do veículo2: ");
        veiculo2.setPlaca (entrada.next());
        
        veiculo1.setModelo(modelo2);
        
        imprimir (veiculo1);

    }
    
    private static void imprimir(Veiculo v){
        System.out.println("\n");
        System.out.println("Dados do carro");
        System.out.println("Id do veículo: " + v.getId());
        System.out.println("Placa do veículo: " + v.getPlaca());
        System.out.println("Modelo: " + v.getModelo());
        System.out.println("Descrição do modelo: " + v.getModelo().getDescricao());
        System.out.println("Nome da marca: " + v.getModelo().getMarca().getNome());
        System.out.println(" - - - - - - - - - - - ");
    }
}
