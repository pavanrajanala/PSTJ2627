import java.util.List;
import java.util.Arrays;

public class Task1{
	public static void main(String[] args){
		List<Integer> Salary = Arrays.asList(2500,350000,96300,7800);
		Salary.stream()
			.map(salary -> salary + (salary * 10/100))
			.mapToInt(salary -> (int)salary)
			.forEach(System.out::println);
}
}