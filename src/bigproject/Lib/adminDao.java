package bigproject.Lib;

/**
 *
 * @author Alfaza
 */
import java.util.*;

public interface adminDao{
    Admin getAdmin();
    Set<Admin> getAllUsers();
    Admin getData();
    boolean insertUser();
    boolean updateUser();
    boolean deleteUser();
    
    
  
    
    
}
