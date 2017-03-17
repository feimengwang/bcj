import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		GenericXmlApplicationContext context= new GenericXmlApplicationContext("classpath:spring_config.xml");
		DefaultSqlSessionFactory sessionFactoryBean = (DefaultSqlSessionFactory) context.getBean("sqlSessionFactory");
		System.out.println(sessionFactoryBean);
	}

}
