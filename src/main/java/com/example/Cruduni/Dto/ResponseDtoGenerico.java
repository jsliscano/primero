package com.example.Cruduni.Dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseDtoGenerico {

    private Integer code;
    private String mensaje;
    private EstudianteDto estudianteDto;
}
