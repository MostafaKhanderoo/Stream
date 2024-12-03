package config;

import exception.CustomException;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Getter
public class DataSource {

    private static final Connection connection;
    private DataSource(){

    }
    static {


        try {
            var jdbc="jdbc:postgresql://localhost:5432/stream";
            connection = DriverManager.getConnection(jdbc,"postgres","mostafa11684");
            System.out.println("");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run(){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static Connection getConnection(){
        return connection;
    }

}
