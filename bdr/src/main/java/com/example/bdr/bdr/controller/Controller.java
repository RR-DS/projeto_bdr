package com.example.bdr.bdr.controller;


import com.example.bdr.bdr.model.Records;
import com.example.bdr.bdr.services.RecordsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("central_de_infracoes")


public class Controller {

    @Autowired
    private RecordsServices recordsService;

    @PostMapping
    public ResponseEntity<String> saveRecords(@RequestBody List<Records> listOfRecords ) throws InterruptedException {

        for (Records records : listOfRecords) {

            recordsService.save(records);
            Thread.sleep(3000); // Pausa por 3 segundos

        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();

    }


}