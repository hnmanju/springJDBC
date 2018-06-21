import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String args[]){
        Employee e= new Employee();
        ApplicationContext apx = new ClassPathXmlApplicationContext("spring-config.xml");
        EmployeeDAO emp = (EmployeeDAO) apx.getBean("edao");
        int status = emp.addEmployee(new Employee(20,"emp1",10000));
        System.out.println(status);

        e.setId(10);
        int status1 = emp.deleteEmployee(e);
        System.out.println(status);
    }
}
