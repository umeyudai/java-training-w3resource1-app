package com.umeyudai;

public class Exercise13 {
    public static void main(String[] args){
        //Width = 5.5 Height = 8.5
        double w = 5.5;
        double h = 8.5;
        double perimeter = 2*(h + w);
		
        double area = w * h;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", h, w, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", w, h, area);
    }
}
