import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    ArrayList<Post> posts = new ArrayList<Post>();
    Scanner scanner = new Scanner(System.in);

//    1.Them moi danh sach
    public void creater(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chương trình danh sách");
        System.out.println("Nhập ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhập tiêu đề: ");
        String tieuDe = scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        String moTa = scanner.nextLine();
        System.out.println("Nhập ảnh đại diện: ");
        String avatar = scanner.nextLine();
        System.out.println("Nhập nội dung chính: ");
        String mainContent = scanner.nextLine();
        System.out.println("Nhập tên tác giả: ");
        String writer = scanner.nextLine();
        System.out.println("Nhập ngày viết: ");
        String date = scanner.nextLine();
        scanner.nextLine();

        Post post = new Post();
        post.setId(id);
        post.setTitle(tieuDe);
        post.setDescrible(moTa);
        post.setAvarta(avatar);
        post.setMainContent(mainContent);
        post.setWriter(writer);
        post.setDateofWriting(date);

        posts.add(post);
    }
//    2.Hien Thi
    public void showListPost(){
        System.out.println("Hiển thị danh sách bài viết. :");
        System.out.println("-----------------------------");
        System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s ||%-30s || %-30s\n", "Id", "Tiêu đề", "Mô Tả", "Ngày Viết", "Ảnh Đại Diện", "Tên Tác Giả", "Nội Dung Chính");
        System.out.println("-----------------------------");
        for(int i=0; i < posts.size(); i++ ) {
            Post p = posts.get(i);
            System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s || %-30s || %-30s\n" , p.getId() , p.getTitle(), p.getDescrible(), p.getDateofWriting(), p.getAvarta(), p.getWriter(), p.getMainContent());
        }
        System.out.println("Enter để tiếp tục ");
        scanner.nextLine();

    }

//    3.Tìm Kiếm bài viết
    public void searchListPost(){
        System.out.println("Nhap ID: ");
        long searchID = scanner.nextLong();
        scanner.nextLine();
        long id = -1;
        for(int i=0; i < posts.size(); i++){
            Post p = posts.get(i);
            if(p.getId() == searchID){
                id = p.getId();
                System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s ||%-30s || %-30s\n", "Id", "Tiêu đề", "Mô Tả", "Ngày Viết", "Ảnh Đại Diện", "Tên Tác Giả", "Nội Dung Chính");
                System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s || %-30s || %-30s\n" , p.getId() , p.getTitle(), p.getDescrible(), p.getDateofWriting(), p.getAvarta(), p.getWriter(), p.getMainContent());
            }
        }
        if (id == -1){
            System.out.println("Không tìm thấy bài viết.");
        }
    }

//    4.Xóa bài viết
    public void deleteListPost(){
        System.out.println("Nhập ID: ");
        long deteleID = scanner.nextLong();
        scanner.nextLine();
        long id = -1;
        for(int i=0; i < posts.size(); i++){
            Post p = posts.get(i);
            if(p.getId() == deteleID){
                id = p.getId();
                posts.remove(i);
                System.out.println("Xóa Thành Công!");
            }
        }
        if (id == -1){
            System.out.println("Không tìm thấy bài viết");
        }
    }

}
