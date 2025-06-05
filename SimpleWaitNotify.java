
//     public static void main(String[] args) {
//         // Step 1: Create a list of strings
//         List<String> cities = new ArrayList<>();
//         // System.out.println(cities.ha);
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Chennai");
//         cities.add("Kolkata");

//         // Step 2: Create a ListIterator for the list
//         ListIterator<String> lit = cities.listIterator();
//         //    System.out.println(lit.hasNext() + "heheh");
//         // Step 3: Forward traversal
//         System.out.println("Forward traversal:");
//         while (lit.hasNext()) {
//             String city = lit.next();
//             System.out.println(city);
//         }

//         // Step 4: Backward traversal
//         System.out.println("\nBackward traversal:");
//         while (lit.hasPrevious()) {
//             String city = lit.previous();
//             System.out.println(city);
//         }
//     }
// }







//         // set.add("C");
//         // set.add("B");
//         // set.add("A");
//         // set.add("a");
//         // System.out.println(set);
//         //  LinkedList<Integer> arr=new LinkedList<>();
//         // //  long start=System.nanoTime();
//         //  arr.add(5);
//         //  System.out.println(arr.get(1));
//         //  System.out.println(arr.contains(5));
//         //  long end=System.nanoTime();
//         //  System.out.println(end-start);


//         // System.out.println("");
//         // int[] arr={1,2,3,4};
//         // int[] arr=new int[5];
//         // ArrayList<Integer> arr=new ArrayList<>();
//         // for(int i=0;i<100000;i++){
//         //     arr.add(i);
//         // }
//         // System.out.println(arr);
//         // arr.add("hiii");
//         // arr.add("hello");
//         // arr.remove(0);
//         // arr.clear();
//         // // arr.set(0,"byeee");

//         // System.out.println(arr);

//     // }
// // }


// import java.util.HashMap;
// class Hello{

//     public static void main(String[] args) {

//         HashMap<Integer , String> map= new HashMap<>();
//         map.put(1, "My");
//         map.put(2, "name");
//         map.put(3, "Tiwari");
//         map.forEach((key,value) -> {
//         //    if(value.equals())
//             // if(key>2){
//             //     System.out.println( value );
//             // }
           

//         });
//         // for(int key :map.values()){
//         //     System.out.println(key);

//         // }
//         // map.remove(map)
        
//         // System.out.println(map.containsKey("id0"));
//         // System.out.println(map.containsValue(1));

//     }
// }

// import java.util.HashSet;
// class Hello{
//     public static void main(String[] args) {
//          int[] arr={1,2,2,3,4,4,5,6,6,7};
//         HashSet<String> set=new HashSet<>();
//         // for(int i =0;i<arr.length;i++){
//         //     if(set.contains(i)){
//         //         System.out.println(arr[i]);
//         //     }
//         //     set.add(arr[i]);

//         // }
//         // set.add("CA");
//         // set.add("Ba");
//         // set.add("Ar");
//         // System.out.println(set);
//         // for(int i=0;i<arr.length;i++){
//         //     set.add(arr[i]);
//         // }
//         // System.out.println(set);
//         // set.add(5);
//         // set.add(5);
//         // set.add(6);
//         // System.out.println(set);


//         // int[]  arr=new int[5];
//         // int[] arr={1,2,3,4,5,5,5}
//         // LinkedList<Integer>  arr=new LinkedList<>();
//         // for(int i=0;i<1000;i++){
//         //     arr.add(i);
//         // }
//         // System.out.println(arr);
//         // arr.add(4);
//         // System.out.println(arr.contains(4));
//         // arr.add("helllo");
//         // arr.add("hiii");
//         // arr.set(1, "byeee");
//         // arr.add(0,"byeeee");
//         // arr.add("hiiii");
//         // arr.remove(0);
//         // System.out.println(arr);

        
//     }
// }


// public class FirstNonRepeating_Array {
//     public static void main(String[] args) {
//         int[] arr = {4, 5, 1, 2, 0, 4};
//         for (int i = 0; i < arr.length; i++) {
//             boolean isRepeated = false;
//             for (int j = 0; j < arr.length; j++) {
//                 if (i != j && arr[i] == arr[j]) {
//                     isRepeated = true;
//                     break;
//                 }
//             }
//             if (!isRepeated) {
//                 System.out.println("First non-repeating element: " + arr[i]);
//                 break;
//             }
//         }
//     }
// }

