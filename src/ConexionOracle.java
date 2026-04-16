import java.sql.*;

public class ConexionOracle {
    public static void main(String[] args) {

        String url ="jdbc:oracle:thin:@localhost:1521:xe";
        String usuario = "RIBERA";
        String contraseña = "ribera";

        try(Connection conn = DriverManager.getConnection(url, usuario, contraseña)){
            String sql = "INSERT INTO EJEMPLOCONEXION (id, nombre, salario) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 10);
            stmt.setString(2, "Ana");
            stmt.setDouble(3, 500);
            stmt.executeUpdate();
            System.out.println("Insertado correctamente");




        }catch(SQLException e ){
            System.out.println("Error al conectar" + e.getMessage());
        }

    }
}