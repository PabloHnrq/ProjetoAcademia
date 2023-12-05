package Projeto_Academia;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Telas telas = new Telas();
    telas.inicializar();

    // Exemplo de uso do Factory para criar um Cliente
    UsuarioFactory clienteFactory = new ClienteFactory();
    Usuario cliente = clienteFactory.criarUsuario();

    // Exemplo de uso do Factory para criar um Personal_trainer
    UsuarioFactory funcionarioFactory = new Personal_trainerFactory();
    Usuario funcionario = funcionarioFactory.criarUsuario();

    // Exemplo de uso do Factory para criar um Administrador
    UsuarioFactory administradorFactory = new AdministradorFactory();
    Usuario administrador = administradorFactory.criarUsuario();


  }
}