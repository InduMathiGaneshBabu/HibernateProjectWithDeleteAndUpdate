import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
public class HibernateUtil {
public static void main(String args[])
{
	try
	{
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory sessionfactory=config.buildSessionFactory();
	Session session=sessionfactory.openSession();
	Transaction transaction=session.beginTransaction();
	com.Product product=new com.Product();
	product.setProductid(1001);
	product.setProductname("samsung");
	product.setPrice(10000);
	session.save(product);
	transaction.commit();
	session.close();
	System.out.println("object is saved");
	}
	catch(RuntimeException e)
	{
		System.out.println("exception arised"+e);
		
	}
}
}


