package com.sunshine.demo.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManagerFactory ef=Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager em=ef.createEntityManager();
        
        
        
        Employee employee=new Employee();
        employee.setId(103);
        employee.setName("navin");
        employee.setMarks(90);
        
        em.getTransaction().begin();
        //insert new Employee
       // em.persist(employee);
        
        //update and get the Employee
        Employee employee1=em.find(Employee.class , 101);
        System.out.println("Employee id::"+employee1.getId());
        System.out.println("Employee name::"+employee1.getName());
        System.out.println("Employee marks::"+employee1.getMarks());
        
        
        /*employee1.setMarks(100);
        System.out.println(employee1);*/
        
        
        //remove the Employee by using id 
        //em.remove(e);
        
        
        
        
        em.getTransaction().commit();
    }
}
