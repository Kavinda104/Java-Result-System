//**************************************************************************//
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
//@@@@@@@@@@@@@@         		     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//
//##############  Kavinda Gayashan   #######################################//
//@@@@@@@@@@@@@@  MGT.2020.104       				 @@@@@@@@@@@@@@@@@@@@@@@//
//**************  Index Number 6125 			     ***********************//
//$$$$$$$$$$$$$$  Department of Information Systems  $$$$$$$$$$$$$$$$$$$$$$$//
//@@@@@@@@@@@@@@  Faculty of Management Studies      @@@@@@@@@@@@@@@@@@@@@@@//
//%%%%%%%%%%%%%%  Rajarata University of Sri Lanka   %%%%%%%%%%%%%%%%%%%%%%%//
//@@@@@@@@@@@@@@         		  	   			 	 @@@@@@@@@@@@@@@@@@@@@@@//
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$@$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
//**************************************************************************//

import java.util.Scanner;

class ResultSystem
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is your name...?");
		String name = input.nextLine();
		System.out.println(" ");
		
		System.out.println("please enter your index number......!");
		int mark = input.nextInt();
		
		System.out.println("Hi "+name+"...!");
		System.out.println("Welcome to the Examination Result System....");
		System.out.println(" ");
		
		System.out.println("Please enter your Computer Programming subject marks...");
		double markCP = input.nextDouble();
		System.out.println(" ");
		
		
		if (markCP>=85) 
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A+ and You have got a 4.00 GPA value for the Computer Programming subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markCP>=70)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A and You have got a 4.00 GPA value for the Computer Programming subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markCP>=65)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A- and You have got a 3.70 GPA value for the Computer Programming subject");
				System.out.println("Good Job student...Good Luck...!");
			}

		else if(markCP>=60)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B+ and You have got a 3.30 GPA value for the Computer Programming subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markCP>=55)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B and You have got a 3.00 GPA value for the Computer Programming subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markCP>=50)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B- and You have got a 2.70 GPA value for the Computer Programming subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markCP>=45)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C+ and You have got a 2.30 GPA value for the Computer Programming subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markCP>=40)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C and You have got a 2.00 GPA value for the Computer Programming subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markCP>=35)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is C- and You have got a 1.70 GPA value for the Computer Programming subject");
				System.out.println("You could only get "+markCP+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markCP>=30)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D+ and You have got a 1.30 GPA value for the Computer Programming subject");
				System.out.println("You could only get "+markCP+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markCP>=25)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D and You have got a 1.00 GPA value for the Computer Programming subject");
				System.out.println("You could only get "+markCP+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is E and You have got a 0.00 GPA value for the Computer Programming subject");
				System.out.println("You could only get "+markCP+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
		
		
		
		
		
		
		System.out.println("Please enter your IT tools for Management subject marks...");
		double markIT = input.nextDouble();
		System.out.println(" ");
		
		
		if (markIT>=85) 
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A+ and You have got a 4.00 GPA value for the IT tools for Management subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markIT>=70)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A and You have got a 4.00 GPA value for the IT tools for Management subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markIT>=65)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A- and You have got a 3.70 GPA value for the IT tools for Management subject");
				System.out.println("Good Job student...Good Luck...!");
			}

		else if(markIT>=60)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B+ and You have got a 3.30 GPA value for the IT tools for Management subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markIT>=55)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B and You have got a 3.00 GPA value for the IT tools for Management subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markIT>=50)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B- and You have got a 2.70 GPA value for the IT tools for Management subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markIT>=45)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C+ and You have got a 2.30 GPA value for the IT tools for Management subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markIT>=40)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C and You have got a 2.00 GPA value for the IT tools for Management subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markIT>=35)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is C- and You have got a 1.70 GPA value for the IT tools for Management subject");
				System.out.println("You could only get "+markIT+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markIT>=30)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D+ and You have got a 1.30 GPA value for the IT tools for Management subject");
				System.out.println("You could only get "+markIT+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markIT>=25)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D and You have got a 1.00 GPA value for the IT tools for Management subject");
				System.out.println("You could only get "+markIT+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is E and You have got a 0.00 GPA value for the IT tools for Management subject");
				System.out.println("You could only get "+markIT+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
			
			
			
			
		System.out.println("Please enter your Organizational Behaviour subject marks...");
		double markOB = input.nextDouble();
		System.out.println(" ");
		
		
		if (markOB>=85) 
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A+ and You have got a 4.00 GPA value for the Organizational Behaviour subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markOB>=70)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A and You have got a 4.00 GPA value for the Organizational Behaviour subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markOB>=65)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A- and You have got a 3.70 GPA value for the Organizational Behaviour subject");
				System.out.println("Good Job student...Good Luck...!");
			}

		else if(markOB>=60)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B+ and You have got a 3.30 GPA value for the Organizational Behaviour subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markOB>=55)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B and You have got a 3.00 GPA value for the Organizational Behaviour subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markOB>=50)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B- and You have got a 2.70 GPA value for the Organizational Behaviour subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markOB>=45)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C+ and You have got a 2.30 GPA value for the Organizational Behaviour subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markOB>=40)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C and You have got a 2.00 GPA value for the Organizational Behaviour subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markOB>=35)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is C- and You have got a 1.70 GPA value for the Organizational Behaviour subject");
				System.out.println("You could only get "+markOB+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markOB>=30)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D+ and You have got a 1.30 GPA value for the Organizational Behaviour subject");
				System.out.println("You could only get "+markOB+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markOB>=25)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D and You have got a 1.00 GPA value for the Organizational Behaviour subject");
				System.out.println("You could only get "+markOB+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is E and You have got a 0.00 GPA value for the Organizational Behaviour subject");
				System.out.println("You could only get "+markOB+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
			
			
			
			
			
		System.out.println("Please enter your Business Statistics subject marks...");
		double markBS = input.nextDouble();
		System.out.println(" ");
		
		
		if (markBS>=85) 
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A+ and You have got a 4.00 GPA value for the Business Statistics subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBS>=70)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A and You have got a 4.00 GPA value for the Business Statistics subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBS>=65)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A- and You have got a 3.70 GPA value for the Business Statistics subject");
				System.out.println("Good Job student...Good Luck...!");
			}

		else if(markBS>=60)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B+ and You have got a 3.30 GPA value for the Business Statistics subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBS>=55)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B and You have got a 3.00 GPA value for the Business Statistics subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBS>=50)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B- and You have got a 2.70 GPA value for the Business Statistics subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBS>=45)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C+ and You have got a 2.30 GPA value for the Business Statistics subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markBS>=40)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C and You have got a 2.00 GPA value for the Business Statistics subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markBS>=35)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is C- and You have got a 1.70 GPA value for the Business Statistics subject");
				System.out.println("You could only get "+markBS+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markBS>=30)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D+ and You have got a 1.30 GPA value for the Business Statistics subject");
				System.out.println("You could only get "+markBS+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markBS>=25)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D and You have got a 1.00 GPA value for the Business Statistics subject");
				System.out.println("You could only get "+markBS+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is E and You have got a 0.00 GPA value for the Business Statistics subject");
				System.out.println("You could only get "+markBS+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
			
			
			
			
			
		System.out.println("Please enter your Business English subject marks...");
		double markBE = input.nextDouble();
		System.out.println(" ");
		
		
		if (markBE>=85) 
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A+ and You have got a 4.00 GPA value for the Business English subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBE>=70)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A and You have got a 4.00 GPA value for the Business English subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBE>=65)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A- and You have got a 3.70 GPA value for the Business English subject");
				System.out.println("Good Job student...Good Luck...!");
			}

		else if(markBE>=60)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B+ and You have got a 3.30 GPA value for the Business English subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBE>=55)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B and You have got a 3.00 GPA value for the Business English subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBE>=50)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B- and You have got a 2.70 GPA value for the Business English subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markBE>=45)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C+ and You have got a 2.30 GPA value for the Business English subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markBE>=40)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C and You have got a 2.00 GPA value for the Business English subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markBE>=35)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is C- and You have got a 1.70 GPA value for the Business English subject");
				System.out.println("You could only get "+markBE+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markBE>=30)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D+ and You have got a 1.30 GPA value for the Business English subject");
				System.out.println("You could only get "+markBE+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markBE>=25)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D and You have got a 1.00 GPA value for the Business English subject");
				System.out.println("You could only get "+markBE+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is E and You have got a 0.00 GPA value for the Business English subject");
				System.out.println("You could only get "+markBE+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
			
			
			
			
			
			
			
		System.out.println("Please enter your Professional Skills Development subject marks...");
		double markPSD = input.nextDouble();
		System.out.println(" ");
		
		
		if (markPSD>=85) 
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A+ and You have got a 4.00 GPA value for the PSD Subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markPSD>=70)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A and You have got a 4.00 GPA value for the PSD Subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markPSD>=65)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is A- and You have got a 3.70 GPA value for the PSD Subject");
				System.out.println("Good Job student...Good Luck...!");
			}

		else if(markPSD>=60)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B+ and You have got a 3.30 GPA value for the PSD Subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markPSD>=55)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B and You have got a 3.00 GPA value for the PSD Subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markPSD>=50)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is B- and You have got a 2.70 GPA value for the PSD Subject");
				System.out.println("Good Job student...Good Luck...!");
			}
			
		else if(markPSD>=45)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C+ and You have got a 2.30 GPA value for the PSD Subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markPSD>=40)
			{
				System.out.println("Congratulations "+name+"....");
				System.out.println("Your result is C and You have got a 2.00 GPA value for the PSD Subject");
				System.out.println("Good Job but you should work hard student...Good Luck...!");
			}
			
		else if(markPSD>=35)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is C- and You have got a 1.70 GPA value for the PSD Subject");
				System.out.println("You could only get "+markPSD+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markPSD>=30)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D+ and You have got a 1.30 GPA value for the PSD Subject");
				System.out.println("You could only get "+markPSD+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else if(markPSD>=25)
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is D and You have got a 1.00 GPA value for the PSD Subject");
				System.out.println("You could only get "+markPSD+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
		else
			{
				System.out.println("Oops "+name+"....!");
				System.out.println("Your result is E and You have got a 0.00 GPA value for the PSD Subject");
				System.out.println("You could only get "+markPSD+"");
				System.out.println("You failed this examination this time");
				System.out.println("You have to get minimum of 40 marks and 2.00 GPA value to pass the examination...");
				System.out.println("Please TRY next time and WORK HARD...");
			}
			
			
			System.out.println("Thank you for using Examination Results System...!");
			System.out.println("Have a nice day....Good Luck...!");
	}
	
}