package Connections;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
//            st.executeUpdate("create table appuser (appuser_pk int AUTO_INCREMENT primary key, userRole varchar(50), name varchar(200), mobileNumber varchar(50), username varchar(200), password varchar(50), address varchar(200), status varchar(50))");
//            st.executeUpdate("insert into appuser (userRole, name, mobileNumber, username, password, address, status) values ('Manager', 'Thahirah', '0762590668', 'Manager','manager@123', 'Colombo','Active')");
//            st.executeUpdate("create table category (category_pk int AUTO_INCREMENT primary key,name varchar(200))");
              st.executeUpdate("create table product (product_pk int AUTO_INCREMENT primary key,name varchar(200),quantity int, price int, description varchar(500),category_fk int)");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally  {
                try {
                    con.close();
                    st.close();
                } 
                catch (Exception e) {
                }
            }
        }
    }
