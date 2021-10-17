package entity;

/**
 *
 * @author YyY
 */
public enum ECategoria {
    PEQUENO("Pequeno"), MEDIO("Médio"), GRANDE("Grande"), MOTO("Moto"), PADRAO("Padrão");
    
    private String DescricaoCategoria;
    
    ECategoria(String descricao){
        this.DescricaoCategoria = descricao;
    }

    public String getDescricaoCategoria() {
        return DescricaoCategoria;
    }
    
}
