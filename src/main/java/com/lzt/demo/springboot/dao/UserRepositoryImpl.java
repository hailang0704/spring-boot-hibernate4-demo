package com.lzt.demo.springboot.dao;

import com.lzt.demo.springboot.entity.UUser;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.List;

@Service
public class UserRepositoryImpl {
    @Resource(name="entityManagerPrimary")
    private EntityManager entityManager;
    @Resource(name="entityManagerSecondary")
    private EntityManager entityManager2;

    public UUser findById(Long id){

        return null;
    }

    public UUser save(UUser user){
        return null;
    }

    public List<UUser> findName( String nickname) {
        Session session = (Session) entityManager.getDelegate();
        return session.createSQLQuery("select * from u_user WHERE nickname='"+nickname+"'").list();
    }

    public List<UUser> findName2( String nickname) {
        Session session = (Session) entityManager2.getDelegate();
        return session.createSQLQuery("select * from UserInfo WHERE username='"+nickname+"'").list();
    }

}