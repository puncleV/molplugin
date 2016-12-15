package com.github.punkkk.molplugin.tree;

import com.intellij.lang.Language;

public class Tree extends Language {
    public static final Tree INSTANCE = new Tree();

    private Tree() {
        super("Tree");
    }
}