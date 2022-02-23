package com.latihan.belajar.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class DataLoginRequest {
    private String username;
    private String password;
}