// import java.util.*;

// public class HashMapExample {
//     public static void main(String[] args) {
//         Map<String, Integer> map = new HashMap<>();

//         map.put("Apple", 10);
//         map.put("Banana", 5);
//         map.put("Orange", 7);
//         map.put(null, 100); // One null key allowed
//         map.put("Banana", 20); // Duplicate key: replaces old value

//         System.out.println("HashMap Output (Unordered):");
//         for (Map.Entry<String, Integer> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " => " + entry.getValue());
//         }
//     }
// }


// import java.util.*;
// public class CharFrequency {
//     public static void main(String[] args) {
//         String str = "java is fun and java is powerfull";
//         String[] words= str.split(" ");
//         Map<String, Integer> freqMap = new HashMap<>();
//         for (String word : words) {
//             freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
//             }
//          System.out.println("Character Frequencies: " + freqMap);
//         // freqMap.put('c',1);
//         // freqMap.put('b',1);
//         // System.out.println(freqMap.getOrDefault('z', 0));
//         // for (char ch : str.toCharArray()) {
//         //     freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1 );
//         // }

   
//     }
// } 
// import java.util.HashMap;
// class Hello{
//     public static void main(String[] args) {
//         // String str="programming"; 
//         String str="java is programming and programming is java";
//     //"aabcccdde"
//            String[] newStr=str.split(" ");
//              HashMap<String ,Integer> map=new HashMap<>();
//              for(String ch : newStr){
//                 map.put(ch,   map.getOrDefault(ch, 0)+1);
//              }
//              System.out.println(map);



        // String str="programming is fun and  programming is good"; // p=1 r=2 
        // char[] ch= str.toCharArray();
        
        // for(char i : ch){
        //     System.out.println(i);
        // }

        //    for(char i : str.toCharArray()){
        //         map.put(, map.getOrDefault(i, 0));
        //    }


        //  map.put("id0", 1);
        //  map.put("id1", 2);
        //  map.put("id2", 1010101);
        //  System.out.println(map.containsKey("id0"));
        //  map.forEach((key,value) -> {
        //     System.out.println(key + value);

        //  });
        //  System.out.println(map.getOrDefault("id0",0));
        //  System.out.println(map.keySet());
        //  System.out.println(map.values());
        // int[] arr={3,21,34,4,4,56,667};
        // HashSet<Integer>  set= new HashSet<>();
        // TreeSet<Integer> set= new TreeSet<>();
    //     for(int i : arr){
    //         set.add(i);
    //     }
    //     System.out.println(set);
//     // }

// // }
// // class Hello{
// //     public static void main(String[] args) {
//      // String str="prograaming";   //p=1, r=2  o=1
//     //  Map.forEach((Key.value)->{
//     //     if(value==1){
//     //         System.out.println(key);
//     //     }
//     //  })
//     //  String str1="prograaming is a fun and fun is a prograaming";
//     //    String[] newStr=str1.split(" ");
//    //  prograaming=2 is =2 a=
//         // char[] ch=   str.toCharArray();
//         // String str="aaabcccdddeeef";
//         // HashMap<Character ,Integer>  map =new HashMap<>();
//         // for(char ch : str.toCharArray()){
//         //     map.put(ch, map.getOrDefault(ch, 0)+1);
//         // }
//         // for(char i : map.keySet()){
//         //     if(map.get(i)==1){
//         //         System.out.println(i);
//         //         break;
//         //     }
      
//         // }

//         // for(String str: newStr){
//         //  map.put(str,    map.getOrDefault(str, 0)+1);
//         // }
//         // System.out.println(map);

//     //    for(char i :ch){


//     //    }
//     //    System.out.println(map);

// //{p=1,r=2}        

                       
//         // map.put("id", 1);
//         // System.out.println(map.get("name"));
//         // System.out.println(map.getOrDefault("id", 0));


        
//     // }
// // }


// // import java.util.ArrayList;
// // import java.util.Iterator;
// // class Hello{
// //     public static void main(String[] args) {
// //         ArrayList<String> names = new ArrayList<>();
// //         names.add("Ravi");
// //         names.add("Anjali");
// //         names.add("Soham");
// //         names.add("Priya");
// //         names.add("Amit");
// //         // System.out.println(names);
// //         Iterator<String> it = names.iterator();
// //         // System.out.println(it.hasNext());
// //      while (it.hasNext()) {
// //            String  elem =  it.next();
// //            System.out.println(elem);
// //            if(elem.startsWith("A")){
// //             it.remove();

