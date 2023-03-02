package com.example.bdr.bdr.services;

import com.example.bdr.bdr.model.Records;
import com.example.bdr.bdr.repository.RecordsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class RecordsServices {
    @Autowired
    private RecordsRepository recordsRepository;

    public Records save(Records records){return recordsRepository.save(records);}



}
