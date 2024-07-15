package Challenge.Foro.Hub.domain.topico;

import Challenge.Foro.Hub.domain.curso.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotNull Long autor,
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotNull Curso curso) {


}
