import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  private final String filePath; 

  public ReadFile(String filePath) {
    this.filePath = filePath;
  }

  public String getFilePath() {
    return filePath;
  }

  public String read() {
    StringBuilder content = new StringBuilder();
    
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        content.append(line).append("\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return content.toString();
  }

  public void printFile() {
    String fileContent = read();
    System.out.println(fileContent);
  }
}
