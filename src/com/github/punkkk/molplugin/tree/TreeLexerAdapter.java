package com.github.punkkk.molplugin.tree;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class TreeLexerAdapter extends FlexAdapter {
    public TreeLexerAdapter() {
        super(new TreeLexer((Reader) null));
    }
}