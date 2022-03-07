package com.TwentyNinthLegion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] grid = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',};
        char[][] twoDs = new char[3][3];

        twoDs[0][0] = grid[0];
        twoDs[0][1] = grid[1];
        twoDs[0][2] = grid[2];
        twoDs[1][0] = grid[3];
        twoDs[1][1] = grid[4];
        twoDs[1][2] = grid[5];
        twoDs[2][0] = grid[6];
        twoDs[2][1] = grid[7];
        twoDs[2][2] = grid[8];

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        int coord1 = 0;
        int coord2 = 0;

        boolean loop = false;

        while (!loop) {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
            }
            catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }

        }

        while (coord1 > 3 || coord2 > 3) {
            System.out.println("Coordinates should be from 1 to 3!");
            System.out.print("Enter the coordinates: ");
            coord1 = scanner.nextInt();
            coord2 = scanner.nextInt();
        }

        while (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.print("Enter the coordinates: ");
            coord1 = scanner.nextInt();
            coord2 = scanner.nextInt();
        }

        int result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'X';
                break;
            case 3:
                twoDs[0][1] = 'X';
                break;
            case 4:
                twoDs[0][2] = 'X';
                break;
            case 5:
                twoDs[1][0] = 'X';
                break;
            case 6:
                twoDs[1][1] = 'X';
                break;
            case 7:
                twoDs[1][2] = 'X';
                break;
            case 10:
                twoDs[2][0] = 'X';
                break;
            case 11:
                twoDs[2][1] = 'X';
                break;
            case 12:
                twoDs[2][2] = 'X';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        coord1 = 0;
        coord2 = 0;
        loop = false;


        do {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
                if (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    loop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                scanner.nextLine();
                loop = false;
            }
        }
            while (!loop);

        result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'O';
                break;
            case 3:
                twoDs[0][1] = 'O';
                break;
            case 4:
                twoDs[0][2] = 'O';
                break;
            case 5:
                twoDs[1][0] = 'O';
                break;
            case 6:
                twoDs[1][1] = 'O';
                break;
            case 7:
                twoDs[1][2] = 'O';
                break;
            case 10:
                twoDs[2][0] = 'O';
                break;
            case 11:
                twoDs[2][1] = 'O';
                break;
            case 12:
                twoDs[2][2] = 'O';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        System.out.print("Enter the coordinates: ");

        coord1 = 0;
        coord2 = 0;
        loop = false;


        do {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
                if (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    loop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                scanner.nextLine();
                loop = false;
            }
        }
        while (!loop);

        result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'X';
                break;
            case 3:
                twoDs[0][1] = 'X';
                break;
            case 4:
                twoDs[0][2] = 'X';
                break;
            case 5:
                twoDs[1][0] = 'X';
                break;
            case 6:
                twoDs[1][1] = 'X';
                break;
            case 7:
                twoDs[1][2] = 'X';
                break;
            case 10:
                twoDs[2][0] = 'X';
                break;
            case 11:
                twoDs[2][1] = 'X';
                break;
            case 12:
                twoDs[2][2] = 'X';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        System.out.print("Enter the coordinates: ");

        coord1 = 0;
        coord2 = 0;
        loop = false;


        do {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
                if (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    loop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                scanner.nextLine();
                loop = false;
            }
        }
        while (!loop);

        result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'O';
                break;
            case 3:
                twoDs[0][1] = 'O';
                break;
            case 4:
                twoDs[0][2] = 'O';
                break;
            case 5:
                twoDs[1][0] = 'O';
                break;
            case 6:
                twoDs[1][1] = 'O';
                break;
            case 7:
                twoDs[1][2] = 'O';
                break;
            case 10:
                twoDs[2][0] = 'O';
                break;
            case 11:
                twoDs[2][1] = 'O';
                break;
            case 12:
                twoDs[2][2] = 'O';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        System.out.print("Enter the coordinates: ");

        coord1 = 0;
        coord2 = 0;
        loop = false;


        do {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
                if (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    loop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                scanner.nextLine();
                loop = false;
            }
        }
        while (!loop);

        result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'X';
                break;
            case 3:
                twoDs[0][1] = 'X';
                break;
            case 4:
                twoDs[0][2] = 'X';
                break;
            case 5:
                twoDs[1][0] = 'X';
                break;
            case 6:
                twoDs[1][1] = 'X';
                break;
            case 7:
                twoDs[1][2] = 'X';
                break;
            case 10:
                twoDs[2][0] = 'X';
                break;
            case 11:
                twoDs[2][1] = 'X';
                break;
            case 12:
                twoDs[2][2] = 'X';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        switch (twoDs[0][0] + twoDs[0][1] + twoDs[0][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[1][0] + twoDs[1][1] + twoDs[1][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[2][0] + twoDs[2][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][0] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][1] + twoDs[1][1] + twoDs[2][1]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][2] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][1] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        System.out.print("Enter the coordinates: ");

        coord1 = 0;
        coord2 = 0;
        loop = false;


        do {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
                if (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    loop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                scanner.nextLine();
                loop = false;
            }
        }
        while (!loop);

        result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'O';
                break;
            case 3:
                twoDs[0][1] = 'O';
                break;
            case 4:
                twoDs[0][2] = 'O';
                break;
            case 5:
                twoDs[1][0] = 'O';
                break;
            case 6:
                twoDs[1][1] = 'O';
                break;
            case 7:
                twoDs[1][2] = 'O';
                break;
            case 10:
                twoDs[2][0] = 'O';
                break;
            case 11:
                twoDs[2][1] = 'O';
                break;
            case 12:
                twoDs[2][2] = 'O';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        switch (twoDs[0][0] + twoDs[0][1] + twoDs[0][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[1][0] + twoDs[1][1] + twoDs[1][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[2][0] + twoDs[2][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][0] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][1] + twoDs[1][1] + twoDs[2][1]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][2] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][1] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        System.out.print("Enter the coordinates: ");

        coord1 = 0;
        coord2 = 0;
        loop = false;


        do {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
                if (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    loop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                scanner.nextLine();
                loop = false;
            }
        }
        while (!loop);

        result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'X';
                break;
            case 3:
                twoDs[0][1] = 'X';
                break;
            case 4:
                twoDs[0][2] = 'X';
                break;
            case 5:
                twoDs[1][0] = 'X';
                break;
            case 6:
                twoDs[1][1] = 'X';
                break;
            case 7:
                twoDs[1][2] = 'X';
                break;
            case 10:
                twoDs[2][0] = 'X';
                break;
            case 11:
                twoDs[2][1] = 'X';
                break;
            case 12:
                twoDs[2][2] = 'X';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        switch (twoDs[0][0] + twoDs[0][1] + twoDs[0][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[1][0] + twoDs[1][1] + twoDs[1][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[2][0] + twoDs[2][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][0] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][1] + twoDs[1][1] + twoDs[2][1]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][2] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][1] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        System.out.print("Enter the coordinates: ");

        coord1 = 0;
        coord2 = 0;
        loop = false;


        do {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
                if (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    loop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                scanner.nextLine();
                loop = false;
            }
        }
        while (!loop);

        result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'O';
                break;
            case 3:
                twoDs[0][1] = 'O';
                break;
            case 4:
                twoDs[0][2] = 'O';
                break;
            case 5:
                twoDs[1][0] = 'O';
                break;
            case 6:
                twoDs[1][1] = 'O';
                break;
            case 7:
                twoDs[1][2] = 'O';
                break;
            case 10:
                twoDs[2][0] = 'O';
                break;
            case 11:
                twoDs[2][1] = 'O';
                break;
            case 12:
                twoDs[2][2] = 'O';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        switch (twoDs[0][0] + twoDs[0][1] + twoDs[0][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[1][0] + twoDs[1][1] + twoDs[1][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[2][0] + twoDs[2][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][0] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][1] + twoDs[1][1] + twoDs[2][1]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][2] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][1] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                System.exit(0);
            case 264:
                System.out.println("X wins");
                System.exit(0);
            default:
                break;
        }

        System.out.print("Enter the coordinates: ");

        coord1 = 0;
        coord2 = 0;
        loop = false;


        do {
            try {
                System.out.print("Enter the coordinates: ");
                coord1 = scanner.nextInt();
                coord2 = scanner.nextInt();
                loop = true;
                if (twoDs[coord1 - 1][coord2 - 1] == 'O' || twoDs[coord1 - 1][coord2 - 1] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    loop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                scanner.nextLine();
                loop = false;
            }
        }
        while (!loop);

        result = (coord1 * coord1) + (coord2);

        switch (result) {
            case 2:
                twoDs[0][0] = 'X';
                break;
            case 3:
                twoDs[0][1] = 'X';
                break;
            case 4:
                twoDs[0][2] = 'X';
                break;
            case 5:
                twoDs[1][0] = 'X';
                break;
            case 6:
                twoDs[1][1] = 'X';
                break;
            case 7:
                twoDs[1][2] = 'X';
                break;
            case 10:
                twoDs[2][0] = 'X';
                break;
            case 11:
                twoDs[2][1] = 'X';
                break;
            case 12:
                twoDs[2][2] = 'X';
                break;
            default:
                break;
        }

        System.out.println("---------");
        System.out.println("|" + " " + twoDs[0][0] + " " + twoDs[0][1] + " " + twoDs[0][2] + " " + "|");
        System.out.println("|" + " " + twoDs[1][0] + " " + twoDs[1][1] + " " + twoDs[1][2] + " " + "|");
        System.out.println("|" + " " + twoDs[2][0] + " " + twoDs[2][1] + " " + twoDs[2][2] + " " + "|");
        System.out.println("---------");

        switch (twoDs[0][0] + twoDs[0][1] + twoDs[0][2]){
            case 237:
                System.out.println("O wins");
                break;
            case 264:
                System.out.println("X wins");
                break;
            default:
                break;
        }

        switch (twoDs[1][0] + twoDs[1][1] + twoDs[1][2]){
            case 237:
                System.out.println("O wins");
                break;
            case 264:
                System.out.println("X wins");
                break;
            default:
                break;
        }

        switch (twoDs[2][0] + twoDs[2][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                break;
            case 264:
                System.out.println("X wins");
                break;
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][0] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                break;
            case 264:
                System.out.println("X wins");
                break;
            default:
                break;
        }

        switch (twoDs[0][1] + twoDs[1][1] + twoDs[2][1]){
            case 237:
                System.out.println("O wins");
                break;
            case 264:
                System.out.println("X wins");
                break;
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][2] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                break;
            case 264:
                System.out.println("X wins");
                break;
            default:
                break;
        }

        switch (twoDs[0][0] + twoDs[1][1] + twoDs[2][2]){
            case 237:
                System.out.println("O wins");
                break;
            case 264:
                System.out.println("X wins");
                break;
            default:
                break;
        }

        switch (twoDs[0][2] + twoDs[1][1] + twoDs[2][0]){
            case 237:
                System.out.println("O wins");
                break;
            case 264:
                System.out.println("X wins");
                break;
            default:
                break;
        }

    }
}
