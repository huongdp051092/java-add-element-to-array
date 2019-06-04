import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so can chen: ");
        int number = scanner.nextInt();

        System.out.println("Nhap vi tri can chen: ");
        int index = scanner.nextInt();

        if (index < 0 || index > arr.length) {
            System.out.println("Khong chen duoc phan tu vao mang");
        } else {
            int[] newArr = AddElement(arr, number, index);
            System.out.println("Mang moi la: ");
            for (int i = 0; i < newArr.length; i++){
                System.out.print(newArr[i]+"\t");
            }
        }
    }

    // Phuong thuc add them phan tu
    private static int[] AddElement(int[] arr, int number, int index) {
        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = number;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        return newArr;
    }
}
