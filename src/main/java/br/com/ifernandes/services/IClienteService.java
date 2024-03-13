package main.java.br.com.ifernandes.services;

import main.java.br.com.ifernandes.domain.Cliente;

public interface IClienteService {

    public Boolean salvar(Cliente cliente);

    public Cliente buscarPorCPF(Long cpf);

    public void excluir(Long cpf);
}