import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.portlet.context.XmlPortletApplicationContext;

public class SpringDemo2 {

    public static void main(String[] args) {
        Resource rs = new ClassPathResource("Beans-config.xml");
        BeanFactory factory = new XmlBeanFactory(rs);

        Business business = (Business) factory.getBean("business");
        business.save();


    }
}
