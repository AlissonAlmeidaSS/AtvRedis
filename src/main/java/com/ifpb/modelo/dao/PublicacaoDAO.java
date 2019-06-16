package com.ifpb.modelo.dao;

import com.ifpb.modelo.Publicacao;
import com.ifpb.modelo.conexao.ConnectionFactory;
import java.sql.*;

import static java.sql.Date.*;

public class PublicacaoDAO {

    private Connection conexao;

    public PublicacaoDAO() {
        ConnectionFactory factory = new ConnectionFactory();
        this.conexao = factory.getConnection();
    }

    public boolean salvar(Publicacao publicacao) throws SQLException {

        String query = ("INSERT INTO publicacao(id, mensagem, datahora, codUsuario) values (?,?,?,?)");
        PreparedStatement statement = this.conexao.prepareStatement(query);
        statement.setString(1,publicacao.getId());
        statement.setString(2,publicacao.getMensagem());
        statement.setDate(3,Date.valueOf(publicacao.getDatahora()));
        statement.setInt(4,publicacao.getCodUsuario());

        return statement.executeUpdate()>0;

    }

}
