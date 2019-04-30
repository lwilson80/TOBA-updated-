package business;

import customer.*;
import javax.persistence.*;



public class UserDB {

    public static void insert(User user) {
        EntityManager em = TobaDBUtility.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();        
        try {
            em.persist(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }

    public static void update(User user) {
        EntityManager em = TobaDBUtility.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();       
        try {
            em.merge(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }

    public static void delete(User user) {
        EntityManager em = TobaDBUtility.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();        
        try {
            em.remove(em.merge(user));
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }       
    }

    public static User selectUser(String userName) {
        EntityManager em = TobaDBUtility.getEmFactory().createEntityManager();
        String qString = "SELECT u FROM User u " +
                "WHERE u.userName = :userName";
        TypedQuery<User> q = em.createQuery(qString, User.class);
        q.setParameter("userName", userName);
        try {
            User user = q.getSingleResult();
            return user;
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public static boolean userExists(String userName) {
        User u = selectUser(userName);   
        return u != null;
    }
}
