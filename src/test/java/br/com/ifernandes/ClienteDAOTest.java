package test.java.br.com.ifernandes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.br.com.ifernandes.dao.IClienteDAO;
import main.java.br.com.ifernandes.domain.Cliente;
import test.java.br.com.ifernandes.dao.ClienteDaoMock;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;

    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDAO = new ClienteDaoMock();
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
        Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() {
        Boolean retorno = clienteDAO.salvar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());        
    }
}
