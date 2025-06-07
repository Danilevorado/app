package w6;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import s6.k;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f27960a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    static s6.d a(byte[] bArr, j jVar, f fVar, Map map) throws r6.f {
        h hVar;
        h hVar2;
        s6.b bVar = new s6.b(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        int i10 = 1;
        ArrayList arrayList = new ArrayList(1);
        boolean z10 = false;
        int i11 = -1;
        int iB = -1;
        s6.c cVarB = null;
        while (true) {
            try {
                h hVarB = bVar.a() < 4 ? h.TERMINATOR : h.b(bVar.b(4));
                h hVar3 = h.TERMINATOR;
                if (hVarB == hVar3) {
                    hVar = hVar3;
                    hVar2 = hVarB;
                } else if (hVarB == h.FNC1_FIRST_POSITION || hVarB == h.FNC1_SECOND_POSITION) {
                    hVar = hVar3;
                    hVar2 = hVarB;
                    z10 = true;
                } else {
                    if (hVarB == h.STRUCTURED_APPEND) {
                        if (bVar.a() < 16) {
                            throw r6.f.a();
                        }
                        int iB2 = bVar.b(8);
                        iB = bVar.b(8);
                        i11 = iB2;
                    } else if (hVarB == h.ECI) {
                        cVarB = s6.c.b(g(bVar));
                        if (cVarB == null) {
                            throw r6.f.a();
                        }
                    } else if (hVarB == h.HANZI) {
                        int iB3 = bVar.b(4);
                        int iB4 = bVar.b(hVarB.d(jVar));
                        if (iB3 == i10) {
                            d(bVar, sb2, iB4);
                        }
                    } else {
                        int iB5 = bVar.b(hVarB.d(jVar));
                        if (hVarB == h.NUMERIC) {
                            f(bVar, sb2, iB5);
                        } else if (hVarB == h.ALPHANUMERIC) {
                            b(bVar, sb2, iB5, z10);
                        } else if (hVarB == h.BYTE) {
                            hVar = hVar3;
                            hVar2 = hVarB;
                            c(bVar, sb2, iB5, cVarB, arrayList, map);
                        } else {
                            hVar = hVar3;
                            hVar2 = hVarB;
                            if (hVar2 != h.KANJI) {
                                throw r6.f.a();
                            }
                            e(bVar, sb2, iB5);
                        }
                    }
                    hVar = hVar3;
                    hVar2 = hVarB;
                }
                if (hVar2 == hVar) {
                    return new s6.d(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i11, iB);
                }
                i10 = 1;
            } catch (IllegalArgumentException unused) {
                throw r6.f.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(s6.b r3, java.lang.StringBuilder r4, int r5, boolean r6) throws r6.f {
        /*
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.a()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.b(r2)
            int r2 = r1 / 45
            char r2 = h(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = h(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            r6.f r3 = r6.f.a()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.a()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.b(r2)
            char r3 = h(r3)
            r4.append(r3)
            goto L47
        L42:
            r6.f r3 = r6.f.a()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.d.b(s6.b, java.lang.StringBuilder, int, boolean):void");
    }

    private static void c(s6.b bVar, StringBuilder sb2, int i10, s6.c cVar, Collection collection, Map map) throws r6.f {
        if ((i10 << 3) > bVar.a()) {
            throw r6.f.a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) bVar.b(8);
        }
        try {
            sb2.append(new String(bArr, cVar == null ? k.a(bArr, map) : cVar.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw r6.f.a();
        }
    }

    private static void d(s6.b bVar, StringBuilder sb2, int i10) throws r6.f {
        if (i10 * 13 > bVar.a()) {
            throw r6.f.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iB = bVar.b(13);
            int i12 = (iB % 96) | ((iB / 96) << 8);
            int i13 = i12 + (i12 < 959 ? 41377 : 42657);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw r6.f.a();
        }
    }

    private static void e(s6.b bVar, StringBuilder sb2, int i10) throws r6.f {
        if (i10 * 13 > bVar.a()) {
            throw r6.f.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iB = bVar.b(13);
            int i12 = (iB % 192) | ((iB / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw r6.f.a();
        }
    }

    private static void f(s6.b bVar, StringBuilder sb2, int i10) throws r6.f {
        while (i10 >= 3) {
            if (bVar.a() < 10) {
                throw r6.f.a();
            }
            int iB = bVar.b(10);
            if (iB >= 1000) {
                throw r6.f.a();
            }
            sb2.append(h(iB / 100));
            sb2.append(h((iB / 10) % 10));
            sb2.append(h(iB % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (bVar.a() < 7) {
                throw r6.f.a();
            }
            int iB2 = bVar.b(7);
            if (iB2 >= 100) {
                throw r6.f.a();
            }
            sb2.append(h(iB2 / 10));
            sb2.append(h(iB2 % 10));
            return;
        }
        if (i10 == 1) {
            if (bVar.a() < 4) {
                throw r6.f.a();
            }
            int iB3 = bVar.b(4);
            if (iB3 >= 10) {
                throw r6.f.a();
            }
            sb2.append(h(iB3));
        }
    }

    private static int g(s6.b bVar) throws r6.f {
        int iB = bVar.b(8);
        if ((iB & 128) == 0) {
            return iB & 127;
        }
        if ((iB & 192) == 128) {
            return bVar.b(8) | ((iB & 63) << 8);
        }
        if ((iB & 224) == 192) {
            return bVar.b(16) | ((iB & 31) << 16);
        }
        throw r6.f.a();
    }

    private static char h(int i10) throws r6.f {
        char[] cArr = f27960a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw r6.f.a();
    }
}
