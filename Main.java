
// int arr=[1,2,3,4,5,6,7]


// target =5\


// 121 
// 3333 
// 333
// 33
// 3

// class Hello{
    // public static void main(String[] args) {
    //     int[]  arr={1,2,3,4,5,6,65};

    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]);

    //     }
    
        // System.out.println(arr[arr.length-1]);
      
    
    
    // }

// }

// class  Hello{
//     public static void main(String[] args) {
//         int[][] arr={ 
//                     {1,2,3,4}, 
//                      {1,2,3,4},
//                     {1,2,3,4}  };
//         // System.out.println(arr.length);
//         // int sum=0;
//         for(int i=0;i<arr.length;i++){
//             int rowWiseSum=0;
//             for(int j=0;j<arr[i].length;j++){
//                 // System.out.print(arr[i][j]);
//                 rowWiseSum+=arr[i][j];

//             }
//             System.out.println("rowWiseSome" + "  " +i+"  " +rowWiseSum);
        
//             // System.out.println();
//         }
    
             
//     }
// }

// class Hello{
//     public static void main(String[] args) {
//         int[] arr1={1,2,3,4,5};
//         int[]  arr2={1,2,3,4,5};
//         int[] sum=new int[arr1.length];
//         for(int i=0;i<arr1.length;i++){
//             sum[i]=arr1[i]+arr2[i];
//         }
//         // for(int k=0;k<5;k++){
//         //     System.out.println();
//         // }


        
//     }
// }


// class Hello{
//     public static void main(String[] args) {
//         int[][] arr={ {1,2,3,4},{1,2,3,4}}; 
//         // System.out.println(arr.length);
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         } 
//     }
// }  

//  class Hello{
//     public static void main(String[] args) {
//          Scanner sc=   new Scanner(System.in);
//          System.out.println("Enter size of the arrr");
//          int n=sc.nextInt();
//          System.out.println("Enter arr valuesss");
//          int[] arr=new int[n];
//          for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//          }
//           int max=0;
//          for(int j=0;j<arr.length;j++){
//             // System.out.print(arr[j]);
//             // sum+=arr[j];
//             // if(max<arr[j])
//             // max=arr[j]


//          }



 



        // int[]  arr=new int[5];
        // int[] arr={1,2,3,4,5};
        // System.out.println(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }



        
//     // }
// //  }



// class Hello{
//     public static void main(String[] args) {
//         int[] arr1={1,2,3,45,00,122,44};
//         int even=0;
//         int odd=0;
//         for(int  i=0;i<arr1.length;i++){
//             if(arr1[i]%2==0){
//                 even++;
//             }
//             else{
//                 odd++;
//             }
//         }
//         System.out.println("even"+ "   " + even + "  "+ "oddd" +"  " +odd);

//         // int[] arr2={2,3,4,5,5,7};
//     }
// }


// int[] arr2={1,2,3,4};
// int[] arr1={1,2,3,4};
// int[]  sum={2,4,6,8}


// class  Hello{
//     public static void main(String[] args) {
//         int[] arr1={1,2,3,4};
//         int[] arr2={2,3,4,5};   
//         int[]  sum =new int[arr1.length];
//         for(int i=0;i<arr1.length;i++){
//             sum[i]=arr1[i]+arr2[i];
//         }
//         for(int j=0;j<4;j++){
//             System.out.print(sum[j]+ "  ");
//         }
//     }
// }

// class Hello {
//     public static void main(String[] args) {
//         int[][] arr = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 56, 6}};

//         // Step 1: Total elements count karo
//         int totalLength = 0;
//         for (int i = 0; i < arr.length; i++) {
//             totalLength += arr[i].length;
//         }

//         // Step 2: 1D array banayo
//         int[] arr1 = new int[totalLength];

//         // Step 3: Copy elements
//         int k = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr1[k] = arr[i][j];
//                 k++;
//             }
//         }

//         // Step 4: Print 1D array
//         for (int p = 0; p < arr1.length; p++) {
//             System.out.println(arr1[p]);
//         }
//     }
// }


