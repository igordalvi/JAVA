/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummativeMilestone2.dvdlibrary.ui;

import java.util.Scanner;

/**
 *
 * @author igord
 */
public class UserIOConsoleImpl implements UserIO {

    Scanner sc = new Scanner(System.in);

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double readDouble;
        readDouble = Double.parseDouble(sc.nextLine());
        return readDouble;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double betweenDouble = Double.parseDouble(sc.nextLine());
        while (betweenDouble < min || betweenDouble > max) {
            System.out.println("It looks like your number is out of bounds. Choose another one (between " + min + " and " + max + "):");
            betweenDouble = Double.parseDouble(sc.nextLine());
        }
        return betweenDouble;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float readFloat = Float.parseFloat(sc.nextLine());
        return readFloat;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        float betweenFloat = Float.parseFloat(sc.nextLine());
        while (betweenFloat < min || betweenFloat > max) {
            System.out.println("It looks like your number is out of bounds. Choose another one (between " + min + " and " + max + "):");
            betweenFloat = Float.parseFloat(sc.nextLine());
        }
        return betweenFloat;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        int readInt = Integer.parseInt(sc.nextLine());
        return readInt;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int betweenInt = Integer.parseInt(sc.nextLine());
        while (betweenInt < min || betweenInt > max) {
            System.out.println("It looks like your number is out of bounds. Choose another one (between " + min + " and " + max + "):");
            betweenInt = Integer.parseInt(sc.nextLine());
        }
        return betweenInt;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long readLong = Long.parseLong(sc.nextLine());
        return readLong;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        long betweenLong = Long.parseLong(sc.nextLine());
        while (betweenLong < min || betweenLong > max) {
            System.out.println("It looks like your number is out of bounds. Choose another one (between " + min + " and " + max + "):");
            betweenLong = Long.parseLong(sc.nextLine());
        }
        return betweenLong;
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String readString = sc.nextLine();
        return readString;
    }

}
