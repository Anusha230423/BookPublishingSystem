package test.com.anu.util;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.anu.dao.UserDAO;
import com.anu.util.ConnectionUtil;
 
public class TestConnectionUtil {
	private static final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(UserDAO.class);

	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		LOGGER.info(jdbcTemplate);
	}	
}

