package h5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import c5.b;
import c5.j;
import c5.k;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;

/* loaded from: classes.dex */
public class a extends g {

    /* renamed from: t, reason: collision with root package name */
    private static final int f24079t = j.f4810k;

    /* renamed from: u, reason: collision with root package name */
    private static final int[][] f24080u = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: q, reason: collision with root package name */
    private ColorStateList f24081q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f24082r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f24083s;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f4676d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f24079t;
        super(t5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, k.f4837c3, i10, i11, new int[0]);
        int i12 = k.f4845d3;
        if (typedArrayH.hasValue(i12)) {
            c.c(this, p5.c.a(context2, typedArrayH, i12));
        }
        this.f24082r = typedArrayH.getBoolean(k.f4860f3, false);
        this.f24083s = typedArrayH.getBoolean(k.f4853e3, true);
        typedArrayH.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24081q == null) {
            int[][] iArr = f24080u;
            int[] iArr2 = new int[iArr.length];
            int iD = i5.a.d(this, b.f4679g);
            int iD2 = i5.a.d(this, b.f4684l);
            int iD3 = i5.a.d(this, b.f4681i);
            iArr2[0] = i5.a.h(iD2, iD, 1.0f);
            iArr2[1] = i5.a.h(iD2, iD3, 0.54f);
            iArr2[2] = i5.a.h(iD2, iD3, 0.38f);
            iArr2[3] = i5.a.h(iD2, iD3, 0.38f);
            this.f24081q = new ColorStateList(iArr, iArr2);
        }
        return this.f24081q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24082r && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f24083s || !TextUtils.isEmpty(getText()) || (drawableA = c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            androidx.core.graphics.drawable.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f24083s = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f24082r = z10;
        c.c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
