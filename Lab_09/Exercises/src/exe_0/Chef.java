package exe_0;

class Chef extends Thread {
    WaitPerson p1, p2;
    int time;

    Chef(int time){
        System.out.println("Start");
        start();
    }

    @Override
    public void run() {
        super.run();
        while(true) {

        }
    }
}
