package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import e4.c;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
final class s extends x {

    /* renamed from: n, reason: collision with root package name */
    private final Map f5805n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ y f5806o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, Map map) {
        super(yVar, null);
        this.f5806o = yVar;
        this.f5805n = map;
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a() {
        e4.i0 i0Var = new e4.i0(this.f5806o.f5828d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.f5805n.keySet()) {
            if (!fVar.g() || ((p) this.f5805n.get(fVar)).f5788c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i10 = 0;
        int iB = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i10 < size) {
                iB = i0Var.b(this.f5806o.f5827c, (a.f) arrayList.get(i10));
                i10++;
                if (iB != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                iB = i0Var.b(this.f5806o.f5827c, (a.f) arrayList2.get(i10));
                i10++;
                if (iB == 0) {
                    break;
                }
            }
        }
        if (iB != 0) {
            b4.b bVar = new b4.b(iB, null);
            y yVar = this.f5806o;
            yVar.f5825a.k(new q(this, yVar, bVar));
            return;
        }
        y yVar2 = this.f5806o;
        if (yVar2.f5837m && yVar2.f5835k != null) {
            yVar2.f5835k.t();
        }
        for (a.f fVar2 : this.f5805n.keySet()) {
            c.InterfaceC0124c interfaceC0124c = (c.InterfaceC0124c) this.f5805n.get(fVar2);
            if (!fVar2.g() || i0Var.b(this.f5806o.f5827c, fVar2) == 0) {
                fVar2.j(interfaceC0124c);
            } else {
                y yVar3 = this.f5806o;
                yVar3.f5825a.k(new r(this, yVar3, interfaceC0124c));
            }
        }
    }
}
