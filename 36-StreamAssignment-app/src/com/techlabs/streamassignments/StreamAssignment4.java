package com.techlabs.streamassignments;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAssignment4 {

	public static void main(String[] args) {
		List<Account> accounts=Arrays.asList(new Account(1,"ABCDEF",75000),new Account(2,"B",55000),new Account(3,"C",85000));
        Optional<Account> minimum=accounts.stream().min((account1,account2)->(int)Math.ceil(account1.getSalary()-account2.getSalary()));	
        System.out.println("Account with minimum balance:");
        System.out.println(minimum.get());
        Optional<Account> maximum=accounts.stream().max((account1,account2)->(int)Math.ceil(account1.getSalary()-account2.getSalary()));	
        System.out.println("Account with maximum balance:");
        System.out.println(maximum.get());
        accounts.stream().filter(account->account.getName().length()<=4)
        .forEach(account->System.out.println(account));
        System.out.println("Toatl os salaries:");
      Double total= accounts.stream().map(account->account.getSalary()).reduce(0.0,(x,y)->x+y);
      System.out.println(total);
	}

}
