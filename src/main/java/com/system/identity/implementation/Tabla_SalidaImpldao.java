package com.system.identity.implementation;

import com.system.identity.interfaces.Tabla_SalidaDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author llagu
 */
public class Tabla_SalidaImpldao implements Tabla_SalidaDao {

    private Statement st;

    private Connection con;

    public Tabla_SalidaImpldao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector lista = new Vector();
        String sql = "SELECT c.id, p.razonsocial, c.descripcion, c.sub_total, c.descuento, c.igv, c.total, c.fecha_compra \n"
                + "FROM compra c \n"
                + "INNER JOIN persona p ON c.id_proveedor = p.id;";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector salida = new Vector();

            salida.add(rs.getString("c.id"));
            salida.add(rs.getString("p.razonsocial"));
            salida.add(rs.getString("c.descripcion"));
            salida.add(rs.getString("c.sub_total"));
            salida.add(rs.getString("c.descuento"));
            salida.add(rs.getString("c.igv"));
            salida.add(rs.getString("c.total"));
            salida.add(rs.getString("c.fecha_compra"));
            lista.add(salida);
        }
        return lista;
    }

}
