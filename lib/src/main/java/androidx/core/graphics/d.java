package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f2211a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2212b;

        a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f2213a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f2214b;

        b(char c10, float[] fArr) {
            this.f2213a = c10;
            this.f2214b = fArr;
        }

        b(b bVar) {
            this.f2213a = bVar.f2213a;
            float[] fArr = bVar.f2214b;
            this.f2214b = d.c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c10, char c11, float[] fArr2) {
            int i10;
            int i11;
            int i12;
            float f5;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            char c12 = c11;
            boolean z10 = false;
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr[2];
            float f20 = fArr[3];
            float f21 = fArr[4];
            float f22 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i10 = 7;
                    i11 = i10;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    i11 = i10;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i11 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f21, f22);
                    f17 = f21;
                    f19 = f17;
                    f18 = f22;
                    f20 = f18;
                    i11 = 2;
                    break;
            }
            float f23 = f17;
            float f24 = f18;
            float f25 = f21;
            float f26 = f22;
            int i13 = 0;
            char c13 = c10;
            while (i13 < fArr2.length) {
                if (c12 != 'A') {
                    if (c12 == 'C') {
                        i12 = i13;
                        int i14 = i12 + 2;
                        int i15 = i12 + 3;
                        int i16 = i12 + 4;
                        int i17 = i12 + 5;
                        path.cubicTo(fArr2[i12 + 0], fArr2[i12 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                        f23 = fArr2[i16];
                        float f27 = fArr2[i17];
                        float f28 = fArr2[i14];
                        float f29 = fArr2[i15];
                        f24 = f27;
                        f20 = f29;
                        f19 = f28;
                    } else if (c12 == 'H') {
                        i12 = i13;
                        int i18 = i12 + 0;
                        path.lineTo(fArr2[i18], f24);
                        f23 = fArr2[i18];
                    } else if (c12 == 'Q') {
                        i12 = i13;
                        int i19 = i12 + 0;
                        int i20 = i12 + 1;
                        int i21 = i12 + 2;
                        int i22 = i12 + 3;
                        path.quadTo(fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                        float f30 = fArr2[i19];
                        float f31 = fArr2[i20];
                        f23 = fArr2[i21];
                        f24 = fArr2[i22];
                        f19 = f30;
                        f20 = f31;
                    } else if (c12 == 'V') {
                        i12 = i13;
                        int i23 = i12 + 0;
                        path.lineTo(f23, fArr2[i23]);
                        f24 = fArr2[i23];
                    } else if (c12 != 'a') {
                        if (c12 != 'c') {
                            if (c12 == 'h') {
                                int i24 = i13 + 0;
                                path.rLineTo(fArr2[i24], 0.0f);
                                f23 += fArr2[i24];
                            } else if (c12 != 'q') {
                                if (c12 == 'v') {
                                    int i25 = i13 + 0;
                                    path.rLineTo(0.0f, fArr2[i25]);
                                    f12 = fArr2[i25];
                                } else if (c12 == 'L') {
                                    int i26 = i13 + 0;
                                    int i27 = i13 + 1;
                                    path.lineTo(fArr2[i26], fArr2[i27]);
                                    f23 = fArr2[i26];
                                    f24 = fArr2[i27];
                                } else if (c12 == 'M') {
                                    int i28 = i13 + 0;
                                    f23 = fArr2[i28];
                                    int i29 = i13 + 1;
                                    f24 = fArr2[i29];
                                    if (i13 > 0) {
                                        path.lineTo(fArr2[i28], fArr2[i29]);
                                    } else {
                                        path.moveTo(fArr2[i28], fArr2[i29]);
                                        i12 = i13;
                                        f26 = f24;
                                        f25 = f23;
                                    }
                                } else if (c12 == 'S') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        f23 = (f23 * 2.0f) - f19;
                                        f24 = (f24 * 2.0f) - f20;
                                    }
                                    float f32 = f24;
                                    int i30 = i13 + 0;
                                    int i31 = i13 + 1;
                                    int i32 = i13 + 2;
                                    int i33 = i13 + 3;
                                    path.cubicTo(f23, f32, fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f5 = fArr2[i30];
                                    f10 = fArr2[i31];
                                    f23 = fArr2[i32];
                                    f24 = fArr2[i33];
                                    f19 = f5;
                                    f20 = f10;
                                } else if (c12 == 'T') {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f23 = (f23 * 2.0f) - f19;
                                        f24 = (f24 * 2.0f) - f20;
                                    }
                                    int i34 = i13 + 0;
                                    int i35 = i13 + 1;
                                    path.quadTo(f23, f24, fArr2[i34], fArr2[i35]);
                                    float f33 = fArr2[i34];
                                    float f34 = fArr2[i35];
                                    i12 = i13;
                                    f20 = f24;
                                    f19 = f23;
                                    f23 = f33;
                                    f24 = f34;
                                } else if (c12 == 'l') {
                                    int i36 = i13 + 0;
                                    int i37 = i13 + 1;
                                    path.rLineTo(fArr2[i36], fArr2[i37]);
                                    f23 += fArr2[i36];
                                    f12 = fArr2[i37];
                                } else if (c12 == 'm') {
                                    int i38 = i13 + 0;
                                    f23 += fArr2[i38];
                                    int i39 = i13 + 1;
                                    f24 += fArr2[i39];
                                    if (i13 > 0) {
                                        path.rLineTo(fArr2[i38], fArr2[i39]);
                                    } else {
                                        path.rMoveTo(fArr2[i38], fArr2[i39]);
                                        i12 = i13;
                                        f26 = f24;
                                        f25 = f23;
                                    }
                                } else if (c12 == 's') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        float f35 = f23 - f19;
                                        f13 = f24 - f20;
                                        f14 = f35;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    int i40 = i13 + 0;
                                    int i41 = i13 + 1;
                                    int i42 = i13 + 2;
                                    int i43 = i13 + 3;
                                    path.rCubicTo(f14, f13, fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                                    f5 = fArr2[i40] + f23;
                                    f10 = fArr2[i41] + f24;
                                    f23 += fArr2[i42];
                                    f11 = fArr2[i43];
                                } else if (c12 == 't') {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f15 = f23 - f19;
                                        f16 = f24 - f20;
                                    } else {
                                        f16 = 0.0f;
                                        f15 = 0.0f;
                                    }
                                    int i44 = i13 + 0;
                                    int i45 = i13 + 1;
                                    path.rQuadTo(f15, f16, fArr2[i44], fArr2[i45]);
                                    float f36 = f15 + f23;
                                    float f37 = f16 + f24;
                                    f23 += fArr2[i44];
                                    f24 += fArr2[i45];
                                    f20 = f37;
                                    f19 = f36;
                                }
                                f24 += f12;
                            } else {
                                int i46 = i13 + 0;
                                int i47 = i13 + 1;
                                int i48 = i13 + 2;
                                int i49 = i13 + 3;
                                path.rQuadTo(fArr2[i46], fArr2[i47], fArr2[i48], fArr2[i49]);
                                f5 = fArr2[i46] + f23;
                                f10 = fArr2[i47] + f24;
                                f23 += fArr2[i48];
                                f11 = fArr2[i49];
                            }
                            i12 = i13;
                        } else {
                            int i50 = i13 + 2;
                            int i51 = i13 + 3;
                            int i52 = i13 + 4;
                            int i53 = i13 + 5;
                            path.rCubicTo(fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i50], fArr2[i51], fArr2[i52], fArr2[i53]);
                            f5 = fArr2[i50] + f23;
                            f10 = fArr2[i51] + f24;
                            f23 += fArr2[i52];
                            f11 = fArr2[i53];
                        }
                        f24 += f11;
                        f19 = f5;
                        f20 = f10;
                        i12 = i13;
                    } else {
                        int i54 = i13 + 5;
                        int i55 = i13 + 6;
                        i12 = i13;
                        c(path, f23, f24, fArr2[i54] + f23, fArr2[i55] + f24, fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f, fArr2[i13 + 4] != 0.0f);
                        f23 += fArr2[i54];
                        f24 += fArr2[i55];
                    }
                    i13 = i12 + i11;
                    c13 = c11;
                    c12 = c13;
                    z10 = false;
                } else {
                    i12 = i13;
                    int i56 = i12 + 5;
                    int i57 = i12 + 6;
                    c(path, f23, f24, fArr2[i56], fArr2[i57], fArr2[i12 + 0], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                    f23 = fArr2[i56];
                    f24 = fArr2[i57];
                }
                f20 = f24;
                f19 = f23;
                i13 = i12 + i11;
                c13 = c11;
                c12 = c13;
                z10 = false;
            }
            fArr[z10 ? 1 : 0] = f23;
            fArr[1] = f24;
            fArr[2] = f19;
            fArr[3] = f20;
            fArr[4] = f25;
            fArr[5] = f26;
        }

        private static void b(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            double d19 = d12;
            int iCeil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d16);
            double dSin = Math.sin(d16);
            double dCos2 = Math.cos(d17);
            double dSin2 = Math.sin(d17);
            double d20 = -d19;
            double d21 = d20 * dCos;
            double d22 = d13 * dSin;
            double d23 = (d21 * dSin2) - (d22 * dCos2);
            double d24 = d20 * dSin;
            double d25 = d13 * dCos;
            double d26 = (dSin2 * d24) + (dCos2 * d25);
            double d27 = d18 / iCeil;
            double d28 = d26;
            double d29 = d23;
            int i10 = 0;
            double d30 = d14;
            double d31 = d15;
            double d32 = d17;
            while (i10 < iCeil) {
                double d33 = d32 + d27;
                double dSin3 = Math.sin(d33);
                double dCos3 = Math.cos(d33);
                double d34 = (d10 + ((d19 * dCos) * dCos3)) - (d22 * dSin3);
                double d35 = d11 + (d19 * dSin * dCos3) + (d25 * dSin3);
                double d36 = (d21 * dSin3) - (d22 * dCos3);
                double d37 = (dSin3 * d24) + (dCos3 * d25);
                double d38 = d33 - d32;
                double dTan = Math.tan(d38 / 2.0d);
                double dSin4 = (Math.sin(d38) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d39 = d30 + (d29 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d39, (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d36)), (float) (d35 - (dSin4 * d37)), (float) d34, (float) d35);
                i10++;
                d27 = d27;
                dSin = dSin;
                d30 = d34;
                d24 = d24;
                dCos = dCos;
                d32 = d33;
                d28 = d37;
                d29 = d36;
                iCeil = iCeil;
                d31 = d35;
                d19 = d12;
            }
        }

        private static void c(Path path, float f5, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f15);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f5;
            double d13 = d12 * dCos;
            double d14 = f10;
            double d15 = f13;
            double d16 = (d13 + (d14 * dSin)) / d15;
            double d17 = ((-f5) * dSin) + (d14 * dCos);
            double d18 = f14;
            double d19 = d17 / d18;
            double d20 = f12;
            double d21 = ((f11 * dCos) + (d20 * dSin)) / d15;
            double d22 = (((-f11) * dSin) + (d20 * dCos)) / d18;
            double d23 = d16 - d21;
            double d24 = d19 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d19 + d22) / 2.0d;
            double d27 = (d23 * d23) + (d24 * d24);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float fSqrt = (float) (Math.sqrt(d27) / 1.99999d);
                c(path, f5, f10, f11, f12, f13 * fSqrt, f14 * fSqrt, f15, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d28);
            double d29 = d23 * dSqrt;
            double d30 = dSqrt * d24;
            if (z10 == z11) {
                d10 = d25 - d30;
                d11 = d26 + d29;
            } else {
                d10 = d25 + d30;
                d11 = d26 - d29;
            }
            double dAtan2 = Math.atan2(d19 - d11, d16 - d10);
            double dAtan22 = Math.atan2(d22 - d11, d21 - d10) - dAtan2;
            if (z11 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d31 = d10 * d15;
            double d32 = d11 * d18;
            b(path, (d31 * dCos) - (d32 * dSin), (d31 * dSin) + (d32 * dCos), d15, d18, d12, d14, radians, dAtan2, dAtan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c10 = 'm';
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                a(path, fArr, c10, bVarArr[i10].f2213a, bVarArr[i10].f2214b);
                c10 = bVarArr[i10].f2213a;
            }
        }

        public void d(b bVar, b bVar2, float f5) {
            this.f2213a = bVar.f2213a;
            int i10 = 0;
            while (true) {
                float[] fArr = bVar.f2214b;
                if (i10 >= fArr.length) {
                    return;
                }
                this.f2214b[i10] = (fArr[i10] * (1.0f - f5)) + (bVar2.f2214b[i10] * f5);
                i10++;
            }
        }
    }

    private static void a(ArrayList arrayList, char c10, float[] fArr) {
        arrayList.add(new b(c10, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10].f2213a != bVarArr2[i10].f2213a || bVarArr[i10].f2214b.length != bVarArr2[i10].f2214b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i10 < 0 || i10 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        int iMin = Math.min(i12, length - i10);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i(str, i10);
            String strTrim = str.substring(i11, i12).trim();
            if (strTrim.length() > 0) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i11 = i12;
            i10 = i12 + 1;
        }
        if (i10 - i11 == 1 && i11 < str.length()) {
            a(arrayList, str.charAt(i11), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] bVarArrD = d(str);
        if (bVarArrD == null) {
            return null;
        }
        try {
            b.e(bVarArrD, path);
            return path;
        } catch (RuntimeException e5) {
            throw new RuntimeException("Error in parsing " + str, e5);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = new b(bVarArr[i10]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[LOOP:0: B:3:0x0007->B:24:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(java.lang.String r8, int r9, androidx.core.graphics.d.a r10) {
        /*
            r0 = 0
            r10.f2212b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L33
            r6 = 69
            if (r5 == r6) goto L31
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L31
            switch(r5) {
                case 44: goto L33;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L2f
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L35
        L27:
            r10.f2212b = r7
            goto L33
        L2a:
            if (r1 == r9) goto L2f
            if (r2 != 0) goto L2f
            goto L27
        L2f:
            r2 = r0
            goto L35
        L31:
            r2 = r7
            goto L35
        L33:
            r2 = r0
            r4 = r7
        L35:
            if (r4 == 0) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r10.f2211a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.d.g(java.lang.String, int, androidx.core.graphics.d$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i10 = 1;
            int i11 = 0;
            while (i10 < length) {
                g(str, i10, aVar);
                int i12 = aVar.f2211a;
                if (i10 < i12) {
                    fArr[i11] = Float.parseFloat(str.substring(i10, i12));
                    i11++;
                }
                i10 = aVar.f2212b ? i12 : i12 + 1;
            }
            return c(fArr, 0, i11);
        } catch (NumberFormatException e5) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e5);
        }
    }

    private static int i(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i10 = 0; i10 < bVarArr2.length; i10++) {
            bVarArr[i10].f2213a = bVarArr2[i10].f2213a;
            for (int i11 = 0; i11 < bVarArr2[i10].f2214b.length; i11++) {
                bVarArr[i10].f2214b[i11] = bVarArr2[i10].f2214b[i11];
            }
        }
    }
}
