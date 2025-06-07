package com.tailor.services;

import com.tailor.entities.Gender;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GenderService {

    public List<Gender> addGender(List<Gender> genderList);
    public ResponseEntity<Object> getGenders();
}
