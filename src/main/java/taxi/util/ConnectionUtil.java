package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static final String URL = "jdbc:mysql://ui3p9ntit1u51gte:"
            + "UGhsouQzcvKmtPjBlflO@blaujqesoflkbrjm5p5b-mysql"
            + ".services.clever-cloud.com:3306/blaujqesoflkbrjm5p5b";
    private static final String USERNAME = "ui3p9ntit1u51gte";
    private static final String PASSWORD = "UGhsouQzcvKmtPjBlflO";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
