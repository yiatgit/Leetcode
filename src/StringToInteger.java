public class StringToInteger {
	///
	public static void main(String args[]){
		System.out.println(atoi("010"));
	}
    public static int atoi(String str) {
        double result=0;
        //1. null or empty
        if(str==null || str.length()==0){
            return 0;
        }
        //2. white space
        str=str.trim();
        //3. +-
        char flag='+';
        int i=0;
        if(str.charAt(0)=='-'){
            flag='-';
            i++;
        }else if(str.charAt(0)=='+'){
            i++;
        }
        //4. start at 0
        while(i<str.length() && str.charAt(i)=='0'){
            i++;
        }
        
        while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
            result=result*10+(str.charAt(i)-'0');
            i++;
        }
        
        if (flag == '-'){
            result = -result;
        }
        //5. max and min
        if(result>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        return (int)result;
    }
}