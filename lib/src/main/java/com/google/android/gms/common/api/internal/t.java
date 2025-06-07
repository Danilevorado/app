package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class t extends x {

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f5811n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ y f5812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, ArrayList arrayList) {
        super(yVar, null);
        this.f5812o = yVar;
        this.f5811n = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a() {
        y yVar = this.f5812o;
        yVar.f5825a.f5742z.f5689p = y.x(yVar);
        ArrayList arrayList = this.f5811n;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.f fVar = (a.f) arrayList.get(i10);
            y yVar2 = this.f5812o;
            fVar.p(yVar2.f5839o, yVar2.f5825a.f5742z.f5689p);
        }
    }
}
