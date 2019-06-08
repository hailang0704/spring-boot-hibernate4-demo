package com.lzt.demo.springboot.dao;

import com.lzt.demo.springboot.entity.UUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//@Repository
public interface UserRepository extends JpaRepository<UUser, Integer> {

    public UUser findById(Long id);

    public UUser save(UUser user);

    @Query(value = "SELECT u FROM UUser u WHERE nickname=:nickname")
    public UUser findName(@Param("nickname") String nickname);

}