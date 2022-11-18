package ClienteAPI.AvaliacaoCliente;

import ClienteAPI.AvaliacaoCliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Repository extends JpaRepository<Cliente,Long> {

}
