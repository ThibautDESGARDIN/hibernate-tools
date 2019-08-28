package fr.formation.inti.dao;

import fr.formation.inti.entities.Employee;

public class EmployeeDaoImpl extends GenericDaoImpl<Employee, Integer>{

	public EmployeeDaoImpl() {
		setClazz(Employee.class);
	}
	
}
