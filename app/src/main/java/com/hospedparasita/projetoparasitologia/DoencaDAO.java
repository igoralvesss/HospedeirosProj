package com.hospedparasita.projetoparasitologia;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DoencaDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public DoencaDAO(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public List<Doenca> obterTodosSudeste(){
        List<Doenca> doencas = new ArrayList<>();
        Cursor cursor = banco.query("doenca", new String[]{"id_doenca","nome_doenca", "descricao_doenca", "titulo_historia", "conteudo_historia",
                "titulo_transmissao", "conteudo_transmissao", "nome_regiao", "titulo_profilaxia","tipo_profilaxia"},
                "nome_regiao = 'SUDESTE'", null, null, null, null);
        while (cursor.moveToNext()){
            Doenca a =  new Doenca();
            a.setId_doenca(cursor.getInt(0));
            a.setNome_doenca(cursor.getString(1));
            a.setDescricao_doenca(cursor.getString(2));
            a.setTitulo_historia(cursor.getString(3));
            a.setConteudo_historia(cursor.getString(4));
            a.setTitulo_transmissao(cursor.getString(5));
            a.setConteudo_transmisao(cursor.getString(6));
            a.setNome_regiao(cursor.getString(7));
            a.setTitulo_profilaxia(cursor.getString(8));
            a.setTipo_profilaxia(cursor.getString(9));

            doencas.add(a);
        }
        return doencas;
    }

    public List<Doenca> obterTodosNorte(){
        List<Doenca> doencas = new ArrayList<>();
        Cursor cursor = banco.query("doenca", new String[]{"id_doenca","nome_doenca", "descricao_doenca", "titulo_historia", "conteudo_historia",
                        "titulo_transmissao", "conteudo_transmissao", "nome_regiao", "titulo_profilaxia","tipo_profilaxia"},
                "nome_regiao = 'NORTE'", null, null, null, null);
        while (cursor.moveToNext()){
            Doenca a =  new Doenca();
            a.setId_doenca(cursor.getInt(0));
            a.setNome_doenca(cursor.getString(1));
            a.setDescricao_doenca(cursor.getString(2));
            a.setTitulo_historia(cursor.getString(3));
            a.setConteudo_historia(cursor.getString(4));
            a.setTitulo_transmissao(cursor.getString(5));
            a.setConteudo_transmisao(cursor.getString(6));
            a.setNome_regiao(cursor.getString(7));
            a.setTitulo_profilaxia(cursor.getString(8));
            a.setTipo_profilaxia(cursor.getString(9));

            doencas.add(a);
        }
        return doencas;

    }

    public List<Doenca> obterTodosSul() {
        List<Doenca> doencas = new ArrayList<>();
        Cursor cursor = banco.query("doenca", new String[]{"id_doenca", "nome_doenca", "descricao_doenca", "titulo_historia", "conteudo_historia",
                        "titulo_transmissao", "conteudo_transmissao", "nome_regiao", "titulo_profilaxia", "tipo_profilaxia"},
                "nome_regiao = 'SUL'", null, null, null, null);
        while (cursor.moveToNext()) {
            Doenca a = new Doenca();
            a.setId_doenca(cursor.getInt(0));
            a.setNome_doenca(cursor.getString(1));
            a.setDescricao_doenca(cursor.getString(2));
            a.setTitulo_historia(cursor.getString(3));
            a.setConteudo_historia(cursor.getString(4));
            a.setTitulo_transmissao(cursor.getString(5));
            a.setConteudo_transmisao(cursor.getString(6));
            a.setNome_regiao(cursor.getString(7));
            a.setTitulo_profilaxia(cursor.getString(8));
            a.setTipo_profilaxia(cursor.getString(9));

            doencas.add(a);
        }
        return doencas;
    }

    public List<Doenca> obterTodosNordeste() {
        List<Doenca> doencas = new ArrayList<>();
        Cursor cursor = banco.query("doenca", new String[]{"id_doenca", "nome_doenca", "descricao_doenca", "titulo_historia", "conteudo_historia",
                        "titulo_transmissao", "conteudo_transmissao", "nome_regiao", "titulo_profilaxia", "tipo_profilaxia"},
                "nome_regiao = 'NORDESTE'", null, null, null, null);
        while (cursor.moveToNext()) {
            Doenca a = new Doenca();
            a.setId_doenca(cursor.getInt(0));
            a.setNome_doenca(cursor.getString(1));
            a.setDescricao_doenca(cursor.getString(2));
            a.setTitulo_historia(cursor.getString(3));
            a.setConteudo_historia(cursor.getString(4));
            a.setTitulo_transmissao(cursor.getString(5));
            a.setConteudo_transmisao(cursor.getString(6));
            a.setNome_regiao(cursor.getString(7));
            a.setTitulo_profilaxia(cursor.getString(8));
            a.setTipo_profilaxia(cursor.getString(9));

            doencas.add(a);
        }
        return doencas;
    }

    public List<Doenca> obterTodosCentro() {
        List<Doenca> doencas = new ArrayList<>();
        Cursor cursor = banco.query("doenca", new String[]{"id_doenca", "nome_doenca", "descricao_doenca", "titulo_historia", "conteudo_historia",
                        "titulo_transmissao", "conteudo_transmissao", "nome_regiao", "titulo_profilaxia", "tipo_profilaxia"},
                "nome_regiao = 'CENTRO-OESTE'", null, null, null, null);
        while (cursor.moveToNext()) {
            Doenca a = new Doenca();
            a.setId_doenca(cursor.getInt(0));
            a.setNome_doenca(cursor.getString(1));
            a.setDescricao_doenca(cursor.getString(2));
            a.setTitulo_historia(cursor.getString(3));
            a.setConteudo_historia(cursor.getString(4));
            a.setTitulo_transmissao(cursor.getString(5));
            a.setConteudo_transmisao(cursor.getString(6));
            a.setNome_regiao(cursor.getString(7));
            a.setTitulo_profilaxia(cursor.getString(8));
            a.setTipo_profilaxia(cursor.getString(9));

            doencas.add(a);
        }
        return doencas;
    }

    public List<Doenca> obterTodosBrasil() {
        List<Doenca> doencas = new ArrayList<>();
        Cursor cursor = banco.query("doenca", new String[]{"id_doenca", "nome_doenca", "descricao_doenca", "titulo_historia", "conteudo_historia",
                        "titulo_transmissao", "conteudo_transmissao", "nome_regiao", "titulo_profilaxia", "tipo_profilaxia"},
                null, null, null, null, null);
        while (cursor.moveToNext()) {
            Doenca a = new Doenca();
            a.setId_doenca(cursor.getInt(0));
            a.setNome_doenca(cursor.getString(1));
            a.setDescricao_doenca(cursor.getString(2));
            a.setTitulo_historia(cursor.getString(3));
            a.setConteudo_historia(cursor.getString(4));
            a.setTitulo_transmissao(cursor.getString(5));
            a.setConteudo_transmisao(cursor.getString(6));
            a.setNome_regiao(cursor.getString(7));
            a.setTitulo_profilaxia(cursor.getString(8));
            a.setTipo_profilaxia(cursor.getString(9));

            doencas.add(a);
        }
        return doencas;
    }


}
