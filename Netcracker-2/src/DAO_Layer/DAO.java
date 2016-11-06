package DAO_Layer;

import BL_Layer.BLClass;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {

    public static ArrayList<Car> Select(String str) {

        ArrayList<Car> carList = new ArrayList<Car>();

        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {

            conn = Database.getConnection();

            stmt = conn.createStatement();
            rs = stmt.executeQuery(str);

            while (rs.next()) {
                Car car = new Car();
                car.setId(rs.getInt("id"));
                car.setModel(rs.getString("model"));
                car.setCountry(rs.getString("Country"));
                car.setCount(rs.getString("count"));

                carList.add(car);
            }


        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return carList;
    }




    public static void Insert(String sql ) {

        Connection conn = null;
        Statement stmt = null;

        try {

            conn = Database.getConnection();
            stmt = conn.createStatement();

            stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ;
    }




    public static void Delete( String sql) {

        Connection conn = null;
        Statement stmt = null;

        try {

            conn = Database.getConnection();
            stmt = conn.createStatement();

            stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ;
    }


    public static void Update( String sql ) {

        Connection conn = null;
        Statement stmt = null;

        try {

            conn = Database.getConnection();
            stmt = conn.createStatement();

            System.out.println(sql);
            stmt.executeUpdate(sql);


        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ;
    }


}
