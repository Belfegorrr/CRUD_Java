package test.java.br.com.ifernandes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.br.com.ifernandes.dao.IClienteDAO;
import main.java.br.com.ifernandes.domain.Cliente;
import main.java.br.com.ifernandes.services.ClienteService;
import main.java.br.com.ifernandes.services.IClienteService;
import test.java.br.com.ifernandes.dao.ClienteDaoMock;

public class ClienteServiceTest {
    
    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(123165498L);
        cliente.setNome("Iago");
        cliente.setCidade("Santos");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(98511883L);   
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());        
    }
}