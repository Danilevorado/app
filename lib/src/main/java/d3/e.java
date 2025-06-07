package d3;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.at;
import com.google.android.gms.internal.ads.eu;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.oe0;
import com.google.android.gms.internal.ads.t60;
import com.google.android.gms.internal.ads.uw;
import com.google.android.gms.internal.ads.vw;
import com.google.android.gms.internal.ads.ze0;
import g3.f;
import g3.h;
import k3.g4;
import k3.i3;
import k3.j0;
import k3.m0;
import k3.t2;
import k3.v3;
import k3.x3;
import r3.c;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final g4 f22828a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f22829b;

    /* renamed from: c, reason: collision with root package name */
    private final j0 f22830c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f22831a;

        /* renamed from: b, reason: collision with root package name */
        private final m0 f22832b;

        public a(Context context, String str) {
            Context context2 = (Context) e4.p.m(context, "context cannot be null");
            m0 m0VarC = k3.t.a().c(context, str, new l30());
            this.f22831a = context2;
            this.f22832b = m0VarC;
        }

        public e a() {
            try {
                return new e(this.f22831a, this.f22832b.c(), g4.f24647a);
            } catch (RemoteException e5) {
                ze0.e("Failed to build AdLoader.", e5);
                return new e(this.f22831a, new i3().M5(), g4.f24647a);
            }
        }

        public a b(String str, f.b bVar, f.a aVar) {
            uw uwVar = new uw(bVar, aVar);
            try {
                this.f22832b.B3(str, uwVar.e(), uwVar.d());
            } catch (RemoteException e5) {
                ze0.h("Failed to add custom template ad listener", e5);
            }
            return this;
        }

        public a c(c.InterfaceC0183c interfaceC0183c) {
            try {
                this.f22832b.G4(new t60(interfaceC0183c));
            } catch (RemoteException e5) {
                ze0.h("Failed to add google native ad listener", e5);
            }
            return this;
        }

        public a d(h.a aVar) {
            try {
                this.f22832b.G4(new vw(aVar));
            } catch (RemoteException e5) {
                ze0.h("Failed to add google native ad listener", e5);
            }
            return this;
        }

        public a e(c cVar) {
            try {
                this.f22832b.l4(new x3(cVar));
            } catch (RemoteException e5) {
                ze0.h("Failed to set AdListener.", e5);
            }
            return this;
        }

        public a f(g3.e eVar) {
            try {
                this.f22832b.Y3(new eu(eVar));
            } catch (RemoteException e5) {
                ze0.h("Failed to specify native ad options", e5);
            }
            return this;
        }

        public a g(r3.d dVar) {
            try {
                this.f22832b.Y3(new eu(4, dVar.e(), -1, dVar.d(), dVar.a(), dVar.c() != null ? new v3(dVar.c()) : null, dVar.h(), dVar.b(), dVar.f(), dVar.g()));
            } catch (RemoteException e5) {
                ze0.h("Failed to specify native ad options", e5);
            }
            return this;
        }
    }

    e(Context context, j0 j0Var, g4 g4Var) {
        this.f22829b = context;
        this.f22830c = j0Var;
        this.f22828a = g4Var;
    }

    private final void c(final t2 t2Var) {
        ir.a(this.f22829b);
        if (((Boolean) at.f6230c.e()).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.A9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: d3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22887m.b(t2Var);
                    }
                });
                return;
            }
        }
        try {
            this.f22830c.E3(this.f22828a.a(this.f22829b, t2Var));
        } catch (RemoteException e5) {
            ze0.e("Failed to load ad.", e5);
        }
    }

    public void a(f fVar) {
        c(fVar.f22835a);
    }

    final /* synthetic */ void b(t2 t2Var) {
        try {
            this.f22830c.E3(this.f22828a.a(this.f22829b, t2Var));
        } catch (RemoteException e5) {
            ze0.e("Failed to load ad.", e5);
        }
    }
}
