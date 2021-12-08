
public class myListTest {
    public static void main(String[] args) throws Exception {
        myList testList = new myList();             
        testList.add(5);                            
        testList.add(10);
        testList.add(15);
        testList.add(20);
        testList.add(25);
        testList.addLast(2);                

        System.out.print("test spisok");
        System.out.println(testList);              
        myList copy = new myList(testList);        
        System.out.print("kopia test spiska: ");
        System.out.println(copy);                   

        testList.removeFirst();                     

        System.out.print("spisok posle udalenia: ");
        System.out.println(testList);              
        System.out.println(copy);                   

        testList.removeAtValue(10);    
        System.out.print("test spisok posle udalenia ilementa (10): ");
        System.out.println(testList);              

        System.out.println("dlina: " + testList.getLength());      
        System.out.println("dlina kopi: " + copy.getLength());
        testList.clear();                                                       

      

    }
}
