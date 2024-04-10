package organice.semana;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import organice.lembrete.LembreteOut;


@FeignClient(name = "organice-semana")
public interface SemanaController {

    // Rota de leitura 
    @GetMapping("/semana/{id_semana}")
    ResponseEntity<SemanaOut> read(@PathVariable("id_semana") String id_semana);

    // Rota de leitura de lembretes
    // @PostMapping("/dia/lembretes")
    // ResponseEntity<List<LembreteOut>> read_lembretes(
    //     @RequestHeader(required = true, name = "id-user") String UserId,    
    //     @RequestBody DiaData data);

    // Rota de criação
    @PostMapping("/semana")
    ResponseEntity<SemanOut> create(
        @RequestHeader(required = true, name = "id-user") String idUser,      
        @RequestBody SemanaIn semanaIn);

    // Rota de atualização
    // @PutMapping("/dia/{id_dia}")
    // ResponseEntity<SemanOut> update(@PathVariable("id_dia") String id_dia, @RequestBody SemanaIn diaIn);

    // Rota de exclusão
    @DeleteMapping("/semana/{id_semana}")
    ResponseEntity<Void> delete(@PathVariable("id_semana") String id_semana);


} 