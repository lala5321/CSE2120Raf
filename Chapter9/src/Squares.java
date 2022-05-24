public class Squares {

public static void main(String[] args) {

int [] arr;

arr = new int [5];

for (int i = 0; i < arr.length; i++) {

arr[i] = i*i;

}

System.out.println("Elements of Array are: ");

for (int i = 0; i < arr.length; i++) {

System.out.println("arr["+i+"] = "+arr[i]);

}

}

}

