import java.util.Arrays;

public class ProblemSet10 {

    public static void main(String[] args) {
        int[] test = {3, 2, 2, 4};
        int[] test1 = fix34(test);
        System.out.println(Arrays.toString(test1));
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
                    System.out.println("1");
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
            System.out.println(counter3);
            System.out.println(counter4);
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
                    System.out.println("1");
                    return null;
                }
            } else if (numbers[i] == 5) {
                counter5++;
            }
        }

        if (counter4 != counter5) {
            System.out.println(counter4);
            System.out.println(counter5);
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
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        return false;
    }

    public int[] squareUp(int n) {
        return null;
    }

    public int[] seriesUp(int n) {
        return null;
    }

    public int maxMirror(int[] numbers) {
        return -1;
    }

    public int countClumps(int[] numbers) {
        return -1;
    }
}
