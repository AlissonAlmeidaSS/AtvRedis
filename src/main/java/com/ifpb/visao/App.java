package com.ifpb.visao;

import com.ifpb.Enumeration.CacheResult;
import com.ifpb.modelo.Publicacao;
import com.ifpb.modelo.dao.PublicacaoDAO;
import com.ifpb.modelo.dao.PublicacaoDaoRedis;

import java.sql.SQLException;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) throws SQLException {


        Publicacao pub = new Publicacao("1","Vamos Testar", LocalDate.now(),1);
        Publicacao pub2 = new Publicacao("3","Vamos Testar", LocalDate.now(),3);



        PublicacaoDAO dao = new PublicacaoDAO();
        PublicacaoDaoRedis daoRedis = new PublicacaoDaoRedis();

        dao.salvar(pub2);


        System.out.println(pub2);

    }
}
