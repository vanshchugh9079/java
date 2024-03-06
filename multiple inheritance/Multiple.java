class Multiple {
    interface Vehical {
        void start();

        void stop();
    }

    interface Charge {
        void charge();
    }

    class Activa implements Charge,Vehical{
        @Override
        public void charge() {
            System.out.println("Charging");
        }
        @Override
        public void start() {
            System.out.println("Starting");
        }
       @Override
        public void stop() {
            System.out.println("Stopping");
        }
    }
    public static void main(String[] args) {
        Multiple multi=new Multiple();
        Multiple.Activa active = multi.new Activa();
        active.charge();
        active.start();
        active.stop();
    }
}
