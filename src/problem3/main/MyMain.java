/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("jaya", 1);
        obj.insert("swastik", 4);
        obj.insert("sheel", 3);
        obj.insert("prakhar", 2);
        obj.insert("ananya", 5);
        obj.display();
    }
}
