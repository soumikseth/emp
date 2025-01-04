package com.employee.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpApplication.class, args);
		//making changes
		public String getRandomElementFromArray(String[] array) {
    Random rand = new Random();
    return array[rand.nextInt(array.length)];
}

public double generateRandomDouble() {
    Random rand = new Random();
    return rand.nextDouble();
}

public boolean generateRandomBoolean() {
    Random rand = new Random();
    return rand.nextBoolean();
}
public int generateRandomInt(int lowerBound, int upperBound) {
    Random rand = new Random();
    return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
}

	}

}
