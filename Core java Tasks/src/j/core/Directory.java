package j.core;


import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
/**
 *
 * @Deepak Gaur
 */
class Directory {

    public List<String> fileList(String dirPath, int level) throws Exception {
//        Map<Integer, List<String>> directoryList = new HashMap<Integer, List<String>>();
        List<String> list = null;
//        System.err.println("path  - " + dirPath);
        File dir = new File(dirPath);
        File[] firstLevelFiles = dir.listFiles();
        if (firstLevelFiles != null && firstLevelFiles.length > 0) {
            list = new ArrayList<String>();
            for (File aFile : firstLevelFiles) {
                if (aFile.isDirectory()) {
                } else {
                    list.add(aFile.getName());
                }
            }
        }
        return list;
    }

    public List<String> directoryList(String dirPath, int level) throws Exception {
        List<String> list = null;
        File dir = new File(dirPath);
        File[] firstLevelFiles = dir.listFiles();
        if (firstLevelFiles != null && firstLevelFiles.length > 0) {
            list = new ArrayList<String>();
            for (File aFile : firstLevelFiles) {
                if (aFile.isDirectory()) {
                    list.add(aFile.getName());
                }
            }
        }
        return list;
    }
}
