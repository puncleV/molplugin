package com.github.punkkk.molplugin.tree.psi;

import com.github.punkkk.molplugin.tree.Tree;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class TreeElementType extends IElementType {
    public TreeElementType(@NotNull @NonNls String debugName) {
        super(debugName, Tree.INSTANCE);
    }
}