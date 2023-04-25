import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;

public class RegisterDao {

    private String dbUrl ="jdbc:mysql://localhost:3306/karthik";
    private String dbUname ="root";
    private String dbPassword ="Karthik@2020";
    private String dbDriver ="com.mysql.cj.jdbc.Driver";
    
    public void loadDriver(String dbDriber) {
        try {
            Class.forName(dbDriber);
        } catch (ClassNotFoundException e) {            
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() 
    {
        Connection con =null;
        try {
            con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);
            
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        return con;
    }
    
    public String insert(Member member) 
    {
        loadDriver(dbDriver);
        Connection con = getConnection();
        String result ="Registered successfully";
        
        
        String sql = "insert into member values(?,?,?,?)";
        
        PreparedStatement pst;
        try {    
       
            pst = con.prepareStatement(sql);        
        pst.setString(1, member. getUname());
        pst.setString(2, member. getPassword());
        pst.setString(3, member. getEmail());
        pst.setInt(4, member. getPhone());
        pst.executeUpdate();
        

        } catch (SQLException e) {
            
            e.printStackTrace();
            
            result ="Registration Unsuccessful";
        }
        
        
        return result;
    }
}

