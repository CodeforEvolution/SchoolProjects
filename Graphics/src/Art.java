	
import java.awt.*;

/**
 * Art
 * This class opens a Canvas window, fills it with a black
 * background, and draws various geometric shapes using Canvas class.
 *  
 * CSTI, Summer 2006
 * @author Jeff Ondich, Dave Musicant, Amy Csizmar Dalal, David Liben-Nowell
 * Nicolet High School, 2006-07
 * @author Brian Due
 */

public class Art
{
  public static void main( String[] args )
  {
	  Canvas canvas = new Canvas("Circle Race");
	  canvas.fillBackground(Color.black);
	  canvas.setSize(500, 500);
	  canvas.setVisible(true);
	  
	  int current = 0;
	  
	  for (int i = 0; i < 110; i++)
	  {
		current = i;
	  	
	  	canvas.erase();
	  	canvas.setInkColor(Color.blue);
		canvas.drawOval(50 + (current * 4), 200, 10, 10);
		canvas.setInkColor(Color.red);
	  	canvas.drawOval((50 + current * 2), 400, 10, 10);
	  	canvas.pause(25);
	  }
  }
}


//import java.awt.*;

/**
* Art
* This class opens a Canvas window, fills it with a black
* background, and draws various geometric shapes using Canvas class.
*  
* CSTI, Summer 2006
* @author Jeff Ondich, Dave Musicant, Amy Csizmar Dalal, David Liben-Nowell
* Nicolet High School, 2006-07
* @author Brian Due
*/
/*
public class Art
{
public static void main( String[] args )
{
// Set up the canvas.
int windowWidth = 800;
int windowHeight = 500;
int rectangleWidth = 50;
int rectangleHeight = 50;
                           //     Make a 'canvas'
Canvas myCanvas = new Canvas("Not quite Picasso");
                           // set the size of window screen
myCanvas.setSize(windowWidth, windowHeight);
myCanvas.setVisible(true);

// There are some built-in colors for your use: yellow, orange, red,
// blue, green, pink, white,black, cyan, magenta, gray, lightGray & darkGray.
// The Color class lets you create new colors. If you want to mix your own colors, create a new
// Color object. The constuctor takes three parameters which
// are ints between 0 and 255, representing the amount of red,
// green, and blue ("RGB") in the color. So (0,0,0) means no
// color (black), (255,0,255) means a shade of purple, and
// (127,0.127) is darker purple, etc.  RGB values for some
// other colors are available at the following web page:
// <http://www.dtp-aus.com/bigcolor.html>.

// Set the background color of the Canvas.
Color black = new Color(0, 0, 0);
myCanvas.fillBackground(black);
//myVanvas.drawFilledRectangle(0,0,windowWidth,windowHeight);

myCanvas.setInkColor (Color.white);             // printing strings on screen
myCanvas.drawString("Welcome to the Geometry Show!",60,80);
myCanvas.pause(1000);

myCanvas.setInkColor (Color.red);               // drawing lines
myCanvas.drawLine(0, 0, 200, windowHeight);
myCanvas.pause(1000);

myCanvas.setInkColor (Color.orange);            // rectangle (filled)
myCanvas.drawFilledRectangle(0,windowHeight-40, windowWidth, 40);

// Set the color of the pen.  The "pen color" refers to the color
// that will be used for all future drawing operations, until the
// pen color is changed again.
Color darkPurple = new Color(127, 0, 127);      // creating your own colors
myCanvas.setInkColor(darkPurple);

myCanvas.drawFilledRectangle(500, 50, 100, 50);
myCanvas.pause(1000);


myCanvas.setInkColor(Color.blue);      //this is a simple form of animation!
int q=0;
while (q<500)
{
myCanvas.drawRectangle(q,10,40,40);
myCanvas.pause(5);
myCanvas.eraseRectangle(q,10,40,40);
q++;
}
myCanvas.drawRectangle(q,10,40,40);



// Draw a square.  More specifically, draw a rectangle whose top
// left corner has coordinates (measured in pixels)
// x = windowWidth/2 and y = windowHeight/2, and whose width
// and height are specified by the variables rectangleWidth and
// rectangleHeight.             
                            // using variable coordinates
myCanvas.drawRectangle(windowWidth/2, windowHeight/2, rectangleWidth, rectangleHeight);   
myCanvas.pause(1000);
                            // erasing pictures
myCanvas.eraseRectangle(windowWidth/2, windowHeight/2, rectangleWidth, rectangleHeight);
myCanvas.pause(1000);
    
myCanvas.drawRectangle(windowWidth/2, windowHeight/2, rectangleWidth+15, rectangleHeight+15);
myCanvas.pause(1000);

myCanvas.setInkColor(Color.green);          // Ovals (ellipses)
myCanvas.drawFilledOval(210, 225, 60, 30);
myCanvas.pause(1000);

myCanvas.setInkColor(Color.yellow);    // circles..oval with same width & height
myCanvas.drawOval(200, 200, 150, 150);

for (int x=150; x>75; x-=5)             // nested circles!!!!
{   myCanvas.drawOval(200, 200, x, x);
    myCanvas.pause(350);}
    
myCanvas.setInkColor(Color.blue);   
myCanvas.drawFilledOval(225, 225, 30, 30);
myCanvas.pause(1000);

myCanvas.setInkColor(Color.pink);       // triangle
myCanvas.drawTriangle(100,100,200,100,150,200);
myCanvas.pause(1000);

int pentagonX [] = {500, 600, 600, 550, 500}; 
int pentagonY [] = {200, 200, 300, 375, 300};
                                        // polygons...using arrays of points
myCanvas.setInkColor(Color.white);   
myCanvas.drawFilledPolygon(pentagonX, pentagonY, 5);    
}
}
*/