// class Hello{
//     public static void main(String[] args) {
        // String str="helllo";
        // String str2="helllo";
        // System.out.println(str==str2);

        // System.out.println(str.indexOf("h"));
        // System.out.println(str2);
        // int count=0;
        // char[] charArr=str.toCharArray();
        // char[] charArr1=str2.toCharArray();

        // for(char c=0;c<str.length();c++){
        //     for(char a=0;a<str2.length();a++){
        //         if(str.charAt(c)==str2.charAt(a)){
        //              count++;
        //         }
        //     }
          
        // }
        // System.out.println(count);
   
       

        // String str1="helllo";

        // StringBuilder str3=new StringBuilder("hello");
        // StringBuilder str4=new StringBuilder("hello");
        // str.append("hhehehe");
        // System.out.println(str);

        // for(int i=0;i<str.length();i++){
        //     // System.out.println(str.charAt(i));
        //     // str1.charAt(i)=i;
        //     str1.append(str.charAt(i));

        // }
        // System.out.println(str3==str);
    // }
// }


// class  Hello{
//     public static void main(String[] args) {
//         int[][] arr={    {1,2,3,4,5},{2,3,4,5,6},{2,3,4} }; 
//         int total=0;
//         int z=0;
//         int[] arr1=new int[total];
//         for(int i=0;i<arr.length;i++){
            
            
//             total+=arr[i].length;
//         }


//         for(int k=0;k<arr.length;k++){
//             for(int j=0;j<arr[k].length;j++){
//                 arr1[z]=arr[k][j];
//                 z++;

//             }
//         }

//         for(int f=0;f<arr1.length;f++){
//             System.out.println(arr1[f]);
//         }
//         // for(int i=0;i<arr.length;i++){
//         //     for(int j=0;j<arr[i].length;j++){
//         //         // System.out.print(arr[i][j]);
//         //         // sum+=arr[i][j]
//         //         System.out.println("hehehehe");
             
               
//         //     }
//         //     System.out.println();
//         // }


//         // System.out.println(arr.length);



//     }
// }
// int[][]  arr={{1,2,3,4},{3,4,5,6},{4,5,67}};
// arr1={1,2,34,3,4,5,6,4,5,67}

// class Hello{
//     public static void main(String[] args) {
//         int[][] arr={{1,2,3},{3,2,1}};

//         int totalCount=0;
//         for(int i=0;i<arr.length;i++){
//             totalCount+=arr[i].length;
//         }
//         int[] outArr=new int[totalCount];

//          int k=0;
//         for(int x=0;x<arr.length;x++){
//             for(int y=0;y<arr[x].length;y++){
//                 outArr[k]=arr[x][y];
//                 k++;

//             }
//         }

//         for(int s=0;s<totalCount;s++){
//             System.out.print(outArr[s] + "  ");
//         }




//         //   int totalCount=0;

//         //   for(int i=0;i<arr.length;i++){
//         //     totalCount=totalCount+arr[i].length;
//         //   }
//         //   System.out.println(totalCount);
//         // for(int i=0;i<arr.length;i++){
//         //     for(int j=0;j<arr[i].length;j++){
//         //         System.out.println("heheh");
//         //         totalCount++;

//         //     }

//         // }
        
//     }
// }



// class Hello {
    // public static void main(String[] args) {

        // String str="eye";
        // str="hello";
        // String str=new String("hello");
        // String str1=new String("hello");
        // System.out.println(str==str1);


        // String newString=str+"";
        // String newStr="hello";
        // System.out.println(newString);
        // String str1="hello";
        // String str2="hello";








        // String str="helllo";
        // String newStr="";
        // // System.out.println("hello"!="hello");
        // for(int i=0;i<str.length();i++){
        //     char c =str.charAt(i);

        //     if(newStr.indexOf(c)==-1){
        //         newStr+=c;
        //     }
        
        // }
        // System.out.println(newStr+ "hehehehe");
    
     
    // }
// }




// class Hello{
//     public static void main(String[] args) {
//         String str="helllo";

//         String newString="";
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//             if(newString.indexOf(c)!=-1){
//                 newString+=c;
//             }
//         }
//         System.out.println(newString);
        
//     }
// }


// class  Hello{
//     public static void main(String[] args) {
//         String s = "hello";
//         String a="hello";
//         String output=a+"";
//         System.out.println(s==output);

