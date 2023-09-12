package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.jpautil.JPAUtil;

public class DaoGeneric<E>{
	public void salvar(E entidade) {
		EntityManager gerenciador = JPAUtil.getEntityManager();
		EntityTransaction transacao = gerenciador.getTransaction();
		
		transacao.begin();
		gerenciador.persist(entidade);
		transacao.commit();
		gerenciador.close();
		}
}
