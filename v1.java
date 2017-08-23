import java.util.*;
class mainClass
{
   public static void main(String[] args)
   { Scanner sc=new Scanner(System.in);
      int i=0,n=0,ns=0;
      System.out.println("Enter num of non terminals");
      n=sc.nextInt();
      String[] str=new String[n];
      String[] new_symbols={"E'","K'","T'","P'"};
      String ch=sc.nextLine(); 
      str[i]=sc.nextLine();
      i++;
      while(i<n)
      {
        
        str[i]=sc.nextLine();
        i++;
      }
      
     //System.out.println(str[2]);
     
   
   
   	for(i=0;i<str.length;i++)
   	{
     String rule=str[i];
     int arrow_index=1;
     int vline_index=rule.indexOf('|');
     int a_temp=0,v_temp=0;
     a_temp=arrow_index+1;
     v_temp=vline_index+1;
     
     String common_str="";
     while(a_temp<vline_index && v_temp<rule.length())
     {  

        if(rule.charAt(a_temp)==rule.charAt(v_temp))
        {
        	common_str=common_str+String.valueOf(rule.charAt(a_temp));
        	a_temp++;
        	v_temp++;
        }
        else
           break;
     }
     if(common_str=="")
     {
       System.out.println(rule);
     }
     else
     {
     
     //Before pipe
     String diff_str1="";
     while(rule.charAt(a_temp)!='|')
     {
        diff_str1=diff_str1+String.valueOf(rule.charAt(a_temp));
        a_temp++;
     }
     
     //System.out.println(diff_str1);
     //after pipe
     String diff_str2="";
     while(v_temp<rule.length())
     {
       diff_str2=diff_str2+String.valueOf(rule.charAt(v_temp));
       v_temp++;
     }
     
       System.out.println(rule.substring(0,1)+"-"+common_str+new_symbols[ns]);
       
       if(diff_str2=="")
       {
          diff_str2="#";
          System.out.println(new_symbols[ns]+"-"+diff_str1+"|"+diff_str2);
       }
       else if(diff_str1=="")
       { 
         diff_str1="#";
         System.out.println(new_symbols[ns]+"-"+diff_str1+"|"+diff_str2);
       }
       ns++;
      }  
   	}
   }
   
}
