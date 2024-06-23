import java.util.*;

// Classe para representar o Funcionário da MGS
class Funcionario {
    private String nome;
    private String telefone;
    private String email;
    private String alergias;
    private String problemasMedicos;

    // Construtor
    public Funcionario(String nome, String telefone, String email, String alergias, String problemasMedicos) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getProblemasMedicos() {
        return problemasMedicos;
    }
}

