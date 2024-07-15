package Challenge.Foro.Hub.Repository;


import Challenge.Foro.Hub.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
