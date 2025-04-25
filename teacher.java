public class teacher{

    String name;

    teacher(){
        System.out.println("Hello");
    }

    void setName(String name){
        this.name=name;
    }
    public static void main(String args[]){
        teacher t1 = new teacher();
        t1.setName("inbaa"); 
        System.out.println(t1.name);
        }
        }