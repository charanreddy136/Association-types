package com.gqt.Association1;

public class Student
{
    Heart heart=new Heart(72,340);
    Brain brain=new Brain("Grayish", 1400);
    Bike bike;
    Book book;
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	public void setBook(Book book) {
		this.book = book;
	}
    
    
}
