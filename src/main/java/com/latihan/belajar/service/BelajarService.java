package com.latihan.belajar.service;

import com.latihan.belajar.dto.request.DataRequest;
import com.latihan.belajar.dto.response.DataResponse;
import com.latihan.belajar.dto.response.ListDataResponse;
import com.latihan.belajar.model.Mahasiswa;

import java.util.List;

public interface BelajarService {

    List<Mahasiswa> getAllData();

    DataResponse saveData(DataRequest request);
}
