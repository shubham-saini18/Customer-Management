package com.customer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;




public class CustMain {
public static void main(String[] args) {
	CustRecords custRecord = new CustRecords();
	Scanner scanner = new Scanner(System.in);
	Integer operation;
	do {
			
			System.out.println("Press 1:Display All Employee Data Name Wise(Asending Order)");
			System.out.println("Press 2:To Update Data by Customer ID");
			System.out.println("Press 3:Exit");
			
			 operation =scanner.nextInt();
			switch (operation) {
				case 1:
					CustRecords custrecord = new CustRecords();
					System.out.println("All Customer Data in NameWise(Ascending Order)=");
					List<Customer> list = custRecord.getCustList().stream().
						sorted((c1,c2)->c2.getName().compareTo(c1.getName())).collect(Collectors.toList());
					custrecord.setCustList(list);
					System.out.println(custrecord.toString());
					break;
				case 2:
					
					System.out.println("Enter the ID");
					Integer id=scanner.nextInt();
					System.out.println("Enter the Purchase Amount=");
					Integer purchaseAmount =scanner.nextInt();
					System.out.println("After Update:"+ custRecord.updatePurchaseAmount(id, purchaseAmount));
					break;
			}
				
	}	while(operation!=3);
	
}

}

