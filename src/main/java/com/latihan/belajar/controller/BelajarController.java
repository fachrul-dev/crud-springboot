package com.latihan.belajar.controller;

import com.latihan.belajar.dto.request.DataRequest;
import com.latihan.belajar.dto.response.DataResponse;
import com.latihan.belajar.dto.response.ListDataResponse;
import com.latihan.belajar.dto.response.MahasiswaResponse;
import com.latihan.belajar.model.Mahasiswa;
import com.latihan.belajar.service.BelajarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class BelajarController {

    @Autowired
    private BelajarService belajarService;

    @GetMapping("/belajar")
    public ResponseEntity<?> indexData(){
        return ResponseEntity.ok().body("Hello World");
    }

    @GetMapping("/coba")
    public ResponseEntity<?> coba(){
//        List<String> stringList = new ArrayList<String>();
//        stringList.add("banana");
//        stringList.add("manggo");
//        stringList.add("tomato");

        List<Mahasiswa> list = belajarService.getAllData();
        return ResponseEntity.ok().body(DataResponse.builder()
                .success(true)
                .message("Success")
                .data(list)
                .build());
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody DataRequest request){
        log.info("Username : {}", request.getNama());
        log.info("Email : {}", request.getEmail());
        log.info("username : {}", request.getData().getUsername());
        log.info("password : {}", request.getData().getPassword());
        DataResponse dataResponse = belajarService.saveData(request);
        return ResponseEntity.ok().body(dataResponse);
    }


}
