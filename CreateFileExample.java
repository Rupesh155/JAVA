
import java.io.File;
import java.io.IOException;
public class CreateFileExample {
    public static void main(String[] args) {  
        try {
            File file = new File("new.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


// import java.io.FileWriter;
// import java.io.IOException;

// public class WriteToFile {
//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("new.txt");
//             writer.write("Hello, this is a test message written to the file.");
//             writer.close(); 
//             System.out.println("Successfully wrote to the file.");
//         } catch (IOException e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }

// import java.io.File;
// import java.util.Scanner;
// import java.io.FileNotFoundException;

// public class ReadFromFile {
//     public static void main(String[] args) {
//         try {
//             File file = new File("example.txt");
//             Scanner scanner = new Scanner(file);
//             while (scanner.hasNextLine()) {
//                 String data = scanner.nextLine();
//                 System.out.println(data);
//             }
//             scanner.close(); 
//         } catch (FileNotFoundException e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }


// import java.io.File;

// public class DeleteFile {
//     public static void main(String[] args) {
//         File file = new File("example.txt");
//         if (file.delete()) {
//             System.out.println("Deleted the file: " + file.getName());
//         } else {
//             System.out.println("Failed to delete the file.");
//         }
//     }
// }


// import java.util.*;

// public class ArrayInsertExample {
//     public static void main(String[] args) {
//         // Step 1: ArrayList create karo
//         ArrayList<Integer> numbers = new ArrayList<>();

//         // Step 2: Scanner se user se input lo
//         Scanner sc = new Scanner(System.in);
//         System.out.print("How many numbers you want to insert? ");
//         int n = sc.nextInt();

//         // Step 3: Loop me values insert karo
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter number " + (i + 1) + ": ");
//             int value = sc.nextInt();
//             numbers.add(value);
//         }

//         // Step 4: Print inserted values
//         System.out.println("Inserted numbers: " + numbers);
//     }
// }
// CRU   D