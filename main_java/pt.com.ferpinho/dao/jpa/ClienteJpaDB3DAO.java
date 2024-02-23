package pt.com.ferpinho.dao.jpa;

import pt.com.ferpinho.dao.generic.jpa.GenericJpaDB3DAO;
import pt.com.ferpinho.domain.jpa.ClienteJpa2;


public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
