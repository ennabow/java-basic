public class App {
    public static void main(String[] args) {
//        App.fizzBuss(5, 18);
        App.isBalanced("()()");
        App.isBalanced("(()())");
        App.isBalanced(")(()())");
        App.isBalanced("");
        App.isBalanced(")()()(");
        App.isBalanced("(())(");
    }

    public static void fizzBuss (int start, int end) {
        if (start > end) {
            return;
        }

        for (var i = start; i <= end; i++) {
            var fizz = i % 3 == 0 ? "Fizz" : "";
            var buzz = i % 5 == 0 ? "Buzz" : "";
            var result = fizz.length() == 0 && buzz.length() == 0 ? i : fizz + buzz;
            System.out.println(result);
        }
    }

    public static boolean isBalanced (String sequence) {
        var count = 0;
        for (var i = 0; i < sequence.length(); i++) {
            if (count < 0) {
                return false;
            }

            if (sequence.charAt(i) == '(') {
                count++;
            } else if (sequence.charAt(i) == ')') {
                count--;
            }

        }

        return count == 0;
    }
}