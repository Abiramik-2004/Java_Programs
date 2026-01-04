import java.util.Scanner;
class  Swiggy
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("SELECT THE HOTEL.....");
		System.out.println();
		System.out.println("\t 1.KARAIKUDI KITCHEN:");
		System.out.println("\t 2.KINGS BAKES");
		System.out.println("\t 3.HOTEL JAINIKA ");
		System.out.println("\t 4.GOURMET");
		System.out.println();
		System.out.println("Select the hotel number:");
		int hotel=sc.nextInt();
		switch(hotel){
			case 1:{
				System.out.println();
				System.out.println("WELCOME TO KARAIKUDI KITCHEN...");
				System.out.println();
				System.out.println("Select the order");
				System.out.println("\t1. Chicken biriyani");
				System.out.println("\t2. Mutton biriyani");
				System.out.println("\t3.Chicken Rice");
				System.out.println("\t4.Plain biriyani");
				System.out.println("\t5.Mutton Soup");
				System.out.println("\t6.Thandoori");
				System.out.println();
		        System.out.println("Select the Dishes number:");
		        int Dish=sc.nextInt();
				switch(Dish){
					case 1:{
						int price=180;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
							}
							case 'n':{break;}
						}
										
							
						
					}
					case 2:{
						int price=280;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
							}
							case 'n':{break;}
						}
										
					break;
						
					}
					case 3:{
						int price=120;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
							}
							case 'n':{break;}
						}
										
					break;	
						
					}
					case 4:{
						int price=140;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
							}
							case 'n':{break;}
						}
						break;
					}
					case 5:{
						int price=160;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
							}
							case 'n':{break;}
						}	
						break;
					}
					case 6:{
						int price=160;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
							}
							case 'n':{break;}
						}		
					}
				break;
				}
				break;
			}
			case 2:{
				System.out.println();
				System.out.println("WELCOME TO KINGS BAKES...");
				System.out.println();
				System.out.println("Select the order");
				System.out.println("\t1. Panner Tikka");
				System.out.println("\t2. Kinds signature salad");
				System.out.println("\t3.Chicken Tikka");
				System.out.println("\t4.Broasted Fried Chicken");
				System.out.println("\t5.Peri Peri Chicken");
				System.out.println("\t6.Veg Kolhapuri");
				System.out.println();
		        System.out.println("Select the Dishes number:");
		        int Dish=sc.nextInt();
				switch(Dish){
					case 1:{
						int price=180;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
							
						}
										
						break;	
						
					}
					case 2:{
						int price=280;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
										
					break;
						
					}
					case 3:{
						int price=120;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
										
					break;	
						
					}
					case 4:{
						int price=140;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
						break;
					}
					case 5:{
						int price=160;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}	
						break;
					}
					case 6:{
						int price=160;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}		
					}
				break;
				}
				break;
			}
			case 3:{
				System.out.println();
				System.out.println("WELCOME TO HOTEL JAINIKA...");
				System.out.println();
				System.out.println("Select the order");
				System.out.println("\t1. Aloo Gobi Masala");
				System.out.println("\t2. Kadhai vegetable");
				System.out.println("\t3.Chana Masala");
				System.out.println("\t4.NAvaratan korma");
				System.out.println("\t5.Mix Veg Curry");
				System.out.println("\t6.Onion Kulcha");
				System.out.println();
		        System.out.println("Select the Dishes number:");
		        int Dish=sc.nextInt();
				switch(Dish){
					case 1:{
						int price=180;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
							
						}
										
						break;	
						
					}
					case 2:{
						int price=280;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
										
					break;
						
					}
					case 3:{
						int price=120;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
										
					break;	
						
					}
					case 4:{
						int price=140;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
						break;
					}
					case 5:{
						int price=160;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}	
						break;
					}
					case 6:{
						int price=160;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}		
					}
				break;
				}
				break;
			}
			case 4:{
				System.out.println();
				System.out.println("WELCOME TO GOURMET...");
				System.out.println();
				System.out.println("Select the order");
				System.out.println("\t1. Korean Chicken Wings");
				System.out.println("\t2. Piri Piri paneer finger");
				System.out.println("\t3.Paneer Popcorn");
				System.out.println("\t4.Peanut Salad");
				System.out.println("\t5.Country Chicken Salad");
				System.out.println("\t6.Poppy panner Pizza");
				System.out.println();
		        System.out.println("Select the Dishes number:");
		        int Dish=sc.nextInt();
				switch(Dish){
					case 1:{
						int price=180;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
							
						}
										
						break;	
						
					}
					case 2:{
						int price=280;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
										
					break;
						
					}
					case 3:{
						int price=120;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
										
					break;	
						
					}
					case 4:{
						int price=140;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}
						break;
					}
					case 5:{
						int price=160;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}	
						break;
					}
					case 6:{
						int price=160;
						System.out.println("Enter the quantity:");
						int qty=sc.nextInt();
						int bill=price * qty;
						Thread.sleep(1000);
						System.out.println("The bill amount:"+bill);
						System.out.println("Do you want to continue for further payment(y/n)?");
						char ip=sc.next().charAt(0);
						switch(ip){
							case 'y':{
								
								int otp=(int)(Math.random()*9999+9999);
								Thread.sleep(1000);
								System.out.println("your otp is "+otp);
								System.out.print("enter Otp:");
								int etp=sc.nextInt();
								if(otp==etp){
									System.out.println("choose payment method");
									System.out.println("\t1.Phone Pay");
									System.out.println("\t2.gpay");
									System.out.println("\t2.Amazon Pay");
									System.out.print("enter option ");
									int pay=sc.nextInt();
									switch(pay){
										case 1: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 2: {
											System.out.print("enter the amount:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
										case 3: {
											System.out.print("enter the amoutn:");
											int am=sc.nextInt();
											if(bill==am){
												System.out.println("your payment is completed");
											}
											else{
												System.out.println("enter valid amount");
											}
											break;
										}
									}
								}
								break;
							}
							case 'n':{break;}
						}		
					}
				break;
				}
				break;
				
			}
		}
	}
}
