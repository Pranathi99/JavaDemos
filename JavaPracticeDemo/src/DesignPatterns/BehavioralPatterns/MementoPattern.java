package DesignPatterns.BehavioralPatterns;

import java.util.Stack;

//Originator class
class TextEditor {
 private String text;

 public void setText(String text) {
     this.text = text;
 }

 public String getText() {
     return text;
 }

 public TextEditorMemento save() {
     return new TextEditorMemento(text);
 }

 public void restore(TextEditorMemento memento) {
     this.text = memento.getSavedText();
 }
}

//Memento class
class TextEditorMemento {
 private final String savedText;

 public TextEditorMemento(String text) {
     this.savedText = text;
 }

 public String getSavedText() {
     return savedText;
 }
}

//Caretaker class
class TextEditorHistory {
 private final Stack<TextEditorMemento> history = new Stack<>();

 public void push(TextEditorMemento memento) {
     history.push(memento);
 }

 public TextEditorMemento pop() {
     return history.pop();
 }
}

//Client code
public class MementoPattern {
 public static void main(String[] args) {
     TextEditor textEditor = new TextEditor();
     TextEditorHistory history = new TextEditorHistory();

     // Set initial text
     textEditor.setText("Hello World");
     System.out.println("Initial text: " + textEditor.getText());

     // Save the state
     history.push(textEditor.save());

     // Modify the text
     textEditor.setText("Hello Universe");
     System.out.println("Modified text: " + textEditor.getText());

     // Restore the previous state
     textEditor.restore(history.pop());
     System.out.println("Restored text: " + textEditor.getText());
 }
}
