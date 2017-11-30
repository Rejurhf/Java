package exe_0;

class WaitPerson extends Thread {
    int time;

    WaitPerson(int time){
        this.time = time;
        start();
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("W: " + time);
        }
    }
}
