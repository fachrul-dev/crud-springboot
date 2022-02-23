package com.latihan.belajar.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mhs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String email;

    @Column(name = "created_date")
    private Timestamp createdDate;




}
