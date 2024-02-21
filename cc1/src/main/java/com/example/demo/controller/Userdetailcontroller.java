package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Userdetailmodel;
import com.example.demo.service.UserdetailService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
public class Userdetailcontroller {
    private UserdetailService userdetailService;

    public Userdetailcontroller(UserdetailService userdetailService) {
        this.userdetailService = userdetailService;
    }
    @PostMapping("/posting")
    public ResponseEntity<Userdetailmodel> savedetail(@RequestBody Userdetailmodel userdetailmodel)
    {
        Userdetailmodel p= userdetailService.savedetail(userdetailmodel);
        return new ResponseEntity<>(p,HttpStatus.CREATED);
    }
    @GetMapping("/getdetail")
    public ResponseEntity<List<Userdetailmodel>> getdetail() {
        List<Userdetailmodel> list=userdetailService.getAlldetail();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/getdetail{emailid}")
    public  ResponseEntity<Userdetailmodel> getByString(@PathVariable String id) {
        Userdetailmodel p=userdetailService.getById(id);
        return new ResponseEntity<>(p,HttpStatus.OK);
    }
    @PutMapping("/put/{emailid}")
    public ResponseEntity<Userdetailmodel> putdetail(@PathVariable String emailid, @RequestBody Userdetailmodel userdetailmodel) {
        if(userdetailService.updatedetail(emailid, userdetailmodel))
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
    @DeleteMapping("/delete/{emailid}")
    public ResponseEntity<Userdetailmodel> deleteMedicine(@PathVariable String emailid)
    {
        if(userdetailService.deletedetailById(emailid))
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}