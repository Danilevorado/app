package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class a implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private androidx.core.util.e f3437a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f3438b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f3439c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0052a f3440d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f3441e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f3442f;

    /* renamed from: g, reason: collision with root package name */
    final h f3443g;

    /* renamed from: h, reason: collision with root package name */
    private int f3444h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0052a {
        void a(int i10, int i11);

        void b(b bVar);

        RecyclerView.d0 c(int i10);

        void d(int i10, int i11);

        void e(int i10, int i11);

        void f(int i10, int i11);

        void g(b bVar);

        void h(int i10, int i11, Object obj);
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        int f3445a;

        /* renamed from: b, reason: collision with root package name */
        int f3446b;

        /* renamed from: c, reason: collision with root package name */
        Object f3447c;

        /* renamed from: d, reason: collision with root package name */
        int f3448d;

        b(int i10, int i11, int i12, Object obj) {
            this.f3445a = i10;
            this.f3446b = i11;
            this.f3448d = i12;
            this.f3447c = obj;
        }

        String a() {
            int i10 = this.f3445a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f3445a;
            if (i10 != bVar.f3445a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f3448d - this.f3446b) == 1 && this.f3448d == bVar.f3446b && this.f3446b == bVar.f3448d) {
                return true;
            }
            if (this.f3448d != bVar.f3448d || this.f3446b != bVar.f3446b) {
                return false;
            }
            Object obj2 = this.f3447c;
            Object obj3 = bVar.f3447c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3445a * 31) + this.f3446b) * 31) + this.f3448d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f3446b + "c:" + this.f3448d + ",p:" + this.f3447c + "]";
        }
    }

    a(InterfaceC0052a interfaceC0052a) {
        this(interfaceC0052a, false);
    }

    a(InterfaceC0052a interfaceC0052a, boolean z10) {
        this.f3437a = new androidx.core.util.f(30);
        this.f3438b = new ArrayList();
        this.f3439c = new ArrayList();
        this.f3444h = 0;
        this.f3440d = interfaceC0052a;
        this.f3442f = z10;
        this.f3443g = new h(this);
    }

    private void c(b bVar) {
        s(bVar);
    }

    private void d(b bVar) {
        s(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f3446b;
        int i11 = bVar.f3448d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f3440d.c(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    s(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f3448d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            s(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f3446b;
        int i11 = bVar.f3448d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f3440d.c(i10) != null || h(i10)) {
                if (!z10) {
                    k(b(4, i13, i12, bVar.f3447c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    s(b(4, i13, i12, bVar.f3447c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f3448d) {
            Object obj = bVar.f3447c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (z10) {
            s(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f3439c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3439c.get(i11);
            int i12 = bVar.f3445a;
            if (i12 == 8) {
                if (n(bVar.f3448d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3446b;
                int i14 = bVar.f3448d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f3445a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iW = w(bVar.f3446b, i11);
        int i12 = bVar.f3446b;
        int i13 = bVar.f3445a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f3448d; i15++) {
            int iW2 = w(bVar.f3446b + (i10 * i15), bVar.f3445a);
            int i16 = bVar.f3445a;
            if (i16 == 2 ? iW2 == iW : i16 == 4 && iW2 == iW + 1) {
                i14++;
            } else {
                b bVarB = b(i16, iW, i14, bVar.f3447c);
                l(bVarB, i12);
                a(bVarB);
                if (bVar.f3445a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iW = iW2;
            }
        }
        Object obj = bVar.f3447c;
        a(bVar);
        if (i14 > 0) {
            b bVarB2 = b(bVar.f3445a, iW, i14, obj);
            l(bVarB2, i12);
            a(bVarB2);
        }
    }

    private void s(b bVar) {
        this.f3439c.add(bVar);
        int i10 = bVar.f3445a;
        if (i10 == 1) {
            this.f3440d.e(bVar.f3446b, bVar.f3448d);
            return;
        }
        if (i10 == 2) {
            this.f3440d.d(bVar.f3446b, bVar.f3448d);
            return;
        }
        if (i10 == 4) {
            this.f3440d.h(bVar.f3446b, bVar.f3448d, bVar.f3447c);
        } else {
            if (i10 == 8) {
                this.f3440d.a(bVar.f3446b, bVar.f3448d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int w(int r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f3439c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L7d
            java.util.ArrayList r3 = r8.f3439c
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r4 = r3.f3445a
            r5 = 2
            if (r4 != r2) goto L5e
            int r2 = r3.f3446b
            int r4 = r3.f3448d
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L48
            if (r9 > r7) goto L48
            if (r6 != r2) goto L39
            if (r10 != r1) goto L31
            int r4 = r4 + 1
        L2e:
            r3.f3448d = r4
            goto L36
        L31:
            if (r10 != r5) goto L36
            int r4 = r4 + (-1)
            goto L2e
        L36:
            int r9 = r9 + 1
            goto L7a
        L39:
            if (r10 != r1) goto L40
            int r2 = r2 + 1
        L3d:
            r3.f3446b = r2
            goto L45
        L40:
            if (r10 != r5) goto L45
            int r2 = r2 + (-1)
            goto L3d
        L45:
            int r9 = r9 + (-1)
            goto L7a
        L48:
            if (r9 >= r2) goto L7a
            if (r10 != r1) goto L55
            int r2 = r2 + 1
            r3.f3446b = r2
            int r4 = r4 + 1
        L52:
            r3.f3448d = r4
            goto L7a
        L55:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            r3.f3446b = r2
            int r4 = r4 + (-1)
            goto L52
        L5e:
            int r2 = r3.f3446b
            if (r2 > r9) goto L6e
            if (r4 != r1) goto L68
            int r2 = r3.f3448d
            int r9 = r9 - r2
            goto L7a
        L68:
            if (r4 != r5) goto L7a
            int r2 = r3.f3448d
            int r9 = r9 + r2
            goto L7a
        L6e:
            if (r10 != r1) goto L75
            int r2 = r2 + 1
        L72:
            r3.f3446b = r2
            goto L7a
        L75:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            goto L72
        L7a:
            int r0 = r0 + (-1)
            goto L8
        L7d:
            java.util.ArrayList r10 = r8.f3439c
            int r10 = r10.size()
            int r10 = r10 - r1
        L84:
            if (r10 < 0) goto Laa
            java.util.ArrayList r0 = r8.f3439c
            java.lang.Object r0 = r0.get(r10)
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.a.b) r0
            int r1 = r0.f3445a
            if (r1 != r2) goto L9b
            int r1 = r0.f3448d
            int r3 = r0.f3446b
            if (r1 == r3) goto L9f
            if (r1 >= 0) goto La7
            goto L9f
        L9b:
            int r1 = r0.f3448d
            if (r1 > 0) goto La7
        L9f:
            java.util.ArrayList r1 = r8.f3439c
            r1.remove(r10)
            r8.a(r0)
        La7:
            int r10 = r10 + (-1)
            goto L84
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.w(int, int):int");
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f3442f) {
            return;
        }
        bVar.f3447c = null;
        this.f3437a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f3437a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f3445a = i10;
        bVar.f3446b = i11;
        bVar.f3448d = i12;
        bVar.f3447c = obj;
        return bVar;
    }

    public int e(int i10) {
        int size = this.f3438b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3438b.get(i11);
            int i12 = bVar.f3445a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f3446b;
                    if (i13 <= i10) {
                        int i14 = bVar.f3448d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f3446b;
                    if (i15 == i10) {
                        i10 = bVar.f3448d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f3448d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f3446b <= i10) {
                i10 += bVar.f3448d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f3439c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3440d.b((b) this.f3439c.get(i10));
        }
        u(this.f3439c);
        this.f3444h = 0;
    }

    void j() {
        i();
        int size = this.f3438b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3438b.get(i10);
            int i11 = bVar.f3445a;
            if (i11 == 1) {
                this.f3440d.b(bVar);
                this.f3440d.e(bVar.f3446b, bVar.f3448d);
            } else if (i11 == 2) {
                this.f3440d.b(bVar);
                this.f3440d.f(bVar.f3446b, bVar.f3448d);
            } else if (i11 == 4) {
                this.f3440d.b(bVar);
                this.f3440d.h(bVar.f3446b, bVar.f3448d, bVar.f3447c);
            } else if (i11 == 8) {
                this.f3440d.b(bVar);
                this.f3440d.a(bVar.f3446b, bVar.f3448d);
            }
            Runnable runnable = this.f3441e;
            if (runnable != null) {
                runnable.run();
            }
        }
        u(this.f3438b);
        this.f3444h = 0;
    }

    void l(b bVar, int i10) {
        this.f3440d.g(bVar);
        int i11 = bVar.f3445a;
        if (i11 == 2) {
            this.f3440d.f(i10, bVar.f3448d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f3440d.h(i10, bVar.f3448d, bVar.f3447c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f3439c.size();
        while (i11 < size) {
            b bVar = (b) this.f3439c.get(i11);
            int i12 = bVar.f3445a;
            if (i12 == 8) {
                int i13 = bVar.f3446b;
                if (i13 == i10) {
                    i10 = bVar.f3448d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3448d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3446b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3448d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3448d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f3444h) != 0;
    }

    boolean p() {
        return this.f3438b.size() > 0;
    }

    boolean q() {
        return (this.f3439c.isEmpty() || this.f3438b.isEmpty()) ? false : true;
    }

    boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f3438b.add(b(4, i10, i11, obj));
        this.f3444h |= 4;
        return this.f3438b.size() == 1;
    }

    void t() {
        this.f3443g.b(this.f3438b);
        int size = this.f3438b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3438b.get(i10);
            int i11 = bVar.f3445a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f3441e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3438b.clear();
    }

    void u(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((b) list.get(i10));
        }
        list.clear();
    }

    void v() {
        u(this.f3438b);
        u(this.f3439c);
        this.f3444h = 0;
    }
}
