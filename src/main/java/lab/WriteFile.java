package lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

import sun.security.util.FilePaths;

public class WriteFile {
  private final String path;
  private final String dirName = "output";

  public WriteFile(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }

  public String getDirName() {
    return dirName;
  }

  public void write(List<Individual> data, String fileName) {
    // create directory (if it doesn't exist)
    Path dirPath = Paths.get(dirName);
    if (!Files.exists(dirPath)) {
      try {
        Files.createDirectories(Paths.get(path + "/" + dirName));
      } catch (IOException e) {
        e.printStackTrace();
        return;
      }
    }

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json = gson.toJson(data);

    Path pathPath = Paths.get(path);
    Path filePath = pathPath.resolve(dirPath.resolve(fileName + ".json"));

    // create file (if it doesn't exist)
    if (!Files.exists(filePath)) {
      try {
        Files.createFile(filePath);
      } catch (IOException e) {
        e.printStackTrace();
        return;
      }
    }

    // write data to file
    try {
      Files.writeString(filePath, json, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
