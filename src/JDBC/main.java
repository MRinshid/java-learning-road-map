package JDBC;
import java.sql.*;

public class main {
    public static void main(String args[])
    {
        String url = "jdbc:mysql://localhost:3306/hobbie_db";
        String username = "root";
        String password = "admin";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database successfully!");
                try (Statement statement = connection.createStatement()) {
                    String sql = "SELECT * FROM atpsusers";
                    try (ResultSet resultSet = statement.executeQuery(sql)) {
                        ResultSetMetaData metaData = resultSet.getMetaData();
                        int columnCount = metaData.getColumnCount();
                        while (resultSet.next()) {
                            for (int i = 1; i <= columnCount; i++) {
                                String columnName = metaData.getColumnName(i);
                                String columnValue = resultSet.getString(i);
                                System.out.println(columnName + ": " + columnValue);
                            }
                            System.out.println("-----------------------------");
                        }
                    }
                }

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
