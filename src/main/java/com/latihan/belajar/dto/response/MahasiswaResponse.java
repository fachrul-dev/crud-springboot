package com.latihan.belajar.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MahasiswaResponse {
    private String nohp;
    private String alamat;

}
