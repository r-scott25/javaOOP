import java.awt.*;

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

        Employee employeeOne = new Employee("Rachel", 41, 60000, "Kansas City");
        Employee employeeTwo = new Employee("Mrs. Fox", 40, 45000, "Independence");
        System.out.println(employeeOne.name);
        System.out.println(employeeOne.raiseSalary());
        System.out.println(employeeTwo.name);
        System.out.println(employeeTwo.raiseSalary());


    }
}
