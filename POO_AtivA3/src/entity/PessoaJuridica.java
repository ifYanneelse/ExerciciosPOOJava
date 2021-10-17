package entity;

import java.util.Date;

/**
 *
 * @author YyY
 */
public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String inscricaoEstadual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public PessoaJuridica(String cnpj, String inscricaoEstadual, int id, String nome, String celular, String email, Date dataCadastro, Veiculo veiculo) {
        super(id, nome, celular, email, dataCadastro, veiculo);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    @Override
    public String getDadosCliente(){
        StringBuilder sb = new StringBuilder();
            sb.append("Cliente Pessoa Jurídica").append("\n");
            sb.append(super.getDadosCliente());
            sb.append("CNPJ:................ "); sb.append(this.getCnpj() + "\n");
            sb.append("Inscrição Estadual:.. "); sb.append(this.getInscricaoEstadual()); 
        return sb.toString();            
    }
}
