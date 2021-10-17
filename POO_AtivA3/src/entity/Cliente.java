package entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author YyY
 */
public abstract class Cliente implements ICliente{
    private int id;
    private String nome;
    private String celular;
    private String email;
    private Date dataCadastro;
        
    private Veiculo veiculo;
    private PessoaFisica pessoafisica;
    private PessoaJuridica pessoajuridica;
    
    List <Veiculo> veiculos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public PessoaFisica getPessoafisica() {
        return pessoafisica;
    }

    public void setPessoafisica(PessoaFisica pessoafisica) {
        this.pessoafisica = pessoafisica;
    }

    public PessoaJuridica getPessoajuridica() {
        return pessoajuridica;
    }

    public void setPessoajuridica(PessoaJuridica pessoajuridica) {
        this.pessoajuridica = pessoajuridica;
    }
    
    public void add(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public void remove(Veiculo veiculo) {
        this.veiculo = veiculo;
    }


    public Cliente(int id, String nome, String celular, String email, Date dataCadastro, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.veiculo = veiculo;
    }

    @Override
    public String getDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDados(String observacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getDadosCliente(){
        StringBuilder sb = new StringBuilder();
            sb.append("Id:.................. "); sb.append(this.getId() + "\n");
            sb.append("Nome:................ "); sb.append(this.getNome() + "\n");
            sb.append("Celular:............. "); sb.append(this.getCelular() + "\n");
            sb.append("Email:............... "); sb.append(this.getEmail() + "\n");
            sb.append("Data de Cadastro:.... "); sb.append(this.getDataCadastro() + "\n");
        return sb.toString();            
    }
    
    
    
}
