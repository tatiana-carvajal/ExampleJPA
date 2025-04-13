/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejpa.persistence;

import co.edu.sena.examplejpa.model.Employee;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author USUARIO
 */
public class EmployeeDAO implements IEmployeeDAO{

    @Override
    public void insert(Employee employee) throws Exception {
          try {
              EntityManagerHelper.beginTransaction();
            EntityManagerHelper.getEntityManager().persist(employee);
            EntityManagerHelper.commit();
        } catch (RuntimeException e) {
             EntityManagerHelper.rollback();
            throw e;
        }finally{
               EntityManagerHelper.closeEntityManager();
          }
    }

    @Override
    public void update(Employee employee) throws Exception {
        try {
            EntityManagerHelper.getEntityManager().merge(employee);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void delete(Employee employee) throws Exception {
         try {
            EntityManagerHelper.getEntityManager().remove(employee);
        } catch (RuntimeException e) {
            throw e;
        } 
    }

     @Override
    public Employee findById(Long document) throws Exception {
        try {
           Query query = EntityManagerHelper.getEntityManager().createNamedQuery("Employee.findById");
        query.setParameter("document", document.longValue()); 
        return (Employee) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (RuntimeException e) {
            throw e;
        }
    }
    

    @Override
    public List<Employee> findAll() throws Exception {
         try {
             Query query = EntityManagerHelper.getEntityManager().createNamedQuery("Employee.findAll");
             return query.getResultList();
        } catch (RuntimeException e) {
            throw e;
        }
    }
    
}
