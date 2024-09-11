/**
 * This image represents a picture of Santa delivering presents. 
 * He has delivered three gifts under the Christmas tree.  
 *
 * 
 * @author  Andrew Parvaneh 
 * @version 2024.09.10
 */
public class Picture
{
    private Square trunk;
    private Square gift1;
    private Square gift2;
    private Square gift3;
    private Triangle tree;
    private Triangle star;
    private Triangle hat;
    private Circle ornament1;
    private Circle ornament2;
    private Circle ornament3;
    private Circle ornament4;
    private Circle ornament5;
    private Person santa;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        trunk = new Square();
        gift1 = new Square();
        gift2 = new Square();
        gift3 = new Square();
        tree = new Triangle();
        star = new Triangle();
        hat = new Triangle();
        ornament1 = new Circle();
        ornament2 = new Circle();
        ornament3 = new Circle();
        ornament4 = new Circle();
        ornament5 = new Circle();
        santa = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            trunk.changeColor("brown");
            trunk.moveHorizontal(-140);
            trunk.moveVertical(60);
            trunk.changeSize(25);
            trunk.makeVisible();
            
            gift1.changeColor("red");
            gift1.moveHorizontal(-100);
            gift1.moveVertical(80);
            gift1.changeSize(15);
            gift1.makeVisible();
            
            gift2.changeColor("yellow");
            gift2.moveHorizontal(-165);
            gift2.moveVertical(80);
            gift2.changeSize(20);
            gift2.makeVisible();
            
            gift3.changeColor("blue");
            gift3.moveHorizontal(-130);
            gift3.moveVertical(100);
            gift3.changeSize(17);
            gift3.makeVisible();
            
            tree.changeColor("green");
            tree.moveHorizontal(-28);
            tree.moveVertical(-40);
            tree.changeSize(80, 100);
            tree.makeVisible();
            
            ornament1.changeColor("red");
            ornament1.moveHorizontal(-75);
            ornament1.moveVertical(70);
            ornament1.changeSize(10);
            ornament1.makeVisible();
            
            ornament2.changeColor("yellow");
            ornament2.moveHorizontal(-65);
            ornament2.moveVertical(40);
            ornament2.changeSize(10);
            ornament2.makeVisible();
            
            ornament3.changeColor("red");
            ornament3.moveHorizontal(-25);
            ornament3.moveVertical(70);
            ornament3.changeSize(10);
            ornament3.makeVisible();
            
            ornament4.changeColor("blue");
            ornament4.moveHorizontal(-50);
            ornament4.moveVertical(70);
            ornament4.changeSize(10);
            ornament4.makeVisible();
            
            ornament5.changeColor("blue");
            ornament5.moveHorizontal(-40);
            ornament5.moveVertical(40);
            ornament5.changeSize(10);
            ornament5.makeVisible();
            
            star.changeColor("yellow");
            star.moveHorizontal(-28);
            star.moveVertical(-42);
            star.changeSize(10, 30);
            star.makeVisible();
            
            santa.changeColor("black");
            santa.changeSize(60,30);
            santa.makeVisible();
            
            hat.changeColor("red");
            hat.moveHorizontal(68);
            hat.moveVertical(17);
            hat.changeSize(20, 30);
            hat.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        trunk.changeColor("black");
        gift1.changeColor("black");
        gift2.changeColor("black");
        gift3.changeColor("black");
        tree.changeColor("black");
        star.changeColor("black");
        hat.changeColor("black");
        santa.changeColor("black");
        ornament1.changeColor("white");
        ornament2.changeColor("white");
        ornament3.changeColor("white");
        ornament4.changeColor("white");
        ornament5.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        trunk.changeColor("brown");
        gift1.changeColor("red");
        gift2.changeColor("yellow");
        gift3.changeColor("blue");
        tree.changeColor("green");
        ornament1.changeColor("red");
        ornament2.changeColor("yellow");
        ornament3.changeColor("red");
        ornament4.changeColor("blue");
        ornament5.changeColor("blue");
        star.changeColor("yellow");
        santa.changeColor("black");
        hat.changeColor("red");
    }
}
