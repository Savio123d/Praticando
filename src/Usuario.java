public class Usuario {
    public String nome;
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean verificarSenha(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
