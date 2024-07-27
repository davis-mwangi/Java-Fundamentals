// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//        char a = 'a';
//        char z ='z';
//
//        System.out.println(z -a);
//
//
//        char b = 'b';
//        char a1 ='a';
//
//        System.out.println( (a1 -b ) % 26);

//        System.out.println(( (-1 % 26) + 26) % 26);

//        String [] parts =  "/home//foo/".split("/");
//        System.out.println(Arrays.toString(parts));
//
//        Deque<String>deque = new LinkedList<>();
//        deque.addFirst();
//
       Random random = new Random();
       for(int i = 0; i <= 10; i++){
           int rand = random.nextInt(0,3)+1;
           System.out.println(rand);
       }

//        System.out.println( (Integer.MAX_VALUE + Integer.MAX_VALUE) );
//        System.out.println( ((int)Math.pow(10,9) + (int)Math.pow(10,9) ) );

//        int  [] arr = new int[]{1,5,34};
//        int  [] arrB = arr.clone();
//        System.out.println(Arrays.toString(arrB));
//
//        ArrayList<List<Integer>>adj = new ArrayList<>();
//        System.out.println(adj.get(0));
//
//        Arrays.asList("ssr");

//        Deque<Integer>deque = new LinkedList<>();
//        deque.add(1);
//        deque.add(6);
//        deque.add(8);
//        deque.add(9);
//        deque.add(9);
//
//        System.out.println(deque);
//        deque.poll();
//        System.out.println(deque);
//        deque.poll();
//        System.out.println(deque);
//        deque.addLast(10);
//        System.out.println(deque);
//        deque.addLast(11);
//        System.out.println(deque);
//        deque.poll();
//        System.out.println(deque);

//
//        Random random;
//
//        random = new Random();
//        int x =  random.nextInt(10);
//        System.out.println(x);

//
//
//        Stack <String>stack = new Stack<>();
//        stack.push("one");
//        stack.push("two");
//        stack.push("three");
//        stack.push("four");
//        stack.push("five");
//
//
//        for(String count :  stack){
//            System.out.println(count);
//        }




    }


//
//        int num = 2736;
//        StringBuilder str  = new StringBuilder();
//        while(num > 0){
//            int rem = num % 10;
//            str.insert(0, rem);
//            System.out.println("REM" +  ('9'- '0') );
//            num = num / 10;
//        }
//        char ch = (char) 7;
//        System.out.println(ch);
//        System.out.println((int)Math.pow(10, 8));
////        100000000
//    }

//        String encoded = encode(Arrays.asList("lint?","code","love","you"));
//        System.out.println(encoded);
//        List<String> decoded = decode(encoded);
//        System.out.println(decoded);
//         int min = 0;
//         int max = 100;
//         int x =  (int) ( Math.random() * (max - min + 1)) + min;
//        List<Integer>list  = Arrays.asList(1,2,10, 4,5,5);
//       int sum =  list.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);
//       int max =  list.stream().mapToInt(Integer::intValue).max().getAsInt();
//        System.out.println(max);
//       int min =  list.stream().mapToInt(Integer::intValue).min().getAsInt();
//        System.out.println(min);
//
//        System.out.println(generateString(10));
//          String str =  "172.16.254.1";
//          str.startsWith("2");
//          str.endsWith("#");
//
//          Character.isUpperCase('c');
//          Character.isLowerCase('c');
//          Character.isDigit('c');
//          Character.isWhitespace('c');
//          Character.isLetter('x');
//
//
//        String[] partsIpv6 = null ;
//          if(str.contains(".")){
//              System.out.println(str.split("."));
//              partsIpv6 = str.split(".");
//          }
//          System.out.println(Arrays.toString(partsIpv6));
//

//        System.out.println( Map.Entry<String,String>
//        Map<String,String>sb = new HashMap<>();
//        sb.put("2","10");
//        sb.put("3","12");
//        for(Map.Entry<String,String>entry : sb.entrySet()){
//            System.out.println(entry);
//        }
//
//        int[][]arr = new int[][] {new int[]{1,3},new int[]{8,10},new int[]{15,18},new int[]{2,6}, };
//        Arrays.sort(arr, (a, b) -> a[0] -b[0]);
//
//        for(int[] a  :arr){
//            System.out.println(Arrays.toString(a));
//        }

//        PriorityQueue<Map.Entry<Integer, Double>>pq = new PriorityQueue<Map.Entry<Integer, Double>>(
//                (a,b) -> Double.compare(a.getValue(), b.getValue() && Double.compare(a.getKey(), b.getKey()))
//        );
//        ;
//        Map<Integer, Double> data = new HashMap<>();
//        pq.add(data);
//       Double.compare(2.0, 24);
//               Integer.compare(3,4);

//        System.out.println( (('a'- 'b') % 26) );
//        System.out.println( 29 % 10);
//
//        StringBuilder sb = new StringBuilder();
//        sb.insert(0, 34);
//        sb.deleteCharAt(sb.length() -1);

