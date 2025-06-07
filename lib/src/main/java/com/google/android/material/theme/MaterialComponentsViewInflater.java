package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.k;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.v;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.h;
import com.google.android.material.textview.MaterialTextView;
import h5.a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends k {
    @Override // androidx.appcompat.app.k
    protected d c(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    protected f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    protected g e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    protected v k(Context context, AttributeSet attributeSet) {
        return new o5.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    protected d0 o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
