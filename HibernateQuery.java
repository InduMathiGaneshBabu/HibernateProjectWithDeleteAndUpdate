
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Product;

public class HibernateQuery {
	public static void main(String args[])
	{
		try
		{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> list=query.list();
				for(Product product:list)
				{
					System.out.print(product.getProductid()+"::::");
					System.out.print(product.getProductname()+"::::");
					System.out.println(product.getPrice()+":::");
				}
		session.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
				
		}
}
