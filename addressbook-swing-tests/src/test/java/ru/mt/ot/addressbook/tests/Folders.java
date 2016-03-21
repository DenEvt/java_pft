package ru.mt.ot.addressbook.tests;

import java.util.ArrayList;
import java.util.List;

public class Folders {

  private List<String> storedFolders = null;

  public Folders(List<String> folders) {
    this.storedFolders = new ArrayList<String>(folders);
  }

  public Folders withAdded(String folder) {
    Folders newList = new Folders(storedFolders);
    newList.storedFolders.add(folder);
    return newList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Folders folders = (Folders) o;

    return storedFolders != null ? storedFolders.equals(folders.storedFolders) : folders.storedFolders == null;

  }

  @Override
  public int hashCode() {
    return storedFolders != null ? storedFolders.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Folders{" +
            "storedFolders=" + storedFolders +
            '}';
  }
}
