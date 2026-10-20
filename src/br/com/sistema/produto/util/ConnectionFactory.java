package br.com.sistema.produto.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

    private static final String URL = "jdbc:h2:~/banco_produtos;AUTO_SERVER=TRUE";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void criarTabelaSeNaoExistir() {
        String sql = "CREATE TABLE IF NOT EXISTS produtos ("
                   + "id BIGINT AUTO_INCREMENT PRIMARY KEY, "
                   + "nome VARCHAR(100) NOT NULL, "
                   + "preco DOUBLE NOT NULL, "
                   + "quantidade INT NOT NULL"
                   + ");";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.err.println("Erro ao inicializar a tabela no H2: " + e.getMessage());
        }
    }
}
