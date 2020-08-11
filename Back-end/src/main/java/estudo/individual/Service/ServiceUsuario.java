package estudo.individual.Service;

import estudo.individual.Model.Evento;
import estudo.individual.Model.Usuario;
import estudo.individual.Repository.RepositoryEvento;
import estudo.individual.Repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario {
    @Autowired
    RepositoryUsuario repositoryUsuario;

    public void salvarUsuario(Usuario usuario){
        repositoryUsuario.save(usuario);
    }
}
