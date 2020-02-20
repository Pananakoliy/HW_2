import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HWMain {

    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        ShootingRange shootingRange = (ShootingRange) context.getBean("shootingRange");

        Shooter shooter = (Shooter)context.getBean("kenny");
        shooter.toShoot();

        Shooter performer2 = (Shooter)context.getBean("hank");
        performer2.toShoot();

    }

}