// //            }
            
         
// //      }
// //      System.out.println(names);
        

// //     }
// // }





// // // import java.util.ArrayList;
// // // import java.util.Collections;
// // // class Hello{
// //     public static void main(String[] args) {
// //         ArrayList<Integer> names = new ArrayList<>();
// //         names.add(1);
// //         names.add(10);
// //         names.add(0);
// //         names.add(12);
// //         names.add(21);
// //         Collections.shu




// //         // {
// //         //     id:1,
// //         //     name:"om"
// //         // }
// //         // {
// //         //     id:0,
// //         //     name:"rahul"
// //         // }
// //         // Collections.sort(names);
// //         // System.out.println(names);

// //         // names.add("Ravi");
// //         // names.add("Anjali");   //  =>>["bye","soham","priya","byee"]  => "hello"
// //         // names.add("Soham");  // ["byee","hello","hello","hello"]
// //         // names.add("Priya");
// //         // names.add("Amit");
// //         // ListIterator<String> it=names.listIterator();  // set ,add
// //         // while (it.hasNext()) {
// //         //     String ele =  it.next();
// //         //     if(ele.length()<=4){
// //         //         it.set("byee");
// //         //     }
// //             // System.out.println(ele);
            
// //         // }
// //         // // System.out.println(names);
// //         // int count = 0;
// //         // while (it.hasPrevious()) {
// //         //     // String ele = it.previous();
// //         //     count++;
// //         //     if (count != names.size()) {
// //         //         it.set("hello");
// //         //     }
// //         //     System.out.println(names.size());
// //         // }
// //         // System.out.println(names);
// //     }
// // }

// // // import java.util.ArrayList;
// // // import java.util.Iterator;
// // // class Hello{
// // //     public static void main(String[] args) {
// // //         ArrayList<String> list= new ArrayList<>();
// // //         list.add("Rahul");
// // //         list.add("Shanti");
// // //         list.add("Rohit");
// // //         list.add("Mohit");
// // //         list.add("Om");
// // //         System.out.println(list);
// // //         Iterator<String> it=list.iterator();
// // //         // System.out.println(it.hasNext());
// // //         while (it.hasNext()) {
// // //              String data=   it.next();
// // //              if(data.startsWith("R")){
// // //                 it.remove();}
// // //             //  System.out.println(data);   
// // //         }
// // //         System.out.println(list);





// // //     }
// // // }

// // // import java.util.ArrayList;
// // // import java.util.ListIterator;
// // // class Hello{

    
// // //         public static void main(String[] args) {
// // //             ArrayList<String> list =new ArrayList();
// // //             list.add("Rahul");
// // //             list.add("Shanti");
// // //             list.add("Rohit");
// // //             list.add("Mohit");
// // //             list.add("Om"); //  "bye"  =["rahul","shanti","rohit",",mohit","bye"]
// // //             ListIterator<String> it=list.listIterator();
// // //             while (it.hasNext()) {
// // //                 String data=it.next();
// // //                 System.out.println(data);
            
                
// // //             }
// // //             System.out.println(" alg hu mai");

// // //             while (it.hasPrevious()) {
// // //                 String PrevData=it.previous();
// // //                 System.out.println(PrevData);
            
                
// // //             }

        
// // //     }
// // // }
// import java.util.*;

// class Student {
//     int rollNo;
//     String name;
//     int age;

//     Student(int rollNo, String name, int age) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.age = age;
//     }

//     public String toString() {
//         return rollNo + " " + name + " " + age;
//     }
// }

// // Comparator to sort by age
// class AgeComparator implements Comparator<Student> {
//     public int compare(Student s1, Student s2) {
//         return s1.age - s2.age;  // ascending order of age
//     }
// }

// // Comparator to sort by name
// class NameComparator implements Comparator<Student> {
//     public int compare(Student s1, Student s2) {
//         return s1.name.compareTo(s2.name);  // alphabetical order
//     }
// }

// public class ComparatorExample {
//     public static void main(String[] args) {
//         List<Student> list = new ArrayList<>();
//         list.add(new Student(102, "Ravi", 22));
//         list.add(new Student(101, "Aman", 21));
//         list.add(new Student(103, "Riya", 23));

