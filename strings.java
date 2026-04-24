public class strings {
    public static void main(String[] args) {

        String str = "hello world";
        String str4 = "hhfskkkkkttesdd";
        String str2 = "Hello World";
        String str3 = new String("Hello World");
        System.out.println(substring(str2, 0,5)); // Hello
        System.out.println(firstUpperCase(str)); // Hello World
        System.out.println(Compression(str4)); // h1f1s1k5t1e1s2d2

    }
    

    public static void StringCompare (String str1, String str2, String str3){


        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2.equals(str3)); // true
        if (str1.equals(str2)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    
    }



    public static String substring(String str,  int start, int end) {
        
        String result = "";
        for (int i = start; i < end && i < str.length(); i++){
            result += str.charAt(i);
        }
        return result;
    }

    public static String firstUpperCase(String str){
        StringBuilder result = new StringBuilder();

        char firstChar = str.charAt(0); 
        result.append(Character.toUpperCase(firstChar));
        for (int i = 1; i < str.length(); i++){
            if(str.charAt (i) == ' ' && i < str.length() - 1){
                result.append(' ');
                result.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static String Compression(String str) {
        if (str.length() == 0){
            return "";
        }

        StringBuilder result = new StringBuilder();
        Integer count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt (i + 1) && i < str.length() - 1){
                count++;
            }
            else {
                result.append(str.charAt(i));
                if (count > 1)
                result.append(count.toString());
                count = 1;
            }

           
        }
        return result.toString();

    }
}


