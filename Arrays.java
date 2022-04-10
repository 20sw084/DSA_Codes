//Method 1(int array) 

public class Arrays_1
{
	public static void main(String[] args) {
	    int[] arr =new int[5];
	    arr=new int[]{1,2,3,4,5};
	    for(int i=0;i<arr.length;i++)
	    System.out.println(arr[i]);
	}
}


//Method 2 (int array)

public class Arrays_2
{
	public static void main(String[] args) {
	    int[] arr ={1,2,3,4,5};
	    for(int i=0;i<arr.length;i++)
	    System.out.println(arr[i]);
	}
}


//Method 1 (String array)



public class Arrays_1 
{
	public static void main(String[] args) {
	    String[] strarr =new String[5];
	    strarr=new String[]{"Apple","Banana","Orange","PineApple","WaterMelon"};
	    for(int i=0;i<strarr.length;i++)
	    System.out.println(strarr[i]);
	}
}


//Method 2 (String array)


public class Arrays_2
{
	public static void main(String[] args) {
	    String[] strarr ={"Apple","Banana","Orange","PineApple","WaterMelon"};
	    for(int i=0;i<strarr.length;i++)
	    System.out.println(strarr[i]);
	}
}


//Arrays Sorting Manually (Integers)


public class ArraySorting
{
	public static void main(String[] args) {
	    int[] arr ={111,22,3,42,15};
	   for (int i = 0; i < arr.length; i++)   
        { 
        for (int j = i + 1; j < arr.length; j++)   
        {  
            int tmp = 0;  
                if (arr[i] > arr[j])   
                {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
        }  
        }
	    for(int i=0;i<arr.length;i++)
	    System.out.println(arr[i]);
}
}

//Arrays Sorting by Functions (Integers)

import java.util.Arrays;
public class ArraySorting
{
	public static void main(String[] args) {
	    int[] arr ={111,22,3,42,15};
	  Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++)
	    System.out.println(arr[i]);
}
}


//Arrays String Sorting By Function (String)

import java.util.Arrays;
public class Main
{  
public static void main(String args[])   
{  
//defining an array of type string  
String[] str = {"Wood apple", "Blackberry", "Date", "Naseberry", "Tamarind", "Fig", "Mulberry",  "Apple", "Plum",  "Orange", "Custard apple",  "Apricot"};  
//sorts string array in alphabetical order or ascending order  
Arrays.sort(str);  
//prints the sorted string array in ascending order  
for(int i=0;i<str.length;i++){
    System.out.println(str[i]);
}
// System.out.println(Arrays.toString(str));  
}  
}  

//Array String Sorting Manually (String)

import java.util.Arrays;
public class Main
{  
public static void main(String args[])   
{  
//defining an array of type String  
String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
int size = countries.length;  
//logic for sorting   
for(int i = 0; i<size-1; i++)   
{  
for (int j = i+1; j<countries.length; j++)   
{  
//compares each elements of the array to all the remaining elements  
if(countries[i].compareTo(countries[j])>0)   
{  
//swapping array elements  
String temp = countries[i];  
countries[i] = countries[j];  
countries[j] = temp;  
}  
}  
}  
//prints the sorted array in ascending order  
System.out.println(Arrays.toString(countries));  
}  
}  



