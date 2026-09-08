public class LibrarySystem {
static String[] titles = {"Java Basics", "Data Structures",
"Algorithms"};
static String[] authors = {"John Doe", "Jane Smith", "Bob Lee"};
static int[] years = {2020, 2021, 2022};
public static void main(String[] args) {
System.out.println(searchBook("Java Basics"));
System.out.println(searchBook("Data Structures", "JaneSmith"));
System.out.println(searchBook("Algorithms", "Bob", 2019));
System.out.println(searchBook("C++", "Alice"));
System.out.println("Fine (Regular, 5 days): Rs." +calculateFine(5));
System.out.println("Fine (Reference, 5 days): Rs." +calculateFine(5, "Reference"));
System.out.println("Fine (Magazine, 5 days): Rs." +calculateFine(5, "Magazine"));
}
static String searchBook(String title) {
for (int i = 0; i < titles.length; i++) {
if (titles[i].equalsIgnoreCase(title)) return "Found: " +

titles[i];
}
return "Not Found";
}
static String searchBook(String title, String author) {
for (int i = 0; i < titles.length; i++) {
if (titles[i].equalsIgnoreCase(title) &&

authors[i].equalsIgnoreCase(author))

return "Found: " + titles[i] + " by " + authors[i];
}
return "Not Found";
}
static String searchBook(String title, String author, int year) {
for (int i = 0; i < titles.length; i++) {
if (titles[i].equalsIgnoreCase(title) &&
authors[i].equalsIgnoreCase(author) && years[i] == year)

return "Found: " + titles[i] + " by " + authors[i] + "(" + year + ")";
}
return "Not Found";
}
static double calculateFine(int days) {
return days * 5.0;
}
static double calculateFine(int days, String type) {
int rate = switch (type.toLowerCase()) {
case "reference" -> 10;

case "magazine" -> 3;
default -> 5;
};
return days * rate;
}
}