package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");

		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println(seller);

	}

}
