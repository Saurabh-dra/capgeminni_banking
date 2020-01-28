package capgemini.bank.rbi;

import java.util.Scanner;
public class Welcome {

		Scanner sc=new Scanner(System.in);
		public static void main(String args[])
		{
			Welcome mObject=new Welcome();
			mObject.selectBank();
			System.out.println();
		}
		public void selectBank() {
			System.out.println("Welcome to IBS");
			int flag=1;
			while(flag==1) {
			System.out.println("1. ICICI \n2. HDFC \n3. SC \n4. Axis");
			int number=sc.nextInt();
			switch(number)
			{
			case 1: icici();
					break;
			case 2: hdfc();
					break;
			case 3: sc();
					break;		
			case 4: axis();
					break;
			default : break;
			}	
			}
		}
		public void icici() {
			ICICI iObject=new ICICI();
			int flag=1;
			while(flag==1) {
			System.out.println("Select Operation: \n1. Add Money 2. Withdraw 3. Display 4.End");
			int operation=sc.nextInt();
			switch(operation)
			{
			case 1: iObject.addAmount();
					break;
			case 2: iObject.withdrawAmount();
					break;
			case 3: iObject.displayBalance();
					break;
			case 4: flag=0;break;
			default :System.out.println("Wrong Operation!"); break;
			}
			}
		}
		public void hdfc() {
			HDFC hObject=new HDFC();
			int flag=1;
			while(flag==1) {
				System.out.println("Select Operation: \n1. Add Money 2. Withdraw 3. Display 4.End");
				int operation=sc.nextInt();
				switch(operation)
				{
				case 1: hObject.addAmount();
						break;
				case 2: hObject.withdrawAmount();
						break;
				case 3: hObject.displayBalance();
						break;
				case 4: flag=0;break;
				default :System.out.println("Wrong Operation!"); break;
				}
			}
		}
		public void sc() {
			SC sObject=new SC();
			int flag=1;
			while(flag==1) {
				System.out.println("Select Operation: \n1. Add Money 2. Withdraw 3. Display 4.End");
				int operation=sc.nextInt();
				switch(operation)
				{
				case 1: sObject.addAmount();
						break;
				case 2: sObject.withdrawAmount();
						break;
				case 3: sObject.displayBalance();
						break;
				case 4: flag=0;break;
				default :System.out.println("Wrong Operation!"); break;
				}
			}
		}
		public void axis() {
			AXIS aObject=new AXIS();
			int flag=1;
			while(flag==1) {
				System.out.println("Select Operation: \n1. Add Money 2. Withdraw 3. Display 4.End");
				int operation=sc.nextInt();
				switch(operation)
				{
				case 1: aObject.addAmount();
						break;
				case 2: aObject.withdrawAmount();
						break;
				case 3: aObject.displayBalance();
						break;
				case 4: flag=0;break;
				default :System.out.println("Wrong Operation!"); break;
				}
			}
		}
}



