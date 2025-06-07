package o5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.v;
import androidx.core.widget.c;
import c5.b;
import c5.j;
import c5.k;
import com.google.android.material.internal.l;

/* loaded from: classes.dex */
public class a extends v {

    /* renamed from: s, reason: collision with root package name */
    private static final int f25755s = j.f4811l;

    /* renamed from: t, reason: collision with root package name */
    private static final int[][] f25756t = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: q, reason: collision with root package name */
    private ColorStateList f25757q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f25758r;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f4696x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f25755s;
        super(t5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, k.f4875h3, i10, i11, new int[0]);
        int i12 = k.f4883i3;
        if (typedArrayH.hasValue(i12)) {
            c.c(this, p5.c.a(context2, typedArrayH, i12));
        }
        this.f25758r = typedArrayH.getBoolean(k.f4891j3, false);
        typedArrayH.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f25757q == null) {
            int iD = i5.a.d(this, b.f4679g);
            int iD2 = i5.a.d(this, b.f4681i);
            int iD3 = i5.a.d(this, b.f4684l);
            int[][] iArr = f25756t;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = i5.a.h(iD3, iD, 1.0f);
            iArr2[1] = i5.a.h(iD3, iD2, 0.54f);
            iArr2[2] = i5.a.h(iD3, iD2, 0.38f);
            iArr2[3] = i5.a.h(iD3, iD2, 0.38f);
            this.f25757q = new ColorStateList(iArr, iArr2);
        }
        return this.f25757q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25758r && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f25758r = z10;
        c.c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
