class SmallestwordString {

    public static void main(String[] args) {
        String str="Take an umberalla";
        String words[] = str.split(" ");
        String min=words[0];
        for(int i=0;i<words.length;i++){
            if(words[i].length()<min.length()){
                min=words[i];
            }
        }
        System.out.println(min);
    }
}
