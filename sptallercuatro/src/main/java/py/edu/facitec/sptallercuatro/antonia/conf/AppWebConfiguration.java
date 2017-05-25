package py.edu.facitec.sptallercuatro.antonia.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.sptaller4.antonia.controller.HomeController;
import py.edu.facitec.sptaller4.antonia.dao.comentarioDao;
import py.edu.facitec.sptallercuatro.antonia.resolver.CustomXMLViewResolver;
import py.edu.facitec.sptallercuatro.antonia.resolver.JsonViewResolver;

//Activa el componente MVC de Spring para trabajar con Servlet
@EnableWebMvc
//Carga las clases necesarias para iniciar la aplicacion
@ComponentScan(basePackageClasses={HomeController.class,comentarioDao.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	
	//Gestiona como un nuevo componente de la aplicacion
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();		
				
				
				resolver.setPrefix("/WEB-INF/views/");
				
				resolver.setSuffix(".jsp");
				
				return resolver;
			}
	
	
	

	
	@Bean
	public ViewResolver contentNegotiatingViewResolver( 
 	 	 	ContentNegotiationManager manager) { 
 	 	List<ViewResolver> resolvers = new 
ArrayList<ViewResolver>(); 
 	 	 
 	 	resolvers.add(internalResourceViewResolver());  	 	
 	 	resolvers.add(new JsonViewResolver()); 
 	 	resolvers.add(getMarshallingXmlViewResolver()); 
 	 	 
 	 	ContentNegotiatingViewResolver resolver = new 
ContentNegotiatingViewResolver();  	 	resolver.setViewResolvers(resolvers); 
 	 	resolver.setContentNegotiationManager(manager); 
 	 	return resolver; 
 	} 
 
 	@Bean 
 	public CustomXMLViewResolver getMarshallingXmlViewResolver() { 
 	 	Jaxb2Marshaller marshaller = new Jaxb2Marshaller();  	 	
 	 //	marshaller.setClassesToBeBound(Producto.class); 
 	 	return new CustomXMLViewResolver(marshaller); 
 	} 

	
	

}
