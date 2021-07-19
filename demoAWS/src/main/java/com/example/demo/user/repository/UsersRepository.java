package com.example.demo.user.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.user.vo.User;

@Repository
public interface UsersRepository extends CrudRepository<User,Integer>{

}
