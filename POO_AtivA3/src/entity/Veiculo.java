
package entity;

public class Veiculo {    
    private int id;
    private String placa;
    private String observacoes;
    
    private Modelo modelo;
    private Cor cor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
        
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
    
    public Veiculo(){
  
    }
    
    public Veiculo(String placa){
        this.placa = placa;        
    }
    
    public Veiculo(String placa, Modelo modelo){
        this(placa);        
        this.modelo = modelo;
    }
            
}
