package ass15_12_22;

interface Drawable
{
    void draw();
}

interface Showable
{
    void show();
}

class Print implements Drawable,Showable
{
         public void draw()
         {
                System.out.println("Drawable.....");
         }
 
          public void show()
          {
                System.out.println("showable.....");
          }

}

class UsePrint
{
    public static void main(String[] args)
     {
         Print p = new Print();
	     p.draw();
	     p.show();
     }
}
