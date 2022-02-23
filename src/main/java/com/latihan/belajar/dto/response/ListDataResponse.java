package com.latihan.belajar.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ListDataResponse {
  List<MahasiswaResponse> list;
}
