public class Cliente {
    private int cod;
    private String nome;
    private String email;

    public Cliente(int cod, String nome, String email) {
        this.cod = cod;
        this.nome = nome;
        this.email = email;
    }
   
    
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
