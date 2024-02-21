package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Userdetailmodel;
import com.example.demo.repository.UserdetailRepo;
@Service
public class UserdetailService {
    private UserdetailRepo userdetailRepo;

    public UserdetailService(UserdetailRepo userdetailRepo) {
        this.userdetailRepo = userdetailRepo;
    }
    @SuppressWarnings("null")
    public Userdetailmodel savedetail(Userdetailmodel userdetailmodel)
    {
        return userdetailRepo.save(userdetailmodel);
    }
    public List<Userdetailmodel> getAlldetail()
    {
        return userdetailRepo.findAll();
    }
    @SuppressWarnings("null")
    public Userdetailmodel getById(String id)
    {
        return userdetailRepo.findById(id).orElse(null);
    }
    @SuppressWarnings("null")
    public boolean updatedetail(String id,Userdetailmodel userdetailmodel)
    {
        if(getById(id)==null)
        {
            return false;
        }
        userdetailRepo.save(userdetailmodel);
        return true;
    }
    @SuppressWarnings("null")
    public boolean deletedetailById(String id)
    {
        if(getById(id)==null)
        return false;
        userdetailRepo.deleteById(id);
        return true;
    }
}
