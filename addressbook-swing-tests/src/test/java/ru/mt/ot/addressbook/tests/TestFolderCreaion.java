package ru.mt.ot.addressbook.tests;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestFolderCreaion extends TestBase {

  @Test
  public void testFolderCreation () {
    String folder = "newfolder";
    Folders oldFolders = app.getFolderHelper().getFolders();
    app.getFolderHelper().createFolder(folder);
    Folders newFolders = app.getFolderHelper().getFolders();
    assertThat(newFolders, equalTo(oldFolders.withAdded(folder)));
  }


}
