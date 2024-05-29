package organice.semana;


import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SemanaOut (
    String data_inicio, 
    String data_fim,
    String descricao,
    String id_semana
) {
    
}
