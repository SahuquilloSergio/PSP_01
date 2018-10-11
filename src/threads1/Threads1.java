package threads1;

public class Threads1 extends Thread {
    public Threads1 (String nombre){
        super(nombre);
    }
    
    @Override
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println(i+" "+getName());
            try{
                Thread.sleep((long)Math.random()*1000);
            }catch(InterruptedException ex){
                System.out.println("Error: "+ex);
            }
            System.out.println(10+" "+this.getName());
            System.out.println("Termina Thread: "+getName());
        }
}
    
    
    
    public static void main(String[] args) throws InterruptedException {
        new Threads1("Hola").start();
        new Threads1("Adios").start();
            
    }
    
}
