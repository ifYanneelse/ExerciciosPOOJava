
package entity;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private int id;
    private String descricao;    
  
    private Modelo modelo;   
    private Marca marca;     
    private ECategoria categoria;
    
    List <Veiculo> veiculos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }
        

    public Modelo(){
  
    } 

    public Modelo(int id, String descricao, Marca marca, ECategoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", descricao=" + descricao + ", modelo=" + modelo + ", marca=" 
                + marca + ", categoria=" + categoria.getDescricaoCategoria() + '}';
    }   
    
}
