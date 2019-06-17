package com.ifpb.modelo.dao;

import com.google.gson.Gson;
import com.ifpb.Enumeration.CacheResult;
import com.ifpb.modelo.Publicacao;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.params.SetParams;

public class PublicacaoDaoRedis {

    private Jedis jedis;
    private Gson gson;

    public PublicacaoDaoRedis() {
        jedis = new Jedis();
        gson = new Gson();
    }

    public boolean salvar(Publicacao publicacao){
        return jedis.set(""+publicacao.getId(),gson.toJson(publicacao),
                SetParams.setParams().ex(3600)) != null;
    }

    public CacheResult buscar(int id){
        return jedis.get(""+id) == null? CacheResult.CACHE_MISS :
                CacheResult.CACHE_HIT;
    }

    public Publicacao get(int id){
        String json = jedis.get(""+id);
        if(json == null) return null;
        return gson.fromJson(json, Publicacao.class);
    }
}
