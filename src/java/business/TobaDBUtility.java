package business;

import java.sql.*;
import customer.*;
import javax.persistence.*;

public class TobaDBUtility  {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("tobadbPU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}