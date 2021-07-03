package model.dao;

import java.util.List;

import model.entities.Departament;

/***
 * 
 * @author dionatan
 *
 */

public interface DepartamentDao {

	void insert(Departament obj);

	void update(Departament obj);

	void deleteById(Integer id);

	void findById(Integer id);

	List<Departament> findAll();
}
