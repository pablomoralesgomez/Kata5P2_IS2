package control;

import model.Mail;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class SQLiteMailLoader{

    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    
    public List<Mail> load() throws ClassNotFoundException, SQLException {
        List<Mail> lista = new ArrayList<>();
        
         Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(
                "jdbc:sqlite:data/prueba.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM people");
        while(resultSet.next()) {
            Mail mail = new Mail(resultSet.getString("email"));
            lista.add(mail);
        }
        statement.close();
        
        return lista;
    }
    /*String email = resultSet.getString("email");
            System.out.println(email);*/
}
