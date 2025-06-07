package f0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
abstract class b {

    public interface a {
        void a(Object obj, Rect rect);
    }

    /* renamed from: f0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0127b {
        Object a(Object obj, int i10);

        int b(Object obj);
    }

    private static class c implements Comparator {

        /* renamed from: m, reason: collision with root package name */
        private final Rect f23568m = new Rect();

        /* renamed from: n, reason: collision with root package name */
        private final Rect f23569n = new Rect();

        /* renamed from: o, reason: collision with root package name */
        private final boolean f23570o;

        /* renamed from: p, reason: collision with root package name */
        private final a f23571p;

        c(boolean z10, a aVar) {
            this.f23570o = z10;
            this.f23571p = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f23568m;
            Rect rect2 = this.f23569n;
            this.f23571p.a(obj, rect);
            this.f23571p.a(obj2, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                return this.f23570o ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f23570o ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return this.f23570o ? 1 : -1;
            }
            if (i16 > i17) {
                return this.f23570o ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean zB = b(i10, rect, rect2);
        if (b(i10, rect, rect3) || !zB) {
            return false;
        }
        return !j(i10, rect, rect3) || i10 == 17 || i10 == 66 || k(i10, rect, rect2) < m(i10, rect, rect3);
    }

    private static boolean b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(java.lang.Object r7, f0.b.InterfaceC0127b r8, f0.b.a r9, java.lang.Object r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L38
            r1 = 33
            if (r12 == r1) goto L2e
            r1 = 66
            if (r12 == r1) goto L26
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L1e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L34
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L26:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L3e
        L2e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L34:
            r0.offset(r2, r1)
            goto L41
        L38:
            int r1 = r11.width()
            int r1 = r1 + 1
        L3e:
            r0.offset(r1, r2)
        L41:
            r1 = 0
            int r3 = r8.b(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L4b:
            if (r2 >= r3) goto L64
            java.lang.Object r5 = r8.a(r7, r2)
            if (r5 != r10) goto L54
            goto L61
        L54:
            r9.a(r5, r4)
            boolean r6 = h(r12, r11, r4, r0)
            if (r6 == 0) goto L61
            r0.set(r4)
            r1 = r5
        L61:
            int r2 = r2 + 1
            goto L4b
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.b.c(java.lang.Object, f0.b$b, f0.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static Object d(Object obj, InterfaceC0127b interfaceC0127b, a aVar, Object obj2, int i10, boolean z10, boolean z11) {
        int iB = interfaceC0127b.b(obj);
        ArrayList arrayList = new ArrayList(iB);
        for (int i11 = 0; i11 < iB; i11++) {
            arrayList.add(interfaceC0127b.a(obj, i11));
        }
        Collections.sort(arrayList, new c(z10, aVar));
        if (i10 == 1) {
            return f(obj2, arrayList, z11);
        }
        if (i10 == 2) {
            return e(obj2, arrayList, z11);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static Object e(Object obj, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static Object f(Object obj, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i10, int i11) {
        return (i10 * 13 * i10) + (i11 * i11);
    }

    private static boolean h(int i10, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i10)) {
            return false;
        }
        if (i(rect, rect3, i10) && !a(i10, rect, rect2, rect3)) {
            return !a(i10, rect, rect3, rect2) && g(k(i10, rect, rect2), o(i10, rect, rect2)) < g(k(i10, rect, rect3), o(i10, rect, rect3));
        }
        return true;
    }

    private static boolean i(Rect rect, Rect rect2, int i10) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            return rect.left >= rect2.right;
        }
        if (i10 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i10 == 66) {
            return rect.right <= rect2.left;
        }
        if (i10 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i10, Rect rect, Rect rect2) {
        return Math.max(0, l(i10, rect, rect2));
    }

    private static int l(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    private static int m(int i10, Rect rect, Rect rect2) {
        return Math.max(1, n(i10, rect, rect2));
    }

    private static int n(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.left;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.top;
        } else if (i10 == 66) {
            i11 = rect2.right;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.bottom;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    private static int o(int i10, Rect rect, Rect rect2) {
        int iHeight;
        int i11;
        int iHeight2;
        if (i10 == 17) {
            iHeight = rect.top + (rect.height() / 2);
            i11 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = rect.top + (rect.height() / 2);
                i11 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = rect.left + (rect.width() / 2);
            i11 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - (i11 + (iHeight2 / 2)));
    }
}
