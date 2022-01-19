package matrix;

import java.util.*;

//TC- O(n*n) & AS- Θ(1)
public class Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] reservation = new char[3][3];

        for(int i = 0; i < reservation.length; i++) {
            System.out.print("Row" + (i+1) + ": ");
            for(int j = 0; j < reservation[0].length; j++) {
                reservation[i][j] = sc.next().toUpperCase().charAt(0);
            }
            System.out.println();
        }

        while(true) {
            System.out.println("1. Seat map");
            System.out.println("2. Book Seat");
            System.out.println("3. Exit");

            int option = sc.nextInt();

            boolean allReserved = false;
            for(int i = 0; i < reservation.length; i++) {
                for(int j = 0; j < reservation[i].length; j++) {
                    if(reservation[i][j] == 'X') {
                        allReserved = true;
                    }else {
                        allReserved = false;
                        break;
                    }
                }
            }

            if(allReserved) {
                for(int i = 0; i < reservation.length; i++) {
                    System.out.print("Row" + (i+1) + ": ");
                    for(int j = 0; j < reservation[i].length; j++) {
                        System.out.print(reservation[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("Opps..You are late Today! Reservation is fulled.'\n'Please Try Next Time..");
                System.exit(0);
            }

            switch (option) {
                case 1:
                    for(int i = 0; i < reservation.length; i++) {
                        System.out.print("Row" + (i+1) + ": ");
                        for(int j = 0; j < reservation[i].length; j++) {
                            System.out.print(reservation[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter row number:");
                    int rowNumber = sc.nextInt();
                    System.out.println("Enter seat number:");
                    char seatNumber = sc.next().toUpperCase().charAt(0);

                    boolean flag = true;
                    for(int i = 0; i < rowNumber; i++) {
                        for(int j = 0; j < reservation[rowNumber-1].length; j++) {
                            if(reservation[rowNumber-1][j] == seatNumber) {
                                reservation[rowNumber-1][j] = 'X';
                                System.out.println("Your reservation for the row/seat has been done.");
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        System.out.println("Seat " + seatNumber + " is invalid");
                    }

                    System.out.println();

                    for(int i = 0; i < reservation.length; i++) {
                        System.out.print("Row" + (i+1) + ": ");
                        for(int j = 0; j < reservation[i].length; j++) {
                            System.out.print(reservation[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println();
                    break;

                case 3:
                    System.out.println("Thank You For Your Reservation. Have A Good Day!");
                    System.exit(0);

                default:
                    break;
            }
        }

    }
}
