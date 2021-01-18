
package Clases;

import java.sql.Connection;
import java.sql.SQLException;

    public class Buses {
    
    private String mensaje = "";
    
    private Buses caDao = new Buses ();
    
    public String agregarBuses( Buses ca ){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = caDao.agregarBuses(conn, ca);
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();         
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e)
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
        
    }
    
    public String editarBuses( Buses ca){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = caDao.borrarBuses(conn, ca);
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();         
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e)
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
        
    }
    
    public String borrarBuses( int id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = caDao.borrarBuses(conn, id);
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();         
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e)
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;

    private String agregarBuses(Connection conn, Buses ca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        

 