//         System.out.println("Sorted by age (Comparator):");
// //         Collections.sort(list, new AgeComparator());
// //         for (Student s : list) {
// //             System.out.println(s);
// //         }

// //         System.out.println("\nSorted by name (Comparator):");
// //         Collections.sort(list, new NameComparator());
// //         for (Student s : list) {
// //             System.out.println(s);
// //         }
// //     }
// // }

// // class Student implements  Comparable<Student>{  
// //     int rollN;
// //     String name;

// //     public Student(int rollN,String name) {
// //         this.rollN=rollN;
// //         this.name=name;

// //     }

 
// //     public int compareTo(Student a) {
// //         return this.rollN - a.rollN;

       
// //     }
// //     public String toString() {
// //         return rollN + " " + name;
// //     }
   

    

// // }
// // class Hello{
// //     public static void main(String[] args) {
// //         ArrayList<Student> list=new ArrayList<>();
// //         list.add(new Student(1,"rahul"));
// //         list.add(new Student(3,"rohit"));
// //         list.add(new Student(0,"mohitl"));
// //         Collections.sort(list);

// //         for(Student s :list){
// //             System.out.println(s.toString());
// //         }
   
// //     }

// // }


// // // import java.util.*;

// // // class Student implements Comparable<Student> {
// // //     int rollNo;
// // //     String name;
// // //     int age;

// // //     Student(int rollNo, String name, int age) {
// // //         this.rollNo = rollNo;
// // //         this.name = name;
// // //         this.age = age;
// // //     }

// // //     // Comparable method — sorting by rollNo
// // //     public int compareTo(Student s) {
// // //         return this.rollNo - s.rollNo;
// // //     }

// // //     // Custom toString for printing
// // //     public String toString() {
// // //         return rollNo + " " + name + " " + age;
// // //     }
// // // }

// // // // public class ComparableExample {
// // // //     public static void main(String[] args) {
// // // //         List<Student> list = new ArrayList<>();
// // // //         list.add(new Student(102, "Ravi", 22));
// // // //         list.add(new Student(101, "Aman", 21));
// // // //         list.add(new Student(103, "Riya", 23));

// // // //         Collections.sort(list); // uses compareTo()

// // // //         System.out.println("Sorted by roll number (Comparable):");

// // // //         // Explicitly calling toString() method
// // // //         for (Student s : list) {
// // // //             System.out.println(s.toString()); // <- calling toString directly
// // // //         }
// // // //     }
// // // // }

// // import java.util.*;

// // class Student {
// //     int rollNo;
// //     String name;
// //     int age;

// //     Student(int rollNo, String name, int age) {
// //         this.rollNo = rollNo;
// //         this.name = name;
// //         this.age = age;
// //     }

// //     public String toString() {
// //         return rollNo + " " + name + " " + age;
// //     }
// // }

// // // Comparator to sort by age
// // class AgeComparator implements Comparator<Student> {
// //     public int compare(Student s1, Student s2) {
// //         return s1.age - s2.age;  // ascending order of age
// //     }
// // }

// // // Comparator to sort by name
// // class NameComparator implements Comparator<Student> {
// //     public int compare(Student s1, Student s2) {
// //         return s1.name.compareTo(s2.name);  // alphabetical order
// //     }
// // }

// // public class ComparatorExample {
// //     public static void main(String[] args) {
// //         List<Student> list = new ArrayList<>();
// //         list.add(new Student(102, "Ravi", 22));
// //         list.add(new Student(101, "Aman", 21));
// //         list.add(new Student(103, "Riya", 23));

// //         System.out.println("Sorted by age (Comparator):");
// //         Collections.sort(list, new AgeComparator());
// //         for (Student s : list) {
// //             System.out.println(s);
// //         }

// //         System.out.println("\nSorted by name (Comparator):");
// //         Collections.sort(list, new NameComparator());
// //         for (Student s : list) {
// //             System.out.println(s);
// //         }
// //     }
// // }


// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// class Student{
//     int rollNo;
//     String name;
//     int age;

//     public Student(int rollNo,String name,int age ) {
//         this.rollNo=rollNo;
//         this.name=name;
//         this.age=age;

