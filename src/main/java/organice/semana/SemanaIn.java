package organice.dia;

import java.util.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SemanaIn (
    Date data_inicio
) {
    
}
