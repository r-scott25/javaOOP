import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


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



        ////////////////////////////////////////////////////////////
        //////////////////// Inheritance Challenge /////////////////
        // ModArrayList Class (as a subclass of ArrayList class) ///
        ////////////////////////////////////////////////////////////

        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

       System.out.println(listy.getUsingMod(1));
       System.out.println(listy.getUsingMod(-2));
       System.out.println(listy.getUsingMod(40));
    }
}
