package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Userdetailmodel;

public interface UserdetailRepo extends JpaRepository<Userdetailmodel,String> {

}
