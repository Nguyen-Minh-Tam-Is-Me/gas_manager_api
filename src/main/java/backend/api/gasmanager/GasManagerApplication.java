package backend.api.gasmanager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GasManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GasManagerApplication.class, args);
	}
//	@Bean
//	public WebMvcConfigurer corsConfigurer(){
//		@Override
//		public void addCorsMappings(@NotNull CorsRegistry registry) {
//			registry.addMapping("/**")
//					.allowCredentials(true)
//					.exposedHeaders("*")
//					.maxAge(3600L)
//					.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
//		}
//	}
}
