import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    //    ===============================================
//    Ex 03
//    ================================================
    // class luu buoc di cua quan ma
    class cell{
        int x, y;
        int dis;

        public cell(int x, int y, int dis){
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }
    // void xuat ket qua
    public void bai3(){
        int xs, xe, ys, ye; // toạ độ x y bắt đầu kết thúc
        int[][] arr = new int[100][100]; // lưu vị trí quân cờ
        Scanner scan = new Scanner(System.in);
        System.out.println(" a - 1 ; b -2 ; c - 3; d - 4; e -5; f - 6; g - 7; h - 8");
        System.out.println("Nhap x bắt dau 1 - 8");
        xs = scan.nextInt();
        System.out.println("Nhap y bat dau  1 - 8");
        ys = scan.nextInt();
        System.out.println("Nhap x ket thuc 1 - 8");
        xe = scan.nextInt();
        System.out.println("Nhap y ket thuc  1 - 8");
        ye = scan.nextInt();
        int chessPort[] = {xs, ys};
        int target[] = { xe, ye};
        System.out.println(minStep(chessPort,target));

    }
    // calculator min step
    public int minStep(int[] chessPort, int[] target){
        // tat ca cac huong con ma co the di
        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
        ArrayList<cell> list = new ArrayList<>();
        list.add(new cell(chessPort[0],target[1],0)); // luu vi tri ban dau cua quan ma
        cell t;
        int x,y;
        boolean visit[][] = new boolean[9][9]; // 9 = gioi han cua o ban co cong 1 <8 + 1> tinh ca vi tri ban dau cua quan co nen cong 1
        // kiem tra tat ca cac cell khong the di qua cua quan ma
        for (int i = 0; i < 8; i++){ // 8 la gioi han cua o ban co
            for (int j = 0; j < 8; j++){ // 8 la gioi han cua o ban co
                visit[i][j] = false;
            }
        }
        // diem bat dau cua quan co
        visit[chessPort[0]][target[1]] = true;

        // dem so buoc di cua quan co
        while (!list.isEmpty()){
            t = list.get(0);
            list.remove(0);
            if(t.x == target[0] && t.y == chessPort[1]){
                return t.dis; // tra ve so buoc di cua quan cơ
            }

            for (int i = 0; i < 8; i++) {
                x = t.x + dx[i];
                y = t.y + dy[i];

                // kiem tra hop le ban co tra ve
                //
                if (checkInside(x, y, 8) && !visit[x][y]) {
                    visit[x][y] = true;
                    list.add(new cell(x, y, t.dis + 1));
                }
            }
        }
        return -1000000000; // cho du thu tuc ham
    }

    // kiem tra buoc di quan ma co hop le khong
    public boolean checkInside(int x, int y, int n){
        if(x >= 1 && x <= n && y >= 1 && y <= n){
            return true;
        }
        return false;
    }

    //


}

