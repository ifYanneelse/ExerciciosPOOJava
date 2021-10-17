
package entity;

public class Modelo {
    private int id;
    private String descricao;
    public Marca marca;    
    private Modelo modelo;

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
        
    
    public Modelo(){
  
    } 
    
    public Modelo(String descricao, Marca marca){
        this.descricao = descricao;
        this.marca = marca;
    }
    
}
