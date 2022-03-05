package com.example.filtercontroleacesso.security;

public class UserInfo {
    // uma vez preenchido os dados do usuário na sessão, as informações
    // ficará disponivel para os demais acessos.
    // o filter checará na sessão os dados do usuário.

    private String id;
    private String senha;
    private String nome;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
