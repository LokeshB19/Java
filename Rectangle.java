
class Rectangle 
{
     //created two attributes length and width
    int length;
    int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) 
    {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() 
    {
        return length * width;
    }
    public static void main(String[] args) 
    {
        // Creating two Rectangle objects with random values
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(40, 10);

        // Calculating the areas of both rectangles
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Compare the areas of the rectangles using relational operators
        if (area1 > area2) 
        {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) 
        {
            System.out.println("Rectangle1 < Rectangle2");
        } else 
        {
            System.out.println("They are equal");
        }
    }
}
