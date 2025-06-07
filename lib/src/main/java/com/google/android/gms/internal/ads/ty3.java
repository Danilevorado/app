package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class ty3 extends yy3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f16100c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ ty3(sy3 sy3Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List f(Object obj, long j10, int i10) {
        qy3 qy3Var;
        List list = (List) t04.p(obj, j10);
        if (list.isEmpty()) {
            List qy3Var2 = list instanceof ry3 ? new qy3(i10) : ((list instanceof qz3) && (list instanceof ky3)) ? ((ky3) list).j(i10) : new ArrayList(i10);
            t04.D(obj, j10, qy3Var2);
            return qy3Var2;
        }
        if (f16100c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            qy3Var = arrayList;
        } else {
            if (!(list instanceof o04)) {
                if (!(list instanceof qz3) || !(list instanceof ky3)) {
                    return list;
                }
                ky3 ky3Var = (ky3) list;
                if (ky3Var.d()) {
                    return list;
                }
                ky3 ky3VarJ = ky3Var.j(list.size() + i10);
                t04.D(obj, j10, ky3VarJ);
                return ky3VarJ;
            }
            qy3 qy3Var3 = new qy3(list.size() + i10);
            qy3Var3.addAll(qy3Var3.size(), (o04) list);
            qy3Var = qy3Var3;
        }
        t04.D(obj, j10, qy3Var);
        return qy3Var;
    }

    @Override // com.google.android.gms.internal.ads.yy3
    final List a(Object obj, long j10) {
        return f(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.ads.yy3
    final void b(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) t04.p(obj, j10);
        if (list instanceof ry3) {
            objUnmodifiableList = ((ry3) list).c();
        } else {
            if (f16100c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof qz3) && (list instanceof ky3)) {
                ky3 ky3Var = (ky3) list;
                if (ky3Var.d()) {
                    ky3Var.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        t04.D(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.yy3
    final void c(Object obj, Object obj2, long j10) {
        List list = (List) t04.p(obj2, j10);
        List listF = f(obj, j10, list.size());
        int size = listF.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(list);
        }
        if (size > 0) {
            list = listF;
        }
        t04.D(obj, j10, list);
    }
}
