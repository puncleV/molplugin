package com.github.punkkk.molplugin.tree.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.github.punkkk.molplugin.tree.psi.TreeNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class TreeNamedElementImpl extends ASTWrapperPsiElement implements TreeNamedElement {
    public TreeNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}