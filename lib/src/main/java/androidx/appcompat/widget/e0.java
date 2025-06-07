package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class e0 {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f1179l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f1180m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap f1181n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f1182a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1183b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f1184c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f1185d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f1186e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f1187f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f1188g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f1189h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f1190i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f1191j;

    /* renamed from: k, reason: collision with root package name */
    private final f f1192k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    private static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    private static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.e0.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) e0.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.e0.d, androidx.appcompat.widget.e0.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.e0.f
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class f {
        f() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) e0.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    e0(TextView textView) {
        this.f1190i = textView;
        this.f1191j = textView.getContext();
        this.f1192k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1182a = 0;
        this.f1185d = -1.0f;
        this.f1186e = -1.0f;
        this.f1184c = -1.0f;
        this.f1187f = new int[0];
        this.f1183b = false;
    }

    private int e(RectF rectF) {
        int i10;
        int length = this.f1187f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = 0;
        int i12 = 1;
        int i13 = length - 1;
        while (true) {
            int i14 = i12;
            int i15 = i11;
            i11 = i14;
            while (i11 <= i13) {
                i10 = (i11 + i13) / 2;
                if (x(this.f1187f[i10], rectF)) {
                    break;
                }
                i15 = i10 - 1;
                i13 = i15;
            }
            return this.f1187f[i15];
            i12 = i10 + 1;
        }
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = (Method) f1180m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f1180m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e5);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, new Object[0]);
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e5);
            return obj2;
        }
    }

    private void s(float f5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f5 != this.f1190i.getPaint().getTextSize()) {
            this.f1190i.getPaint().setTextSize(f5);
            boolean zA = b.a(this.f1190i);
            if (this.f1190i.getLayout() != null) {
                this.f1183b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f1190i, new Object[0]);
                    }
                } catch (Exception e5) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e5);
                }
                if (zA) {
                    this.f1190i.forceLayout();
                } else {
                    this.f1190i.requestLayout();
                }
                this.f1190i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f1182a == 1) {
            if (!this.f1188g || this.f1187f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1186e - this.f1185d) / this.f1184c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f1185d + (i10 * this.f1184c));
                }
                this.f1187f = b(iArr);
            }
            this.f1183b = true;
        } else {
            this.f1183b = false;
        }
        return this.f1183b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1187f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10 = this.f1187f.length > 0;
        this.f1188g = z10;
        if (z10) {
            this.f1182a = 1;
            this.f1185d = r0[0];
            this.f1186e = r0[r1 - 1];
            this.f1184c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1190i.getText();
        TransformationMethod transformationMethod = this.f1190i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1190i)) != null) {
            text = transformation;
        }
        int iB = a.b(this.f1190i);
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f1190i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutD.getLineCount() <= iB && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f1190i instanceof l);
    }

    private void z(float f5, float f10, float f11) {
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f5 + "px) is less or equal to (0px)");
        }
        if (f10 <= f5) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f5 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f1182a = 1;
        this.f1185d = f5;
        this.f1186e = f10;
        this.f1184c = f11;
        this.f1188g = false;
    }

    void a() {
        if (n()) {
            if (this.f1183b) {
                if (this.f1190i.getMeasuredHeight() <= 0 || this.f1190i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1192k.b(this.f1190i) ? 1048576 : (this.f1190i.getMeasuredWidth() - this.f1190i.getTotalPaddingLeft()) - this.f1190i.getTotalPaddingRight();
                int height = (this.f1190i.getHeight() - this.f1190i.getCompoundPaddingBottom()) - this.f1190i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1179l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fE = e(rectF);
                    if (fE != this.f1190i.getTextSize()) {
                        t(0, fE);
                    }
                }
            }
            this.f1183b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return c.a(charSequence, alignment, i10, i11, this.f1190i, this.f1189h, this.f1192k);
    }

    int f() {
        return Math.round(this.f1186e);
    }

    int g() {
        return Math.round(this.f1185d);
    }

    int h() {
        return Math.round(this.f1184c);
    }

    int[] i() {
        return this.f1187f;
    }

    int j() {
        return this.f1182a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f1189h;
        if (textPaint == null) {
            this.f1189h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1189h.set(this.f1190i.getPaint());
        this.f1189h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f1182a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1191j;
        int[] iArr = f.j.f23455g0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1190i;
        androidx.core.view.w.m0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = f.j.f23480l0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f1182a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = f.j.f23475k0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = f.j.f23465i0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = f.j.f23460h0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = f.j.f23470j0;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f1182a = 0;
            return;
        }
        if (this.f1182a == 1) {
            if (!this.f1188g) {
                DisplayMetrics displayMetrics = this.f1191j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1191j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1191j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1187f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1188g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f1191j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f5) {
        Context context = this.f1191j;
        s(TypedValue.applyDimension(i10, f5, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
