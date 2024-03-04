public class Driver {
    public static void main(String[] args) {

        Figure[] figuresArray = new Figure[5];

        figuresArray[0] = new DownwardHat();
        figuresArray[1] = new DownwardHat();
        figuresArray[2] = new UpwardHat();
        figuresArray[3] = new FaceMaker();
        figuresArray[4] = new Vertical();

        for(Figure fig: figuresArray){
            fig.getFigure();
        }
        System.out.println();

        for(Figure fig: figuresArray){
            System.out.print(fig.getClass().getName() + ": " );
            fig.getFigure();
            System.out.println();
        }
    }
}
