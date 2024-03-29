package br.cnj.projeto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import br.cnj.projeto.util.CasoJudicialUtil;
/**
 * @SpringBootApplication is a convenience annotation that adds all of the following:
 * 		@Configuration: Tags the class as a source of bean definitions for the application context.
 * 		@EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.
 * 		@ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.
 */
@SpringBootApplication
public class ProjetoApplication implements CommandLineRunner {
	
	@Autowired
	private CasoJudicialUtil casoJudicial;

	public static void main(String[] args) {
		System.out.println("INICIO");
		SpringApplication.run(ProjetoApplication.class, args);
		System.out.println("FIM");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(casoJudicial.finalizarCusto(100, "MS", 2017));
	}

	@Bean
	protected CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
