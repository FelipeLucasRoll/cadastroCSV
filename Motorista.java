public class Motorista {

    private String cpf;
    private String nome;
    private FormaPagamento formaPagto;
    private Veiculo veiculo;

    public Motorista(String cpf, String nome, FormaPagamento formaPagto, Veiculo veiculo) {
        this.cpf = cpf;
        this.nome = nome;
        this.formaPagto = formaPagto;
        this.veiculo = veiculo;
    }
    
    

    public String getCPF() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public FormaPagamento getFormaPagto() {
        return formaPagto;
    }

    public Veiculo getNroCartao() {
        return veiculo;
    }

    

}