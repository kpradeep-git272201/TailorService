package com.tailor.services;

import com.tailor.entities.Gender;
import com.tailor.repositories.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {
    @Autowired
    private GenderRepository genderRepository;
    @Override
    public List<Gender> addGender(List<Gender> genderList) {
        return this.genderRepository.saveAll(genderList);
    }

    @Override
    public ResponseEntity<Object> getGenders() {
        List<Gender> allGender = this.genderRepository.findAll();
        return new ResponseEntity<>(allGender, HttpStatus.OK);
    }
}
