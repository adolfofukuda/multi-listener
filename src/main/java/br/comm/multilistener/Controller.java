package br.comm.multilistener;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.common.TesteService;
import lombok.RequiredArgsConstructor;
import br.com.common.TesteEntity;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final TesteService service;

    @GetMapping("/parametros/teste")
    public ParametroDTO getParametros() {
        return ParametroDTO.builder().chave("1234").valor("teste").build();   
    }

    @GetMapping("/teste")
    public List<TesteEntity> getName() {
        return service.getAll();
    }
}
