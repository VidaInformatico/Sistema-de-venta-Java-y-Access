package Modelo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.filechooser.FileSystemView;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String url = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
            File salida = new File(url + File.separator+ "sis_java.accdb");
            String access = "jdbc:ucanaccess://" + salida;
            con = DriverManager.getConnection(access);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
