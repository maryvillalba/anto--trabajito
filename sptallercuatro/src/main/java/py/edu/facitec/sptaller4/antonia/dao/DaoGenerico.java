package py.edu.facitec.sptaller4.antonia.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.propertyeditors.ClassArrayEditor;

public abstract class DaoGenerico<T>{
	
	private Class<T> entityClass;
	
	public DaoGenerico(Class<T> entityClass) {
		this.entityClass= entityClass;
	
	}
	
	protected abstract EntityManager getEntityManager();

	public void insertar (T entity){
		getEntityManager().getTransaction();
	}
}