//         // s.charAt(1)="p";
//         // s += "world";
        
//         // System.out.println(s);
//     }
// }



// "helloooooo"


// class Hello{
//     public static void main(String[] args) {
//         String str="heloool";
//         char[] ch=str.toCharArray();
//         // {'h','e','l''l','o'}
//         for(int i=0;i<ch.length;i++){
//             for(int j=i+1;j<ch.length;j++){
//                 if(ch[i]==ch[j]){
//                     System.out.println(ch[i]);
//                     return;

//                 }
//             }
//             // System.out.println(ch[i]);
//         }
        
//     }

// }

// class Hello{
    // public static void main(String[] args) {
        // String str="hello";
        // System.out.println(str.concat("hiii"));

        // System.out.println(str);
        // str="hiii";
        // System.out.println(str);
        // StringBuilder str= new StringBuilder(15);
        // str.append("hii hello byee ");
        // System.out.println(str.capacity());
        // System.out.println(str.length());

        // str.append("hiii");
        // System.out.println(str);
        // System.out.println(str);
        // int[] a = new int[3];
        // System.out.println(a[0] + a[1] + a[2] + a[3]);


        // char[] ch=str.toCharArray();
        //  for(int i=0;i<ch.length;i++){
        //     for(int j=i+1;j<ch.length;j++){
        //         if(ch[i]==ch[j]){
        //             System.out.println(ch[j]);
        //             return;
        //         }
        //     }
        //  }

        // String str1="eye";
    //     String str=new String("hello");
    //     String str1=new String("hello");
    //    System.out.println(str==str1);

        // System.out.println(str==str1111);


        // String newStr="";
        // for(int i=0;i<str.length();i++){
        //     char c=str.charAt(i);
        //     if(newStr.indexOf(c)==-1){
        //         newStr=newStr+c;
        //     }
        // }
        // System.out.println(newStr + "   ");


        


    // }
// }

// class Hello{
//     public static void main(String[] args) {
//         String str="hellllloo";
//         int maxCount=0;
//         char ch=' ';
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//             int count=0;
//             for(int j=0;j<str.length();j++){
//                 if(str.charAt(j)==c){
//                     count++;

//                 }
//             }
//             if(count>maxCount){
//                 maxCount=count;
//                 ch=c;
//             }
//         }
//         System.out.println(ch);



//     }
// }


// class Hello{
//       void call(){
//     System.out.println("hello");

//     }
//     public static void main(String[] args) {
//         // System.out.println("");
//         Hello obj=new Hello();
//         obj.call();
//         // call();
//     }
// }
// class Hello{
    // public static void main(String[] args) {
        // int[] arr=new int[5];
        // arr[5]=5;
        // System.out.println(arr[5]);
        // int a=012;
        // int a=_10_10; 


        // int a=3;
        // while (a<5){
        //     System.out.println("hiii");
        //     a++;
        // }
     
            
        
        
       
    // }
// }


// class Hello{
    // public static void main(String[] args) {
        // String str="hello";
        // str="hiii";
        // System.out.println(str.concat("hiii"));
        // System.out.println(str);
        // StringBuilder str= new StringBuilder("hello");
        // str.append("hiii");
        // System.out.println(str);
        // StringBuilder str=new StringBuilder(10);
        // str.append("hello ueueueueueeu   heheh hiii byeee");
      
        // System.out.println(str.length());
        // System.out.println(str.capacity());



        
    // }
// }


// class Hello{

 

    // void sum(int a,int b){
    //    int c=a+b;
    //    int count=0;
    //    while(c>0){
    //     int digit=c%10;
    //     if(digit>count){
    //         count=digit;

    //     }
    //     c=c/10;
    //    }
    //    System.out.println(count);
    // }
    //  int a=5;
    // public static void main(String[] args) {
    //     Hello obj=new Hello();
    //     System.out.println(obj.a);
        // System.out.println(a);
        // int a=5;
        // System.out.println(a);
        // Hello obj=new Hello();
        // obj.sum(5,2);
        // Hello obj= new Hello()
        // System.out.println(Hello.a);
        // Hello obj= new Hello();
        // obj.sum();
        // int output=sum(202,7);
     
        // System.out.println(output);
       
    // }

