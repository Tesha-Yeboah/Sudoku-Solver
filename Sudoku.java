import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Sudoku {


    int[][] maingrid;


    public Sudoku(int[][] grid) {

        this.maingrid = grid;


    }



    public static void main(String[] args) {

        // int[][] grid = {{0, 3, 4, 0, 0, 0, 0, 0, 2},
        //     {6, 0, 0, 3, 0, 2, 0, 7, 0},
        //     {0, 1, 0, 0, 7, 0, 0, 0, 8},
        //     {0, 0, 6, 7, 8, 1, 3, 4, 0},
        //     {8, 0, 1, 0, 0, 0, 0, 0, 0},
        //     {0, 0, 3, 5, 0, 0, 0, 9, 1},
        //     {0, 4, 2, 0, 0, 5, 6, 0, 0},
        //     {0, 0, 0, 0, 0, 3, 0, 0, 4},
        //     {5, 0, 0, 0, 0, 0, 0, 0, 3}
        // };

        int[][] grid = new int[9][9];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("What is the input for row %s ", i);
                System.out.printf("and column %s \n", j);
                System.out.println("Put 0 for blank spots");
                int num = input.nextInt();
                grid[i][j] = num;
            }
        }

        input.close();

        // grid[0][0] = 4;
        // grid[0][1] = 1;
        // grid[0][2] = 0;
        // grid[0][3] = 0;
        // grid[0][4] = 6;
        // grid[0][5] = 0;
        // grid[0][6] = 0;
        // grid[0][7] = 7;
        // grid[0][8] = 8;

        // grid[1][0] = 7;
        // grid[1][1] = 0;
        // grid[1][2] = 3;
        // grid[1][3] = 5;
        // grid[1][4] = 0;
        // grid[1][5] = 1;
        // grid[1][6] = 4;
        // grid[1][7] = 2;
        // grid[1][8] = 0;

        // grid[2][0] = 0;
        // grid[2][1] = 0;
        // grid[2][2] = 8;
        // grid[2][3] = 4;
        // grid[2][4] = 7;
        // grid[2][5] = 3;
        // grid[2][6] = 0;
        // grid[2][7] = 6;
        // grid[2][8] = 0;


        // grid[3][0] = 0;
        // grid[3][1] = 5;
        // grid[3][2] = 0;
        // grid[3][3] = 0;
        // grid[3][4] = 9;
        // grid[3][5] = 4;
        // grid[3][6] = 8;
        // grid[3][7] = 3;
        // grid[3][8] = 0;


        // grid[4][0] = 3;
        // grid[4][1] = 9;
        // grid[4][2] = 0;
        // grid[4][3] = 0;
        // grid[4][4] = 1;
        // grid[4][5] = 0;
        // grid[4][6] = 7;
        // grid[4][7] = 0;
        // grid[4][8] = 0;


        // grid[5][0] = 2;
        // grid[5][1] = 8;
        // grid[5][2] = 4;
        // grid[5][3] = 3;
        // grid[5][4] = 0;
        // grid[5][5] = 0;
        // grid[5][6] = 0;
        // grid[5][7] = 0;
        // grid[5][8] = 0; 


        // grid[6][0] = 6;
        // grid[6][1] = 0;
        // grid[6][2] = 0;
        // grid[6][3] = 0;
        // grid[6][4] = 0;
        // grid[6][5] = 0;
        // grid[6][6] = 0;
        // grid[6][7] = 8;
        // grid[6][8] = 0;


        // grid[7][0] = 0;
        // grid[7][1] = 0;
        // grid[7][2] = 1;
        // grid[7][3] = 9;
        // grid[7][4] = 4;
        // grid[7][5] = 0;
        // grid[7][6] = 0;
        // grid[7][7] = 0;
        // grid[7][8] = 0;


        // grid[8][0] = 0;
        // grid[8][1] = 4;
        // grid[8][2] = 9;
        // grid[8][3] = 0;
        // grid[8][4] = 2;
        // grid[8][5] = 8;
        // grid[8][6] = 0;
        // grid[8][7] = 0;
        // grid[8][8] = 0;

