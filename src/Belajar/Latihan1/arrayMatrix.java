package Belajar.Latihan1;

public class arrayMatrix {
    public static void main(String[] args) {

        // perjumlahan dalam array dua dimensi
        int[][] matrix_A = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int[][] matrix_B = {
            {11,12,13},
            {14,15,16},
            {17,18,19},
        };
        
        printArray(matrix_A);
        printArray(matrix_B);
        
        int[][] hasilTambah = tambah(matrix_A, matrix_B);
        
        printArray(hasilTambah);

        // perkalian dengan menggunakan array dua dimensi
        int[][] matrix_C = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int[][] matrix_D = {
            {11,12,13},
            {14,15,16},
            {17,18,19},
        };
        
        int baris_A = matrix_A.length;
        int kolom_A = matrix_A[0].length;
        
        int baris_B = matrix_B.length;
        int kolom_B = matrix_B[0].length;
        
        int buffer;
        for(int i = 0; i < baris_A; i++) {
            buffer = 0;
            for(int j = 0; j <baris_B; j++) {
                buffer += matrix_A
            }
        }

    }

    private static int[][] tambah(int[][] matrix_1, int[][] matrix_2){
        int baris_1 = matrix_1.length;
        int kolom_1 = matrix_1[0].length;
        
        int baris_2 = matrix_2.length;
        int kolom_2 = matrix_2[0].length;

        int[][] hasil = new int[baris_1][baris_2];

        if (baris_1 == baris_2 && baris_2 == kolom_2) {

            for(int i = 0; i < baris_1; i++){
                for(int j = 0; j < kolom_1; j++){
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        }else {
            System.out.println("jumlah baris yang anda asukkan tidak sesuai yaa...!!");
        }
        return hasil; 

    }

    private static void printArray(int [][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray.length;

        for(int i = 0; i < baris; i++){
            System.out.print("[");
            for(int j=0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);

                if (j < (kolom -1)) {
                    System.out.print(",");
                }else
                    System.out.print("]");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
