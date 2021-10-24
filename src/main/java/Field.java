public class Field {

        private static char[][] field = new char[3][3];

        public Field() {
         fillField();
        }

        private static void fillField() {
            int count = 1;

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++){
                   field[i][j] = (char) count;
                   count++;
                }
            }
    }

    public void displayField() {
          for (int i = 0; i < field.length; i++ ) {
              for (int j = 0; j < field[i].length; j++) {
                  System.out.print(" " + field[i][j]);
              }
              System.out.println();
          }
    }

    public boolean isAvailableCell (int x, int y) {
            return (field[x][y] == 'X' || field[x][y] == 'O');

    }

    private boolean isHorizontalWin () {
            boolean isWin = false;

            for (int i = 0; i < field.length; i++) {
                isWin = true;
              for (int j = 0; j < field[i].length-1; j++) {
                  if (field[i][j] != field[i][j+1]) {
                      isWin = false;
                      break;
                  }
              }
              if (isWin)
                  break;
        }

            return isWin;
    }

    private boolean isVerticalWin () {
            boolean isWin = false;

            for (int i = 0; i < field.length; i++) {
                isWin = true;
                for(int j = 0; j < field[i].length-1; j++) {
                    if (field[j][i] != field[j+1][i]) {
                        isWin = false;
                        break;
                    }
                }
                if(isWin)
                    break;
            }
            return isWin;
    }

    private boolean isDiagonalLeftWin () {
            boolean isWin = true;

            for (int i = 0; i < field.length-1; i++) {
                if (field[i][i] != field[i+1][i+1]) {
                    isWin = false;
                    break;
                }
            }
            return isWin;
    }

    private boolean isDiagonalRightWin () {
            boolean isWin = true;

            int j = field.length-1;

            for (int i = 0; i < field.length-1; i++) {
                if (field[i][j] != field[i+1][j-1]) {
                  isWin = false;
                  break;
                }
            }
            return isWin;
    }

    public boolean fillCell (int x, int y, char symbol) {
            if (isAvailableCell(x, y)) {
                field[x][y] = symbol;
                return true;
            }
            else
                return false;
    }
}
