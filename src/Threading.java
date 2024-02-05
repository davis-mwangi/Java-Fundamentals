public class Threading {

   public static void main(String[] args){
       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("Count...");
           }
       }).start();

       new Thread(() -> {
           System.out.println("Implementation using Java 8");
       }).start();
   }
}
