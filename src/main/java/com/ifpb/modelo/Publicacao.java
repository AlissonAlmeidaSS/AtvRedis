package com.ifpb.modelo;

import java.time.LocalDate;

public class Publicacao {

    private String id;
    private String mensagem;
    private LocalDate datahora;
    private int codUsuario;

    public Publicacao(String id, String mensagem, LocalDate datahora, int codUsuario) {
        this.id = id;
        this.mensagem = mensagem;
        this.datahora = datahora;
        this.codUsuario = codUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDate datahora) {
        this.datahora = datahora;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "id='" + id + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", datahora=" + datahora +
                ", codUsuario=" + codUsuario +
                '}';
    }

}
