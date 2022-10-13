public class MyTurtle extends BaseTurtle{

    public MyTurtle(){
        super();
    }

    public void desenhar(){

        pen.setStrokeWidth(5);
        this.setDelay(10);
		this.face(90);
        pen.down();

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                pen.setRandomColor();
                this.moveBy(k, i);
                this.moveBy(k, -i);
                this.moveBy(-k, i);
                this.moveBy(-k, -i);
            }
            this.turn(90 * i);
		}
    }
}