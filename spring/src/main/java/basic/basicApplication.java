package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import scope.PersonDao;

@SpringBootApplication
public class basicApplication {
	private static Logger LOGGER =
			 LoggerFactory.getLogger(basicApplication.class);
	// what are the bean ? 
	// what are the dependencies of a bean ? 
	// where to search for bean;

	public static void main(String[] args) {
		// benarSerchImpl benarySearch = add @Compenet
		//new BinarySerachImple(new bubbleSortAlgorithm)= add 	@Autowired
		// Application Context 
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		ApplicationContext applicationContext = 
				SpringApplication.run(basicApplication.class, args);
		
		PersonDao personDao = 
				(PersonDao) SpringApplication.run(basicApplication.class, args);
		
		PersonDao personDao1 = 
				(PersonDao) SpringApplication.run(basicApplication.class, args);
		
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			LOGGER.info("{}", personDao.getJdbcConnection());
			
			LOGGER.info("{}", personDao1);
			LOGGER.info("{}", personDao1.getJdbcConnection());
			
		
		//BinarySearchImpl binarySearch =
				//applicationContext.getBean(BinarySearchImpl.class);
		
		//BinarySearchImpl binarySearch1 = 
				//applicationContext.getBean(BinarySearchImpl.class);
		//System.out.println(binarySearch);
		//System.out.println(binarySearch1);
		
		
		//int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		//System.out.println(result);
				
		SpringApplication.run(basicApplication.class, args);
	}

}
