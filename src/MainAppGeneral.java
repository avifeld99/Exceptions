public class MainAppGeneral {
    public static void main(String[] args) {

        /*try {
            int num = 5;
            int result = num / 0;
            System.out.println(result);

        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();

        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();

        } catch (Exception exception) {
            exception.printStackTrace();

        } finally {
            System.out.println("toch nog uitgevoerd");
        }*/


        /*Scanner scanner = new Scanner(System.in);

        Thread.sleep(1000);*/

        check(12);
    }

    public static void check(Integer num) throws ArithmeticException {
        if(num < 18){
            // throw exception using java throw keyword
            throw new ArithmeticException("You are not allowed to vote!");
        }
        else {
            System.out.println("You can vote!!");
        }
    }
}
