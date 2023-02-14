package com.hospedparasita.projetoparasitologia;
import java.io.Serializable;

public class Doenca implements Serializable{

    private Integer id_doenca;
    private String nome_doenca;
    private String descricao_doenca;
    private String titulo_historia;
    private String conteudo_historia;
    private String titulo_transmissao;
    private String conteudo_transmisao;
    private String nome_regiao;
    private String titulo_profilaxia;
    private String tipo_profilaxia ;

    public Integer getId_doenca() {
        return id_doenca;
    }

    public void setId_doenca(Integer id_doenca) {
        this.id_doenca = id_doenca;
    }

    public String getNome_doenca() {
        return nome_doenca;
    }

    public void setNome_doenca(String nome_doenca) {
        this.nome_doenca = nome_doenca;
    }

    public String getDescricao_doenca() {
        return descricao_doenca;
    }

    public void setDescricao_doenca(String descricao_doenca) {
        this.descricao_doenca = descricao_doenca;
    }

    public String getTitulo_historia() {
        return titulo_historia;
    }

    public void setTitulo_historia(String titulo_historia) {
        this.titulo_historia = titulo_historia;
    }

    public String getConteudo_historia() {
        return conteudo_historia;
    }

    public void setConteudo_historia(String conteudo_historia) {
        this.conteudo_historia = conteudo_historia;
    }

    public String getTitulo_transmissao() {
        return titulo_transmissao;
    }

    public void setTitulo_transmissao(String titulo_transmissao) {
        this.titulo_transmissao = titulo_transmissao;
    }

    public String getConteudo_transmisao() {
        return conteudo_transmisao;
    }

    public void setConteudo_transmisao(String conteudo_transmisao) {
        this.conteudo_transmisao = conteudo_transmisao;
    }

    public String getNome_regiao() {
        return nome_regiao;
    }

    public void setNome_regiao(String nome_regiao) {
        this.nome_regiao = nome_regiao;
    }

    public String getTitulo_profilaxia() {
        return titulo_profilaxia;
    }

    public void setTitulo_profilaxia(String titulo_profilaxia) {
        this.titulo_profilaxia = titulo_profilaxia;
    }

    public String getTipo_profilaxia() {
        return tipo_profilaxia;
    }

    public void setTipo_profilaxia(String tipo_profilaxia) {
        this.tipo_profilaxia = tipo_profilaxia;
    }

    @Override
    public String toString(){
        return nome_doenca;
    }
}
