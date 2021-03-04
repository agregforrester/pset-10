import java.util.Arrays;

public class ProblemSet10 {

    public static void main(String[] args) {

    }

    public String[] fizzBuzz(int start, int end) {
        if (start >= end) {
            return null;
        } else {
            String[] arr = new String[end - start];

            for(int i = start; i < end; i++) {
                if(i % 15 == 0) {
                    arr[i - start] = "FizzBuzz";
                } else if(i % 3 == 0) {
                    arr[i - start] = "Fizz";
                } else if(i % 5 == 0) {
                    arr[i - start] = "Buzz";
                } else {
                    arr[i - start] = String.valueOf(i);
                }
            }

            return arr;
        }
    }

    public int maxSpan(int[] numbers) {
        if (numbers == null) {
            return -1;
        } else {
            int max = 0;

            for(int i = 0; i < numbers.length; i++) {
                int j = numbers.length - 1;

                while(numbers[i] != numbers[j])
                    j--;

                int span = j - i + 1;

                if(span > max)
                    max = span;
            }

            return max;
        }
    }

    public static int[] fix34(int[] numbers) {
        int counter3 = 0;
        int counter4 = 0;
        if (numbers == null) {
            return null;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                counter3++;
                if (i > 0 && numbers[i - 1] == 3) {
                    return null;
                }
            } else if (numbers[i] == 4) {
                counter4++;
            }

            if (counter4 == 1 && counter3 == 0) {
                return null;
            }
        }

        if (counter3 != counter4) {
            return null;
        } else {
            int i = 0;

            while(i < numbers.length && numbers[i] != 3)
                i++;

            int j = i + 1;

            while(j < numbers.length && numbers[j] != 4)
                j++;

            while(i < numbers.length) {
                if(numbers[i] == 3) {
                    int temp = numbers[i+1];
                    numbers[i+1] = numbers[j];
                    numbers[j] = temp;

                    while(j < numbers.length && numbers[j] != 4)
                        j++;
                }
                i++;
            }

            return numbers;
        }
    }

    public int[] fix45(int[] numbers) {
        int counter4 = 0;
        int counter5 = 0;
        if (numbers == null) {
            return null;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                counter4++;
                if (i > 0 && numbers[i - 1] == 4) {
                    return null;
                }
            } else if (numbers[i] == 5) {
                counter5++;
            }
        }

        if (counter4 != counter5) {
            return null;
        } else {
            int i = 0;
            int j = 0;

            while(j < numbers.length && numbers[j] != 5)
                j++;

            while(i < numbers.length) {
                if(numbers[i] == 4) {
                    int temp = numbers[i+1];
                    numbers[i+1] = numbers[j];
                    numbers[j] = temp;

                    while((j < numbers.length && numbers[j] != 5) || j == i + 1)
                        j++;
                }
                i++;
            }

            return numbers;
        }
    }

    public boolean canBalance(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        } else {
            int first = 0;
            int second = 0;

            for (int i = 0; i < numbers.length; i++)
                second += numbers[i];

            for (int i = 0; i <= numbers.length - 2; i++) {
                first += numbers[i];
                second -= numbers[i];

                if (first == second)
                    return true;
            }

            return false;
        }
    }

    public boolean linearIn(int[] outer, int[] inner) {
        if (outer == null || inner == null || outer.length == 0 || inner.length == 0) {
            return false;
        }

        for (int a = 1; a < outer.length; a++) {
            if (outer[a] < outer[a - 1]) {
                return false;
            }
        }

        for (int b = 1; b < inner.length; b++) {
            if (inner[b] < inner[b - 1]) {
                return false;
            }
        }
        
        int i = 0;
        int j = 0;

        while(i < inner.length && j < outer.length) {
            if(inner[i] > outer[j]) {
                j++;
            } else if(inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }
        }

        if(i != inner.length)
            return false;

        return true;
    }

    public int[] squareUp(int n) {
        int[] arr = new int[n*n];

        if(n == 0)
            return arr;

        for(int i = n - 1; i < arr.length; i += n) {
            for(int j = i; j >= i - i / n; j--)
                arr[j] = i - j + 1;
        }

        return arr;
    }

    public int[] seriesUp(int n) {
        int[] arr = new int[n*(n+1)/2];

        int index = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                arr[index + j] = j + 1;
            }
            index += i;
        }

        return arr;
    }

    public int maxMirror(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if(nums[i + count] == nums[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public int countClumps(int[] nums) {
        int count = 0;
        int i = 0;

        while(i < nums.length) {
            int val = nums[i];
            i++;
            int length = 1;
            while(i < nums.length && nums[i] == val) {
                i++;
                length++;
            }

            if(length > 1)
                count++;
        }

        return count;
    }
}
