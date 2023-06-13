package com.mycompany.avaj;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class LimitaCaracteres extends PlainDocument{

    private int qtdCaracteres;


    public LimitaCaracteres(int qtdCaracteres) {
        this.qtdCaracteres = qtdCaracteres;
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if (string == null || getLength() == qtdCaracteres){
            return;
        }
        int totalCarac = getLength() + string.length();

        if (totalCarac <= qtdCaracteres){
            super.insertString(i, string, as); //To change body of generated methods, choose Tools | Templates.
        }else{
            String nova = string.substring(0, qtdCaracteres);
            super.insertString(i, nova, as);
        }
    }

}

