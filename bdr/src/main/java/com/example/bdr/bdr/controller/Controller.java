package com.example.bdr.bdr.controller;


import com.example.bdr.bdr.model.Records;
import com.example.bdr.bdr.services.RecordsServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("central_de_infracoes")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")

public class Controller {

    @Autowired
    private RecordsServices recordsService;

    @GetMapping
    public ResponseEntity<String> saveRecords(@RequestBody List<Records> listOfRecords ) throws InterruptedException {

        for (Records records : listOfRecords) {

            recordsService.save(records);
            Thread.sleep(3000); // Pausa por 3 segundos

        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();

    }


}