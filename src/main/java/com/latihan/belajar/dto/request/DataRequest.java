package com.latihan.belajar.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class DataRequest {
    private String nama;
    private String email;
    private DataLoginRequest data;
}
