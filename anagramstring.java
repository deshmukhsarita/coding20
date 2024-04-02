import java.util.*;
class anagram 
{
String s1="Heart";
String s2="Earth";

if(s1.length()== s2.length())
{
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    char a1[]=s1.toCharArray();
    char a2[]=s2.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    if(a1.equals(a2))
    {
        System.out.println("given string is anagram");
    }
    else{
        System.out.println("given string is not a anagram");
    }

}
}
