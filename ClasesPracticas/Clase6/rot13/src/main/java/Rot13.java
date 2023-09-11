public class Rot13 {

    public static String cifrar(String s){
        StringBuilder r = new StringBuilder();
        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            c+= 13;
            if(c>'z'){
                c-=26;
            }
            r.append(c);
        }
        return r.toString();
    }
}
