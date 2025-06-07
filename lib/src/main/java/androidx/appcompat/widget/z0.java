package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1412a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f1413b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f1414c;

    private z0(Context context, TypedArray typedArray) {
        this.f1412a = context;
        this.f1413b = typedArray;
    }

    public static z0 t(Context context, int i10, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static z0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static z0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1413b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1413b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f1413b.hasValue(i10) || (resourceId = this.f1413b.getResourceId(i10, 0)) == 0 || (colorStateListA = g.a.a(this.f1412a, resourceId)) == null) ? this.f1413b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f5) {
        return this.f1413b.getDimension(i10, f5);
    }

    public int e(int i10, int i11) {
        return this.f1413b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1413b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f1413b.hasValue(i10) || (resourceId = this.f1413b.getResourceId(i10, 0)) == 0) ? this.f1413b.getDrawable(i10) : g.a.b(this.f1412a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f1413b.hasValue(i10) || (resourceId = this.f1413b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f1412a, resourceId, true);
    }

    public float i(int i10, float f5) {
        return this.f1413b.getFloat(i10, f5);
    }

    public Typeface j(int i10, int i11, h.e eVar) {
        int resourceId = this.f1413b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1414c == null) {
            this.f1414c = new TypedValue();
        }
        return androidx.core.content.res.h.h(this.f1412a, resourceId, this.f1414c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f1413b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1413b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1413b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1413b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1413b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1413b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1413b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1413b;
    }

    public boolean s(int i10) {
        return this.f1413b.hasValue(i10);
    }

    public void w() {
        this.f1413b.recycle();
    }
}
