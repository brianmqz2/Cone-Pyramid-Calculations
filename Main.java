import java.util.*;
public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter pyramid width: ");
        double PyramidWidth = in.nextDouble();
        System.out.print("Enter pyramid height: ");
        double PyramidHeight = in.nextDouble();

        Pyramid Luxor = new Pyramid(PyramidWidth, PyramidHeight);

        System.out.println("Volume = " + Luxor.getVolume());
        System.out.println("Surface area = " + Luxor.getSurfaceArea());
        System.out.println("\n");

        System.out.print("Enter cone width: ");
        double ConeWidth = in.nextDouble();
        System.out.print("Enter cone height: ");
        double ConeHeight = in.nextDouble();

        Cone Joker = new Cone(ConeWidth, ConeHeight);

        System.out.println("Volume = " + Joker.getVolume());
        System.out.println("Surface area = " + Joker.getSurfaceArea());
        System.out.println("\n");
    }
}
class Pyramid
{
    double Width, Height;

    Pyramid (double theWidth, double theHeight)
    {
        Width = theWidth;
        Height = theHeight;
    }

    double getVolume()
    {
        return (Width*Width*Height)/3;
    }

    double getSurfaceArea()
    {
        return (Width * Width) + Width * Math.sqrt(((Width / 2) *
                (Width / 2)) + (Height * Height)) + Width * Math.sqrt(((Width / 2) *
                (Width / 2)) + (Height * Height));
    }
}

class Cone
{
    double Width, Height;
    double pi = 3.1415926;

    Cone (double theWidth, double theHeight)
    {
        Width = theWidth;
        Height = theHeight;
    }
    double getVolume()
    {
        return pi * (Width * Width) * (Height / 3);
    }

    double getSurfaceArea()
    {
        return pi * Width * (Width + Math.sqrt((Height * Height) +
                (Width * Width)));
    }
}