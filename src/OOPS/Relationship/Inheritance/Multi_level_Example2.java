package OOPS.Relationship.Inheritance;


class Drive {
    String driveName;
    double totalSpace;
    double usedSpace;
    double freeSpace;

    public Drive(String driveName, double totalSpace, double usedSpace, double freeSpace) {
        this.driveName = driveName;
        this.totalSpace = totalSpace;
        this.usedSpace = usedSpace;
        this.freeSpace = freeSpace;
    }

    public void displayDrive() {
        System.out.println("\n\nDrive [" +
                "driveName=" + driveName +
                ", totalSpace=" + totalSpace + "GB" +
                ", usedSpace=" + usedSpace + "GB" +
                ", freeSpace=" + freeSpace + "GB" +
                "]");
    }
}

class Folder extends Drive {
    String folderName;
    String folderType;
    String folderCreated;//created date
    String numOfFiles;

    public Folder(String driveName, double totalSpace, double usedSpace, double freeSpace, String folderName, String folderType, String folderCreated, String numOfFiles) {
        super(driveName, totalSpace, usedSpace, freeSpace);
        this.folderName = folderName;
        this.folderType = folderType;
        this.folderCreated = folderCreated;
        this.numOfFiles = numOfFiles;
    }

    public void displayFolder() {
        System.out.println("Folder [" +
                "folderName=" + folderName +
                ", folderType=" + folderType +
                ", folderCreated=" + folderCreated +
                ", numOfFiles=" + numOfFiles +
                "]");
    }
}

class File extends Folder {
    String fileName;
    String fileType;
    double fileSize;
    String fileCreated;//created date

    public File(String driveName, double totalSpace, double usedSpace, double freeSpace, String folderName, String folderType, String folderCreated, String numOfFiles, String fileName, String fileType, double fileSize, String fileCreated) {
        super(driveName, totalSpace, usedSpace, freeSpace, folderName, folderType, folderCreated, numOfFiles);
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.fileCreated = fileCreated;
    }
    public void displayFile() {
        System.out.println("File [" +
                "fileName=" + fileName +
                ", fileType=" + fileType +
                ", fileSize=" + fileSize + "KB" +
                ", fileCreated=" + fileCreated +
                "]");
    }
}

public class Multi_level_Example2 {
    public static void main(String[] args) {
        File file = new File("GoogleDrive", 15, 8, 7, "java", "Document", "Dec-12",
                "10", "Mutli_level", "pdf", 32, "12/12/2025");
        file.displayDrive();
        file.displayFolder();
        file.displayFile();
    }
}
