package br.comm.multilistener;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder(toBuilder = true)
@Data
public class Item {
    private Date data;
    private String nome;
    private String categoria;
    private Double valor;
}
