package com.system.identity.implementation;

import com.system.identity.interfaces.Tabla_IngresoDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author llagu
 */
public class Tabla_IngresoImpldao implements Tabla_IngresoDao {

    private Statement st;
    private Connection con;

    public Tabla_IngresoImpldao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector lista = new Vector();
        String sql = "SELECT c.id, p.producto, a.cantidad, a.precio, a.sub_total, a.descuento, a.igv, a.total, a.stock_inicial, a.stock_final FROM producto p INNER JOIN articulo a ON p.id = a.id_producto LEFT JOIN compra c ON a.id_compra = c.id LEFT JOIN persona prov ON c.id_proveedor = prov.id LEFT JOIN persona trab ON c.id_trabajador = trab.id LEFT JOIN persona m ON p.id_marca = m.id ORDER BY p.producto, c.fecha_compra DESC";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector salida = new Vector();

            salida.add(rs.getString("c.id"));
            salida.add(rs.getString("p.producto"));
            salida.add(rs.getString("a.cantidad"));
            salida.add(rs.getString("a.precio"));
            salida.add(rs.getString("a.sub_total"));
            salida.add(rs.getString("a.descuento"));
            salida.add(rs.getString("a.igv"));
            salida.add(rs.getString("a.total"));
            salida.add(rs.getString("a.stock_inicial"));
            salida.add(rs.getString("a.stock_final"));
            lista.add(salida);
        }
        return lista;
    }

}