// }



// class Hello{
//     // int a=5;
// //    int a=12;
//     public static void main(String[] args) {


//         int hello=5;
//         System.out.println(hello);

//         // StringBuffer str=new StringBuffer("hello");
//         // System.out.println(str+ " ");
//         // int[] arr={3,4,1,-3,0}; 
//     //   int a=13;
//     //   System.out.println(a);
//         // Hello obj=new Hello();
//         // System.out.println(obj.a);
//         // System.out.println(Hello.a);
//         // int[] arr=new int[4];
//         // arr[4]
//         // String str="hello";
//         //    System.out.println(str.concat("hiii"));
//         //    System.out.println(str);
//         // StringBuilder str=new StringBuilder(5);
//         //       str.append("hiiiii");
//         // str.append("hiiiiii");
//         // oldC*2+2
//         // System.out.println(str.capacity());
//         // str.append("hiiii");
//         // System.out.println(str);

         
//         // int a=5;
//         // while(a<7);
//         //  System.out.println("hee");
//         //  a++;
//         // int a=012;   
//     // boolean a=true;
//     // if(0)

//     // {3,0,1,2,5}
//     // n(n+1)





        
//     }
// }


// public class Main {
//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) { // n-1 passes
//             for (int j = 0; j < n - i - 1; j++) { // compare till unsorted part
//                 if (arr[j] > arr[j + 1]) {
//                     // swap arr[j] and arr[j+1]
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {5, 1, 4, 2, 8};
//         bubbleSort(arr);
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


// class Hello{
//     public  static  void bubbleSort(int[] arr){
   
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;

//                 }
//             }
//         }

//         for(int i : arr){
//             System.out.println(i);
//         }

//     }
//     public static void main(String[] args) {
//         int[] arr={2,1,3,53,52};
//         bubbleSort(arr);
        
//     }
// }

// public class BinarySearch {
//     public static int binarySearch(int[] arr, int target) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {
//                 return mid; // Target found
//             }
//             if (arr[mid] < target) {
//                 left = mid + 1; // Search in the right half
//             } else {
//                 right = mid - 1; // Search in the left half
//             }
//         }
//         return -1; // Target not found
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int target = 30;
//         int result = binarySearch(arr, target);
//         System.out.println(result != -1 ? "Element found at index " + result : "Element not found");
//     }
// }


// class Hello{
//     // public  static void sum(int a){
//     //     // System.out.println(a);
//     //     for(int i=0;i<=a;i++){
//     //         System.out.println(i);

//     //     }

//     // }
//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);
//         int a= obj.nextInt();
//         sum(a);


        
//     }
// }


// class Hello{
//     public static void BubbleSort(int[] arr) {
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;

//                 }

//             }
//         }

//         for(int i :arr){
//             System.out.println(i);

//         }
        
//     }
//     public static void main(String[] args) {
//         // int[] arr={22,4,7,6,3,0,12};
//         //     int target=7
//         // BubbleSort(arr);

    

        
//     }
// }


