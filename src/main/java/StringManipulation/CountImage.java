
/*7. Find out how many images are in the given array:
Input: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
Output: 3*/

package StringManipulation;

public class CountImage {
    public static void main(String[] args) {
        String[] images = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count = 0;
        for (String result : images) {
            if (result.contains(".jpg") || result.contains(".png")) {
                count += 1;
            }
        }
        System.out.println("your photo is: " + count);
    }
}
