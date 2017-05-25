package py.edu.facitec.sptaller4.antonia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.sptaller4.antonia.model.Comentario;

@Repository
public class comentarioDao {

	@PersistenceContext
	private EntityManager manager;
	
	public void save(Comentario comentario){
		manager.persist(comentario);
		
	}
}
