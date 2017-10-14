package com.company;

import java.sql.Time;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Labor cost for creating a stainless steel cylinder

        Scanner scanner = new Scanner(System.in);

        //Promp user

        System.out.println("Total labor time is:");

        String time = scanner.next();

        double laborCost = Double.parseDouble(time)*12.5*2;
                System.out.println("$"+laborCost+"is the labor cost");
    }
}
