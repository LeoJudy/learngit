
public void Main{
    
    private String name = "Feature 1";

    public static void main(String[] args){
        System.out.println("Hello Git!");
        System.out.println(new Main());
    }

    public String toString(){
        return "I am " + name;
    }
}
