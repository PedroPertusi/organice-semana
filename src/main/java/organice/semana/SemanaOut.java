package organice.dia;

import java.util.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SemanaOut (
    Date data_inicio, 
    Date data_fim
) {
    
}
