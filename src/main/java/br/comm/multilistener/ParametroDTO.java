package br.comm.multilistener;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParametroDTO {
    private String chave;
    private String valor;
}
