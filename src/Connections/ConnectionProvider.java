package Connections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?useSSL=false", "root", "icbt@123");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static void saveDataToTextFile(String tableName) {
        try {
            Connection con = getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);

            BufferedWriter writer = new BufferedWriter(new FileWriter(tableName + ".txt"));

            while (rs.next()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    sb.append(rs.getString(i));
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1); // Remove the last comma
                writer.write(sb.toString());
                writer.newLine();
            }

            writer.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        saveDataToTextFile("appuser");
        saveDataToTextFile("category");
        saveDataToTextFile("product");
    }
}
