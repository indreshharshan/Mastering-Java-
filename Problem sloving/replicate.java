public class replicate{
    public static void main(String[] args){
        // String str="Hello everyone Guys";
        // String words="";
        //   String word[]=str.split(" ");
        // for(int j=0;j<word.length;j++){
          
        //    String letter=word[j];
        
        // for(int i=letter.length()-1;i>0;i--){
        //      words=words+letter.charAt(i);

        // }
        // words=words+" ";
        // }
        // System.out.println(words);
        String str="Hello everyone Guys";
        String words="";
          String word[]=str.split(" ");
        for(int j=0;j<word.length;j++){
          
           String letter=word[j];
        
        for(int i=letter.length()-1;i>0;i--){
             words=words+letter.charAt(i);

        }
        words=words+" ";
        }
        System.out.println(words);

    }
}
 