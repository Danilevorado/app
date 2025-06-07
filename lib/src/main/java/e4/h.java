package e4;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h extends c implements a.f, g0 {
    private final e F;
    private final Set G;
    private final Account H;

    protected h(Context context, Looper looper, int i10, e eVar, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        this(context, looper, i10, eVar, (d4.d) bVar, (d4.g) cVar);
    }

    protected h(Context context, Looper looper, int i10, e eVar, d4.d dVar, d4.g gVar) {
        this(context, looper, i.a(context), b4.e.p(), i10, eVar, (d4.d) p.l(dVar), (d4.g) p.l(gVar));
    }

    protected h(Context context, Looper looper, i iVar, b4.e eVar, int i10, e eVar2, d4.d dVar, d4.g gVar) {
        super(context, looper, iVar, eVar, i10, dVar == null ? null : new e0(dVar), gVar == null ? null : new f0(gVar), eVar2.h());
        this.F = eVar2;
        this.H = eVar2.a();
        this.G = o0(eVar2.c());
    }

    private final Set o0(Set set) {
        Set setN0 = n0(set);
        Iterator it = setN0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setN0;
    }

    @Override // e4.c
    protected Executor A() {
        return null;
    }

    @Override // e4.c
    protected final Set G() {
        return this.G;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set d() {
        return s() ? this.G : Collections.emptySet();
    }

    protected Set n0(Set set) {
        return set;
    }

    @Override // e4.c
    public final Account y() {
        return this.H;
    }
}
