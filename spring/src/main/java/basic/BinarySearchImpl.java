package basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	
 public int binarySearch(int[] numbers, int numbersToSearchFor) {
	 Boolean sortedNumbers =  sortAlgorithm.equals(numbers);
	 System.out.println(sortAlgorithm);
	 
	 // search the array
	 
	 return 3;
 }
}
