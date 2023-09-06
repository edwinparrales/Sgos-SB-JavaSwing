package epv.tecnologia.pos;

import epv.tecnologia.pos.vista.MainMDI;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SistemaPosApplication {

	public static void main(String[] args) {
            SpringApplicationBuilder run = new SpringApplicationBuilder(SistemaPosApplication.class).headless(false).web(WebApplicationType.NONE);
                 
           ConfigurableApplicationContext cac= run.run(args);
           MainMDI main = (MainMDI) cac.getBean("MainMDI");
          
           
                /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main.setVisible(true);
            }
        });
          
          
	}

}
