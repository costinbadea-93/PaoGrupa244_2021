package exceptions;

public class Main {
    public static void main(String[] args) {
        /**
         *       Throwable
         *
         * Exception     Error
         *
         *checked uchecked
         *
         */

//        try {
//
//        }catch (RuntimeException e) {
//
//        }catch (Exception e) {
//
//        }
//        finally {
//
//        }

// will not compile
//        try {
//
//        }catch (Exception e) {
//
//        }catch (RuntimeException e) {
//
//        } finally {
//
//        }

//        try {
//
//        }catch (ExceptionOne | ExceptionTwo  e) {
//
//        } finally {
//
//        }

        /**
         *  throw => folosit pentru a arunca o exceptie!!!
         *  throws => pentru a marca o functie ca va arunca o anumita exceptie
         */
        m1();
    }

    public static void m1() throws ExceptionOne {
        throw new ExceptionOne("Exception One!!!!");
    }
}



class ExceptionOne extends RuntimeException{

    public ExceptionOne(String message) {
        super(message);
    }
}


class ExceptionTwo extends RuntimeException{

    public ExceptionTwo(String message) {
        super(message);
    }
}