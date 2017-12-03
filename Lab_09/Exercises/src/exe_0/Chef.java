package exe_0;

class Chef extends Thread {
    int time;
    int count = 0;

    Chef(int time){
        this.time = time;
        System.out.println("Start time: " + time);
        start();
    }

    @Override
    public void run() {
        super.run();
        while(true){
            try{
                count++;
                sleep(time);
                System.out.println("Time: " + time + " count: " + count);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
