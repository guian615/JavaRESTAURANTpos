package inventory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class product { //product calss
    
    MY_CONNECTION my_connection = new MY_CONNECTION();
   
    // function to add product
    public boolean addClient(String productName, String category, int price){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery = "INSERT INTO `products`(`productName`,`category`,`price`)VALUES (?,?,?)";
        
        st = my_connection.createConnection().prepareStatement(addQuery);
        return true;
    }
    
    // function to edit selected product
    
    
    // function to remove product
    
    
    // function toreturn a list of all product
}
