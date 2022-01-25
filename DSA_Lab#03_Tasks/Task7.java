package dsaCodes;

public class Task7 {
  public static void main(String[] args) {
    int first[][] = {
      {
        4,1
      },
      {
        3,6
      }
    };
    int second[][] = {
      {
        0,2
      },
      {
        4,2
      }
    };

    int resultant[][] = new int[2][2];   


    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        resultant[i][j] = 0;
        for (int k = 0; k < 2; k++) {
          resultant[i][j] += first[i][k] * second[k][j];
        }

        System.out.print(resultant[i][j] + " "); 
      } 
      System.out.println();    
    }
  }
}