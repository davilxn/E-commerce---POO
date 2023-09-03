abstract class Usuario {
    private String nome;
    private String endereco;
    private String email;
    private String senha;
    private static int proximoID = 1;
    
    public Usuario(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public static int getProximoID() {
        return proximoID;
    }
    public static void setProximoID(int proximoID) {
        Usuario.proximoID = proximoID;
    }
}