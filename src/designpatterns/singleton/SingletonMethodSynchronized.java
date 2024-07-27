package designpatterns.singleton;
//Thread safe
public class SingletonMethodSynchronized {
     private  static SingletonMethodSynchronized instance;

     private SingletonMethodSynchronized(){

     }

     //Method synchronized for read - Two threads cannot access the method at the same time
     public  static synchronized SingletonMethodSynchronized getInstance(){
         //Only one thread can access  here
         if(instance == null){
             instance = new SingletonMethodSynchronized();
         }
         return  instance;
     }
}
