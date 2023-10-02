
public class StaticDemo
{
 
    public void machwas () {
        String str = "superkallefrageslistic";
        System.out.println(this);
        boolean xy = this.equals(null);
    }
    
    public String toString() {
        return "Ich bin eine StaticDemo Instanz -- wie unlogisch!";
    }

}
