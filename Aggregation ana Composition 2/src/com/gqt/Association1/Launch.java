package com.gqt.Association1;

public class Launch {

	public static void main(String[] args) {
		Bike bike = new Bike("Pulsar", 35);
		Book book = new Book("Bimal Jalal", "The India Story");
		Student stu = new Student();
		stu.setBike(bike);
		stu.setBook(book);
		System.out.println("Heart beat"+"-"+stu.heart.getHeartbeat());
		System.out.println("Heart Weight"+"-"+stu.heart.getWeight());
		System.out.println("Brain colour"+"-"+stu.brain.getColour());
		System.out.println("Brain Weight"+"-"+stu.brain.getWeight());
		System.out.println("Bike Brand"+"-"+stu.bike.getBrand());
		System.out.println("Bike Mileage"+"-"+stu.bike.getMileage());
		System.out.println("Book Author"+"-"+stu.book.getAuthor());
		System.out.println("Book Title"+"-"+stu.book.getTitle());
		stu=null;
		/*System.out.println("Heart beat"+"-"+stu.heart.getHeartbeat());
		System.out.println("Heart Weight"+"-"+stu.heart.getWeight());
		System.out.println("Brain colour"+"-"+stu.brain.getColour());
		System.out.println("Brain Weight"+"-"+stu.brain.getWeight());
		System.out.println("Bike Brand"+"-"+stu.bike.getBrand());
		System.out.println("Bike Mileage"+"-"+stu.bike.getMileage());
		System.out.println("Book Author"+"-"+stu.book.getAuthor());
		System.out.println("Book Title"+"-"+stu.book.getTitle());
		*/
		System.out.println();
		System.out.println("Bike Brand"+"-"+bike.getBrand());
		System.out.println("Bike Mileage"+"-"+bike.getMileage());
		System.out.println("Book Author"+"-"+book.getAuthor());
		System.out.println("Book Title"+"-"+book.getTitle());

		

	}

}
