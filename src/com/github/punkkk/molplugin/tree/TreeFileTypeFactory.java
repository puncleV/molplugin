package com.github.punkkk.molplugin.tree;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class TreeFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(TreeFileType.INSTANCE, "tree");
    }
}