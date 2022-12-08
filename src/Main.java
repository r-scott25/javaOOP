import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;


////////////////////////////////////////////////////////////
///////////////// Creating Instance of Tree ////////////////
////////////////////////////////////////////////////////////

//      Tree myFavoriteOakTree = new Tree(120, 12, TreeType.OAK);
//
//      myFavoriteOakTree.announceTallTree();
//
//     Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
//
//      myFavoriteMapleTree.announceTallTree();
//
//      System.out.println(Tree.TRUNK_COLOR);
//      Tree.announceTree();
//
//      Color myTrunkColor = Tree.TRUNK_COLOR;




////////////////////////////////////////////////////////////
/////////////// Creating Instance of Employee //////////////
////////////////////////////////////////////////////////////

//        Employee employeeOne = new Employee("Rachel", 41, 60000, "Kansas City");
//        Employee employeeTwo = new Employee("Mrs. Fox", 40, 45000, "Independence");
//        System.out.println(employeeOne.name);
//        System.out.println(employeeOne.raiseSalary());
//        System.out.println(employeeTwo.name);
//        System.out.println(employeeTwo.raiseSalary());




//        ////////////////////////////////////////////////////////////
//        /////////////////// Encapsulation - Tree ///////////////////
//        ////// User the get method to access attribute values //////
//        ////// User the set method to assign attribute values //////
//        ////////////////////////////////////////////////////////////
//
//        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
//
///*
//        Use a GETTER to access the attribute values of the tree instance
// */
//        System.out.println(myFavoriteMapleTree.getTreeType());
//        System.out.println(myFavoriteMapleTree.getHeightFt());
//        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());
//
//
///*        Attribute values can only be modified w/in the class instance.
//          We can't change an attribute directly in the main class with a hard coded value.
//          To change the height of the maple tree, we must use the grow method that's inside
//          the tree class on that instance/.
//          The implementation of how a tree can be modified lives in the tree class only.
// */
//            myFavoriteMapleTree.grow();
//
//
///*
//          If we wanted to allow other classes to set a particular value to one of these attributes,
//          we would create a SETTER. A setter allows you to set the value for a particular attribute.
// */




//        ////////////////////////////////////////////////////////////
//        /////////////////// Encapsulation Challenge ////////////////
//        /////////////////////// Bank Account ///////////////////////
//        ////////////////////////////////////////////////////////////
//
//        BankAccount myBankAccount = new BankAccount("Rachel", 1000);
//
////        Print Bank Account Owner
//        System.out.println(myBankAccount.getOwner());
////        Print initial balance: 1000
//        System.out.println(myBankAccount.getBalance());
//
////        Use withdraw method
//        myBankAccount.withdraw(500);
//
////        Print receipt with updated balance: 5000
//        System.out.println(myBankAccount.getBalance());
//
////        Use deposit method
//        myBankAccount.deposit(200);
//
////          Print receipt with updated balance: 700
//        System.out.println(myBankAccount.getBalance());



//
//        ////////////////////////////////////////////////////////////
//        ///////////////////////// Inheritance //////////////////////
//        //////////////////// Java's Stack Class ////////////////////
//        ////////////////////////////////////////////////////////////
//
//        Stack<Character> charStack = new Stack<Character>();
//
//        charStack.push('c');
//        charStack.push('a');
//        charStack.push('t');
//
//        System.out.println(charStack.pop());
//        System.out.println(charStack.pop());
//        System.out.println(charStack.pop());




//        ////////////////////////////////////////////////////////////
//        //////////////////// Inheritance Challenge /////////////////
//        // ModArrayList Class (as a subclass of ArrayList class) ///
//        ////////////////////////////////////////////////////////////
//
//        ModArrayList listy = new ModArrayList();
//        listy.add(0);
//        listy.add(10);
//        listy.add(20);
//        listy.add(30);
//
//       System.out.println(listy.getUsingMod(1));
//       System.out.println(listy.getUsingMod(-2));
//       System.out.println(listy.getUsingMod(40));


