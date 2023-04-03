package com.github.gcestaro.designpatterns.command;

public class TextEditor {

  private String text;

  private TextEditorCommand copyCommand = String::new;

  private TextEditorCommand pasteCommand = text::concat;

  public TextEditor(String text) {
    this.text = text;
  }

  public TextEditor() {
    this("");
  }

  public void copy(String selected) {
    if (text.contains(selected)) {
      copyCommand.execute(selected);
    }
  }

  public void paste(String content) {
    pasteCommand.execute(content);
  }
}
