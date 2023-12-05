package Projeto_Academia;

public class AdministradorFactory implements UsuarioFactory {

    @Override
    public Usuario criarUsuario() {
        return new Administrador();
    }

}
