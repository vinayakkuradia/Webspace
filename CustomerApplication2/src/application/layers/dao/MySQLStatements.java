package application.layers.dao;

public class MySQLStatements {

	static final String ROWS_AFFECTED = " rows affected.";
	static final String UPDATE_CUSTOMER = "update customer set firstname=?, lastname=?, address=?, mobile=?, email=?)";
	static final String WHERE_CUST_ID = " where CustID=?";
	static final String DELETE_FROM_CUSTOMER = "delete from Customer";
	static final String SELECT_FROM_CUSTOMER = "select * from Customer";
	
}
