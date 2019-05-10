package business;

import java.sql.*;
import customer.*;
import javax.persistence.*;


public class AccountDB {

    public static void insert(Account account) {
        EntityManager em = TobaDBUtility.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(account);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }

    public static void update(Account account) {
        EntityManager em = TobaDBUtility.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(account);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }

    public static Account selectAccount(User user, String account) {
        EntityManager em = TobaDBUtility.getEmFactory().createEntityManager();
        String qString = "SELECT a FROM Account a "
                + "WHERE a.accountOwner = :user AND a.accountType= :ACCOUNT";
        TypedQuery<Account> q = em.createQuery(qString, Account.class);
        q.setParameter("user", user);
        q.setParameter("ACCOUNT", account);
        try {
            Account a = q.getSingleResult();
            return a;
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

}

