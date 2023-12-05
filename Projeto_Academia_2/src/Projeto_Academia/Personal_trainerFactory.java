package Projeto_Academia;

public class Personal_trainerFactory implements UsuarioFactory {

    @Override
    public Usuario criarUsuario() {
        return new Personal_trainer();
    }

}
