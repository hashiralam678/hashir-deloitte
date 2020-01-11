package com.newdata.deloitte;

public class Assignment1 {

	public static void main(String[] args) {
		String email[]= {"albert.einstein@gmail.com","leonardo_da_vinci@hotmail.com","jagadish_chandra_bose@yahoo.com",
						 "alan_turing@yahoo.com","srinivasa.ramanujan@gmail.com","bjarne_stroustrup@yahoo.com","max.plank@gmail.com",
						 "nikol.tesla@hotmail.com","galileo_galilei@hotmail.com","a.p.j.abdul.kalam@gmail.com","richard.stalllman@inbox.com",
						 "c_v_raman@inbox.com"};
		
		int len= email.length;
		String gmail[]= new String[len];
		String yahoo[]= new String[len];
		String hotmail[]= new String[len];
		String inbox[]= new String[len];
		int p=0,q=0,r=0,s=0;
		for(int i=0; i<len;i++)
		{
			if(email[i].contains("gmail"))
			{
				gmail[p]=email[i];
				p++;
				
			}
			else if(email[i].contains("yahoo"))
			{
				yahoo[q]=email[i];
				q++;
			}
			else if(email[i].contains("hotmail"))
			{
				hotmail[r]=email[i];
				r++;
			}
			else
			{
				inbox[s]=email[i];
				s++;
			}
			for(int j=0;j<len;j++)
			{
				if(gmail[j]==null)
				{
					gmail[j]="";
				}
				if(yahoo[j]==null)
				{
					yahoo[j]="";
				}
				if(hotmail[j]==null)
				{
					hotmail[j]="";
				}
				if(inbox[j]==null)
				{
					inbox[j]="";
				}
			}
		}
		/*
		System.out.println("Gmail");
		for(String one:gmail)
		{
			System.out.println(one);
		}
		System.out.println("Yahoo");
		for(String two:yahoo)
		{
			System.out.println(two);
		}
		System.out.println("Hotmail");
		for(String three:hotmail)
		{
			System.out.println(three);
		}
		System.out.println("Inbox");
		for(String four:inbox)
		{
			System.out.println(four);
		}
		*/
		System.out.printf( "%40s %40s %40s %40s \n","Gmail","Yahoo","Hotmail","Inbox");
		
		for(int l=0;l<len;l++)
		{
			System.out.printf("%40s %40s %40s %40s \n",gmail[l],yahoo[l],hotmail[l],inbox[l]);
		}
	}

}
