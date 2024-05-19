import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createMenu();
    }

    public static void createMenu() {
        Scanner scanner = new Scanner(System.in);
        PostController postController = new PostController();
        while (true) {
            System.out.println("Chương trình quản lý bài viết.");
            System.out.println("====================================");
            System.out.println("1. Thêm mới bài viết  ");
            System.out.println("2. Hiển thị danh sách bài viết ");
            System.out.println("3. Tìm kiếm bài viết ");
            System.out.println("4. Xóa bài viết ");
            System.out.println("0. Thoát chương trình ");
            System.out.println("====================================");
            System.out.println("Vui lòng nhập lựa chọn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    postController.creater();
                    break;
                case 2:
                    postController.showListPost();
                    break;
                case 3:
                    postController.searchListPost();
                    break;
                case 4:
                    postController.deleteListPost();
                    break;
                case 0:
                    System.out.println("Tạm Biệt");
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1 - 0");
                    break;
            }
            if (choice == 0) {
                break;
            }


        }

    }
}
