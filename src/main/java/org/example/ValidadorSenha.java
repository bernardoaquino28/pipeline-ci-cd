package org.example;

public class ValidadorSenha {

    public boolean validar(String senha) {
        if (senha == null) return false;
        if (senha.length() < 8) return false;
        if (!senha.matches(".*[A-Z].*")) return false;
        if (!senha.matches(".*[a-z].*")) return false;
        if (!senha.matches(".*\\d.*")) return false;
        if (!senha.matches(".*[@#$%^&+=!?.].*")) return false;
        return true;
    }

    public static void main(String[] args) {
        ValidadorSenha validador = new ValidadorSenha();

        String[] senhas = {
                "abc123",
                "Senha123",
                "Senha123!",
                "senha123!",
                "SENHA123!"
        };

        for (String s : senhas) {
            boolean ok = validador.validar(s);
            System.out.printf("Senha: %-10s → %s%n", s, ok ? "VÁLIDA ✅" : "INVÁLIDA ❌");
        }
    }
}
