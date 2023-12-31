package accesoADatos;

import Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VacunaData {

    private Connection conexion = null;

    public VacunaData() {
        conexion = Conexion.getConexion();
    }

    public VacunaData(Connection conexion) {
        this.conexion = conexion;
    }
//GUARDAR VACUNA  

    public void cargarVacunas(Vacuna cargar) {

        String sql = "INSERT INTO vacuna(nroSerieDosis, marca, medida, fechaCaduca, colocada) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cargar.getNroSerieDosis());
            ps.setString(2, cargar.getMarca());
            ps.setDouble(3, cargar.getMedida());
            ps.setDate(4, (Date) cargar.getFechaCaduca());
            ps.setBoolean(5, cargar.isColocada());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se ha cargado una Vacuna");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion con tabla vacuna");
        }
    }
//MODIFICAR VACUNA  

    public void modificarStockVacunas(Vacuna vacuna) {

        String sql = "UPDATE vacuna SET marca=?,medida=?,fechaCaduca=?,colocada=? WHERE nroSerieDosis=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, vacuna.getMarca());
            ps.setDouble(2, vacuna.getMedida());
            ps.setDate(3, (Date) (vacuna.getFechaCaduca()));
            ps.setBoolean(4, vacuna.isColocada());
            ps.setInt(5, vacuna.getNroSerieDosis());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado una Vacuna ");

            }
//                else {
//                JOptionPane.showMessageDialog(null, "La Vacuna no existe (de vacunaData)");
//            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion con tabla vacuna");
        }
    }
//ELIMINAR VACUNA LOGICAMENTE    

    public void eliminarVacuna(int nroSerieDosis) {

        try {
            String sql = "UPDATE vacuna SET colocada = 1 WHERE nroSerieDosis = ? ";

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, nroSerieDosis);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se ha Eliminado una Vacuna");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla vacuna");
        }
    }
//BUSCAR VACUNA    

    public Vacuna obtenerVacunaPorNroSerie(int nroSerieDosis) {

        Vacuna vacuna = null;
        String sql = "SELECT  marca, medida, fechaCaduca, colocada FROM vacuna WHERE nroSerieDosis=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, nroSerieDosis);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                vacuna = new Vacuna();

                vacuna.setMarca(rs.getString("marca"));
                vacuna.setMedida(rs.getDouble("medida"));
                vacuna.setFechaCaduca(rs.getDate("fechaCaduca"));
                vacuna.setColocada(rs.getBoolean("colocada"));

//                JOptionPane.showMessageDialog(null,vacuna);    //para ver si toma la vacuna de la base de datos
            } else {
                JOptionPane.showMessageDialog(null, "la vacuna no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Vacuna 4");
        }
        return vacuna;
    }

    //AGREGADO- LISTAR VACUNAS
    public List<Vacuna> listarVacunas() {
        List<Vacuna> vacunas = new ArrayList<>();
        String sql = "SELECT * FROM vacuna";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                Vacuna vacuna = new Vacuna();
                vacuna.setNroSerieDosis(result.getInt("nroSerieDosis"));
                vacuna.setMarca(result.getString("marca"));
                vacuna.setMedida(result.getDouble("medida"));
                vacuna.setFechaCaduca(result.getDate("fechaCaduca"));
                vacuna.setColocada(result.getBoolean("colocada"));
                vacunas.add(vacuna);
            }

            result.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar vacunas: " + ex.getMessage());
        }

        return vacunas;
    }

}
