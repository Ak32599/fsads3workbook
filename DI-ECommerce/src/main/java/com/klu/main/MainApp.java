package com.klu.main;
import com.klu.config.AppConfig;
import com.klu.model.ProductOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductOrder pr=(ProductOrder)cont.getBean("order");
		pr.disp();
		ApplicationContext cont1=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductOrder pr1=cont1.getBean(ProductOrder.class);
		pr1.disp();
	}

}
