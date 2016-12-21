package com.github.punkkk.molplugin.tree.psi;

import com.github.punkkk.molplugin.tree.Tree;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class TreeTokenType extends IElementType {
    public TreeTokenType(@NotNull @NonNls String debugName) {
        super(debugName, Tree.INSTANCE);
    }

    @Override
    public String toString() {
        return "TreeTokenType." + super.toString();
    }
}