//     }
//     public String toString() {
//         return rollNo + " " + name + " " + age;
//     }

    
    
// }
// // class sortByAge  implements Comparator<Student>{
// //     public  int compare(Student a,Student  b){
// //         return a.rollNo-b.rollNo;

// //     }

// // }
// // Comparator to sort by name
// class NameComparator implements Comparator<Student> {
//     public int compare(Student s1, Student s2) {
//         return s1.name.compareTo(s2.name);  // alphabetical order
//     }
// }
// class Hello{
//     public static void main(String[] args) {
//         ArrayList<Student> list = new ArrayList<>();
//         list.add(new Student(102, "Ravi", 12));
//         list.add(new Student(101, "Aman", 21));
//         list.add(new Student(103, "Ziya", 23));
//         // Collections.sort(list,new sortByAge());
  
//         Collections.sort(list,new NameComparator());
//         for (Student s : list) {
//             System.out.println(s);
//         }

        
//     }
// }






























// class Student implements  Comparable<Student>{
// int rollN;

// String name;

// public Student(int rollN,String name) {

// this.rollN=rollN;

// this.name=name;

// }

// public int compareTo(Student a) {

// return this.rollN - a.rollN;

// }

// public String toString() {

// return rollN + " " + name;

// }

// }

// class Hello{

// public static void main(String[] args) {

// ArrayList<Student> list=new ArrayList<>();

// list.add(new Student(1,"rahul"));

// list.add(new Student(3,"rohit"));

// list.add(new Student(0,"mohitl"));

// Collections.sort(list);

// for(Student s :list){

// System.out.println(s.toString());

// }

// }

// }


// import java.util.ArrayList;
// import java.util.Collections;
// class Student  implements Comparable <Student>{
//     int  age;
//     String name;

//     public Student(int age,String name) {
//         this.age=age;
//         this.name=name;
//     }

// public  String toString() {
//     // return s.toString(s)
//     // System.out.println("hehe");
//     return age + " " +name;
 
   
  
// }
// // [12,11]=> [11,12]

//     public int compareTo(Student s) {
//         return  this.age-s.age;

//     }
    
    


// }
// class Hello{
//     public static void main(String[] args) {

//         ArrayList<Student> list= new  ArrayList<>();
//         list.add(new Student(12,"rahul"));
//         list.add(new Student(11, "rohit"));
//         list.add(new Student(2, "mohit"));

//            Collections.sort(list);
//            for(Student s :list){
//             System.out.println(s.toString());
//            }


//         // ArrayList<Integer> list= new  ArrayList<>();
//         // list.add(1);
//         // list.add(0);
//         // list.add(4);
     
//         // System.out.println(list);

//     }
// }


//   class Student{
//     int rollN;
//     String name;
//     int age;

//     public Student(int rollN,String name,int age) {
//         this.rollN=rollN;
//         this.name=name;
//         this.age=age;


//     }

//     public String toString(){
//         return age+ " " + name + " " + rollN;

//     }
    
//   }
// // om , shanti
//   class sortByName implements Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.name.compareTo(s2.name);

//     }

//   }
//   class sortByRoll implements Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.rollN-s2.rollN;

//     }

//   }

// class Hello{

//     public static void main(String[] args) {
//         ArrayList<Student> list= new ArrayList<>();
//         list.add(new Student(55, "Rohit", 12));
//         list.add(new Student(52, "Rahul", 112));
//         // list.add(new Student(21, "Rohit", 21));
//         // list.add(new Student(32, "Jain", 17));
//         Collections.sort(list,new sortByName());
//         for(Student s : list){
//             System.out.println(s);
//         }
//         Collections.sort(list,new sortByRoll());
//         for(Student s : list){
//             System.out.println(s);
//         }   
//     }


// }

// import java.util.ArrayList;
// import java.util.Collections;
// class Student implements Comparable<Student>{
//     int age;
//     String name;

//     public Student(int age,String name) {
//         this.age=age;
//         this.name=name;
//     }
//     public  String toString(){
//         return age+ " " + name;
//     }
//     public  int compareTo(Student s){
//         return this.age-s.age;

//     }
    

// }
// class Hello{
//     public static void main(String[] args) {
//         ArrayList<Student> list =new ArrayList<>();
//         list.add(new Student(17, "rahul"));
//         list.add(new Student(16, "rohit"));
//         list.add(new Student(11, "mohit"));
//         list.add(new Student(51, "om"));

