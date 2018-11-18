import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Product;

public class HibernateUtilDelete {
	public static void main(String args[])
	{
		try
		{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=(Product)session.load(Product.class,1001);
		product.setProductname("samsung");
		session.update(product);
		session.delete(product);
		transaction.commit();
		session.close();
		System.out.println("object is deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}