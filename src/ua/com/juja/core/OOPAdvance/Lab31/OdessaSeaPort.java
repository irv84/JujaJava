package ua.com.juja.core.OOPAdvance.Lab31;

class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort < 2) {
            indexShipInPort =indexShipInPort+ 1;
            arrayShip[indexShipInPort] = ship;
            return indexShipInPort;
        }
        else return -1;
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (indexShipInPort<0)return -1;
        if (indexShipInPort==0){
            arrayShip[0]=null;
            indexShipInPort=indexShipInPort-1;
        }
        else {
            for (int i = 0; i <indexShipInPort; i++) {
                arrayShip[i]=arrayShip[i+1];
                }
                arrayShip[indexShipInPort]=null;
            indexShipInPort=indexShipInPort-1;

        }return 1;


    }

    @Override
    public String printQueueShip() {
        String result = "";
        if (indexShipInPort < 0) result = "QueueEmpty";
        else {
            for (int i = 0; i <=indexShipInPort ; i++) {

            AbstractShip ship=arrayShip[i];
               result += "{Name=" + ship.getName() + "Length=" + ship.getLength() + "Width=" + ship.getWidth() + "Displacement=" + ship.getDisplacement() + "};";


            }
        }
        return result;
    }
}
