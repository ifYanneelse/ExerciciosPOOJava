package entity;

import java.util.Date;

/**
 *
 * @author YyY
 */
public class PessoaFisica extends Cliente {
    private String cpf;
    private Date dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisica(String cpf, Date dataNascimento, int id, String nome, String celular, String email, Date dataCadastro, Veiculo veiculo) {
        super(id, nome, celular, email, dataCadastro, veiculo);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String getDadosCliente(){
        StringBuilder sb = new StringBuilder();
            sb.append("Cliente Pessoa Física").append("\n");
            sb.append(super.getDadosCliente());
            sb.append("CPF:................. "); sb.append(this.getCpf() + "\n");
            sb.append("Data de nascimento:.. "); sb.append(this.getDataNascimento()); 
        return sb.toString();            
    }
    
}
