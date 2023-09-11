

public class Computer
{
    // instance variables - replace the example below with your own
    private long ram;
    private long harddisk;
    private String display;
 

    
    public Computer(long ram, long harddisk, String display)
    {
        // initialise instance variables
        this.ram = ram;
        this.harddisk = harddisk/1000000000;
        this.display = display;
    }
    
    public void Specs()
    {
       System.out.println(harddiskInGB() + ramInGB() + Display());
       /*System.out.println("Der RAM ist: " + ram + " Gigabyte groß");
       System.out.println("Die Festplatte ist: " + harddisk + " Gigabyte groß");
       System.out.println("Das Display ist von der Marke: " + display);*/
    }
    
    public long harddiskInGB()
    {
        System.out.println("Die Festplatte ist: " + harddisk + " Gigabyte groß");
        return harddisk;    
    }
    
    public long ramInGB()
    {
        System.out.println("Der RAM ist: " + ram + " Gigabyte groß");
        return ram;
    }
    
    public String Display()
    {
        System.out.println("Das Display ist ein: " + display + "Display");        
        return display;
    }
}
