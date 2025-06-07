package f1;

import android.content.Context;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final h f23616a;

    /* renamed from: b, reason: collision with root package name */
    private final c f23617b;

    /* renamed from: c, reason: collision with root package name */
    private final h f23618c;

    /* renamed from: d, reason: collision with root package name */
    private final h f23619d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Context context, i1.c cVar) {
        this(context, cVar, null, null, null, null, 60, null);
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
    }

    public o(Context context, i1.c cVar, h hVar, c cVar2, h hVar2, h hVar3) {
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
        rb.h.e(hVar, "batteryChargingTracker");
        rb.h.e(cVar2, "batteryNotLowTracker");
        rb.h.e(hVar2, "networkStateTracker");
        rb.h.e(hVar3, "storageNotLowTracker");
        this.f23616a = hVar;
        this.f23617b = cVar2;
        this.f23618c = hVar2;
        this.f23619d = hVar3;
    }

    public /* synthetic */ o(Context context, i1.c cVar, h hVar, c cVar2, h hVar2, h hVar3, int i10, rb.f fVar) {
        h aVar;
        c cVar3;
        h hVarA;
        h mVar;
        if ((i10 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            rb.h.d(applicationContext, "context.applicationContext");
            aVar = new a(applicationContext, cVar);
        } else {
            aVar = hVar;
        }
        if ((i10 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            rb.h.d(applicationContext2, "context.applicationContext");
            cVar3 = new c(applicationContext2, cVar);
        } else {
            cVar3 = cVar2;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            rb.h.d(applicationContext3, "context.applicationContext");
            hVarA = k.a(applicationContext3, cVar);
        } else {
            hVarA = hVar2;
        }
        if ((i10 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            rb.h.d(applicationContext4, "context.applicationContext");
            mVar = new m(applicationContext4, cVar);
        } else {
            mVar = hVar3;
        }
        this(context, cVar, aVar, cVar3, hVarA, mVar);
    }

    public final h a() {
        return this.f23616a;
    }

    public final c b() {
        return this.f23617b;
    }

    public final h c() {
        return this.f23618c;
    }

    public final h d() {
        return this.f23619d;
    }
}
