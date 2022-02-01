

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CustomerDAO {
	
	public Customer findCustomer(String userName) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Customer cust = (Customer) session.get(Customer.class, userName);
//		Customer customer = (Customer) session.createSQLQuery("SELECT * FROM customer c where c.user_name = ?").addEntity(Customer.class).setString(1, userName).list().get(0);
		session.close();
		return cust;
	}
}
