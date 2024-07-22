import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        task11();
    }


    static void task1(){
        int[] nums = new int[3];



        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        for (int i : nums) {
            System.out.println(i);
        }
    }


    static void task2(){
        int nums[] = {13, 5, 7, 68, 2};

        int average  = nums.length / 2;

        System.out.println(nums[average]);
    }

    static void task3(){
        String colors[]  = {"red", "green","blue", "yellow" };


        System.out.println(colors.length);


        String newColors[] = colors.clone();

        System.out.println(Arrays.toString(newColors));
    }

    static void task4(){
        int numbers[] = {1,2,3,4,5};

        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length -1]);
    }


    static void task5(){

        int[] array = new int[5];

        System.out.println(Arrays.toString(array));

        for (int i : array) {
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));


    }

    static void task6(){
        int nums[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] *2;
        }
        System.out.println(Arrays.toString(nums));
    }


    static void task7(){
        int nums[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums));
        int average  = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (i != average){
                System.out.println(nums[i]);
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void task8(){;
        String random[] ={"Hi","Bye", "Hello", "Farewell", "Booyah"} ;

        System.out.println(Arrays.toString(random));
        int average  = random.length / 2;
        String hold = random[0];
        random[0] = random[average];
        random[average] = hold;
        System.out.println(Arrays.toString(random));

    }

    static void task9(){
        int nums[] = {4, 2, 9, 13, 1, 0};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Array in ascending order " + Arrays.toString(nums));
        System.out.println("The smallest number is " + nums[0]);
        System.out.println("The biggest number is " + nums[nums.length -1]);


    }

    static void task10 (){
        Object mixOfStuff[] = {2,"Sun", "Moon", "Saturn", 2.2};

        System.out.println(Arrays.toString(mixOfStuff));
    }

    static void task11(){
        Scanner userInput = new Scanner(System.in);

        System.out.print("How many stuff do you have? ");
        int amountOfStuff = userInput.nextInt();
        userInput.nextLine();
        String[] stuff = new String[amountOfStuff];

        int count =0;
        while (count < amountOfStuff){
            System.out.print("Enter your thing: ");
            String item = userInput.nextLine();
            stuff[count] = item;
            count++;
        }

        System.out.println("Your favorite stuff are: " + Arrays.toString(stuff));


    }
}