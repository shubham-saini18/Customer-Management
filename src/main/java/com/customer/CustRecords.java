package com.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class CustRecords {
	private List<Customer> CustList;

	public void CustRecords() {
		CustList= new ArrayList<>();
		CustList.add(new Customer(101, "Suryanshi Mehta", 27, 2000));
		CustList.add(new Customer(102, "Abshiek Garg", 28, 1500));
		CustList.add(new Customer(104, "Priya Sharma", 25, 6500));
		CustList.add(new Customer(110, "Vijay Saini", 21, 10500));
		CustList.add(new Customer(107, "Rithika Mathur", 25, 3500));
		CustList.add(new Customer(109, "Ishu Sai", 24, 6210));
		CustList.add(new Customer(108, "Himanshu singh", 26, 2555));
		CustList.add(new Customer(103, "Yuvraj Sen", 25, 5555));
		CustList.add(new Customer(105, "Nikita Roy", 26, 7669));
		CustList.add(new Customer(106, "Manisha Verma", 29, 90876));
	}
	
	public List<Customer> getCustList() {
		return this.CustList;
	}
	public void setCustList(List<Customer> custList) {
		this.CustList = custList;
	}
	public Customer updatePurchaseAmount(Integer id, Integer purchaseAmount) {
		List<Customer> list = CustList.stream().filter(c -> c.getId() == id).collect(Collectors.toList());
			Customer customer = list.get(0);
			((Customer) customer).setPurchaseAmount(purchaseAmount);
			CustList.remove(customer);
			return customer;
		}
	}


