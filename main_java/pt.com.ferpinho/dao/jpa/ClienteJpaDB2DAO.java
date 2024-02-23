package pt.com.ferpinho.dao.jpa;

import pt.com.ferpinho.dao.generic.jpa.GenericJpaDB2DAO;
import pt.com.ferpinho.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
