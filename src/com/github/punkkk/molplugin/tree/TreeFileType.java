package com.github.punkkk.molplugin.tree;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class TreeFileType extends LanguageFileType {
    public static final TreeFileType INSTANCE = new TreeFileType();

    private TreeFileType() {
        super(Tree.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Tree file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Tree language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "tree";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TreeIcons.FILE;
    }
}