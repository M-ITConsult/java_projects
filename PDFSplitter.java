import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.IOException;
import java.util.Scanner;

public class PDFSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Load the PDF file
        System.out.print("Input the file name in .pdf: ");
        String pdfFile = sc.next();
        try (PDDocument document = Loader.loadPDF(new RandomAccessReadBufferedFile(pdfFile) {
        })){
            // Get the total number of pages
            int totalPages = document.getNumberOfPages();

            // Loop through each page and save it as a separate PDF
            for (int i = 0; i < totalPages; i++) {
                PDDocument singlePageDocument = new PDDocument();
                singlePageDocument.addPage(document.getPage(i));
                singlePageDocument.save("page_" + (i + 1) + ".pdf");
                singlePageDocument.close();
            }

            // Close the original document
            document.close();

            System.out.println("PDF split successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}