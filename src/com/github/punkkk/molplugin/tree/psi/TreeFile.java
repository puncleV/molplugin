package com.github.punkkk.molplugin.tree.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.github.punkkk.molplugin.tree.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class TreeFile extends PsiFileBase {
    public TreeFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, Tree.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TreeFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Tree File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}