//        Set<String>set = new LinkedHashSet<>();
//        set.clear();
//        set.add("eee");
//        set.remove("eee");
//        Arrays.reve

//        List<String>msm = new ArrayList<>();
//        msm.add();
//        msm.addAll();
//
//        String string = "AZURE_STORAGE_ACCOUNT_KEY=/ZDNfFlUc1vWX/hP3K7yWd0Daw/EwofPF1QftmvjUFqBQz5dWpoqdnrIygL1yN7gl2FZrfLf2nopYN9v82TEew\\=\\=;CLIENT_ID=BD33F3A97D6941A;CLIENT_SECRET=MjJDOTRENTEtNTRGQy00MkZGLThFNjYtMTc3NEVFNDc5MUNC;EMAIL_VALIDATION_API_KEY=5cbc98e5b00b4103982b01cf5f52ff0e;ENCRYPTION_KEY=8z96G01Br5IU5gZ6wBvmc61NOyWSlm;EVENTHUB_CONNECTION_STRING=Endpoint\\=sb://finserve-dev.servicebus.windows.net/\\;SharedAccessKeyName\\=RootManageSharedAccessKey\\;SharedAccessKey\\=TSMGPlinPdpuIBR53aR/45jLxBBLd+OVmd71UVYiPgM\\=;INSTRUMENTATION_KEY=d7edff2b-517a-46e0-a984-2b29425f0865;JENGA_HQ_API_KEY=yPZbhSY7/6lMHHnEoxFG0FSNqKTGG2fvFBDc73qS15be3DzdbVT2FA2/zmN;JENGA_HQ_CONSUMER_SECRET=oN8kYT6bv3EYb43nDRR8547rNK8o4709n5f;MPGS_CLIENT_AUTH=32424234243242343r43r43r34;MPGS_CLIENT_KEY=b2ba7a26af1f6a611e7afef19d0341fc;MY_FILE=/usr/local/files/;PAYPAL_PARTNER_ID=D2A4FHU23GYHE;PAYPAL_PASSWORD=EO19KT-VaHBTfHOT_FIMZwNwh_DyKolUqeFBIymF3xdKOb1G53xt5RtwarTstt2kCNMV4oIKQwbZc003;PAYPAL_USERNAME=AX9GOhS1VtoQQ0gEA4N90UsFz24VmlnbaBpMiR8M999PPdaLCUWjOrAo84d1B2rs8rZaZb3yhA50FP4w;PHONE_VALIDATION_API_KEY=04f4efd35de850b9277003b1ea17647c;SQL_SERVER_NAME_01=sql-finserve-uat-001.database.windows.net;SQL_SERVER_PASSWORD_01=d9fMazGUsi9VZCHKMMC9tcrw3T;SQL_SERVER_USERNAME_01=sql-finserve-admin;ZENDESK_API_KEY=fjtiANb3MCByDIN2LxpVX2JRLcpcZ7SpXib6Q3TQ;ZENDESK_PASS=Jenga@2020";
//        String [] split =  string.split(";");
//        for(String keyVault :  split){
//            System.out.println(keyVault);
//        }
//        Integer.toString(13);
//StringBuilder sb = new StringBuilder(24);
//sb.setCharAt(1,'4');




// List<String>jj= new ArrayList<>();
// jj.set(0, "4");
// jj.clear();
//    }





//    public static String generateString(int length){
//        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        int len = str.length();
//        StringBuilder sb = new StringBuilder(len);
//        int min = 0;
//        for(int i = 0; i <  length; i++){
//            int index = (int) ( Math.random() * (len - min)) + min;
//            sb.append(str.charAt(index));
//        }
//        return sb.toString();
//    }

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.

     ["lint","code","love","you"]

     4#lint4#code4#love3#you


     */
//    public static  String encode(List<String> strs) {
//        StringBuilder sb = new StringBuilder();
//        for(String str:  strs){
//            sb.append(str.length());
//            sb.append("#");
//            sb.append(str);
//        }
//        return sb.toString();
//    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
//    public  static  List<String> decode(String str) {
//        // write your code here
//        List<String>ans = new ArrayList<>();
//        int i = 0;
//        while( i < str.length() ){
//            if(str.charAt(i) == '#'){
//                //Get the length of the String
//                int k = i - 1;
//                StringBuilder lenStr = new StringBuilder();
//                while( k >= 0 && Character.isDigit(str.charAt(k))){
//                     lenStr.insert(0,str.charAt(k)) ;
//                    k--;
//                }
//                System.out.println("STR LEN " + lenStr);
//                int len =  Integer.parseInt(lenStr.toString());
//                StringBuilder sb = new StringBuilder();
//                int j = i + 1;
//                while(len > 0){
//                    sb.append(str.charAt(j));
//                    len -= 1;
//                    j += 1;
//                }
//                ans.add(sb.toString());
//                i = j - 1;
//            }
//            i++;
//        }
//        return ans;
//    }
}