//            Collections.sort(list);
//            for(Student s :list){
//             System.out.println(s.toString());
//            }

//         // list.add(0);
//         // list.add(5);
//         // list.add(6);

//         // Collections.sort(list);
//         // System.out.println(list);





        
//     }
// }

// class FileDownload extends Thread {
//     String fileName;

//     FileDownload(String fileName) {
//         this.fileName = fileName;
//     }

//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(fileName + " downloading... " + (i * 20) + "%");
//             try {
//                 Thread.sleep(1000); // simulate 1 second delay per chunk
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//         System.out.println(fileName + " download complete!");
//     }
// }

// public class DownloadSimulatorWithThread {
//     public static void main(String[] args) {
//         FileDownload fileA = new FileDownload("File A");
//         FileDownload fileB = new FileDownload("File B");

//         fileA.start(); // Starts thread for File A
//         fileB.start(); // Starts thread for File B
//     }
// }


// class MyThread extends Thread{
//     public  void  run(){
//         System.out.println("hello");
//         try {
//             Thread.sleep(2000);
//         } catch (InterruptedException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();}
//             System.out.println("After 2 seconds");

       

//     }
// }
// class Hello{
//     public static void main(String[] args) {
//        MyThread t1=  new MyThread();
//        t1.start();
    
//     }
// }


// class Hello{
//     static  void  downloadFile(String fileName){
//         for(int i=0;i<=5;i++){
//             System.out.println(fileName +  " "+"downloading..." +(i*20)+ "%");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
       
//         }
//         System.out.println(fileName + " download complete!");

//     }
//     public static void main(String[] args) {
//         downloadFile("file A");
//         downloadFile("file B");

        
//     }
// }

// class DownloadThread extends Thread {
//     private String fileName;

//     public DownloadThread(String fileName) {
//         this.fileName = fileName;
//     }

//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(fileName + " downloading... " + (i * 20) + "%");
//             try {
//                 Thread.sleep(1000); // simulate download time
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//         System.out.println(fileName + " download complete!");
//     }
// }

// public class DownloadSimulatorWithThread {
//     public static void main(String[] args) {
//         DownloadThread t1 = new DownloadThread("File A");
//         DownloadThread t2 = new DownloadThread("File B");
//         t1.start();
//         t2.start();
//     }
// }

// class MyThread  extends Thread{
//     public  void run(){
//         System.out.println("hello ");
    
//         try {
//             Thread.sleep(5000);
            
//         } catch (Exception e) {
//         }
//             System.out.println("hiii");
//     }

// }
// class Hello{
//     public static void main(String[] args) {  
//         MyThread t1=new MyThread();
//         t1.start();
//         //   for(int i=0;i<5;i++){
//         //     System.out.println("hiii");

//         //   }
       
//     }
// }


// class MyThread extends Thread {
//     public void run() {
//         System.out.println("hello ");
//     }
// }

// class Hello {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
      
//         t1.start(); 
// //         for (int i = 0; i < 5; i++) {
// //             System.out.println("hiii");
// //         }
// //     }
// // }

// class downloadFile{
//     public  static  void file(String file){
//         for(int i=1;i<=5;i++){
//    System.out.println(file +" " +"dowloding..." + (i*20) + "%");
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//             }
//         }
        

//         System.out.println(file + "done");

//     }

// }

// class Hello{
//     public static void main(String[] args) {
//         downloadFile obj =new downloadFile();
//         obj.file("file A");
//         obj.file("file B");


//         // file("file A");
//         // file("file B");


           
//     }
// }




// class FileDownload extends  Thread{
//     String fileName;

//     public FileDownload(String fileName) {
//         this.fileName=fileName;
//     }
//       public  void run(){
//         for(int i=1;i<=5;i++){
//                    System.out.println(fileName +" " +"dowloding..." + (i*20) + "%");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (Exception e) {
//                    }
//         }
//         System.out.println(fileName + "doneeeeee");
//       }
     
// }

// class Hello{
//     public static void main(String[] args) {
//         FileDownload t1= new FileDownload("File A");
//         FileDownload t2= new FileDownload("File B");
//         t1.start();
//         t2.start();

        
//     }
// }

