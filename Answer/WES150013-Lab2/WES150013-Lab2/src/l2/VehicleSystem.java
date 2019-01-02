

package l2;

public abstract class VehicleSystem {

    protected MoveBehaviour mb;

    public void setMoveBehaviour(MoveBehaviour mb) {
        this.mb = mb;
    }

    public void performMove() {
        mb.move();
    }

    public abstract void display();
}

class StreetRacer extends VehicleSystem {

    public StreetRacer() {
        setMoveBehaviour(new Drive());
    }

    @Override
    public void display() {
        System.out.print("\nI am a StreetRacer. ");
    }
}

class FormulaOne extends VehicleSystem {

    public FormulaOne() {
        setMoveBehaviour(new Drive());
    }

    @Override
    public void display() {
        System.out.print("\nI am a FormulaOne. ");
    }
}

class Aircraft extends VehicleSystem {

    public Aircraft() {
        setMoveBehaviour(new Fly());
    }

    @Override
    public void display() {
        System.out.print("\nI am an Aircraft. ");
    }

}
