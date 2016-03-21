package ru.mt.ot.addressbook.appmanager;

public class ApplicationManager {

    private FolderHelper folderHelper;

    public void init() {

    }

    public void stop() {

    }

    public FolderHelper getFolderHelper() {
        if (folderHelper == null) {
            folderHelper = new FolderHelper(this);
        }
        return folderHelper;

    }
}
