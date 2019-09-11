package atm_xml_database;

import java.sql.*;

public class JdbcSQLiteConnection {

    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:atmDatabase.db";
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected to the database");
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
                System.out.println("----- Data in Book table -----");
                String query = "Select * from user";
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    String password = resultSet.getString(3);

                    System.out.println("id:"+id+" name:"+name+" password: "+password);
                }
                conn.close();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