// class Hello{
//     public static int  LinerS(int[] arr,argetValue) {
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i] ==target){
//                    return i 
//                 }
//                 else{
//                     return -2
//                 }
//             }

        
//     }
//     public static void main(String[] args) {
//         int[] arr={1,3,24,5,3};
//         int targetValue=100;
//         LinerS(arr,targetValue);
        
//     }
// }

// {0,1,2,3,4,56,0}
// target=3


// class Hello {

//     public static int BinarySearch() {
//         int target = 2;
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//         int start = 0;
//         int endPoint = arr.length - 1;

//         while (start <= endPoint) {
//             int midPoint = (start + endPoint) / 2; 

//             if (arr[midPoint] == target) { 
//                 return midPoint;
//             } 
//             else if (arr[midPoint] > target) {
//                 endPoint = midPoint - 1; 
//             } 
//             else {
//                 start = midPoint + 1; 
//             }
//         }
//         return -1; 
//     }

//     public static void main(String[] args) {
//         System.out.println(BinarySearch());
//     }
// }



// class Hello{
//          static  void   sum(int a){
//             // int b=5;
//             // return a+b;
//             System.out.println(a);

//       }

//     public static void main(String[] args) {
//         // Hello obj=new Hello();
//         // obj.sum();
//         sum(5);
//         //  System.out.println(sum(5));

        
//     }
  
// }



// class Hello{
//       void sum(int a){
//         System.out.println(a);
       
      
//         // System.out.println("hiiiii");

//     }
//     public static void main(String[] args) {
//         Hello obj=new Hello();
//         obj.sum(5);
//         // sum(5);
//         // sum();

        
//     }
// }



// class Hello{
       
//         static  void sum(int a){
//             for(int i=0;i<a;i++){
//                 System.out.println(i);
//             }

//         }
//     public static void main(String[] args) {
//         Scanner  obj=new Scanner(System.in);
//         int a=obj.nextInt();
//         sum(a);



//     }
// }


// class Hello{
//     static int targetSum(int[] arr){
//         int target=4;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int[]  arr={1,2,3,4,5,5};
     
       
//         System.out.println( targetSum(arr));

//      }
// }



// class Hello{
//     static  void BubbleSort(int[] arr){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;

//                 }
//             }
//         }
//         for(int i :arr){
//             System.out.println(i);

//         }

//     }

//     public static void main(String[] args) {
//         int[] arr={2,1,34,2,45,2,5,0};
//         BubbleSort(arr);

      
//     }
// }



// class Student{
//      String name;
//      int age;

//      Student(String name,int age){
//         name=name;
//         age=age;


//      }
//     void display(){
//         System.out.println("name of the student is " + name + " and age "+age);
//     }
//     // void display1(){
//     //     System.out.println("name of the student is " + name + " and age "+age);
//     // }

// }
// class Hello{
//     public static void main(String[] args) {
//         Student obj=new Student("rupesh",15);
//         obj.display();
        

//         // obj.display();
//         // obj.display1();

        
//     }
// }



// class Hello{
//    static  void bSort(){
//     String[]  str={"B","A","C"};
//     for(int i=0;i<str.length-1;i++){
//         for(int j=0;j<str.length-i-1;j++){
//             if((int)str[j].charAt(0)>(int)str[j+1].charAt(0)){
//                 String temp=str[j];
//                 str[j]=str[j+1];
//                 str[j+1]=temp;

//             }
//         }

//     }


//    }
//     public static void main(String[] args) {
//         bSort();

//         // {4,3,5,7,3,6,3,0}
//         // String[] str={"A","C","B"};  
//     }


// class FullName{
//     String firstName="rahul";
//     String lastName="jain";
//     void name(){
//         int a=5;
//         System.out.println(firstName+"  "+lastName);
//     }
// }
// class Student{
//     String name="modi";
//     void sum(int a,int b){
//         System.out.println(a+b);

//     }    
// }
// class Hello{
//     public static void main(String[] args) {
//         Student obj=new Student();
//         Student obj1=new Student();
//         FullName in=new FullName();
//         in.name();
//         obj.sum(5,2);


   
//     }
// }




// class Area{
//     void calsi(int a,int b){

//     }
// }
// class Hello{
//     public static void main(String[] args) {
//         Area obj=new Area();

// obj.calsi(4,6);
        
//     }

// }


// class Hello{
//       static  void Sort(){
//         String[] str={"Z","A","C"};
//          for(int i=0;i<str.length-1;i++){
//          for(int j=0;j<str.length-1-i;j++){
//             if((int)str[j].charAt(0)>(int)str[j+1].charAt(0)){
//                 String temp=str[j];
//                 str[j]=str[j+1];
//                 str[j+1]=temp;

//             }

//             }
//          }
//          for(String i : str){
//             System.out.println(i);
//          }

//       }

//     public static void main(String[] args) {
//             Sort();

        
//     }
// }


//   class Student{
//     String str;
//       int age;

//      Student() {
//         System.out.println("hello");
//     }
//     Student(int a) {
//         System.out.println(a);
//     }
      
//       Student(String str,int a){
//         this.str=str;
//        this. age=a;
//         System.out.println(str +" " + age);
//       }
   
//  }

// public  class Hello{
  
//     public static void main(String[] args) {

//         Student obj=new Student("rahul",15);
//         // obj.str="modi";
//         // Student obj1=new Student("rohit",16);

//     }
// }


// class Animal{
//     void eat(){
//         System.out.println("ani vegie hoteeee");
//     }
 
// }
// class Dog extends Animal{
//     void  food(){
//         System.out.println("cutiessssssssss");
//     }
    
// }
// class Puppy extends Dog{
//     void cutie(){
//         System.out.println( "mai sabse achha hu ... yess sbse");
//     }

// }

// class Hello{
//     public static void main(String[] args) {
//         Puppy obj=new Puppy();
//         obj.eat();
//         obj.food();
//         obj.cutie();
//     }
// }



// class Student{
//     String firstName="rahul";
//     int age=11;

//    Student() {
//     System.out.println("hello");
//     }
//     Student(String firstName){
//         this();
//         System.out.println(firstName);
//     }
    
//     Student(String firstName,int age) {
//         this(firstName);
//        this.firstName=firstName;
//       age=age;
//         // age=a;
//         System.out.println(firstName+   "  "+age)  ;
       

//     }
//     // void name(){
//     //     System.out.println(firstName +  "  "+ rollN);

//     // }
// }

// class Hello{
// // this==obj
//     public static void main(String[] args) {
//         Student obj= new Student("rohit",15);
//         // Student obj1= new Student("mohit",16);
        
//         // System.out.println(obj.firstName);
//         // System.out.println(obj1.firstName);

//         // System.out.println(obj1.firstName);

//         // Student obj1= new Student();
//         // obj.name();
//         // obj1.name();
//         // obj.fir
        
//     }
// }


// class Animal{

//     void eat(){

// System.out.println("eatingggggggggggg");
//     }

// }


// class Dog extends  Animal{
//     void bark(){
//         System.out.println("barkkkkkkkkkkk");

//     }

//     // void eat(){

//     //     System.out.println("eatingggggggggggg");
//     //         }
// }

// class Puppy extends Dog{

//     void lazy(){
//         System.out.println("cutieeeeeee");
        
//     }

// }

// class Hello{
//     public static void main(String[] args) {
//         Puppy obj =new Puppy();
//          obj.bark();
//          obj.eat();
//          obj.lazy();
        
//     }


// }



// class Hello{
//     public static void main(String[] args) {
//         StringBuilder obj=new StringBuilder(10);
//         obj.append("helloooooooertyuyrertyutrertyudsdfgh");
//         Runtime r = Runtime.getRuntime();
//         System.out.println(r.freeMemory()/(1024*1024));
//         System.out.println(obj.capacity());
//         System.out.println(obj.length());

//     }
// }


// class Parent{
//     void sum(int a){
//         System.out.println(a);
//     }
//     void sum(int a,int b){
//         System.out.println(a+b);
//     }
//     void sum(int a,int b,int c){
//         System.out.println(a+b+c);
//     }
// }
// class Child extends Parent{
     
//     void sum(int a,int b,int c,int d){
//         System.out.println(a+b+c+d);

//     }
   
// }

// class Hello{
//     public static void main(String[] args) {
//         Parent obj=new Parent();
//         Child obj1=new Child();

//         obj.sum(5,6);
//         obj1.sum(5,6,7);
       


        
//     }
// }




// class Parent{
//     void print(){
//         System.out.println("hello mai hu don");
//     }

// }
// class Child extends Parent{
//     void print(){
//         super.print();
//         System.out.println("mai chota don!!!");
       
       
//     }
 
// }
// class Hello{
//     public static void main(String[] args) {
//         Parent obj= new Child();
//         obj.print();
      

        
//     }
// }


// class Parent{
//     void sum(int a){
//         System.out.println("mai hu don No" + a);
//     }
//     void sum(int a,int b){
//         System.out.println(a+b);

//     }
//     void sum(int a,int b,int c){
//         System.out.println(a+b+c);

//     }
// }

// class Hello{
//     public static void main(String[] args) {
//         Parent obj=new Parent();
//         obj.sum(420);
//         obj.sum(420,20);
//         obj.sum(420,20,40);   
//     }

// }

// class Student{
//     String name="rahul";
//     int age=16;

//     Student(String  name,int age) {
//         // name=n;
//         // age=a;
//       name=name;
//         age=age;
//         System.out.println( name  +age);
//     }
//     void eat(){
//         System.out.println("mai hu donn");
//     }
// }
// class Hello{
//     public static void main(String[] args) {
//         Student obj=new Student("rohit",17);
     
//         System.out.println(   obj.name);
//         // Student obj1=new Student("mohit",18);

//         // Student obj1=new Student();

//         // Parent obj=new Parent();
//         // Parent obj1=new Parent();

//         // obj.eat();
//         // obj1.eat();

        
//     }

// }

// class Student{
//     int a;
//     Student(int a){
//        this.a=a;
//         // System.out.println(a);

//     }
//     void data(){
//         System.out.println(a);
//     }

// }
// class Hello{

//     public static void main(String[] args) {
//         Student obj=new Student(10);
//         obj.data();
      

//     }
// }


// class Parent {
//     int value = 100;

//     void display() {
//         System.out.println("Parent display: value = " + value);
//     }
// }

// class Child extends Parent {
//     int value = 200;

//     void display() {
//         System.out.println("Child display: value = " + value); // child's value
//         System.out.println("Parent value using super: " + super.value); // parent's value
//         super.display(); // call parent class method
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.display();
//     }
// }


// class Main{
//     void sum(){
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//         Main obj=new Main();
//         obj.sum();
//         System.out.println(obj);
//     }
// }


// class Hello{
  
//     void data(){
//         System.out.println(this);

//     }
//     public static void main(String[] args) {
//          Hello obj=new Hello();
//          obj.data();
//          System.out.println(obj);
        
//     }
// }

// class Student{
//     int age;
//     Student(int age){
//        this.age=age;

//     }
//     void print(){
//         System.out.println(age);
//     }

// }
// class Main{
//     public static void main(String[] args) {
//         Student obj=new Student(16);
//         obj.print();

        
//     }
// }


// class Vehicle{
//     void run(){
//         System.out.println("runn krta haiiii");
//     }
// }
// class Bike extends  Vehicle{
//     void run(){
//         System.out.println("ye bhi chalti haiiii");
//         super.run();
     
//     }
    
// }
// class Main{
//     public static void main(String[] args) {
//          Vehicle obj=    new Bike();
//          obj.run();
        
//     }
// }

// class Main{
 
//     void sum(){
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//         Main obj =new Main();
//         System.out.println(obj);
//         obj.sum();
   
//     }
// }


//    class Student{
//     int a;

//      Student(int a) {
//       this.a=a;

//     }
//     void sum(){
//         System.out.println(a);
//     }
    
//    }

// class Main{
//     public static void main(String[] args) {
//         Student obj=new Student(20);
//         obj.sum();
        
//     }
// }

// class Student{
//     Student() {
//         System.out.println("mai hu naa!!!");
//     }
//     Student(int a){
//         this();
//         System.out.println(a);

//     }
//     Student(int a,int b){
//         this(5);
//         System.out.println(a+b); 
//     }
    
// }
// class Main{
//     public static void main(String[] args) {
//         Student obj= new Student(5,6);
          
//     }
// }

//  abstract  class Animal{
//     abstract  void eat();


// }

// class Hello{
//     public static void main(String[] args) {
//         Animal obj=new Animal() ;
//         System.out.println(obj);

            
            
            
        
        
//     }
// }


// // Abstract class
// abstract class Payment {
//     // Abstract method - every payment type must define how it pays
//     abstract void pay(double amount);

//     // Non-abstract method - common logic
//     void paymentReceipt() {
//         System.out.println("Payment receipt generated.");
//     }
// }

// // Subclass 1
// class CardPayment extends Payment {
//     void pay(double amount) {
//         System.out.println("Paid ₹" + amount + " using Credit/Debit Card.");
//     }
// }

// // Subclass 2
// class UpiPayment extends Payment {
//     void pay(double amount) {
//         System.out.println("Paid ₹" + amount + " using UPI (Google Pay, PhonePe, etc.).");
//     }
// }

// // Subclass 3
// class NetBanking extends Payment {
//     void pay(double amount) {
//         System.out.println("Paid ₹" + amount + " using Net Banking.");
//     }
// }

// // Main class
// public class PaymentApp {
//     public static void main(String[] args) {
//         // Abstract class reference, different objects
//         Payment p1 = new CardPayment();
//         p1.pay(500);
//         p1.paymentReceipt();

//         Payment p2 = new UpiPayment();
//         p2.pay(1000);
//         p2.paymentReceipt();

//         Payment p3 = new NetBanking();
//         p3.pay(750);
//         p3.paymentReceipt();
//     }
// }


// class Parent{
//     void   paisa(){

//     }
// }
// class Child extends  Parent{

// }
//Polymorphism in Java

// class Parent{
//     void sum(int a){
//         System.out.println(a);

//     }
//     void sum(int a,int b){
//         System.out.println(a+b);
//     }
// }
// class Hello{
//     public static void main(String[] args) {
//         Parent obj=new Parent();
//         obj.sum(5,6);
        
//     }
// }

// abstract  class and methodsssss


// abstract  class Payment{

//     abstract  void pay(int a);
//     void succes(){
//         System.out.println("payment done");
//     }
// //  int a=5;

// }
// class UpiPayment extends Payment{
//     void pay(int a){
//         System.out.println("pay via Upi" +a);
//     }

// }
// class NetBanking extends  Payment{
//     void pay(int b){
//         System.out.println("pay via netbanking" +b);
//     }
// }


// class Hello{
//     public static void main(String[] args) {
//        Payment obj=   new UpiPayment();    
//        obj.pay(25000);
//        obj.succes();
//        Payment obj1=new NetBanking();
//        obj1.pay(510000);
//        obj1.succes();  
//     }

// }


// class Animal{
//     void eat(){
//         System.out.println("eattttttt");
//     }

// }
// class Dog extends  Animal{

//     void bark(){
//         System.out.println("barkkkk");
//     }


// }
// class Puppy extends  Dog{
//     void cute(){
//         System.out.println("cutiessssss");
//     }
// }
// class Cat extends Animal{

// }
// class Hello{
//     public static void main(String[] args) {
//         Puppy obj=new Puppy();
//         obj.bark();
//         obj.eat();
//         obj.cute();

        
//     }
// }


// class Parent{
//     void sum(int a,int b){
//         System.out.println(a+b);

//     }
//     void sum(int a,int b,int c){
//         System.out.println(a+b+c);

//     }
// }
// class Hello{
//     public static void main(String[] args) {
//         Parent obj=new Parent();
//         obj.sum(5,3,6);
        
//     }
// }



// abstract  class Payment{
//     abstract  void pay(int a);
//     void print(){
//         System.out.println("payment done");
//     }
 
// }
// class UpiPayment extends Payment{
//     void pay(int a){
//         System.out.println("payment done via upi" + a);

//     }

// }

// class CardPayment extends Payment{
//     void pay(int a){
//         System.out.println("payment done via card"+a);
//     }

// }



// class Main{
//     public static void main(String[] args) {
//              Payment obj=   new UpiPayment();
//              obj.pay(5000);
//              obj.print();
//               Payment obj1=   new CardPayment();
//               obj1.pay(11000);
//               obj1.print();
//             //  obj.print();   
//     }
// }

// class Atm{
//       private  int a;
//      public   void  setRupees(int a){
//         this.a=a;

//       }
//      public  int  getRuppes(){
//         return a;
       
//       }
// }

// class Main{
//     public static void main(String[] args) {
//         Atm obj=new Atm();
//         obj.setRupees(501);
//         System.out.println(obj.getRuppes());  
//     }
// }

  
// class Atm{
//        private  int a;

//        void setRupees(int a){
//        this.a=a;

//        }
//        int   getRuppes(){
//         return a;

//        }


// }
// class Main{
//     public static void main(String[] args) {
//         Atm obj=new Atm();
//         obj.setRupees(50001);
//         System.out.println(obj.getRuppes());



        
//     }

// }


interface  Payment{
    void pay(int a);

}

class UpiPayment implements  Payment{
     public  void pay(int a){
        System.out.println("payment via upi ");

    }


}

class Main{
    public static void main(String[] args) {
        Payment obj=new UpiPayment();
        obj.pay(5001);   
        final  int a=4;
        System.out.println(a);

    }
}














