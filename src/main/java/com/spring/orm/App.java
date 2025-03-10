package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao=context.getBean("StudentDao",StudentDao.class);
       Student student=new Student(111,"Deepanjali","Pune");
       int r=studentDao.insert(student);
       System.out.println("Done"+r);
    }
}
