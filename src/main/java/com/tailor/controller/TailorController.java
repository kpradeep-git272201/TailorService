package com.tailor.controller;

import com.tailor.entities.Gender;
import com.tailor.services.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TailorController {

    @Autowired
    private GenderService genderService;
    @PostMapping("/genders")
    public List<Gender> addGenders(@RequestBody List<Gender> genderList){
        return this.genderService.addGender(genderList);
    }

    @GetMapping("/genders")
    public ResponseEntity<Object> getGenders(){
        return this.genderService.getGenders();
    }
    @GetMapping("/test")
    public ResponseEntity<Object > test(){
        return new ResponseEntity<>("I am running port number : 8090", HttpStatus.OK);
    }
}
