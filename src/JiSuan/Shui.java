package JiSuan;

import java.util.Scanner;

public class Shui {

	public static void main(String[] args) {
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入工资：");
		int salary=scanner.nextInt();
		
		if(salary<=1500)
		{
			System.out.println("所需要缴纳的税费为："+salary*0.03);
			
		}
		if(salary>1500&&salary<=4500)
		{
			System.out.println("所需要缴纳的税费为："+((salary-1500)*0.1+1500*0.03));
			
		}
		if(salary>4500&&salary<=9000)
		{
			System.out.println("所需要缴纳的税费为："+((salary-4500)*0.2+1500*0.03+3000*0.1));
			
		}
		if(salary>9000&&salary<=35000) 
		{
			System.out.println("所需要缴纳的税费为："+((salary-9000)*0.25+1500*0.03+3000*0.1+4500*0.2));
			
		}
		
		
		if(salary>35000&&salary<=55000)
		{
			System.out.println("所需要缴纳的税费为："+((salary-35000)*0.3+1500*0.03+3000*0.1+4500*0.2+24000*0.25));
			
		}
		if(salary>55000&&salary<=80000)
		{
			System.out.println("所需要缴纳的税费为："+((salary-55000)*0.35+1500*0.03+3000*0.1+4500*0.2+24000*0.25+2000*0.3));
			
		}
		if(salary>80000)
		{
			System.out.println("所需要缴纳的税费为："+((salary-80000)*0.451500*0.03+3000*0.1+4500*0.2+24000*0.25+2000*0.3+25000*0.35));
			
		}
		

	}

}
