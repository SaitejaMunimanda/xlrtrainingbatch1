
import java.util.HashSet;
import java.util.Scanner;
class HashSetDemo2 {
    void HashsetMethod(){
        HashSet<String> hashSet = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String a=scanner.next();
        System.out.print("Name is : "+a);
		//System.out.println(hashSet);
    }
	
}

public class Demo032 {
    public static void main(String[] args) {
		HashSetDemo2 obj = new HashSetDemo2();
        obj.HashsetMethod();
	}
}

// Demo032 - wap to create a Hashset to store 
// Homogeneous string values
//import java.util.HashSet;
//class HashSetDemo2 {
//HashSet does not allow duplicates and it does 
// not guarantee of the 
//order in which the elements are added...
    //void HashsetMethod(){
//         HashSet <String>hashSet = new HashSet<String>();
// 		hashSet.add("INDIA");
// 		hashSet.add("AUSTRALIA");
// 		hashSet.add("BANGLADESH");
// 		hashSet.add("CHINA");
// 		hashSet.add("DUBAI");
// 		hashSet.add("INDIA");
// 		System.out.println(hashSet);
//     }
	
// }

// public class Demo032 {
//     public static void main(String[] args) {
// 		HashSetDemo2 obj = new HashSetDemo2();
//         obj.HashsetMethod();
// 	}
// }