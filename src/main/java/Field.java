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
            if (field[x][y] == 'X' || field[x][y] == 'O')
                return false;

            else
                return true;
    }

    private boolean isHorizontalWin (char player) {
            
    }
}
