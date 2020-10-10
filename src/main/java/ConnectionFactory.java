
import org.apache.logging.log4j.Logger;
import java.sql.*;
import org.apache.logging.log4j.LogManager;



public class ConnectionFactory {

    private static Logger logger ;
    private static Connection connection;

    private static void settingConnectionParameters() {
        logger = LogManager.getLogger();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        String connectionUrl = "jdbc:mysql://localhost:3306/jammyDB?" +
                "useUnicode=true&characterEncoding=UTF-8&user=nebel&password=nebel1984";
        try {
            connection = DriverManager.getConnection(connectionUrl);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            logger.error(throwables.getMessage());
        }

    }
    public static Connection getConnection(){
        settingConnectionParameters();
        if (connection == null){
            logger.error("Connection error, Failed to connect to MySQL");
            return null;
        }else {
            logger.info("Connection to Database successful");
        }

        return connection;
    }
}