import java.util.Arrays;

public class ProblemSet10 {

    public static void main(String[] args) {

    }

    public String[] fizzBuzz(int start, int end) {
        if (start >= end) {
            return null;
        } else {
            String[] newArray = new String[100];
            int index = 0;
            String k;
            for (int i = start; i < end; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    newArray[index] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    newArray[index] = "Fizz";
                } else if (i % 5 == 0) {
                    newArray[index] = "Buzz";
                } else {
                    k = Integer.toString(i);
                    newArray[index] = k;
                }

                index++;
            }

            return newArray;
        }
    }

    public int maxSpan(int[] numbers) {
        if (numbers == null) {
            return -1;
        } else {
            int x;
            int span;
            int result = 0;

            for (int number : numbers) {
                if (numbers.length == 1) {
                    result = 1;
                } else {
                    x = number;
                    for (int i = numbers.length - 1; i >= 0; i--) {
                        if (numbers[i] == x) {
                            span = i;
                            if (span > result) {
                                result = span;
                            }
                        }
                    }
                }
            }

            return result;
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
            int x;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == 3) {
                    for (int k = j + 2; k < numbers.length; k++) {
                        if (numbers[k] == 4) {
                            x = numbers[k];
                            numbers[k] = numbers[j + 1];
                            numbers[j + 1] = x;
                        }
                    }

                    for (int a = 0; a < numbers.length - 1; a++) {
                        if (numbers[a] == 3 && numbers[a + 1] != 4) {
                            int z;
                            for (int b = 0; b < numbers.length; b++) {
                                if (numbers[b] == 4) {
                                    z = numbers[b];
                                    numbers[b] = numbers[a + 1];
                                    numbers[a + 1] = z;
                                }
                            }
                        }
                    }
                }
            }
        }
        return numbers;
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
            int x;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == 4) {
                    for (int k = j + 2; k < numbers.length; k++) {
                        if (numbers[k] == 5) {
                            x = numbers[k];
                            numbers[k] = numbers[j + 1];
                            numbers[j + 1] = x;
                        }
                    }

                    for (int a = 0; a < numbers.length - 1; a++) {
                        if (numbers[a] == 4 && numbers[a + 1] != 5) {
                            int z;
                            for (int b = 0; b < numbers.length; b++) {
                                if (numbers[b] == 5) {
                                     z = numbers[b];
                                     numbers[b] = numbers[a + 1];
                                     numbers[a + 1] = z;
                                }
                            }
                        }
                    }
                }
            }
        }
        return numbers;
    }

    public boolean canBalance(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        } else {
            int firstSum = 0;
            int secondSum= 0;
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    firstSum = numbers[i];
                    for (int k = 1; k < numbers.length; k++) {
                        secondSum = numbers[k];
                    }

                    if (firstSum == secondSum) {
                        return true;
                    } else {
                        firstSum = 0;
                        secondSum = 0;
                    }

                } else {
                    for (int j = 0; j <= i; j++) {
                        firstSum += numbers[j];
                    }

                    for (int h = i + 1; h < numbers.length; h++) {
                        secondSum += numbers[h];
                    }

                    if (firstSum == secondSum) {
                        return true;
                    } else {
                        firstSum = 0;
                        secondSum = 0;
                    }
                }

            }
        }
        return false;
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

        int counter = 0;
        for (int j : inner) {
            for (int k : outer) {
                if (k == j) {
                    counter++;
                }
            }
        }

        return counter >= inner.length;

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
