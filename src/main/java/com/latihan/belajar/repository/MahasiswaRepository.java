package com.latihan.belajar.repository;

import com.latihan.belajar.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepository  extends JpaRepository<Mahasiswa,Integer> {


}
