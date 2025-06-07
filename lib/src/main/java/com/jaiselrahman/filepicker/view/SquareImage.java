package com.jaiselrahman.filepicker.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.r;

/* loaded from: classes.dex */
public class SquareImage extends r {
    public SquareImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquareImage(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, i10);
    }
}
