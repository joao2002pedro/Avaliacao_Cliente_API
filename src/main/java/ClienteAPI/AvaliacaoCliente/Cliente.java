package ClienteAPI.AvaliacaoCliente;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String profissao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Enderecos> enderecos;
//tabela de clientes
    public Cliente() {
    }

    public Cliente(String nome, String profissao, List<Enderecos> enderecos) {
        this.nome = nome;
        this.profissao = profissao;
        this.enderecos = enderecos;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<Enderecos> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Enderecos> enderecos) {
        this.enderecos = enderecos;
    }
}

