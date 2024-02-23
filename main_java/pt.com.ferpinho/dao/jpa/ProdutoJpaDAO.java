package pt.com.ferpinho.dao.jpa;

import pt.com.ferpinho.dao.generic.jpa.GenericJpaDB1DAO;
import pt.com.ferpinho.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}