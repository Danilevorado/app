package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
abstract class f {

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f2176a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f2177b;

        a(int i10, int i11) {
            this.f2176a = new int[]{i10, i11};
            this.f2177b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f2176a = new int[]{i10, i11, i12};
            this.f2177b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List list, List list2) {
            int size = list.size();
            this.f2176a = new int[size];
            this.f2177b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f2176a[i10] = ((Integer) list.get(i10)).intValue();
                this.f2177b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }
    }

    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayK = k.k(resources, theme, attributeSet, y.d.A);
        float f5 = k.f(typedArrayK, xmlPullParser, "startX", y.d.J, 0.0f);
        float f10 = k.f(typedArrayK, xmlPullParser, "startY", y.d.K, 0.0f);
        float f11 = k.f(typedArrayK, xmlPullParser, "endX", y.d.L, 0.0f);
        float f12 = k.f(typedArrayK, xmlPullParser, "endY", y.d.M, 0.0f);
        float f13 = k.f(typedArrayK, xmlPullParser, "centerX", y.d.E, 0.0f);
        float f14 = k.f(typedArrayK, xmlPullParser, "centerY", y.d.F, 0.0f);
        int iG = k.g(typedArrayK, xmlPullParser, "type", y.d.D, 0);
        int iB = k.b(typedArrayK, xmlPullParser, "startColor", y.d.B, 0);
        boolean zJ = k.j(xmlPullParser, "centerColor");
        int iB2 = k.b(typedArrayK, xmlPullParser, "centerColor", y.d.I, 0);
        int iB3 = k.b(typedArrayK, xmlPullParser, "endColor", y.d.C, 0);
        int iG2 = k.g(typedArrayK, xmlPullParser, "tileMode", y.d.H, 0);
        float f15 = k.f(typedArrayK, xmlPullParser, "gradientRadius", y.d.G, 0.0f);
        typedArrayK.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zJ, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f5, f10, f11, f12, aVarA.f2176a, aVarA.f2177b, d(iG2)) : new SweepGradient(f13, f14, aVarA.f2176a, aVarA.f2177b);
        }
        if (f15 > 0.0f) {
            return new RadialGradient(f13, f14, f15, aVarA.f2176a, aVarA.f2177b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new androidx.core.content.res.f.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = y.d.N
            android.content.res.TypedArray r3 = androidx.core.content.res.k.k(r9, r12, r11, r3)
            int r5 = y.d.O
            boolean r6 = r3.hasValue(r5)
            int r7 = y.d.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
