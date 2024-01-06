import java.util.*;
// *****
// *****
// *****
// *****
// *****
public class star_pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
// *
// **
// ***
// ****
// *****
class star{
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    }
}
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
class star2{
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
}
// 1
// 22
// 333
// 4444
// 55555
class star3{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}}
// 1
// 12
// 123
// 1234
// 12345
class star4{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}}
// 54321
// 5432
// 543
// 54
// 5
class star5{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}}
// 12345
// 1234
// 123
// 12
// 1
class star6{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}}