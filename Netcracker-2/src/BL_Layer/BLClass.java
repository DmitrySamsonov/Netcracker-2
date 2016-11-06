package BL_Layer;


import DAO_Layer.Car;
import DAO_Layer.DAO;

import java.util.ArrayList;

public class BLClass {

    public static ArrayList<Car> GetList()
    {
        String sql = "select * from cars";
        return DAO.Select(sql);
    }


    public static Car GetElementById(String id)
    {
        String sql = "select * from cars " +
                     "where id=" + id;

        Car car = DAO.Select(sql).get(0);
        return car;
    }


    public static void DeleteElementById(String id)
    {
        String sql = "DELETE FROM carsdb.cars " +
                     "WHERE id =" + id;
        DAO.Delete(sql);
    }


    public static void EditElement(String id, String model, String country, String count)
    {
        String sql = "UPDATE carsdb.cars "+
                     "SET Model ="+model+", Country ="+country+", Count ="+count+" " +
                     "WHERE id ="+id;
        DAO.Update(sql);
    }


    public static void CreateElement(String model, String country, String count)
    {
        String sql = "INSERT INTO carsdb.cars (Model, Country, Count) " +
                     "VALUES ( ' " + model + "',' "+ country + "',' " + count + "')";
        DAO.Insert(sql);
    }

}
