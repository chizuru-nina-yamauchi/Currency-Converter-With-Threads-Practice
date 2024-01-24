public class DaemonThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Monitoring exchange rates....");
            try{
                Thread.sleep(5000); // Sleep for 5 seconds
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