// class MyThread  extends Thread{
//     public  void run(){
//         System.out.println("hello");
//         try {
//             Thread.sleep(4000);
//         } catch (Exception e) {
//         }
//         System.out.println("hiiii");

//     }
// }

// class Hello{
//     public static void main(String[] args) {
//         MyThread t1=new MyThread();
//         t1.start();
     
     
//     }
// }


// class FileDownload{
//     public static  void download(String file){
//         for(int i=1;i<=5;i++){
//             System.out.println(file + " "+ "downloading...." + (i*20)+ "%");
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//             }
//         }
//         System.out.println(file + "done");
//     }

// }

// class  Hello{
//     public static void main(String[] args) {
//         FileDownload obj=new FileDownload();
//         obj.download("file A");
//         obj.download("file B");

        
//     }

// }



// class downloadFile extends Thread{
//     String fileName;

//     public downloadFile(String fileName) {
//         this.fileName=fileName;
//     }
//      public  void run(){
//         for(int i=1;i<=5;i++){
//         System.out.println(fileName + " "+ "downloading...." + (i*20)+ "%");
//         try {
//             Thread.sleep(2000);
//         } catch (Exception e) {
//         }
//         }
//         System.out.println(fileName + " "  + "done ");
//      }
    
// }

// class Hello{
//     public static void main(String[] args) {
//         downloadFile t1= new downloadFile("file A");
//         downloadFile t2= new downloadFile("file B");
//         downloadFile t3= new downloadFile("file C");
//         t1.start();
//         t2.start();
//         t3.start();


        
//     }
// }



// class MyThread extends Thread{
//     public  void run(){
//         System.out.println("hello");
//     }
// }
// class Hello{
//     public static void main(String[] args) {
//         MyThread obj = new MyThread();
//         obj.run();
//         // try {
//         //     obj.join();
//         // } catch (InterruptedException e) {
//         //     // TODO Auto-generated catch block
//         //     e.printStackTrace();
//         // }
//         for(int i =0;i<5;i++){
//             System.out.println(i);
//         }
        
//     }
// }



// class MyRunnable implements Runnable {
//     public void run() {
//         for(int i=1; i<=5; i++) {
//             System.out.println(Thread.currentThread().getName() + " -> " + i);
//         }
//     }
// }

// public class Demo3 {
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new MyRunnable());
//         Thread t2 = new Thread(new MyRunnable());

//         t1.start();
//         t2.start();
//     }
// }



// class WithdrawThread extends Thread {
//     static int balance = 1000; // shared account balance
//     int amount;

//     WithdrawThread(int amount) {
//         this.amount = amount;
//     }

//     public void run() {
//         // ⚠️ No synchronization used here
//         if (balance >= amount) {
//             System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);

//             try { Thread.sleep(1000); } catch (InterruptedException e) {}

//             balance -= amount;
//             System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
//         } else {
//             System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
//         }
//     }
// }

// public class DemoProblem {
//     public static void main(String[] args) {
//         WithdrawThread t1 = new WithdrawThread(800);
//         WithdrawThread t2 = new WithdrawThread(500);

//         t1.start();
//         t2.start();
//     }
// }





// class WithdrawThread extends Thread {
//     static int balance = 1000; 
//     int amount;

//     WithdrawThread(int amount) {
//         this.amount = amount;
//     }

//     public void run() {
//         synchronized(WithdrawThread.class) {
//             if (balance >= amount) {
//                 System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);
//                 try { Thread.sleep(100); } catch (InterruptedException e) {}
//                 balance -= amount;
//                 System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
//             } else {
//                 System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
//             }
//         }
//     }
// }

// public class DemoFixed {
//     public static void main(String[] args) {
//         WithdrawThread t1 = new WithdrawThread(800);
//         WithdrawThread t2 = new WithdrawThread(500);

//         t1.start();
//         t2.start();
//     }
// }
 
                            
// class MyRunnable implements Runnable {
//     public void run() {
//         System.out.println("Thread using Runnable interface");
//     }
// }

// public class Demo2 {
//     public static void main(String[] args) {
//         MyRunnable obj = new MyRunnable();
//         Thread t1 = new Thread(obj); 
//         t1.start();
//         try {
//             t1.join();
//         } catch (InterruptedException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//         for(int i =1;i<5;i++){
//             System.out.println(i);
//         }

//     }
// }

// class Hello{
//     int balance=1000;

