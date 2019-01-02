package l2;

public interface MoveBehaviour {
    public void move();
}

class Fly implements MoveBehaviour{

    @Override
    public void move() {
        System.out.print("Now I'm flying. ");
    }
}

class Drive implements MoveBehaviour{

    @Override
    public void move() {
        System.out.print("Now I'm driving. ");
    }
}

class Halt implements MoveBehaviour{

    @Override
    public void move() {
        System.out.print("Now I'm stopping. ");
    }
    
}
