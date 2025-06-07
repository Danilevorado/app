package androidx.work.impl;

import android.content.Context;
import androidx.room.i0;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import u0.h;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends i0 {

    /* renamed from: o, reason: collision with root package name */
    public static final a f4055o = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u0.h c(Context context, h.b bVar) {
            rb.h.e(context, "$context");
            rb.h.e(bVar, "configuration");
            h.b.a aVarA = h.b.a(context);
            rb.h.d(aVarA, "builder(context)");
            aVarA.d(bVar.f27529b).c(bVar.f27530c).e(true).a(true);
            return new v0.e().a(aVarA.b());
        }

        public final WorkDatabase b(final Context context, Executor executor, boolean z10) {
            rb.h.e(context, "context");
            rb.h.e(executor, "queryExecutor");
            i0.a aVarC = z10 ? androidx.room.h0.c(context, WorkDatabase.class).c() : androidx.room.h0.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: androidx.work.impl.x
                @Override // u0.h.c
                public final u0.h a(h.b bVar) {
                    return WorkDatabase.a.c(context, bVar);
                }
            });
            rb.h.d(aVarC, "if (useTestDatabase) {\n …          }\n            }");
            i0 i0VarD = aVarC.g(executor).a(c.f4131a).b(h.f4182c).b(new r(context, 2, 3)).b(i.f4211c).b(j.f4212c).b(new r(context, 5, 6)).b(k.f4213c).b(l.f4214c).b(m.f4215c).b(new f0(context)).b(new r(context, 10, 11)).b(f.f4149c).b(g.f4179c).e().d();
            rb.h.d(i0VarD, "builder.setQueryExecutor…\n                .build()");
            return (WorkDatabase) i0VarD;
        }
    }

    public static final WorkDatabase D(Context context, Executor executor, boolean z10) {
        return f4055o.b(context, executor, z10);
    }

    public abstract g1.b E();

    public abstract g1.e F();

    public abstract g1.j G();

    public abstract g1.o H();

    public abstract g1.r I();

    public abstract g1.w J();

    public abstract g1.a0 K();
}
