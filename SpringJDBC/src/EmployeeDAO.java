import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate;

    public EmployeeDAO setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        return this;
    }
    public int addEmployee(Employee e){
        String query = "insert into test values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
        return jdbcTemplate.update(query);
    }
    public int updateEmployee(Employee e){
        String query = "update test set id='"+e.getId()+"',name='"+e.getName()+"',salary='"+e.getSalary()+"'";
        return jdbcTemplate.update(query);
    }
    public int deleteEmployee(Employee e){
        String query = "delete from test where id='"+e.getId()+"'";
        return jdbcTemplate.update(query);
    }
}
