package function;

import java.util.function.Function;

public class MainExample {
	
	private static Student[] students = {
			new Student("홍길동", 91, 96),
			new Student("신용권", 99, 93),
	};
	
	
//	private static double avg(Function<Student> f) {
	private static double avg(Function<Student, Integer> f) {
		int sum=0;
		for(Student student : students )
			sum += f.apply(student);
		
		return (double)sum/students.length;
	}
	public static void main(String[] args) {
	
		double englishAvg = avg(s->s.getEnglishScore());
		System.out.println("영어 평균 : " + englishAvg);

		double mathAvg = avg(s->s.getMathScore());
		System.out.println("영어 평균 : " + mathAvg);
	}
}
