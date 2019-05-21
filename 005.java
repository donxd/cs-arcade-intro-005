int shapeArea(int n) {
    int totalLeft = square(n);
    n--;
    int totalRight = square(n);
    int total = totalLeft + totalRight;
    System.out.println( "shapeArea(n) = " + total );
    
    return total;
}

int square ( int n ){
    return n*n;
}
