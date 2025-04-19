package com.system.identity.implementation;

import com.system.conexion.Conexion;
import com.system.identity.Archivo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author llagu
 */
public class TablaDao {

    public ArrayList<Archivo> Listar_Archivo() {
        ArrayList<Archivo> list = new ArrayList<Archivo>();
        Conexion conec = new Conexion();
        String sql = "SELECT c.id, p.razonsocial, c.descripcion, c.sub_total, c.descuento, c.igv, c.total, c.fecha_compra \n"
                + "FROM compra c \n"
                + "INNER JOIN persona p ON c.id_proveedor = p.id;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conec.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Archivo arch = new Archivo();
                arch.setId(rs.getInt(1));
                arch.setRazonsocial(rs.getString(2));
                arch.setDescripcion(rs.getString(3));
                arch.setSub_total(rs.getDouble(4));
                arch.setDescuento(rs.getDouble(5));
                arch.setIgv(rs.getDouble(6));
                arch.setTotal(rs.getDouble(7));
                arch.setFecha_compra(rs.getString(8));
                list.add(arch);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
            } catch (Exception ex) {
            }
        }
        return list;
    }
}
