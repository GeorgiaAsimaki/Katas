package BerlinClock.BugHunt;

public class Problem1 {



    public class Test {

        private boolean checkDimensions(CLIQUEUnit other, int e) {
            for(int i = 0, j = 0; i < e; i++, j += 2) {
                if (dims[i] != other.dims[i]
                        || bounds[j] != other.bounds[j]
                        || bounds[j] != bounds[j + 1]) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args){


        }
    }
}
