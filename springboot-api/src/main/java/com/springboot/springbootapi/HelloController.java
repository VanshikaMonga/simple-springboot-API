package com.springboot.springbootapi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//With hardcoded String
	// Type http://localhost:8080//hello
	@RequestMapping(method=RequestMethod.GET, path="/hello")
	public String sayHello()
	{
		return "Hello World";
	}
	
	
	//By creating a bean and returning it back
	//type http://localhost:8080//hello-bean
	@RequestMapping(method=RequestMethod.GET, path="/hello-bean")
	public HelloBean sayHelloBean()
	{
		return new HelloBean("Hello World returned by bean");
	}
	
	
	//By providing a path parameters
	//type http://localhost:8080//hello-bean/your name
	@RequestMapping(method=RequestMethod.GET, path="/hello-bean/{name}")
	public HelloBean sayHelloBeanPathVariable(@PathVariable String name)
	{
		return new HelloBean(String.format("Hello, %s", name));
	}
}
