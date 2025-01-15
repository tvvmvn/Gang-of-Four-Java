package pack00gofstructural.example00flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory: IconFactory
public class IconFactory {
  
  // It stores icons like document, folder, app, etc.
  private Map<String, Icon> iconCache = new HashMap<>();

  // to manage creation and retrieval of flyweight objects
  public Icon getIcon(String key) {
    
    if (iconCache.containsKey(key)) {
      // Check if the icon already exists in the cache and
      // return existing data to save memory.
      return iconCache.get(key);
    } else {
      // Create a new icon based on the key (type of icon)
      Icon icon;

      // create file icon
      if (key.equals("file")) {
        icon = new FileIcon("document", "document.png");
      // create folder icon
      } else if (key.equals("folder")) {
        icon = new FolderIcon("blue", "folder.png");
      } else {
        throw new IllegalArgumentException("Unsupported icon type: " + key);
      }
      
      // Store the created icon in the cache to reuse.
      iconCache.put(key, icon);

      return icon;
    }
  }
}