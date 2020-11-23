public class Bai2 {
    //    ===============================================
//    Ex 02
//    ===============================================

    public void bai2(int[] arr){
        for (int i = 0; i < arr.length;i++){
            if(i < arr.length){
                if (i == 0){
                    System.out.println(arr[i] +" la nguoi dau tien ben trai");
                }else{
                    int higher = 0;
                    int lower = 0;
                    int same = 0;
                    for (int j = 0; j < i; j++){
                        if (arr[i] > arr[j]){
                            higher+= 1;
                        }
                        if (arr[i] < arr[j]){
                            lower +=1;
                        }
                        if(arr[i] == arr[j]){
                            same += 1;
                        }
                    }
                    System.out.println(arr[i] + " co " + lower +" nguoi cao hon va " + higher + " nguoi thap hon va co " + same + " nguoi cao bang tinh tu ben trai sang");
                    same = higher = lower = 0;
                }
            }
        }
    }
//    =========================================================================
//    Ket qua
//    =========================================================================
//5 la nguoi dau tien ben trai
//33 co 0 nguoi cao hon va 1 nguoi thap hon va co 0 nguoi cao bang tinh tu ben trai sang
//11 co 1 nguoi cao hon va 1 nguoi thap hon va co 0 nguoi cao bang tinh tu ben trai sang
//22 co 1 nguoi cao hon va 2 nguoi thap hon va co 0 nguoi cao bang tinh tu ben trai sang
//44 co 0 nguoi cao hon va 4 nguoi thap hon va co 0 nguoi cao bang tinh tu ben trai sang
//55 co 0 nguoi cao hon va 5 nguoi thap hon va co 0 nguoi cao bang tinh tu ben trai sang
//66 co 0 nguoi cao hon va 6 nguoi thap hon va co 0 nguoi cao bang tinh tu ben trai sang
}
