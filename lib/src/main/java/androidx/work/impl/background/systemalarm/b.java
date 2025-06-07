package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.u;
import androidx.work.impl.v;
import b1.j;
import g1.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements androidx.work.impl.e {

    /* renamed from: q, reason: collision with root package name */
    private static final String f4078q = j.i("CommandHandler");

    /* renamed from: m, reason: collision with root package name */
    private final Context f4079m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f4080n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final Object f4081o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private final v f4082p;

    b(Context context, v vVar) {
        this.f4079m = context;
        this.f4082p = vVar;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    static Intent c(Context context, m mVar, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, mVar);
    }

    static Intent e(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i10, g gVar) {
        j.e().a(f4078q, "Handling constraints changed " + intent);
        new c(this.f4079m, i10, gVar).a();
    }

    private void h(Intent intent, int i10, g gVar) {
        synchronized (this.f4081o) {
            m mVarP = p(intent);
            j jVarE = j.e();
            String str = f4078q;
            jVarE.a(str, "Handing delay met for " + mVarP);
            if (this.f4080n.containsKey(mVarP)) {
                j.e().a(str, "WorkSpec " + mVarP + " is is already being handled for ACTION_DELAY_MET");
            } else {
                f fVar = new f(this.f4079m, i10, gVar, this.f4082p.c(mVarP));
                this.f4080n.put(mVarP, fVar);
                fVar.g();
            }
        }
    }

    private void i(Intent intent, int i10) {
        m mVarP = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        j.e().a(f4078q, "Handling onExecutionCompleted " + intent + ", " + i10);
        l(mVarP, z10);
    }

    private void j(Intent intent, int i10, g gVar) {
        j.e().a(f4078q, "Handling reschedule " + intent + ", " + i10);
        gVar.g().w();
    }

    private void k(Intent intent, int i10, g gVar) {
        m mVarP = p(intent);
        j jVarE = j.e();
        String str = f4078q;
        jVarE.a(str, "Handling schedule work for " + mVarP);
        WorkDatabase workDatabaseS = gVar.g().s();
        workDatabaseS.e();
        try {
            g1.v vVarL = workDatabaseS.J().l(mVarP.b());
            if (vVarL == null) {
                j.e().k(str, "Skipping scheduling " + mVarP + " because it's no longer in the DB");
                return;
            }
            if (vVarL.f23740b.b()) {
                j.e().k(str, "Skipping scheduling " + mVarP + "because it is finished.");
                return;
            }
            long jC = vVarL.c();
            if (vVarL.h()) {
                j.e().a(str, "Opportunistically setting an alarm for " + mVarP + "at " + jC);
                a.c(this.f4079m, gVar.g(), mVarP, jC);
                gVar.f().a().execute(new g.b(gVar, a(this.f4079m), i10));
            } else {
                j.e().a(str, "Setting up Alarms for " + mVarP + "at " + jC);
                a.c(this.f4079m, gVar.g(), mVarP, jC);
            }
            workDatabaseS.B();
        } finally {
            workDatabaseS.i();
        }
    }

    private void l(Intent intent, g gVar) {
        List<u> listB;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            listB = new ArrayList(1);
            u uVarA = this.f4082p.a(new m(string, i10));
            if (uVarA != null) {
                listB.add(uVarA);
            }
        } else {
            listB = this.f4082p.b(string);
        }
        for (u uVar : listB) {
            j.e().a(f4078q, "Handing stopWork work for " + string);
            gVar.g().B(uVar);
            a.a(this.f4079m, gVar.g(), uVar.a());
            gVar.l(uVar.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static m p(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        synchronized (this.f4081o) {
            f fVar = (f) this.f4080n.remove(mVar);
            this.f4082p.a(mVar);
            if (fVar != null) {
                fVar.h(z10);
            }
        }
    }

    boolean n() {
        boolean z10;
        synchronized (this.f4081o) {
            z10 = !this.f4080n.isEmpty();
        }
        return z10;
    }

    void o(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, gVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, gVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            j.e().c(f4078q, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, gVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, gVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
            return;
        }
        j.e().k(f4078q, "Ignoring intent " + intent);
    }
}
