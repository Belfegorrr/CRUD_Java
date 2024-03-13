package main.java.br.com.ifernandes.dao;

import main.java.br.com.ifernandes.domain.Cliente;

public interface IClienteDAO {

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);
}