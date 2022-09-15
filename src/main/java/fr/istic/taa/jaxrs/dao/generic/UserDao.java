package jpa.DAO;

import jpa.*;

import javax.persistence.EntityManager;

public class UserDao extends AbstractJpaDao<Long, User> {
    static EntityManager em = EntityManagerHelper.getEntityManager();
    User user ;
    public UserDao(User user) {
        super(User.class);
    }
public void setName(String name){
        em.createNativeQuery("insert into User(this.user) value (?) ", User.class)
            .setParameter("Name", name).executeUpdate();
}
}

