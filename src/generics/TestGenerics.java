package generics;

public class TestGenerics {
    public static < E > void printArray(E[] elements) {
        for ( E element : elements){
            System.out.println(element );
        }
        System.out.println();
    }
    public static void main( String args[] ) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'R','I','N','S','H','I','D' };
        System.out.println( "Printing Integer Array" );
        printArray( intArray  );
        System.out.println( "Printing Character Array" );
        printArray( charArray );
    }
}

