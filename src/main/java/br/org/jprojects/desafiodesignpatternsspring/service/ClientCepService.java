package br.org.jprojects.desafiodesignpatternsspring.service;

import br.org.jprojects.desafiodesignpatternsspring.dto.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ClientCepService {

    @GetMapping("/{cep}/json/")
    AddressDTO consultarCEP(@PathVariable("cep") String cep);
}
