class CountString{
    public static void main(String[] args) {
        String str="Java Programming is easy";
        int count=0;
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' '){
            count++;
        }
        }
        System.out.println(count);
    }
}