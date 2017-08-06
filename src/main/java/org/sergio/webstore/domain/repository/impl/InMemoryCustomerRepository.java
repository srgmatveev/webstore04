package org.sergio.webstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sergio.webstore.domain.Customer;
import org.sergio.webstore.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Customer> getAllCustomers() {
		Map<String, Object> params = new HashMap<String, Object>();
		List<Customer> result = jdbcTemplate.query("SELECT *	FROM customers", params, new CustomerMapper());
		return result;
	}

	private static final class CustomerMapper implements RowMapper<Customer> {

		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			customer.setCustomerId(rs.getInt("ID"));
			customer.setName(rs.getString("NAME"));
			customer.setAddress(rs.getString("ADDRESS"));
			customer.setNoOfOrdersMade(rs.getBoolean("NOOFORDERSMADE"));
			return customer;
		}
	}

	@Override
	public void addCustomer(Customer customer) {
		String SQL = "INSERT INTO CUSTOMERS (ID, "
				+ "NAME,"
				+ "ADDRESS,"
				+ "NOOFORDERSMADE) "
							+ "VALUES (:id, :name, :address, :nooforders)";
		
		Map<String, Object> params = new HashMap<>();
		params.put("id", customer.getCustomerId());
		params.put("name", customer.getName());
		params.put("address", customer.getAddress());
		params.put("nooforders", customer.isNoOfOrdersMade());
	
		jdbcTemplate.update(SQL, params);
	
	}

}
