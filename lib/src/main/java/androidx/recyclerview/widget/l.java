package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
abstract class l {
    static int a(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1;
        }
        return Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
    }

    static int b(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.o oVar, boolean z10, boolean z11) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (a0Var.b() - Math.max(oVar.h0(view), oVar.h0(view2))) - 1) : Math.max(0, Math.min(oVar.h0(view), oVar.h0(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1))) + (iVar.m() - iVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.a0 a0Var, i iVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return a0Var.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1)) * a0Var.b());
    }
}
