package com.mattaparty.s;

import com.mattaparty.s.task.Candies;
import com.mattaparty.s.task.Chocolate;
import com.mattaparty.s.task.NewYearGift;
import com.mattaparty.s.task.GulabJamun;
import com.mattaparty.s.task.SoanPapdi;
import com.mattaparty.s.task.Lollipop;
import com.mattaparty.s.task.Kajukatli;


public class Task1 {
	 public static void main( String[] args )
	    {
		 task a=new task();
	    	NewYearGift r=a.new NewYearGift();
	    	NewYearGift n = a.new NewYearGift("sweetest gift", a.new GulabJamun(15,45),a.new Candies(250,150), a.new Chocolate(170,34),a.new SoanPapdi(35,26),a.new Lollipop(35,26),a.new Kajukatli(35,26));
	        System.out.println(n);

	    }
}