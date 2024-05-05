package organice.semana;


import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SemanaIn (
    String diaInicio,
    String diaFim, 
    String descricao

) {

}