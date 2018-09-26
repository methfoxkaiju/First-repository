public class Task6 {
    public static void main(String[] args){
        String str = "? world # ! ? jav#a";
        System.out.println(str);
        str = str.replaceAll("#","");
        str = str.replaceAll("\\?","HELLO");
        System.out.println(str);
    }
}
