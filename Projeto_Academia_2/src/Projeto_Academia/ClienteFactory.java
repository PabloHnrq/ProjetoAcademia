package Projeto_Academia;

public class ClienteFactory implements UsuarioFactory {

    @Override
    public Usuario criarUsuario() {
        return new Cliente();
    }

}
