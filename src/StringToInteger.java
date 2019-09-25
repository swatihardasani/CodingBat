public class StringToInteger {
    public static void main(String args[]){
        int digit = 0;
        int result = 0;
        String str = "4193 with words";

        str = str.trim();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digit = str.charAt(i) - '0';
                result = result * 10 + digit;
            }
        }

        System.out.println(result);
    }
}
