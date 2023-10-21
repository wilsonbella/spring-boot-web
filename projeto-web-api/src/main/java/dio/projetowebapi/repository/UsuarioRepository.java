package dio.projetowebapi.repository;

import dio.projetowebapi.handler.BusinessException;
import dio.projetowebapi.handler.CampoObrigatorioException;
import dio.projetowebapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin() == null)
            throw new CampoObrigatorioException("login");
        if (usuario.getSenha() == null)
            throw new CampoObrigatorioException("senha");
        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id :  para excluir um usuário "));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários em nosso sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Wilson", "Wil2023"));
        usuarios.add(new Usuario("Denise", "De2023"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - recebendo o id : para localizar um usuário " + id));
        return new Usuario("Wison", "Wil2023");
    }

    public Usuario findByUserName(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username : para localizar um usuário " + username));
        return new Usuario("Wilson", "Wil2023");
    }

}
