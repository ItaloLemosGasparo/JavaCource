package com.italo.Spring_JDBC.repositories;

import com.italo.Spring_JDBC.models.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class clientRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    // Salvar novo cliente
    public void save(client cli) {
        System.out.println(
                jdbc.update("INSERT INTO Client (clientid, name, age) VALUES (?, ?, ?)", cli.getClientId(), cli.getName(), cli.getAge())
                + " Row(s) effected.");
    }

    // Atualizar cliente existente
    public void update(client cli) {
        System.out.println(
                jdbc.update("UPDATE Client SET name = ?, age = ? WHERE clientid = ?", cli.getName(), cli.getAge(), cli.getClientId())
                + " Row(s) effected.");
    }

    // Deletar cliente pelo ID
    public void delete(int clientId) {
        System.out.println(
                jdbc.update("DELETE FROM Client WHERE clientid = ?", clientId)
                + " Row(s) effected.");
    }

    // Listar todos os clientes
    public List<client> findAll() {
        return jdbc.query("SELECT * FROM Client", (rs, rowNum) -> {
            client cli = new client();
            cli.setClientId(rs.getInt("clientid"));
            cli.setName(rs.getString("name"));
            cli.setAge(rs.getInt("age"));
            return cli;
        });
    }
}
