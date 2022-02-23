package com.latihan.belajar.service;

import com.latihan.belajar.dto.request.DataRequest;
import com.latihan.belajar.dto.response.DataResponse;
import com.latihan.belajar.dto.response.ListDataResponse;
import com.latihan.belajar.dto.response.MahasiswaResponse;
import com.latihan.belajar.model.Mahasiswa;
import com.latihan.belajar.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;

@Service
public class BelajarServiceImpl implements BelajarService {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Override
    public List<Mahasiswa> getAllData() {
      List<Mahasiswa> list = mahasiswaRepository.findAll();
        return list;
    }

    @Override
    public DataResponse saveData(DataRequest request) {
        Mahasiswa mahasiswa = mahasiswaRepository.save(Mahasiswa.builder()
                .email(request.getEmail())
                .username(request.getData().getUsername())
                .createdDate(new Timestamp(System.currentTimeMillis()))
                .build());
        return DataResponse.builder()
                .success(true)
                .message("success")
                .data(mahasiswa)
                .build();
    }
}
