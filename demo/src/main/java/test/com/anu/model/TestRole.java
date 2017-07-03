package test.com.anu.model;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anu.dao.UserDAO;
import com.anu.model.Role;
@Repository
public class TestRole {
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	@Autowired
	public static void main(String[] args) {
		Role role1 = new Role();
		
		role1.setId(200);
		role1.setRoleName("Author");
		
		LOGGER.info("ID = " + role1.getId());
		LOGGER.info("Role Name = " + role1.getRoleName());
	}
}
