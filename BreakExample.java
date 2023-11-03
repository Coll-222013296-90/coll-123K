class BreakExample {
    
        public static void main(String [] args) {
            int i, j;
    
            for (i = 1; i <= 3; ++i) {
                System.out.println("Outer loop iteration " + i);
    
                for (j = 1; j <= 3; ++j) {
                    System.out.println("Inner loop iteration " + j);
    
                    if (i == 2 && j == 2) {
                        break;
                    }
                }
            }
        }
    }
    
    

