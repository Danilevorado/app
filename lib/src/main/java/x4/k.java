package x4;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.s3;
import com.google.android.gms.measurement.internal.w4;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final j f28262a;

    public k(j jVar) {
        e4.p.l(jVar);
        this.f28262a = jVar;
    }

    public final void a(Context context, Intent intent) {
        w4 w4VarH = w4.H(context, null, null);
        s3 s3VarB = w4VarH.b();
        if (intent == null) {
            s3VarB.u().a("Receiver called with null intent");
            return;
        }
        w4VarH.x();
        String action = intent.getAction();
        s3VarB.t().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                s3VarB.u().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            s3VarB.t().a("Starting wakeful intent.");
            this.f28262a.a(context, className);
        }
    }
}
