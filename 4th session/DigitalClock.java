import java.util.Scanner;
public class DigitalClock {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int d = sc.nextInt();
for (int row = 0; row < 5; row++) {
for (int col = 0; col < 3; col++) {
boolean star = false;
if (row == 0 && col >= 0 && col <= 2) {
if (d != 1 && d != 4) star = true;
}
if (row == 1 && col == 0) {
if (d == 0 || d == 4 || d == 5 || d == 6 || d == 8

|| d == 9) star = true;
}
if (row == 1 && col == 2) {
if (d != 5 && d != 6) star = true;
}
if (row == 2 && col >= 0 && col <= 2) {
if (d != 0 && d != 1 && d != 7) star = true;
}
if (row == 3 && col == 0) {
if (d == 0 || d == 2 || d == 6 || d == 8) star =

true;

}
if (row == 3 && col == 2) {
if (d != 2) star = true;
}
if (row == 4 && col >= 0 && col <= 2) {
if (d != 1 && d != 4 && d != 7) star = true;
}
System.out.print(star ? "* " : " ");
}
System.out.println();
}
sc.close();

}
}