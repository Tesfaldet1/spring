package scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import er.Asmera.spring.JDBCConnection;
@Component
public class PersonDao {
	@Autowired
	
	JDBCConnection jdbcConnection;

	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	

}
