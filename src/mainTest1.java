import java.util.Scanner;
/*
    cote.inflearn.com
    작성일 : 2022.12.28
    4.단어뒤집기
 */
public class mainTest1 {
    public static void main(String[] args){
        Scanner in1 = new Scanner(System.in);
        int inputNum = in1.nextInt();
        String[] strArr = new String[20];
        String[] retArr = new String[20];
        for(int i = 0 ; i < inputNum ; i++) {
            Scanner in2 = new Scanner(System.in);
            strArr[i]=in2.nextLine();
            for(int j = 0 ; j < strArr[i].length();j++){
                if(j==0){
                    retArr[i]= String.valueOf(strArr[i].charAt(strArr[i].length()-1-j));
                }else{
                    retArr[i]= retArr[i] + strArr[i].charAt(strArr[i].length()-1-j) ;
                }

            }
        }
        for(int i = 0 ; i < inputNum ; i++){
                System.out.println(retArr[i]);
        }

    }
}
