/**
 * Created by jianiyang on 16/7/12.
 */
public class ZigZagCoversion {
    public String covert(String s, int numRows){
        char[] c = s.toCharArray();
        int length = c.length;

        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0; i < sb.length; i++){
            sb[i] = new StringBuffer();
        }

        int i = 0;
        while(i < length){
            for(int index = 0; index < numRows && i < length; index++){
                sb[index].append(c[i++]);
            }
            for(int index = numRows -2 ; index >= 1 && i < length; index--){
                sb[index].append(c[i++]);
            }
        }

        for(int idx = 1; idx < sb.length; idx++){
            sb[0].append(sb[idx]);
        }

        return sb[0].toString();
    }

    public static void main(String[] args){
        String s = new String("ABCDEFG");
        int numRows = 3;

        ZigZagCoversion res = new ZigZagCoversion();
        String result = res.covert(s, numRows);
        System.out.println(result);
    }
}
///the hint of leetcode is wrong