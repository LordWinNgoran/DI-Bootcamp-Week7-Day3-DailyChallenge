//Daily Challenge : ArrayProcessor
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a few lambda expressions and a function that returns a lambda expression as its value.
* Suppose that a function interface ArrayProcessor is defined as
* date: 08/02/2023
*/
package daily;

public class ArrayProcessorLambdas {
	// We define a ArrayProcessor tab to find the max value
		// dans un tableau
		public static final ArrayProcessor max = (double[] array) -> {
			double maxValue = Double.NEGATIVE_INFINITY;
			for (double value : array) {
				maxValue = Math.max(maxValue, value);
			}
			return maxValue;
		};

		// We define a ArrayProcessor  to find in tab the max value
		
		public static final ArrayProcessor min = (double[] array) -> {
			double minValue = Double.POSITIVE_INFINITY;
			for (double value : array) {
				minValue = Math.min(minValue, value);
			}
			return minValue;
		};

		 // We define a ArrayProcessor  to sum all values in tab
		public static final ArrayProcessor sum = (double[] array) -> {
			double total = 0;
			for (double value : array) {
				total += value;
			}
			return total;
		};

		 // We define a ArrayProcessor  to have the averageof  all values in tab
		public static final ArrayProcessor average = (double[] array) -> {
			return sum.apply(array) / array.length;
		};

		 // We define a ArrayProcessor  to find the apparition of a number
		public static ArrayProcessor counter(double value) {
			return (double[] array) -> {
				int count = 0;
				for (double val : array) {
					if (val == value) {
						count++;
					}
				}
				return count;
			};
		}
		
		
		public static void main(String[] args) {
		    double[] array = {14, 15, 43, 7, 25, 66, 22, 78, 5., 55,95};
		    
		    System.out.println("The max value is : " + max.apply(array));
		    System.out.println("The min value is : " + min.apply(array));
		    System.out.println("The sum of values in table is : " + sum.apply(array));
		    System.out.println("The average of values in table is : " + average.apply(array));
		    
		    ArrayProcessor countFive = counter(5);
		    System.out.println("The number of apparition of 5 is : " + countFive.apply(array));
		  }
}
