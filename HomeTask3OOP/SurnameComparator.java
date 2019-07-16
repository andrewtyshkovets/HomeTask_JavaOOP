package com.gmail.tas;

import java.util.Comparator;
import com.gmail.tas.NullCheck;

public class SurnameComparator implements Comparator{
	private boolean reverce;
	
	public SurnameComparator(boolean reverce) {
		super();
		this.reverce = reverce;
	}

	public SurnameComparator() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		int n = reverce ? -1 : 1;
		int result = NullCheck.checkNull(o1, o2);
		if (result != NullCheck.NOT_NULL) {
			return result * n;
		}
		Student student1 = (Student) o1;
		Student student2 = (Student) o2;

		if (student1.getSurname().compareToIgnoreCase(student2.getSurname()) > 0) {
			result = 1;
		}
		if (student1.getSurname().compareToIgnoreCase(student2.getSurname()) < 0) {
			result = -1;
		}
		if (student1.getSurname().compareToIgnoreCase(student2.getSurname()) == 0) {
			result = 0;
		}
		return result * n;
	}

}
