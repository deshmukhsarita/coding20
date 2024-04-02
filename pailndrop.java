class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int num=101;//It is the number variable to be checked for palindrome  
  
  temp=num;    
  while(num>0){    
   r=num%10;  //getting remainder  
   sum=(sum*10)+r;    
   num=num/10;    
  }    
  if(temp==sum)    
   System.out.println("it is palindrome number");    
  else    
   System.out.println("it is not a palindrome number");    
}  
}  