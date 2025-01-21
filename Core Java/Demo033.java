import java.util.Iterator;
import java.util.LinkedHashSet;

class hashSet{
    void LinkedHashSet(){
        LinkedHashSet <Integer>linkedhashset = new LinkedHashSet();
        linkedhashset.add(45);
        linkedhashset.add(48);
        linkedhashset.add(47);
        linkedhashset.add(44);
        System.out.println(linkedhashset);
        linkedhashset.remove(45);
        int sum=0;
        for(Integer x : linkedhashset) {
			sum += x;
		}

		System.out.println("The sum is :" + sum);

        Iterator it = linkedhashset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

    }
}

public class Demo033 {
    public static void main(String[] args) {
        hashSet obj = new hashSet();
        obj.LinkedHashSet();
    }

    
}
