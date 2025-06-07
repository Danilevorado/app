package e4;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class y0 extends r4.e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f23235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c cVar, Looper looper) {
        super(looper);
        this.f23235b = cVar;
    }

    private static final void a(Message message) {
        z0 z0Var = (z0) message.obj;
        z0Var.b();
        z0Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f23235b.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f23235b.x()) || message.what == 5)) && !this.f23235b.i()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f23235b.f23103z = new b4.b(message.arg2);
            if (c.l0(this.f23235b)) {
                c cVar = this.f23235b;
                if (!cVar.A) {
                    cVar.m0(3, null);
                    return;
                }
            }
            c cVar2 = this.f23235b;
            b4.b bVar = cVar2.f23103z != null ? cVar2.f23103z : new b4.b(8);
            this.f23235b.f23093p.a(bVar);
            this.f23235b.P(bVar);
            return;
        }
        if (i11 == 5) {
            c cVar3 = this.f23235b;
            b4.b bVar2 = cVar3.f23103z != null ? cVar3.f23103z : new b4.b(8);
            this.f23235b.f23093p.a(bVar2);
            this.f23235b.P(bVar2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            b4.b bVar3 = new b4.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f23235b.f23093p.a(bVar3);
            this.f23235b.P(bVar3);
            return;
        }
        if (i11 == 6) {
            this.f23235b.m0(5, null);
            c cVar4 = this.f23235b;
            if (cVar4.f23098u != null) {
                cVar4.f23098u.C(message.arg2);
            }
            this.f23235b.Q(message.arg2);
            c.k0(this.f23235b, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f23235b.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((z0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
