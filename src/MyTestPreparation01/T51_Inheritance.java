package MyTestPreparation01;

public class T51_Inheritance implements A51,C51 { // and B (1)

}

interface A51{

}

//interface B51 implements A51 { //(2)
//
//}

interface C51 extends A51{ //a,B (3)

}

/*
What is wrong here if anything?
Number 1 - A class can't implement multiple interfaces
Number 2 - A interface can't implement and interface
Number 3 - A interface can't extend multiple interfaces
Nothing is wrong here
*/