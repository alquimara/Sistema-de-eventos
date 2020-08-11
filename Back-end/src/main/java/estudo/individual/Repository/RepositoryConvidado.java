package estudo.individual.Repository;

import estudo.individual.Model.Convidado;
import estudo.individual.Model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Repository
public interface RepositoryConvidado extends JpaRepository<Convidado, Integer > {
    List<Convidado> findConvidadoByEvento(Evento evento);

    @Query("select  c from Convidado c WHERE lower(c.nome) LIKE %:nome%")
    List<Convidado> findConvidadoByNome(@Param("nome") String nome);


}