// -----------------
        // grid[0][0] = 0;
        // grid[0][1] = 0;
        // grid[0][2] = 0;
        // grid[0][3] = 6;
        // grid[0][4] = 0;
        // grid[0][5] = 0;
        // grid[0][6] = 4;
        // grid[0][7] = 7;
        // grid[0][8] = 0;

        // grid[1][0] = 0;
        // grid[1][1] = 9;
        // grid[1][2] = 8;
        // grid[1][3] = 0;
        // grid[1][4] = 0;
        // grid[1][5] = 0;
        // grid[1][6] = 0;
        // grid[1][7] = 6;
        // grid[1][8] = 2;

        // grid[2][0] = 0;
        // grid[2][1] = 0;
        // grid[2][2] = 4;
        // grid[2][3] = 0;
        // grid[2][4] = 1;
        // grid[2][5] = 0;
        // grid[2][6] = 5;
        // grid[2][7] = 0;
        // grid[2][8] = 0;


        // grid[3][0] = 9;
        // grid[3][1] = 0;
        // grid[3][2] = 0;
        // grid[3][3] = 3;
        // grid[3][4] = 0;
        // grid[3][5] = 0;
        // grid[3][6] = 6;
        // grid[3][7] = 0;
        // grid[3][8] = 0;


        // grid[4][0] = 4;
        // grid[4][1] = 2;
        // grid[4][2] = 0;
        // grid[4][3] = 0;
        // grid[4][4] = 0;
        // grid[4][5] = 8;
        // grid[4][6] = 9;
        // grid[4][7] = 0;
        // grid[4][8] = 3;


        // grid[5][0] = 6;
        // grid[5][1] = 0;
        // grid[5][2] = 0;
        // grid[5][3] = 1;
        // grid[5][4] = 9;
        // grid[5][5] = 7;
        // grid[5][6] = 0;
        // grid[5][7] = 5;
        // grid[5][8] = 0; 


        // grid[6][0] = 0;
        // grid[6][1] = 0;
        // grid[6][2] = 6;
        // grid[6][3] = 0;
        // grid[6][4] = 7;
        // grid[6][5] = 3;
        // grid[6][6] = 8;
        // grid[6][7] = 0;
        // grid[6][8] = 0;


        // grid[7][0] = 3;
        // grid[7][1] = 0;
        // grid[7][2] = 9;
        // grid[7][3] = 8;
        // grid[7][4] = 5;
        // grid[7][5] = 1;
        // grid[7][6] = 7;
        // grid[7][7] = 0;
        // grid[7][8] = 6;


        // grid[8][0] = 0;
        // grid[8][1] = 7;
        // grid[8][2] = 0;
        // grid[8][3] = 0;
        // grid[8][4] = 2;
        // grid[8][5] = 0;
        // grid[8][6] = 0;
        // grid[8][7] = 4;
        // grid[8][8] = 5;
      
        Sudoku sudoku = new Sudoku(grid);
        sudoku.printing();

        // we can go through the 0 slots here
        while (!sudoku.contains()) {

            int[][] temp = new int[9][9];
            for (int i = 0; i < sudoku.maingrid.length; i++) {
                for (int j = 0; j < sudoku.maingrid.length; j++) {
                    temp[i][j] = sudoku.maingrid[i][j];
                }
            }
            sudoku.traverse(sudoku);
            sudoku.printing();

            if (sudoku.compare(temp) == true) {
                System.out.println("I don't have the capabilities to fully solve this yet");
                break;
            }
            

        }


        System.out.println("Based on my current capabilities, this is what I got:");
        sudoku.printing();

    }


    private boolean compare(int[][] temp) {

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (temp[i][j] != maingrid[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }

    private boolean contains() {
        for (int i = 0; i < this.maingrid.length; i++) {
            for (int j = 0; j < 9; j++) {

                if (maingrid[i][j] == 0) {
                    return false;

                }
            }   
        }

        return true;

    }

    private void traverse(Sudoku sudoku) {

        // updating based on a spot only accepting 1 value
        Map<String, Map<Integer, Boolean>> whole = new HashMap<>();
        for (int i = 0; i < sudoku.maingrid.length; i++) {
            for (int j = 0; j < 9; j++) {

                if (maingrid[i][j] == 0) {
                    // produces dict
                    Map<Integer, Boolean> dict = sudoku.state(i, j);
                    System.out.println(dict);
                    // a method to count the number of trues in the dict 
                    int count = sudoku.counter(dict);
                    // a method to return the key that is true
                    int value = sudoku.isTrue(dict);
                    if (count == 1) {
                       // System.out.println("hereee");
                        sudoku.update(i, j, value);

                    }

                    // Map<String, Map<Integer, Boolean>> whole = new HashMap<>();
                  //  String pos = String.valueOf(i) + String.valueOf(j);
                   // whole.put(pos, dict);
                    // System.out.println(whole);
                }
            }

        }

        // need to work on this
      //   check(whole);


    }

    private void check (Map<String, Map<Integer, Boolean>> whole) {
        for (int row = 0; row < maingrid.length; row++) {
            oneSpotH(whole, row);
        }

        // for (int column = 0; column < maingrid.length; column++) {
        //     oneSpotV(whole, column);
        // }
    }

    // Need to account for if it has only one spot where it is true
    // we want to keep the row the same and go through the columns (horizontally)
    private void oneSpotH(Map<String, Map<Integer, Boolean>> whole, int row) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;
      //  for (int i = 0; i < whole.size(); i++) {

        for (String x: whole.keySet()) {
            // if we're comparing the dictionary for the rows
            if (x.substring(0, 1).equals(String.valueOf(row))) {

                System.out.printf("rowww %d \n", row);

                Map<Integer, Boolean> innerMap = whole.get(x);

                // I need to go through the values of each position that is on the row.
                // the position to update will be the substring, the value will be e.
                for (int e: innerMap.keySet()) {

                    System.out.print("keyset: ");
                    System.out.println(innerMap.keySet());


                    // System.out.print("Get readyyy: ");
                    // System.out.println(innerMap.get(e));
                    if (innerMap.get(e) == true) {

                        if (e == 1) {
                            num1++;
                        }
                        if (e == 2) {
                            num2++;
                        }
                        if (e == 3) {
                            num3++;
                        }

                        if (e == 4) {
                            num4++;
                        }
                        if (e == 5) {
                            num5++;
                        }
                        if (e == 6) {
                            num6++;
                        }
                        if (e == 7) {
                            num7++;
                        }
                        if (e == 8) {
                            num8++;
                        }
                        if (e == 9) {
                            num9++;
                        }

                    }
    

                if (num1 == 1) {

                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 1);

                }

                if (num2 == 1) {
                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 2);

                }
                if (num3 == 1) {

                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 3);

                }
                if (num4 == 1) {

                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 4);

                }
                if (num5 == 1) {

                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 5);
                }
                if (num6 == 1) {

                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 6);

                }

                if (num7 == 1) {

                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 7);

                }

                if (num8 == 1) {

                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 8);

                }

                if (num9 == 1) {

                    update(Integer.valueOf(x.substring(0, 1)), Integer.valueOf(x.substring(1, 2)), 9);

                }

            }
                
            }
        }


      //  }


    }

    private void oneSpotV(Map<String, Map<Integer, Boolean>> whole, int column) {

        System.out.println("check check");


    }

    private void oneSpotB() {


    }
    private int isTrue (Map<Integer, Boolean> dict) {
        for(Integer e: dict.keySet()) {

            if (dict.get(e) == true) {
                return e;
            }
            

        }

        return 0;

    }

    private int counter(Map<Integer, Boolean> dict) {
        int count = 0;
        
        for(Integer e: dict.keySet()) {

            if (dict.get(e) == true) {
                count++;
            }
            

        }

        return count;


    }

    public void update (int i, int j, int value) {

        this.maingrid[i][j] = value;

    }

    public Map<Integer, Boolean> state (int row, int column) {
        // return the true and false values for each 0 position

        Map<Integer, Boolean> dict = new HashMap<>();
        // check row
        for (int check = 1; check < 10; check++) {
            dict.put(check, true);
        }
        for (int i = 0; i < maingrid.length; i++) {
          //  System.out.printf("%s row\n", check);
            int value = maingrid[row][i];
            if (value != 0) {
                dict.put(value, false);
            }
    

        }
        
        // check column
        for (int j = 0; j < 9; j++) {
           // System.out.printf("%s column\n", check);
           // dict.put(check, true);
           int value = maingrid[j][column];
           if (value != 0) {
               dict.put(value, false);
           }


        }

        // check box
        // if row is in the left upper(00, 03, 06, 30, 33, 36, 60, 63, 66)
        if ((row == 0 && column == 0) || (row == 3 && column == 0)  || (row == 6 && column == 0) || (row == 0 && column == 3) || (row == 3 && column == 3) || (row == 6 && column == 3)  || (row == 0 && column == 6) || (row == 3 && column == 6) || (row == 6 && column == 6)) {
            int value1 = maingrid[row + 1][column + 1];
            int value2 = maingrid[row + 1][column + 2];
            int value3 = maingrid[row + 2][column + 1];
            int value4 = maingrid[row + 2][column + 2];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }
        // down one then:
        // right, right, down, left
        // middle upper (01, 04, 07, 31, 34, 37, 61, 64, 67)

        if ((row == 0 && column == 1) || (row == 3 && column == 1)  || (row == 6 && column == 1) || (row == 0 && column == 4) || (row == 3 && column == 4) || (row == 6 && column == 4)  || (row == 0 && column == 7) || (row == 3 && column == 7) || (row == 6 && column == 7)) {
            // down one then:
            // left then right
            // down one again:
            // check left and right
            int value1 = maingrid[row + 1][column - 1];
            int value2 = maingrid[row + 1][column + 1];
            int value3 = maingrid[row + 2][column - 1];
            int value4 = maingrid[row + 2][column + 1];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }
     
        // right upper (02, 05, 08, 32, 35, 38, 62, 65, 68)
        if ((row == 0 && column == 2) || (row == 3 && column == 2)  || (row == 6 && column == 2) || (row == 0 && column == 5) || (row == 3 && column == 5) || (row == 6 && column == 5)  || (row == 0 && column == 8) || (row == 3 && column == 8) || (row == 6 && column == 8)) {
            // down one then:
            // left, left, down, right
            int value1 = maingrid[row + 1][column - 1];
            int value2 = maingrid[row + 1][column - 2];
            int value3 = maingrid[row + 2][column - 1];
            int value4 = maingrid[row + 2][column - 2];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }
    

        // middle left (10, 13, 16, 40, 43, 46, 70, 73, 76)
        if ((row == 1 && column == 0) || (row == 1 && column == 3)  || (row == 1 && column == 6) || (row == 4 && column == 0) || (row == 4 && column == 3) || (row == 4 && column == 6)  || (row == 7 && column == 0) || (row == 7 && column == 3) || (row == 7 && column == 6)) {
            // right, then right, then down, then left
            int value1 = maingrid[row + 1][column + 1];
            int value2 = maingrid[row - 1][column + 1];
            int value3 = maingrid[row + 1][column + 2];
            int value4 = maingrid[row - 1][column + 2];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }

        // middle middle (11, 14, 17, 41, 44, 47, 71, 74, 77)
        // not

        if ((row == 1 && column == 1) || (row == 1 && column == 4)  || (row == 1 && column == 7) || (row == 4 && column == 1) || (row == 4 && column == 4) || (row == 4 && column == 7)  || (row == 7 && column == 1) || (row == 7 && column == 4) || (row == 7 && column == 7)) {
            // right, then right, then down, then left
            int value1 = maingrid[row + 1][column - 1];
            int value2 = maingrid[row - 1][column - 1];
            int value3 = maingrid[row + 1][column + 1];
            int value4 = maingrid[row - 1][column + 1];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }

        //left, then right,
        // down one:
        // left, then right

        // middle right (12, 15, 18, 42, 45, 48, 72, 75, 78)

        if ((row == 1 && column == 2) || (row == 1 && column == 5)  || (row == 1 && column == 8) || (row == 4 && column == 2) || (row == 4 && column == 5) || (row == 4 && column == 8)  || (row == 7 && column == 2) || (row == 7 && column == 5) || (row == 7 && column == 8)) {
            // right, then right, then down, then left
            int value1 = maingrid[row - 1][column - 1];
            int value2 = maingrid[row + 1][column - 1];
            int value3 = maingrid[row - 1][column - 2];
            int value4 = maingrid[row + 1][column - 2];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }



        // bottom left (20, 23, 26, 50, 53, 56, 80, 83, 86)

        if ((row == 2 && column == 0) || (row == 2 && column == 3)  || (row == 2 && column == 6) || (row == 5 && column == 0) || (row == 5 && column == 3) || (row == 5 && column == 6)  || (row == 8 && column == 0) || (row == 8 && column == 3) || (row == 8 && column == 6)) {
            // right, then right, then down, then left
            int value1 = maingrid[row - 1][column + 1];
            int value2 = maingrid[row - 1][column + 2];
            int value3 = maingrid[row - 2][column + 1];
            int value4 = maingrid[row - 2][column + 2];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }


        // bottom middle (21, 24, 27, 51, 54, 57, 81, 84, 87)
        if ((row == 2 && column == 1) || (row == 2 && column == 4)  || (row == 2 && column == 7) || (row == 5 && column == 1) || (row == 5 && column == 4) || (row == 5 && column == 7)  || (row == 8 && column == 1) || (row == 8 && column == 4) || (row == 8 && column == 7)) {
            // right, then right, then down, then left
            int value1 = maingrid[row - 1][column + 1];
            int value2 = maingrid[row - 1][column - 1];
            int value3 = maingrid[row - 2][column + 1];
            int value4 = maingrid[row - 2][column - 1];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }


        // bottom right (22, 25, 28, 52, 55, 58, 82, 85, 88)

        if ((row == 2 && column == 2) || (row == 2 && column == 5)  || (row == 2 && column == 8) || (row == 5 && column == 2) || (row == 5 && column == 5) || (row == 5 && column == 8)  || (row == 8 && column == 2) || (row == 8 && column == 5) || (row == 8 && column == 8)) {
            // right, then right, then down, then left
            int value1 = maingrid[row - 1][column - 1];
            int value2 = maingrid[row - 1][column - 2];
            int value3 = maingrid[row - 2][column - 1];
            int value4 = maingrid[row - 2][column - 2];


            if (value1 != 0) {
                dict.put(value1, false);
            }

            if (value2 != 0) {
                dict.put(value2, false);
            }

            if (value3 != 0) {
                dict.put(value3, false);
            }

            if (value4 != 0) {
                dict.put(value4, false);
            }
        }


    


        return dict;


    }

    private void printing() {

    // for debugging purposes 
        for (int i = 0; i < maingrid.length; i++) {
            for (int j = 0; j < 9; j++) {
            
            System.out.print(maingrid[i][j]);
            System.out.print(" ");
            if (j == 8) {
                System.out.println("");
            }
        }
        }


    }
}