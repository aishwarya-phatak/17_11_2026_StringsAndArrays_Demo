void main(){

    //array of integer elements
    //array of primitive type
    int [] numbers = {23,56,78,12,90};

    IO.println(" 0th element is : " + numbers[0]);
    IO.println(" 2nd element is : " + numbers[2]);

    IO.println("-------------------------");
    //traditional for loop
    for(int i = 0;i<numbers.length;i++){
        System.out.println(numbers[i]);
    }
    IO.println("-------------------------");
    //enhanced for loop
    for (int n : numbers) {
        System.out.println(n);
    }
    //array using new keyword
    int [] arr = new int[3];     //array of three elements - array object creation with new keyword
    arr[0] = 76;
    arr[1] = 33;
    arr[2] = 63;
    IO.println("-------------------------");
    //elements of ar array
    for(int i : arr){
        IO.println(i);
    }

    //2d arrays in java
    int [][] matrix2 = {
            {52,67},
            {89,11}};

    int [][] matrix1 = new int [2][2];

    matrix1[0][0] = 11;
    matrix1[0][1] = 22;
    matrix1[1][0] = 49;
    matrix1[1][1] = 86;

    IO.println("-------------------------");
    int matrix1Length = matrix1.length;         //rows
    IO.println(matrix1Length);

    IO.println("-------------------------");
    for(int i  = 0;i<matrix1.length;i++){          //matirx1.length = total rows
        for (int j = 0;j<matrix1[i].length;j++){   //matrix1[i] -- gives count of columns in that row
            IO.print("\t" + matrix1[i][j]);
        }
        IO.println();
    }

    IO.println("-------------------------");
    //array of strings -- array of non-primitive type
    String [] languages = {"Java", "Cpp", "Golang", "Swift", "Swift UI", "Kotlin"};

    for(int i =0;i<languages.length;i++){
        IO.println(languages[i]);
    }

    String [] cities;
    cities = new String[]{"Pune", "Mumbai", "Kolkata", "Nagpur", "Bangalore"};

    for (String c : cities){
        IO.println(c);
    }

    //array of objects
    Point [] points = new Point[3];

    Point p1 = new Point();             //p1 is the reference variable for Point object
    Point p2 = new Point(5,10);
    Point p3 = new Point(15,15);

//    points[0] = new Point(10,10);     //object of Point created with new keyword
//    points[1] = new Point(4,4);
//    points[2] = new Point(2,2);

    points[0] = p1;             //p1 is the reference of an object Point
    points[1] = p2;
    points[2] = p3;

    for(Point p : points){
        IO.println(p.toString());
    }
}