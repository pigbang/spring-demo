package com.qunechi;

/**
 * Created by bond on 2018/8/10.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor");
        this.spellChecker = spellChecker;
    }

    public void spellChecker(){
        spellChecker.checkSpelling();
    }
}
