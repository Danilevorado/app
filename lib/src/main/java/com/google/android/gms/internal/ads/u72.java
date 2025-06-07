package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class u72 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f16209a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f16210b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f16211c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f16212d;

    /* renamed from: e, reason: collision with root package name */
    private final View f16213e;

    public u72(bb3 bb3Var, bb3 bb3Var2, Context context, do2 do2Var, ViewGroup viewGroup) {
        this.f16209a = bb3Var;
        this.f16210b = bb3Var2;
        this.f16211c = context;
        this.f16212d = do2Var;
        this.f16213e = viewGroup;
    }

    private final List e() {
        ArrayList arrayList = new ArrayList();
        View view = this.f16213e;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        bb3 bb3Var;
        Callable callable;
        ir.a(this.f16211c);
        if (((Boolean) k3.w.c().b(ir.f10108u9)).booleanValue()) {
            bb3Var = this.f16210b;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.s72
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f15138a.c();
                }
            };
        } else {
            bb3Var = this.f16209a;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.t72
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f15719a.d();
                }
            };
        }
        return bb3Var.g(callable);
    }

    final /* synthetic */ w72 c() {
        return new w72(this.f16211c, this.f16212d.f7446e, e());
    }

    final /* synthetic */ w72 d() {
        return new w72(this.f16211c, this.f16212d.f7446e, e());
    }
}