//        /////////////////////////////////////////////////////////////
//        ///////////////////////// Polymorphism //////////////////////
//        //////////////////////// ConditionalArrayList ///////////////////////
//        ////////////////////////////////////////////////////////////
//
//        ConditionalArrayList oddListy = new ConditionalArrayList(1, 2, 3, 4, 9, -13);
//
//        System.out.println(oddListy);
//
//        ArrayList<Integer> listy = new ArrayList<>();
//
//        listy.add(1);
//        listy.add(2);
//        listy.add(3);
//        listy.add(4);
//        listy.add(7);
//        listy.add(9);
//        listy.add(-13);
//
//        System.out.println(listy);


        /////////////////////////////////////////////////////////////
        ///////////////////////// Polymorphism //////////////////////
        /////////////// ConditionalArrayList - Diff Forms in 1 Obj /////////
        ////////////////////////////////////////////////////////////




//    public static void addRandomNumber(ArrayList<Integer> list) {
//        int originalSize = list.size();
//        Random random = new Random();
//        while (originalSize + 1 != list.size()) {
//            int n = random.nextInt(1000);
//            list.add(n);
//        }




//        OddArrayList oddListy = new ConditionalArrayList(7);
//        oddListy.add(1);
//        oddListy.add(2);
//        addRandomNumber(oddListy);
//        System.out.println(oddListy.size());
//        System.out.println(oddListy);
//
//        ArrayList<Integer> listy = new ArrayList<>();
//        listy.add(1);
//        listy.add(2);
//        addRandomNumber(listy);
//        System.out.println(listy.size());
//        System.out.println(listy);
//    }

//    public class Main {
//
//        public static void addRandomNumber(ArrayList<Integer> list) {
//            int originalSize = list.size();
//            Random random = new Random();
//            int n = random.nextInt(1000);
//
//            if (list instanceof ConditionalArrayList) {
//                ConditionalArrayList conditionList = (ConditionalArrayList) list;
//                while (!conditionList.isEligible(n)) {
//                    n = random.nextInt(1000);
//                }
//                }
//                list.add(n);
//            }
//
//
//            public static void main(String[] args) {
//
//
//
//            ConditionalArrayList oddListy = new ConditionalArrayList(n -> Math.abs(n) % 2 == 1);
//            oddListy.add(1);
//            oddListy.add(2);
//            addRandomNumber(oddListy);
//            System.out.println(oddListy);
//
//            ConditionalArrayList evenListy = new ConditionalArrayList(n -> Math.abs(n) % 2 == 0);
//            evenListy.add(1);
//            evenListy.add(2);
//            addRandomNumber(evenListy);
//            System.out.println(evenListy);
//
//            ArrayList<Integer> listy = new ArrayList<Integer>();
//            listy.add(1);
//            listy.add(2);
//            addRandomNumber(listy);
//            System.out.println(listy);
//
//            }

//public class Main {
//
//    public static void main(String[] args) {
//
//        Predicate<Integer> isDivisibleByThree = n -> Math.abs(n) % 3 == 0;
//
//        ConditionalArrayList divisibleByThreeListy =
//                new ConditionalArrayList(isDivisibleByThree);
//
//        ConditionalArrayList divisibleByThreeListy2 =
//                new ConditionalArrayList(isDivisibleByThree, 1, 2, 3, 4, 6, 9);
//
//        ArrayList<Integer>numsList = new ArrayList<>();
//        numsList.add(1);
//        numsList.add(4);
//        numsList.add(3);
//        numsList.add(6);
//        numsList.add(13);
//
//        ConditionalArrayList divisibleByThreeListy3 = new ConditionalArrayList(isDivisibleByThree, numsList);
//
//        Predicate<Integer> isDivisibleBySix = n -> Math.abs(n) % 6 == 0;
//        ConditionalArrayList divisibleBySix = new ConditionalArrayList(isDivisibleBySix, divisibleByThreeListy);
//
//    }
//
//    }

public class Main {
    public static void main(String[] args) {

        Contact contactOne = new Contact("Sally", new PhoneNumber("1234567890"));
        Contact contactTwo = new Contact("Johnny", new PhoneNumber("1234567890"), "johnny@gmail.com");
        Contact contactThree = new Contact("Joe", new PhoneNumber(1, "1234567890"));
        Contact contactFour = new Contact("Jane ", new PhoneNumber("0987654321"));
        Contact contactFive = new Contact("Sunshine Walker", "sunshine@waler.com");



        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);

    }
}