//     Thread A=> 800
//     Thread B=> 500



//     public static void main(String[] args) {
        
//     }
// }

//  class withdrawal extends Thread{
//     static  int totalBalance=1000;
//     int amount;

//     public withdrawal(int amount) {
//         this.amount=amount;
//     }
//     public  void run(){

//         if(totalBalance>=amount){
//             System.out.println("is going to withdrawal"+" " + amount);
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException ex) {
//             }
//             totalBalance-=amount;
//             System.out.println("Remaining paisaaaaaaa" +"  "+ totalBalance);
//         }
//         else{
//             System.out.println(" sorry aap gareeb haiii !!!!");
//         }
//     }
    


//  }

// class Hello{
//     public static void main(String[] args) {
//            withdrawal t1=    new   withdrawal(800);
//            withdrawal t2=    new   withdrawal(500);
//            t1.start();
//            t2.start();

        
//     }
// }




// class MyRunnable implements Runnable {
//     public  void run(){
//         System.out.println(Thread.currentThread().getName()+ "hiiii");
//     }
          
// }       
// class Hello{
//     public static void main(String[] args) {
//         MyRunnable obj= new MyRunnable();
//                Thread t1=    new Thread(obj);
//                t1.start();
//             //    try {
//             //     t1.join();
//             // } catch (InterruptedException e) {
//             //     // TODO Auto-generated catch block
//             //     e.printStackTrace();
//             // }
//                System.out.println("hello");
        
//     }


// }


// class WithdrawThread  extends Thread{
//     static  int totalBalance=1000;
//     int amount;

//     public WithdrawThread(int amount) {
//         this.amount=amount;
//     }

//     public  void run(){
//         if(totalBalance>=amount){
//             System.out.println("paisa aapke pass aa jayega" + amount);
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//             totalBalance-=amount;
//             System.out.println(totalBalance);
//         }
//         else{
//             System.out.println("limit me raho apne ");
//         }

//     }
    

// }
// class Hello{
  
// public static void main(String[] args) {
//     WithdrawThread  t1= new WithdrawThread(800);
//     WithdrawThread  t2= new WithdrawThread(500);
//     t1.start();
//     try {
//         t1.join();
//     } catch (InterruptedException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//     }
//     t2.start();


    
// }


// }
// sleep ,start

// class MyThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(getName() + " is running with priority " + getPriority());
//             Thread.yield();
//         }
//     }
// }

// public class PriorityExampleWithoutSuper {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();

//         t1.setName("Low Priority Thread");   
//         t2.setName("High Priority Thread");

//         t1.setPriority(Thread.MIN_PRIORITY); // 1
//         t2.setPriority(Thread.MAX_PRIORITY); // 10 priority

//         t1.start();
//         t2.start();
//     }
// }

public class SimpleWaitNotify {

    private boolean isSignalled = false;

    public synchronized void sendSignal() {
        isSignalled = true;
        System.out.println("Producer: Sending signal...");
        notify();
    }

    public synchronized void waitForSignal() {
        while (!isSignalled) {
            try {
                System.out.println("Consumer: Waiting for signal...");
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Consumer: Got the signal! Proceeding...");
    }

    public static void main(String[] args) {
        SimpleWaitNotify obj = new SimpleWaitNotify();

        Thread consumer = new Thread(() -> {
            obj.waitForSignal();
        });

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            obj.sendSignal();
        });

        consumer.start();
        producer.start();
    }
}



// class Hello{
//     public static void main(String[] args) {
//           Thread t1=  new Thread(()->{
//             System.out.println("hello");
//               try {
//                   Thread.sleep(2000);
//               } catch (InterruptedException ex) {
//               }
//               System.out.println("byeee");
//         });
//         Thread t2=  new Thread(()->{
//             System.out.println("hiiii");
//         });

//         t1.start();
//         try {
//             t1.join();
//         } catch (InterruptedException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//         t2.start();

//     }
// }

// class MyThread extends Thread{
//     public  void run(){

//     }
// }


// class Hello{
//     public static void main(String[] args) {
//         System.out.println("idher dekhooo");
//           Thread t1=  new Thread( ()->{
//             System.out.println("hello");
        
//          });
//          Thread t2=  new Thread( ()->{
//             System.out.println("hiiii");

//          });
//          t1.start();
//          t2.start();


//     }
// }



// wait notify 












