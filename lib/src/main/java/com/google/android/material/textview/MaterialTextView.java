package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.d0;
import c5.k;
import p5.b;
import p5.c;
import t5.a;

/* loaded from: classes.dex */
public class MaterialTextView extends d0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) throws Resources.NotFoundException {
        int iD;
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        if (C(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (F(context2, theme, attributeSet, i10, i11) || (iD = D(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            B(theme, iD);
        }
    }

    private void B(Resources.Theme theme, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f4923n3);
        int iE = E(getContext(), typedArrayObtainStyledAttributes, k.f4938p3, k.f4946q3);
        typedArrayObtainStyledAttributes.recycle();
        if (iE >= 0) {
            setLineHeight(iE);
        }
    }

    private static boolean C(Context context) {
        return b.b(context, c5.b.C, true);
    }

    private static int D(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f4954r3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(k.f4962s3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int E(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i10 = 0; i10 < iArr.length && iC < 0; i10++) {
            iC = c.c(context, typedArray, iArr[i10], -1);
        }
        return iC;
    }

    private static boolean F(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f4954r3, i10, i11);
        int iE = E(context, typedArrayObtainStyledAttributes, k.f4970t3, k.f4978u3);
        typedArrayObtainStyledAttributes.recycle();
        return iE != -1;
    }

    @Override // androidx.appcompat.widget.d0, android.widget.TextView
    public void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        if (C(context)) {
            B(context.getTheme(), i10);
        }
    }
}
