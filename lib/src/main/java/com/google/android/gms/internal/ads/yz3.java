package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
final class yz3 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f18337a = new ArrayDeque();

    /* synthetic */ yz3(xz3 xz3Var) {
    }

    static /* bridge */ /* synthetic */ ww3 a(yz3 yz3Var, ww3 ww3Var, ww3 ww3Var2) {
        yz3Var.b(ww3Var);
        yz3Var.b(ww3Var2);
        ww3 c04Var = (ww3) yz3Var.f18337a.pop();
        while (!yz3Var.f18337a.isEmpty()) {
            c04Var = new c04((ww3) yz3Var.f18337a.pop(), c04Var);
        }
        return c04Var;
    }

    private final void b(ww3 ww3Var) {
        b04 b04Var;
        if (!ww3Var.q()) {
            if (!(ww3Var instanceof c04)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(ww3Var.getClass())));
            }
            c04 c04Var = (c04) ww3Var;
            b(c04Var.f6750r);
            b(c04Var.f6751s);
            return;
        }
        int iC = c(ww3Var.n());
        int iQ = c04.Q(iC + 1);
        if (this.f18337a.isEmpty() || ((ww3) this.f18337a.peek()).n() >= iQ) {
            this.f18337a.push(ww3Var);
            return;
        }
        int iQ2 = c04.Q(iC);
        ww3 c04Var2 = (ww3) this.f18337a.pop();
        while (true) {
            b04Var = null;
            if (this.f18337a.isEmpty() || ((ww3) this.f18337a.peek()).n() >= iQ2) {
                break;
            } else {
                c04Var2 = new c04((ww3) this.f18337a.pop(), c04Var2);
            }
        }
        c04 c04Var3 = new c04(c04Var2, ww3Var);
        while (!this.f18337a.isEmpty()) {
            if (((ww3) this.f18337a.peek()).n() >= c04.Q(c(c04Var3.n()) + 1)) {
                break;
            } else {
                c04Var3 = new c04((ww3) this.f18337a.pop(), c04Var3);
            }
        }
        this.f18337a.push(c04Var3);
    }

    private static final int c(int i10) {
        int iBinarySearch = Arrays.binarySearch(c04.f6748v, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
