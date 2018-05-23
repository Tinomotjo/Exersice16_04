package Exersice16_1;

/*
  Write a method called lastIndexOf that accepts an integer value as a parameter
  and that returns the index in the list of the last occurrence of that value,
  or 1 if the value is not found in the list. For example, if a variable list stores the values
  [1, 18, 2, 7, 18, 39, 18, 40],
  then the call of list.lastIndexOf(18) should return 6.
  If the call had instead been list.lastIndexOf(3), the method would return –1.
 */

public class Run16 {

public static void main(String[] args)
{
    LinkedIntList list1 = new LinkedIntList();
    list1.add(1);
    list1.add(18);
    list1.add(2);
    list1.add(7);
    list1.add(18);
    list1.add(36);
    list1.add(18);
    list1.add(40);

    System.out.println(list1.lastIndexOf(18));
}
}