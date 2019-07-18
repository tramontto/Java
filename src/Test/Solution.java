package Test;


public class Solution {
    public  void eating(){
        System.out.println("from solution");
    }
    public static void main(String[] args){
       Solution solution = new Dog();
       Dog dog = new Dog();
       Cat cat = new Cat();
       solution.eating();
       Dog dog1 = (Dog) solution;
       dog.eating();
       cat.eating();

    }
}
